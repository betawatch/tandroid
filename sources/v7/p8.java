package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dm0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class p8 {
    public static void a(dm0 dm0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        dm0Var.q(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q());
    }

    public static int b(ii.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(hg.c.f(r4, 1, 24, 28)) : 0);
    }

    public static int c(ii.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.c.f(r3, 1, 16, 12));
    }

    public static int d(ii.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.c.f(r3, 1, 16, 8));
    }
}
