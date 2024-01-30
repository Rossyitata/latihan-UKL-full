package latsol_ukl;

import java.util.Scanner;

public class LatSol_UKL_Rossyita_32_XR4 {  
    public static void deret_arimatika(String[] args) {
        int a = 5;
        int b = 3;
        int n = 10;
        int sum = 0;
        
        System.out.println("Deret Aritmatika");
        for (int i = 0; i < n; i++) {
            int suku = a + i * b;
            System.out.print(suku);
            
            sum += suku;
            
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Jumlah: " + sum);
        
    }
    public static void matrix(String[] args) {
        int a = 5;
        int b = 3;
        int n = 3 * 4;

        int[][] matrix = new int[3][4];
        int sum = 0;

        System.out.println("Matrix 3x4");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = a + sum * b;

                System.out.print(matrix[i][j]);
                sum++;

                if (j < 3) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total += matrix[i][j];
            }
        }
        System.out.println("Jumlah: " + total);
    }
    public static void matrix_5_kolom(String[] args) {
        int a = 5;
        int b = 3;
        int n = 5; 
        int total = 0;
        int[][] matrix = new int[n][n];
        System.out.println("Matrix 5 kolom");
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);

                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b; 
            }
            System.out.println();
        }
        for (int i= n-1; i>=0; i--) {
            for (int j=0; j<=i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);
                
                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b;
            }
            System.out.println();
        }
        System.out.println("Jumlah: " + total);
    }
    public static void matrix_3_kolom(String[] args) {
        int a = 5;
        int b = 3;
        int n = 3;
        int total = 0;
        int[][] matrix = new int[n][n];

        System.out.println("Matrix 3 kolom");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);

                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b;
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);

                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b;
            }
            System.out.println();
        }
        
        for (int i = 3; i > n; i--) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);

                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b;
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);

                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b;
            }
            System.out.println();
        }
        
        for (int i=1; i<n; i++) {
            for (int j=0; j <= i; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j]);

                if (j < i) {
                    System.out.print(" ");
                }
                total += a;
                a += b;
            }
            System.out.println();
        }
        System.out.println("Jumlah: " + total);
    }
    public static void array1(String[] args) {
        int[][] matrixA = {{-7, 4}, {5, 8}};
        int[][] matrixB = {{1, -4}, {1, 9}};

        int a = matrixA.length;
        int b = matrixA[0].length;
        int[][] hasil = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                hasil[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Hasil:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void array2(String[] args) {
        int[][] matrixA = {{6,4}, {3,2}, {2,3}};
        int[][] matrixB = {{1,2,3}, {2,3,1}};
        
        int a = matrixA.length;
        int b = matrixA[0].length;
        int c = matrixB[0].length;
        int[][] hasil = new int[a][c];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    hasil[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        System.out.println("Hasil:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void tagihan_pdam(String[] args) {
       Scanner input = new Scanner(System.in);
        String[] nama = {"", "Ali", "Budi", "Dani", "Edi", "Umar"};
        int[] m3 = {10, 20, 30};

        System.out.println("===============================================");
        System.out.println("                PEMBAYARAN PDAM                ");
        System.out.println("===============================================");
        System.out.print("Masukkan ID anda: ");
        int id = input.nextInt();

        if (id < 1 || id > 5) {
            System.out.println("SALAHSETAN");
            System.out.println("================================================");
        } else {
            System.out.print("Masukkan pemakaian air anda: ");
            int air = input.nextInt();
            if (air < 0) {
                System.out.println("SALAHSETAN");
                System.out.println("================================================");
            } else {
                int biaya = hitung(m3, air);
                System.out.println("================================================");
                System.out.println("ID Pelanggan\t: " + id);
                System.out.println("Nama Pelanggan\t: " + nama[id]);
                System.out.println("Jumlah Tagihan\t: " + biaya);
                System.out.println("================================================");

            }
        }
    }

    public static int hitung(int[] m3, int air) {
        int biaya = 0;
        int tarif = 0;

        if (air > 30) {
            tarif = 5000;
        } else if (air > 20) {
            tarif = 4000;
        } else if (air > 10) {
            tarif = 3000;
        } else {
            tarif = 2000;
        }
        biaya = tarif * air + 10000;

        if (air < 10) {
            air = 10;
        }
        return biaya;
    }
    public static void tagihan_listrik(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = {"", "Galuh", "Indro", "Jedi", "Kanu"};
        String[] alamat = {"", "Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        String[] va  = {"", "450 VA", "2200 VA", "1300 VA", "2200 VA"};
        int[] gol = {4, 1, 3, 2, 3};
        System.out.println("================================================");
        System.out.println("              PEMBAYARAN LISTRIK                ");
        System.out.println("================================================");
        System.out.print("Masukkan ID anda\t: ");
        int id = input.nextInt();
        if (id < 1 || id > 4) {
            System.out.println("SALAHSETAN");
            System.out.println("================================================");
        } else {
            System.out.print("Masukkan kwh anda\t: ");
            int kwh = input.nextInt();
            if (kwh < 0) {
                System.out.println("SALAHSETAN");
                System.out.println("================================================");
            } 
            else {
                int biaya = hitung(gol[id], kwh);
                System.out.println("================================================");
                System.out.println("ID Pelanggan\t: " + id);
                System.out.println("Nama Pelanggan\t: " + nama[id]);
                System.out.println("Alamat\t\t: " + alamat[id]);
                System.out.println("Golongan anda\t: " + gol[id] + " - " + va[id]);
                System.out.println("Jumlah Tagihan\t: " + biaya);
                System.out.println("================================================");
            }
        }
    }

    public static int hitung(int golo, int kwh) {
        int biaya = 0;

        switch (golo) {
            case 1:
                biaya = 1000 * kwh + 13000;
                break;
            case 2:
                biaya = 1300 * kwh + 13000;
                break;
            case 3:
                biaya = 1500 * kwh + 13000;
                break;
            default:
        }

        if (biaya < 50000) {
            biaya = 50000;
        }
        return biaya;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = {"", "Mira", "Nina", "Oemar", "Pena"};
        String[] jalur = {"", "SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String[] alamat = {"", "Sawojajar", "Kedung kadang", "Ijen", "Dinoyo"};
        String[] kat = {"A", "B", "C"};
        int[] pen = {2000000, 10000000};
        
        System.out.println("================================================");
        System.out.println("             Pembayaran SPP dan DPP             ");
        System.out.println("================================================");
        System.out.print("Masukkan ID anda\t: ");
        int id = input.nextInt();
        if (id<1 || id>4) {
            System.out.println("SALAHSETAN");
            System.out.println("================================================");
        }
        else {
            System.out.print("Masukkan pendapatan orang tua anda: ");
            int gaji = input.nextInt();
            if (gaji < 0) {
                System.out.println("SALAHSETAN");
                System.out.println("================================================"); 
            }
            else {
                System.out.print("Masukkan jumlah bulan SPP yang akan dibayar: ");
                int spp = input.nextInt();
                int biaya = hitung(jalur[id], kat[id], spp, gaji);
                System.out.println("================================================");
                System.out.println("ID Mahasiswa: " + id);
                System.out.println("Nama Mahasiswa: " + nama[id]);
                System.out.println("Jalur masuk: " + jalur[id]);
                System.out.println("Alamat: " + alamat[id]);
                System.out.println("Kategori pendapatan: " + kategori(gaji));
                System.out.println("Jumlah biaya: " + biaya);
                System.out.println("================================================");
            }
        }
    }
    
    public static int pembayaran_spp(String jalur, String kat, int spp, int gaji) {
        int DSP = 0;
        int SPP = 0;
        
        if (jalur.equals("SBMPTN")) {
            if (gaji >= 10000000) {
                DSP = 30000000;
                SPP = 2000000;
            } 
            else if (gaji >= 2000000) {
                DSP = 15000000;
                SPP = 1000000;
            } 
            else {
                DSP = 5000000;
                SPP = 500000;
            }
        } 
        else if (jalur.equals("SNMPTN")) {
            if (gaji >= 10000000) {
                DSP = 35000000;
                SPP = 2000000;
            }
            else if (gaji >= 2000000) {
                DSP = 17000000;
                SPP = 1000000;
            }
            else {
                DSP = 7000000;
                SPP = 500000;
            }
        } 
        else {
            if (gaji >= 10000000) {
                DSP = 50000000;
                SPP = 3000000;
            } 
            else if (gaji >= 2000000) {
                DSP = 25000000;
                SPP = 2000000;
            } 
            else {
                DSP = 10000000;
                SPP = 1000000;
            }
        }
        
        int biaya = (DSP + SPP * spp);
        return biaya;
    }
    
    public static String kategori(int gaji) {
        if (gaji >= 10000000) {
            return "C";
        } 
        else if (gaji >= 2000000) {
            return "B";
        } 
        else {
            return "A";
        }
    }
    public static void tarif_tol(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lok = {"", "Dupak", "Waru", "Sidoarjo", "Porong", "Kejapanan"};

        System.out.println("Daerah Asal");
        for (int i = 1; i < lok.length; i++) {
            System.out.println(i + ". " + lok[i]);
        }
        System.out.print("Daerah Asal Anda: ");
        int asal = input.nextInt();
        System.out.println("================================================");

        switch (asal) {
            case 1:
                System.out.println("Nama Ruas: Dupak - Waru");
                System.out.println("================================================");
                System.out.println("Golongan Kendaraan");
                System.out.println("1. Sedan, Jip, Pick Up");
                System.out.println("2. Truk dengan 2 sumbu roda");
                System.out.println("3. Truk dengan 3 sumbu roda");
                System.out.print("Golongan Kendaraan Anda: ");
                int gol = input.nextInt();
                System.out.println("================================================");
                switch (gol) {
                    case 1:
                        System.out.println("Biaya: 5000");
                        break;
                    case 2:
                        System.out.println("Biaya: 8000");
                        break;
                    case 3:
                        System.out.println("Biaya: 8000");
                        break;
                }
                break;

            case 2:
                System.out.println("Daerah Tujuan");
                System.out.println("1. Sidoarjo");
                System.out.println("2. Porong");
                System.out.print("Daerah Tujuan Anda: ");
                int tujuan = input.nextInt();

                switch (tujuan) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 6000");
                                break;
                            case 2:
                                System.out.println("Biaya: 9000");
                                break;
                            case 3:
                                System.out.println("Biaya: 9000");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 9000");
                                break;
                            case 2:
                                System.out.println("Biaya: 14000");
                                break;
                            case 3:
                                System.out.println("Biaya: 14000");
                                break;
                        }
                        break;
                }
                break;

            case 3:
                System.out.println("Daerah Tujuan");
                System.out.println("1. Waru");
                System.out.println("2. Porong");
                System.out.println("Daerah Tujuan Anda: ");
                tujuan = input.nextInt();

                switch (tujuan) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 6000");
                                break;
                            case 2:
                                System.out.println("Biaya: 9000");
                                break;
                            case 3:
                                System.out.println("Biaya: 9000");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 5500");
                                break;
                            case 2:
                                System.out.println("Biaya: 8500");
                                break;
                            case 3:
                                System.out.println("Biaya: 8500");
                                break;
                        }
                        break;
                }
                break;

            case 4:
                System.out.println("Daerah Tujuan");
                System.out.println("1. Sidoarjo");
                System.out.println("2. Waru");
                System.out.println("3. Kejapanan");
                System.out.println("Daerah Tujuan Anda: ");
                tujuan = input.nextInt();

                switch (tujuan) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 5500");
                                break;
                            case 2:
                                System.out.println("Biaya: 8500");
                                break;
                            case 3:
                                System.out.println("Biaya: 8500");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 9000");
                                break;
                            case 2:
                                System.out.println("Biaya: 14000");
                                break;
                            case 3:
                                System.out.println("Biaya: 14000");
                                break;
                        }
                        break;
                        
                        case 3:
                        System.out.println("================================================");
                        System.out.println("Golongan Kendaraan");
                        System.out.println("1. Sedan, Jip, Pick Up");
                        System.out.println("2. Truk dengan 2 sumbu roda");
                        System.out.println("3. Truk dengan 3 sumbu roda");
                        System.out.print("Golongan Kendaraan Anda: ");
                        gol = input.nextInt();
                        System.out.println("================================================");
                        switch (gol) {
                            case 1:
                                System.out.println("Biaya: 6000");
                                break;
                            case 2:
                                System.out.println("Biaya: 8500");
                                break;
                            case 3:
                                System.out.println("Biaya: 8500");
                                break;
                        }
                        break;
                }
                break;
                
                case 5:
                System.out.println("Nama Ruas: Kajapanan - Gempol");
                System.out.println("================================================");
                System.out.println("Golongan Kendaraan");
                System.out.println("1. Sedan, Jip, Pick Up");
                System.out.println("2. Truk dengan 2 sumbu roda");
                System.out.println("3. Truk dengan 3 sumbu roda");
                System.out.print("Golongan Kendaraan Anda: ");
                gol = input.nextInt();
                System.out.println("================================================");
                switch (gol) {
                    case 1:
                        System.out.println("Biaya: 3000");
                        break;
                    case 2:
                        System.out.println("Biaya: 5000");
                        break;
                    case 3:
                        System.out.println("Biaya: 5000");
                        break;
                }
                break;
                default : System.out.println("SALAHSETAN");
        }
    }
    public static void tarif_cottage(String[] args) {
        Scanner input = new Scanner (System.in);  
        String[] nama = {"", "Ali", "Budi", "Dani", "Edi", "Umar"};
        String[] cot = {"", "Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga", "Kedondong", "Barrack"};
        int[] wday = {0, 915000, 915000, 575000, 575000, 595000, 595000, 495000, 495000, 495000, 25000};
        int[] wend = {0, 1025000, 1025000, 695000, 695000, 715000, 715000, 575000, 575000, 575000, 25000};
        int[] holi = {0, 1225000, 1225000, 895000, 895000, 915000, 915000, 755000, 755000, 755000, 35000};
        int tipe = 0;
        int gol = 0;
        int lama = 0;

        System.out.println("==================================");
        System.out.println("     BHAKTI ALAM Cottage Rate     ");
        System.out.println("==================================");
        System.out.print("Masukkan ID Anda: ");
        int id = input.nextInt();
        System.out.println("==================================");

        if (id < 1 || id > 5) {
            System.out.println("SALAHSETAN");
            System.out.println("==================================");
        } else {
            System.out.println("Tipe Cottage: ");
            for (int i = 1; i < cot.length; i++) {
                System.out.println(i + ". " + cot[i]);
            }
            System.out.print("Tipe Cottage Anda: ");
            tipe = input.nextInt();
            if (tipe < 1 || tipe >= cot.length) {
                System.out.println("SALAHSETAN");
            }
            System.out.println("==================================");
        }

        System.out.println("Golongan Hari");
        System.out.println("1. Weekday");
        System.out.println("2. Weekend");
        System.out.println("3. Holiday");
        System.out.print("Golongan Hari Anda: ");
        gol = input.nextInt();
        System.out.println("==================================");
        if (gol < 1 || gol > 3) {
            System.out.println("SALAHSETAN");
            System.out.println("==================================");
        } else {
            System.out.print("Lama Menginap (hari): ");
            lama = input.nextInt();
            int biaya = hitung(tipe, gol, lama, wday, wend, holi, cot);
            System.out.println("==================================");
            System.out.println("ID Pelanggan: " + id);
            System.out.println("Nama Pelanggan: " + nama[id]);
            System.out.println("Jumlah Hari: " + lama);
            System.out.println("Tipe Cottage: " + cot[tipe]);
            System.out.println("Jumlah biaya: " + biaya);
            System.out.println("==================================");
        }
    }

    public static int hitung(int tipe, int gol, int lama, int wday[], int wend[], int holi[], String cot[]) {
        int biaya = 0;
        if (tipe < 1 || tipe >= cot.length || gol < 1 || gol > 3) {
            System.out.println("SALAHSETAN");
        } else {
            if (gol == 1) {
                biaya = wday[tipe] * lama;
            } else if (gol == 2) {
                biaya = wend[tipe] * lama;
            } else if (gol == 3) {
                biaya = holi[tipe] * lama;
            }
        }
        return biaya;
    }

    private static int hitung(String string, String string0, int spp, int gaji) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    

