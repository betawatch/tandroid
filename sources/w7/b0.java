package w7;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class b0 {
    /* JADX WARN: Can't wrap try/catch for region: R(5:15|16|17|(1:40)|(6:22|23|24|25|27|28)(2:30|31)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r4 = r0.c;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r4 == 307) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r7 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r14 = r14 + 1;
        r0 = r3.a();
        r0.e = android.net.Uri.parse(r7);
        r3 = r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r7 = (java.lang.String) r4.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r2 = e2.m0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n2.w a(g2.h hVar, String str, byte[] bArr, Map map) {
        g2.b0 b0Var = new g2.b0(hVar);
        Map map2 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        v7.u6.l(parse, "The uri must be set.");
        g2.m mVar = new g2.m(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g2.m mVar2 = mVar;
        while (true) {
            try {
                g2.k kVar = new g2.k(b0Var, mVar2);
                byte[] b10 = f9.f.b(kVar);
                u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                m4.c cVar = new m4.c(b10, 3);
                cVar.c = uVar;
                n2.w wVar = new n2.w(cVar);
                try {
                    kVar.close();
                } catch (IOException unused) {
                }
                return wVar;
            } catch (Exception e) {
                throw new n2.x(mVar, b0Var.c, b0Var.a.getResponseHeaders(), b0Var.b, e);
            }
        }
    }

    public static boolean b(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
