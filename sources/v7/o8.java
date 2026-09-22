package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class o8 {
    public static void a(sl0 sl0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        sl0Var.q(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var), e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.i6.I.q());
    }

    public static int b(ii.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(hg.c.g(r4, 1, 24, 28)) : 0);
    }

    public static int c(ii.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.c.g(r3, 1, 16, 12));
    }

    public static int d(ii.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.c.g(r3, 1, 16, 8));
    }
}
