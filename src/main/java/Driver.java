package src.main.java;

public class Driver {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
        mahasiswa.setIpk(3.80);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
        mahasiswa.setIpk(2.50);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());

        // Additional repeated blocks to increase duplication
        mahasiswa.setIpk(3.20);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
        mahasiswa.setIpk(1.80);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
        mahasiswa.setIpk(4.00);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());

        mahasiswa.setIpk(3.80);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
        mahasiswa.setIpk(2.50);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());

        mahasiswa.setIpk(3.20);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
        mahasiswa.setIpk(1.80);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
        mahasiswa.setIpk(4.00);
        System.out.println("IPK saat ini: " + mahasiswa.getIpk());
        System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
    }
}
