// default package

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class sge {
    public static ls6 a(a83 a83Var, String str, byte[] bArr, Map map) {
        Throwable th;
        Throwable th2;
        Map map2;
        List list;
        byte[] b;
        g83 g83Var;
        c0b c0bVar = new c0b(a83Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        jte.l(parse, "The uri must be set.");
        g83 g83Var2 = new g83(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        g83 g83Var3 = g83Var2;
        while (true) {
            try {
                e83 e83Var = new e83(c0bVar, g83Var3);
                try {
                    b = i61.b(e83Var);
                    g83Var = g83Var2;
                } catch (ki5 e) {
                    e = e;
                }
                try {
                    da6 da6Var = new da6(-1L, g83Var, SystemClock.elapsedRealtime());
                    da6Var.d = c0bVar.c;
                    da6Var.e = c0bVar.d;
                    da6Var.g = b.length;
                    ea6 ea6Var = new ea6(da6Var);
                    mj4 mj4Var = new mj4(b);
                    mj4Var.c = ea6Var;
                    ls6 ls6Var = new ls6(mj4Var);
                    String str2 = hac.a;
                    try {
                        e83Var.close();
                    } catch (IOException unused) {
                    }
                    return ls6Var;
                } catch (ki5 e2) {
                    e = e2;
                    g83Var2 = g83Var;
                    try {
                        int i2 = e.c;
                        String str3 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str3 = (String) list.get(0);
                        }
                        if (str3 == null) {
                            throw e;
                        }
                        i++;
                        f83 a = g83Var3.a();
                        a.a = Uri.parse(str3);
                        g83Var3 = a.a();
                        String str4 = hac.a;
                        try {
                            e83Var.close();
                        } catch (IOException unused2) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        String str5 = hac.a;
                        try {
                            e83Var.close();
                            throw th2;
                        } catch (IOException unused3) {
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    String str52 = hac.a;
                    e83Var.close();
                    throw th2;
                }
            } catch (Exception e3) {
                throw new ms6(g83Var2, c0bVar.c, c0bVar.a.getResponseHeaders(), c0bVar.b, e3);
            }
        }
    }

    public static boolean b(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
