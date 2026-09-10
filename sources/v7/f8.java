package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cm0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class f8 {
    public static void a(cm0 cm0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        cm0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q());
    }

    public static int b(hi.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(hc.b.B(r4, 1, 24, 28)) : 0);
    }

    public static int c(hi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hc.b.B(r3, 1, 16, 12));
    }

    public static int d(hi.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hc.b.B(r3, 1, 16, 8));
    }
}
