// default package

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class w01 {
    public static boolean a = true;
    public static final boolean b;
    public static final String c;
    public static final byte d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static String h;
    public static final boolean i;
    public static final boolean j;
    public static Boolean k;

    static {
        b = Build.VERSION.SDK_INT <= 29;
        c = "13.3.2";
        d = (byte) 4;
        e = "014b35b6184100b085b0d0572f9b5103";
        f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        i = true;
        j = true;
        if (a.b != null) {
            a.b.getSharedPreferences("systemConfig", 0);
            a = true;
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: v01
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    fa4.i(th, false);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        }
    }

    public static boolean a() {
        Boolean bool = k;
        if (bool == null) {
            bool = Boolean.valueOf(a.b != null && "org.telegram.messenger.beta".equals(a.b.getPackageName()));
            k = bool;
        }
        return bool.booleanValue();
    }

    public static boolean b() {
        kl8 kl8Var;
        if (ci0.n) {
            return true;
        }
        a.t();
        a();
        a.q();
        if (ci0.h().j() && (kl8Var = ci0.l) != null) {
            ArrayList arrayList = kl8Var.h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ArrayList arrayList2 = ((jl8) obj).b.a;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    hl8 hl8Var = (hl8) obj2;
                    Iterator it = na7.q1(y6c.t0).k4.A3.f.iterator();
                    while (it.hasNext()) {
                        if (Objects.equals(hl8Var.c, (String) it.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
