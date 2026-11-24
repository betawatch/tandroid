// default package

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xm3 implements gk7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long[] b;
    public final /* synthetic */ ym3 c;
    public final /* synthetic */ File[] d;
    public final /* synthetic */ File e;
    public final /* synthetic */ CountDownLatch f;

    public xm3(String str, long[] jArr, ym3 ym3Var, File[] fileArr, File file, CountDownLatch countDownLatch) {
        this.a = str;
        this.b = jArr;
        this.c = ym3Var;
        this.d = fileArr;
        this.e = file;
        this.f = countDownLatch;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        File file;
        if (objArr.length != 0) {
            Object obj = objArr[0];
            String str = this.a;
            if (str.equals(obj)) {
                this.b[0] = SystemClock.elapsedRealtime();
                if (i == kk7.W1) {
                    this.c.c(((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue());
                    return;
                }
                if (i == kk7.X1) {
                    if (objArr.length > 1) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof File) {
                            file = (File) obj2;
                            this.d[0] = file;
                        }
                    }
                    file = this.e;
                    this.d[0] = file;
                } else {
                    if (i != kk7.Y1) {
                        return;
                    }
                    StringBuilder p = ug8.p("speech models: ", str, " download failed (");
                    p.append(objArr.length > 1 ? objArr[1] : "");
                    p.append(")");
                    Log.d("Dictation", p.toString());
                    na7.c1().edit().remove("speech_models_checked").apply();
                }
                this.f.countDown();
            }
        }
    }
}
