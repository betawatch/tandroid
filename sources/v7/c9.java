package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class c9 {
    public static t7.r a;

    public static void a(sl0 sl0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        sl0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q());
    }

    public static int b(ji.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r4, 1, 24, 28)) : 0);
    }

    public static int c(ji.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r3, 1, 16, 12));
    }

    public static int d(ji.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r3, 1, 16, 8));
    }

    public static synchronized y8 e(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (a == null) {
                    a = new t7.r(1);
                }
                y8Var = (y8) a.O0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
