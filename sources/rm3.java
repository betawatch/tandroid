// default package

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ File b;

    public /* synthetic */ rm3(File file, byte b) {
        this.a = b;
        this.b = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int c;
        byte b = this.a;
        File file = this.b;
        switch (b) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                SharedPreferences c1 = na7.c1();
                boolean z = true;
                long[] jArr = {0};
                try {
                    CountDownLatch e = zm3.e();
                    if (e != null) {
                        try {
                            e.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f = zm3.f(zm3.a(), "tinylid");
                    if (f == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    if (zm3.i(f, file)) {
                        Log.d("Dictation", "tinylid: a newer model on the server, updating");
                    }
                    c = zm3.c(f, file, true, new vu2(jArr, (byte) 25));
                    if (c >= 0) {
                        c1.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
                if (c > 0) {
                    DictationLid.e = true;
                    DictationLid.g = true;
                    try {
                        DictationLid.a.execute(new rm3(file, (byte) 2));
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            Log.d("Dictation", "tinylid: download failed: " + th);
                            break;
                        } finally {
                            if (!z) {
                                DictationLid.h = false;
                            }
                            DictationLid.f = false;
                            DictationLid.f();
                            DictationAsr.I("tinylid.bin");
                        }
                    }
                    return;
                }
                return;
            case 1:
                DictationLid.e(file);
                return;
            default:
                DictationLid.e(file);
                DictationLid.h = false;
                DictationLid.f();
                return;
        }
    }
}
