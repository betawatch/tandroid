package w7;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static n2.v a(g2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        g2.b0 b0Var = new g2.b0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        v7.u6.l(parse, "The uri must be set.");
        g2.m mVar = new g2.m(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g2.m mVar2 = mVar;
        while (true) {
            try {
                g2.k kVar = new g2.k(b0Var, mVar2);
                try {
                    byte[] b10 = f9.f.b(kVar);
                    u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                    m2.t tVar = new m2.t(b10);
                    tVar.c = uVar;
                    n2.v vVar = new n2.v(tVar);
                    try {
                        kVar.close();
                    } catch (IOException unused) {
                    }
                    return vVar;
                } catch (g2.x e) {
                    try {
                        int i11 = e.c;
                        String str2 = null;
                        if ((i11 == 307 || i11 == 308) && i10 < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i10++;
                        g2.l a2 = mVar2.a();
                        a2.e = Uri.parse(str2);
                        mVar2 = a2.d();
                        try {
                            kVar.close();
                        } catch (IOException unused2) {
                        }
                    } finally {
                        String str3 = e2.m0.a;
                        try {
                            kVar.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
            } catch (Exception e7) {
                throw new n2.w(mVar, b0Var.c, b0Var.a.getResponseHeaders(), b0Var.b, e7);
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
