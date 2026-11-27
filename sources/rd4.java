// default package

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rd4 extends Thread {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd4(yla ylaVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = ylaVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FilesMigrationService filesMigrationService = (FilesMigrationService) this.b;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!TextUtils.isEmpty(xea.e0)) {
                    ArrayList c1 = hl.c1();
                    int size = c1.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            File file = (File) c1.get(i);
                            if (file.getAbsolutePath().startsWith(xea.e0)) {
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
                cc4.b("move time = " + (System.currentTimeMillis() - currentTimeMillis));
                a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("migration_to_scoped_storage_finished", true).apply();
                hl.c3(new lw3((Object) this, (byte) 20));
                break;
            default:
                do {
                    try {
                    } catch (InterruptedException e) {
                        vr9.l(e);
                    }
                } while (((yla) this.b).j());
        }
    }

    public rd4(FilesMigrationService filesMigrationService) {
        this.b = filesMigrationService;
    }
}
