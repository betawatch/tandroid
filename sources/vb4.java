// default package

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vb4 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ xb4 e;

    /* JADX WARN: Multi-variable type inference failed */
    public vb4(xb4 xb4Var, Object obj, TLRPC.Document document, String str, int i) {
        this.e = xb4Var;
        this.a = obj;
        this.b = document;
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6 > r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hb4 hb4Var, long j, long j2) {
        int i;
        sm5 sm5Var = this.e.F;
        if (sm5Var != null) {
            in5 in5Var = sm5Var.b;
            String str = this.c;
            in5Var.u.put(str, new long[]{j, j2});
            if (!in5Var.h.isEmpty() && (i = hb4Var.J) > 0) {
                long j3 = i;
                if (hb4Var.a0 > j3) {
                    ArrayList arrayList = hb4Var.M;
                    if (arrayList != null) {
                        long j4 = Long.MAX_VALUE;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            try {
                                j4 = Math.min(j4, ((fb4) arrayList.get(i2)).a);
                            } catch (Throwable th) {
                                cc4.g(th, true);
                            }
                        }
                    }
                    in5Var.s.c(new re4((Object) sm5Var, (Object) str, (Object) hb4Var, (byte) 26));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j5 = hb4Var.L;
            if (j5 == 0 || j5 < elapsedRealtime - 500 || j == 0) {
                hb4Var.L = elapsedRealtime;
                hl.c3(new m30(sm5Var.a, j, j2, str));
            }
        }
    }

    public final void b(hb4 hb4Var, int i) {
        int i2;
        Object obj = this.a;
        xb4 xb4Var = this.e;
        ConcurrentHashMap concurrentHashMap = xb4Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        xb4.K.d(new cv2(xb4Var, hb4Var.e1, hb4Var, (byte) 28), 0L);
        sm5 sm5Var = xb4Var.F;
        if (sm5Var != null) {
            sm5Var.b.u.remove(str);
            i2 = i;
            hl.c3(new aq1((Object) sm5Var, (Object) str, i2, sm5Var.a, (byte) 6));
        } else {
            i2 = i;
        }
        if (this.b == null || !(obj instanceof r47) || i2 != 0) {
            if (i2 == -1) {
                LaunchActivity.F(2);
            }
        } else {
            lq3 downloadController = xb4Var.getDownloadController();
            r47 r47Var = (r47) obj;
            downloadController.getClass();
            hl.c3(new ze7((Object) downloadController, (Object) r47Var, i2, (byte) 22));
            downloadController.getMessagesStorage().a.c(new gq3(downloadController, r47Var, (byte) 0));
        }
    }

    public final void c(hb4 hb4Var, File file) {
        Object obj = this.a;
        xb4 xb4Var = this.e;
        byte b = 28;
        if (!hb4Var.y && hb4Var.z) {
            xb4.K.d(new cv2(xb4Var, hb4Var.e1, hb4Var, b), 0L);
            return;
        }
        hc4 E = xb4.E(obj);
        if (E != null) {
            ic4 ic4Var = xb4Var.getFileLoader().d;
            ic4Var.getClass();
            if (file != null) {
                ic4Var.h(new cv2(ic4Var, file, E, (byte) 29));
            }
        }
        if (obj instanceof r47) {
            r47 r47Var = (r47) obj;
            if (this.b != null && r47Var.P) {
                lq3 downloadController = xb4Var.getDownloadController();
                downloadController.getClass();
                if (r47Var.F0() != null) {
                    hl.c3(new iq3(downloadController, r47Var.F0(), r47Var, (byte) 1));
                }
            }
        }
        if (!hb4Var.y) {
            xb4Var.x.remove(this.c);
            sm5 sm5Var = xb4Var.F;
            if (sm5Var != null) {
                String str = this.c;
                Object obj2 = this.a;
                byte b2 = this.d;
                sm5Var.b.u.remove(str);
                hl.c3(new a52(sm5Var, file, str, sm5Var.a, obj2, b2));
            }
        }
        xb4.K.d(new cv2(xb4Var, hb4Var.e1, hb4Var, b), 0L);
    }
}
