package lundy.com.latihanpertama;

import java.util.ArrayList;

import lundy.com.latihanpertama.DataSetGet;

// List String untuk data Menu yang tampil di Beranda beserta source aset dan Activity yang di Start dalam Package
public class DataObjek {
    public static String[][] data = new String[][]{
                {"Mobprog", "IK323"},
                    {"Sistem Informasi", "IK323"},
                        {"Kecerdasan Buatan", "IK323"}
    };
        //Untuk menambah Menu Grid cukup tambahkan array string 'Data' diatas
        //Fungsi untuk List String ini akan dimasukkan ke Array List Objek 'BerandaSetget'
        public static ArrayList<DataSetGet> getListData(){
            //Deklarasi Objek
            DataSetGet dataSetGet = null;
            //Menyusun Objek ke dalam Array Objek
            ArrayList<DataSetGet> list = new ArrayList<>();
            //Mengisi array yang masih kosong dengan isian data satu per satu dari array String
            for (int i = 0; i <data.length; i++) {
                dataSetGet = new DataSetGet();
                dataSetGet.setCode(data[i][1]);
                dataSetGet.setName(data[i][0]);
                list.add(dataSetGet);
            }
            return list;
        }


    }

