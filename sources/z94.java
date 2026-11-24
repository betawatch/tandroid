// default package

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class z94 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ ba4 e;

    /* JADX WARN: Multi-variable type inference failed */
    public z94(ba4 ba4Var, Object obj, TLRPC.Document document, String str, int i) {
        this.e = ba4Var;
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
    public final void a(l94 l94Var, long j, long j2) {
        int i;
        pk5 pk5Var = this.e.F;
        if (pk5Var != null) {
            fl5 fl5Var = pk5Var.b;
            String str = this.c;
            fl5Var.u.put(str, new long[]{j, j2});
            if (!fl5Var.h.isEmpty() && (i = l94Var.J) > 0) {
                long j3 = i;
                if (l94Var.a0 > j3) {
                    ArrayList arrayList = l94Var.M;
                    if (arrayList != null) {
                        long j4 = Long.MAX_VALUE;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            try {
                                j4 = Math.min(j4, ((j94) arrayList.get(i2)).a);
                            } catch (Throwable th) {
                                fa4.g(th, true);
                            }
                        }
                    }
                    fl5Var.s.c(new jf4((Object) pk5Var, (Object) str, (Object) l94Var, (byte) 21));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j5 = l94Var.L;
            if (j5 == 0 || j5 < elapsedRealtime - 500 || j == 0) {
                l94Var.L = elapsedRealtime;
                gl.c3(new l30(pk5Var.a, j, j2, str));
            }
        }
    }

    public final void b(l94 l94Var, int i) {
        int i2;
        Object obj = this.a;
        ba4 ba4Var = this.e;
        ConcurrentHashMap concurrentHashMap = ba4Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        ba4.K.d(new mg3(ba4Var, l94Var.e1, l94Var, (byte) 24), 0L);
        pk5 pk5Var = ba4Var.F;
        if (pk5Var != null) {
            pk5Var.b.u.remove(str);
            i2 = i;
            gl.c3(new mp1((Object) pk5Var, (Object) str, i2, pk5Var.a, (byte) 6));
        } else {
            i2 = i;
        }
        byte b = 2;
        if (this.b == null || !(obj instanceof k27) || i2 != 0) {
            if (i2 == -1) {
                LaunchActivity.E(2);
            }
        } else {
            up3 downloadController = ba4Var.getDownloadController();
            k27 k27Var = (k27) obj;
            downloadController.getClass();
            gl.c3(new va7((Object) downloadController, (Object) k27Var, i2, (byte) 22));
            downloadController.getMessagesStorage().a.c(new qp3(downloadController, k27Var, b));
        }
    }

    public final void c(l94 l94Var, File file) {
        Object obj = this.a;
        ba4 ba4Var = this.e;
        byte b = 24;
        if (!l94Var.y && l94Var.z) {
            ba4.K.d(new mg3(ba4Var, l94Var.e1, l94Var, b), 0L);
            return;
        }
        ka4 E = ba4.E(obj);
        if (E != null) {
            la4 la4Var = ba4Var.getFileLoader().d;
            la4Var.getClass();
            if (file != null) {
                la4Var.h(new mg3(la4Var, file, E, (byte) 25));
            }
        }
        if (obj instanceof k27) {
            k27 k27Var = (k27) obj;
            if (this.b != null && k27Var.P) {
                up3 downloadController = ba4Var.getDownloadController();
                downloadController.getClass();
                if (k27Var.F0() != null) {
                    gl.c3(new pp3(downloadController, k27Var.F0(), k27Var, (byte) 0));
                }
            }
        }
        if (!l94Var.y) {
            ba4Var.x.remove(this.c);
            pk5 pk5Var = ba4Var.F;
            if (pk5Var != null) {
                String str = this.c;
                Object obj2 = this.a;
                byte b2 = this.d;
                pk5Var.b.u.remove(str);
                gl.c3(new k42(pk5Var, file, str, pk5Var.a, obj2, b2));
            }
        }
        ba4.K.d(new mg3(ba4Var, l94Var.e1, l94Var, b), 0L);
    }
}
