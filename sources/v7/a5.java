package v7;

import org.telegram.ui.Components.dl0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a5 {
    public static void a(dl0 dl0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        dl0Var.r(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q());
    }

    public static int b(bi.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? org.telegram.messenger.i0.L(i0.a.e(r4, 1, 24, 28)) : 0);
    }

    public static int c(bi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.i0.L(i0.a.e(r3, 1, 16, 12));
    }

    public static int d(bi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return org.telegram.messenger.i0.L(i0.a.e(r3, 1, 16, 8));
    }
}
