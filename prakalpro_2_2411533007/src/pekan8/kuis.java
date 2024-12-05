package pekan8;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class kuis {

    private JFrame frmAplikasiRaziaMotor;
    private JTextField txtAplikasiRaziaMotor;
    private JTextField txtNama;
    private JTextField txtUmur;
    private JTextField txtSimC;
    private JTextField Nama;
    private JTextField Umur;
    private JLabel lblOutput; 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    kuis window = new kuis();
                    window.frmAplikasiRaziaMotor.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public kuis() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAplikasiRaziaMotor = new JFrame();
        frmAplikasiRaziaMotor.setTitle("Aplikasi Razia Motor");
        frmAplikasiRaziaMotor.setBounds(100, 100, 450, 350); 
        frmAplikasiRaziaMotor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAplikasiRaziaMotor.getContentPane().setLayout(null);

        // Title label
        txtAplikasiRaziaMotor = new JTextField();
        txtAplikasiRaziaMotor.setEditable(false);
        txtAplikasiRaziaMotor.setFont(new Font("Times New Roman", Font.BOLD, 12));
        txtAplikasiRaziaMotor.setText("Aplikasi Razia Motor Online");
        txtAplikasiRaziaMotor.setHorizontalAlignment(SwingConstants.CENTER);
        txtAplikasiRaziaMotor.setBounds(137, 24, 174, 20);
        frmAplikasiRaziaMotor.getContentPane().add(txtAplikasiRaziaMotor);
        txtAplikasiRaziaMotor.setColumns(10);

        // Teks Nama
        txtNama = new JTextField();
        txtNama.setEditable(false);
        txtNama.setText("Nama");
        txtNama.setHorizontalAlignment(SwingConstants.CENTER);
        txtNama.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        txtNama.setColumns(10);
        txtNama.setBounds(63, 66, 69, 20);
        frmAplikasiRaziaMotor.getContentPane().add(txtNama);

        // Teks Umur
        txtUmur = new JTextField();
        txtUmur.setEditable(false);
        txtUmur.setText("Umur");
        txtUmur.setHorizontalAlignment(SwingConstants.CENTER);
        txtUmur.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        txtUmur.setColumns(10);
        txtUmur.setBounds(63, 97, 69, 20);
        frmAplikasiRaziaMotor.getContentPane().add(txtUmur);

        //Teks Sim C
        txtSimC = new JTextField();
        txtSimC.setEditable(false);
        txtSimC.setText("Sim C");
        txtSimC.setHorizontalAlignment(SwingConstants.CENTER);
        txtSimC.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        txtSimC.setColumns(10);
        txtSimC.setBounds(63, 128, 69, 20);
        frmAplikasiRaziaMotor.getContentPane().add(txtSimC);

        // Pilihan (Yes/No)
        JComboBox<String> Pilihan = new JComboBox<>();
        Pilihan.setModel(new DefaultComboBoxModel<>(new String[] {"Ya", "Tidak"}));
        Pilihan.setBounds(192, 127, 69, 22);
        frmAplikasiRaziaMotor.getContentPane().add(Pilihan);

        // Input Nama  
        Nama = new JTextField();
        Nama.setBounds(192, 66, 159, 20);
        frmAplikasiRaziaMotor.getContentPane().add(Nama);
        Nama.setColumns(10);

        // Input Umur  
        Umur = new JTextField();
        Umur.setColumns(10);
        Umur.setBounds(192, 97, 86, 20);
        frmAplikasiRaziaMotor.getContentPane().add(Umur);

     // Proses button
        JButton btnProses = new JButton("Proses");
        btnProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menangani aksi tombol Proses
                String nama = Nama.getText(); // Mengambil input nama
                String umurText = Umur.getText(); // Mengambil input umur
                String simC = (String) Pilihan.getSelectedItem(); // Mengambil pilihan "Ya" atau "Tidak"
                
                // Label output untuk menampilkan hasil
                lblOutput.setText(""); // Reset label output sebelum diisi dengan hasil baru

                try {
                    int umur = Integer.parseInt(umurText); // Mengonversi umur dari String ke int
                    // Kondisi untuk menentukan output berdasarkan umur dan pilihan SIM C
                    if (umur >= 17 && "Ya".equals(simC)) {
                        lblOutput.setText(nama + " Anda sudah dewasa dan boleh bawa motor.");
                    } else if (umur >= 17 && "Tidak".equals(simC)) {
                        lblOutput.setText(nama + " Anda sudah dewasa tetapi tidak boleh bawa motor.");
                    } else if (umur < 17 && "Ya".equals(simC)) {
                        lblOutput.setText(nama + " Anda belum cukup umur punya SIM.");
                    } else {
                        lblOutput.setText(nama + " Anda belum cukup umur dan tidak boleh bawa motor.");
                    }
                } catch (NumberFormatException ex) {
                    // Menampilkan pesan error jika umur bukan angka
                    lblOutput.setText("Umur harus berupa angka!");
                }
            }
        });
        btnProses.setBounds(120, 177, 89, 23);
        frmAplikasiRaziaMotor.getContentPane().add(btnProses);


        // Reset button
        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mengosongkan semua input
                Nama.setText("");
                Umur.setText("");
                Pilihan.setSelectedIndex(0); // Mengatur pilihan kembali ke "Ya"
                lblOutput.setText(""); // Mengosongkan output
            }
        });
        btnReset.setBounds(262, 177, 89, 23);
        frmAplikasiRaziaMotor.getContentPane().add(btnReset);

        // JLabel untuk menampilkan output di bawah form
        lblOutput = new JLabel();
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(47, 210, 351, 50); // Menempatkan label di bawah tombol
        frmAplikasiRaziaMotor.getContentPane().add(lblOutput);
    }
}
