package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fm0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class p8 {
    public static void a(fm0 fm0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        fm0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q());
    }

    public static int b(ii.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(hg.k0.f(r4, 1, 24, 28)) : 0);
    }

    public static int c(ii.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.k0.f(r3, 1, 16, 12));
    }

    public static int d(ii.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.k0.f(r3, 1, 16, 8));
    }
}
