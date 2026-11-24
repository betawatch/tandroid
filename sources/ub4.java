// default package

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ub4 extends Thread {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub4(dia diaVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = diaVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(gba.e0)) {
                    ArrayList c1 = gl.c1();
                    int size = c1.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            File file = (File) c1.get(i);
                            if (file.getAbsolutePath().startsWith(gba.e0)) {
                                externalStorageDirectory = file;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                File file2 = new File(a.b.getExternalFilesDir(null), "Telegram");
                File file3 = new File(externalStorageDirectory, "Telegram");
                filesMigrationService.a = FilesMigrationService.b(file3);
                long currentTimeMillis = System.currentTimeMillis();
                if (file3.canRead() && file3.canWrite()) {
                    filesMigrationService.c(file3, file2);
                }
                fa4.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                gl.c3(new s54((Object) this, (byte) 7));
                break;
            default:
                do {
                    try {
                    } catch (InterruptedException e) {
                        ho9.n(e);
                    }
                } while (((dia) this.b).j());
        }
    }

    public ub4(FilesMigrationService filesMigrationService) {
        this.b = filesMigrationService;
    }
}
