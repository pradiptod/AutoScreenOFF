# AutoScreen OEM — Cloud Build (Android phone only)

## Cara membuat APK tanpa komputer
1. Buka https://github.com di browser HP dan masuk/daftar akun.
2. Buat repository baru bernama `AutoScreenOEM` (boleh Private).
3. Upload seluruh isi folder proyek ini ke root repository. Pastikan folder `.github/workflows` ikut terunggah dan file workflow bernama `android.yml`.
4. Buka tab **Actions** pada repository.
5. Pilih **Build AutoScreen OEM APK** lalu tekan **Run workflow**.
6. Tunggu sampai job selesai dengan tanda hijau.
7. Buka hasil run, bagian **Artifacts**, unduh `AutoScreenOEM-debug-apk`.
8. Ekstrak ZIP artifact. File APK di dalamnya bernama `app-debug.apk`.

## Catatan penting
- Workflow ini menghasilkan APK debug untuk uji coba, bukan rilis produksi.
- APK belum membuktikan bahwa panel LCD Allwinner bisa benar-benar dipadamkan tanpa menghentikan audio. Perilaku bergantung firmware/MCU head unit.
- Fitur lock screen memakai Device Admin dan bisa meminta aktivasi izin administrator perangkat.
- Uji pertama saat mobil parkir. Jangan mengaktifkan otomatisasi saat berkendara sebelum perilaku audio, layar, dan wake terverifikasi.
