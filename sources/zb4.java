// default package

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zb4 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ bc4 e;

    /* JADX WARN: Multi-variable type inference failed */
    public zb4(bc4 bc4Var, Object obj, TLRPC.Document document, String str, int i) {
        this.e = bc4Var;
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
    public final void a(lb4 lb4Var, long j, long j2) {
        int i;
        pm5 pm5Var = this.e.F;
        if (pm5Var != null) {
            fn5 fn5Var = pm5Var.b;
            String str = this.c;
            fn5Var.u.put(str, new long[]{j, j2});
            if (!fn5Var.h.isEmpty() && (i = lb4Var.J) > 0) {
                long j3 = i;
                if (lb4Var.a0 > j3) {
                    ArrayList arrayList = lb4Var.M;
                    if (arrayList != null) {
                        long j4 = Long.MAX_VALUE;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            try {
                                j4 = Math.min(j4, ((jb4) arrayList.get(i2)).a);
                            } catch (Throwable th) {
                                fc4.g(th, true);
                            }
                        }
                    }
                    fn5Var.s.c(new if4((Object) pm5Var, (Object) str, (Object) lb4Var, (byte) 23));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j5 = lb4Var.L;
            if (j5 == 0 || j5 < elapsedRealtime - 500 || j == 0) {
                lb4Var.L = elapsedRealtime;
                gm.c3(new l40(pm5Var.a, j, j2, str));
            }
        }
    }

    public final void b(lb4 lb4Var, int i) {
        int i2;
        Object obj = this.a;
        bc4 bc4Var = this.e;
        ConcurrentHashMap concurrentHashMap = bc4Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        bc4.K.d(new pz2(bc4Var, lb4Var.e1, lb4Var, (byte) 26), 0L);
        pm5 pm5Var = bc4Var.F;
        if (pm5Var != null) {
            pm5Var.b.u.remove(str);
            i2 = i;
            gm.c3(new zq1((Object) pm5Var, (Object) str, i2, pm5Var.a, (byte) 6));
        } else {
            i2 = i;
        }
        byte b = 2;
        if (this.b == null || !(obj instanceof k47) || i2 != 0) {
            if (i2 == -1) {
                LaunchActivity.F(2);
            }
        } else {
            er3 downloadController = bc4Var.getDownloadController();
            k47 k47Var = (k47) obj;
            downloadController.getClass();
            gm.c3(new wc7((Object) downloadController, (Object) k47Var, i2, (byte) 22));
            downloadController.getMessagesStorage().a.c(new ar3(downloadController, k47Var, b));
        }
    }

    public final void c(lb4 lb4Var, File file) {
        Object obj = this.a;
        bc4 bc4Var = this.e;
        byte b = 26;
        if (!lb4Var.y && lb4Var.z) {
            bc4.K.d(new pz2(bc4Var, lb4Var.e1, lb4Var, b), 0L);
            return;
        }
        kc4 E = bc4.E(obj);
        if (E != null) {
            lc4 lc4Var = bc4Var.getFileLoader().d;
            lc4Var.getClass();
            if (file != null) {
                lc4Var.h(new pz2(lc4Var, file, E, (byte) 27));
            }
        }
        if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            if (this.b != null && k47Var.P) {
                er3 downloadController = bc4Var.getDownloadController();
                downloadController.getClass();
                if (k47Var.F0() != null) {
                    gm.c3(new zq3(downloadController, k47Var.F0(), k47Var, (byte) 0));
                }
            }
        }
        if (!lb4Var.y) {
            bc4Var.x.remove(this.c);
            pm5 pm5Var = bc4Var.F;
            if (pm5Var != null) {
                String str = this.c;
                Object obj2 = this.a;
                byte b2 = this.d;
                pm5Var.b.u.remove(str);
                gm.c3(new v52(pm5Var, file, str, pm5Var.a, obj2, b2));
            }
        }
        bc4.K.d(new pz2(bc4Var, lb4Var.e1, lb4Var, b), 0L);
    }
}
