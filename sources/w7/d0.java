package w7;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d0 {
    public static n2.w a(g2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        g2.c0 c0Var = new g2.c0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        v7.t6.l(parse, "The uri must be set.");
        g2.n nVar = new g2.n(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g2.n nVar2 = nVar;
        while (true) {
            try {
                g2.l lVar = new g2.l(c0Var, nVar2);
                try {
                    byte[] b10 = f9.f.b(lVar);
                    u2.u uVar = new u2.u(nVar, c0Var.c, c0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                    m4.c cVar = new m4.c(b10, 3);
                    cVar.c = uVar;
                    n2.w wVar = new n2.w(cVar);
                    try {
                        lVar.close();
                    } catch (IOException unused) {
                    }
                    return wVar;
                } catch (g2.y e) {
                    int i11 = e.c;
                    String str2 = null;
                    if ((i11 == 307 || i11 == 308) && i10 < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 == null) {
                        throw e;
                    }
                    i10++;
                    g2.m a2 = nVar2.a();
                    a2.e = Uri.parse(str2);
                    nVar2 = a2.d();
                    try {
                        lVar.close();
                    } catch (IOException unused2) {
                    }
                } finally {
                    String str3 = e2.l0.a;
                    try {
                        lVar.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Exception e7) {
                throw new n2.x(nVar, c0Var.c, c0Var.a.getResponseHeaders(), c0Var.b, e7);
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
