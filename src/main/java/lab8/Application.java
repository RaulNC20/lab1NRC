package lab8;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;




public class Application
{

    public static void main(String[] args)
    {


        String filePath = "laborator8_input.xlsx";

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis))
        {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet)
            {
                for (Cell cell : row)
                {

                    switch (cell.getCellType())
                    {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;

                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;

                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;

                        default:
                            System.out.print(" \t");
                    }
                }
                System.out.println();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        copyAndAddAverage("laborator8_input.xlsx", "out2.xlsx");
        copyWithFormula("laborator8_input.xlsx", "out3.xlsx");
    }



    public static void copyAndAddAverage(String input, String output) {
        try (FileInputStream fis = new FileInputStream(input);
             Workbook workbook = new XSSFWorkbook(fis);
             Workbook outWorkbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.getSheetAt(0);
            Sheet outSheet = outWorkbook.createSheet("Rezultat");

            int rowIndex = 0;

            for (Row row : sheet) {
                Row newRow = outSheet.createRow(rowIndex);

                int lastCol = row.getLastCellNum();
                double sum = 0;
                int count = 0;

                for (int i = 0; i < lastCol; i++) {
                    Cell cell = row.getCell(i);
                    Cell newCell = newRow.createCell(i);

                    if (cell != null) {
                        if (cell.getCellType() == CellType.STRING) {
                            newCell.setCellValue(cell.getStringCellValue());
                        } else if (cell.getCellType() == CellType.NUMERIC) {
                            double val = cell.getNumericCellValue();
                            newCell.setCellValue(val);

                            // ultimele 3 coloane
                            if (i >= lastCol - 3) {
                                sum += val;
                                count++;
                            }
                        }
                    }
                }

                double avg = (count > 0) ? sum / count : 0;
                newRow.createCell(lastCol).setCellValue(avg);

                rowIndex++;
            }

            try (FileOutputStream fos = new FileOutputStream(output)) {
                outWorkbook.write(fos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copyWithFormula(String input, String output) {
        try (FileInputStream fis = new FileInputStream(input);
             Workbook workbook = new XSSFWorkbook(fis);
             Workbook outWorkbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.getSheetAt(0);
            Sheet outSheet = outWorkbook.createSheet("Rezultat");

            int rowIndex = 0;

            for (Row row : sheet) {
                Row newRow = outSheet.createRow(rowIndex);

                int lastCol = row.getLastCellNum();

                for (int i = 0; i < lastCol; i++) {
                    Cell cell = row.getCell(i);
                    Cell newCell = newRow.createCell(i);

                    if (cell != null) {
                        if (cell.getCellType() == CellType.STRING) {
                            newCell.setCellValue(cell.getStringCellValue());
                        } else if (cell.getCellType() == CellType.NUMERIC) {
                            newCell.setCellValue(cell.getNumericCellValue());
                        }
                    }
                }

                int excelRow = rowIndex + 1; // Excel începe de la 1
                String formula = "AVERAGE(D" + excelRow + ":F" + excelRow + ")";

                newRow.createCell(lastCol).setCellFormula(formula);

                rowIndex++;
            }

            try (FileOutputStream fos = new FileOutputStream(output)) {
                outWorkbook.write(fos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




















}