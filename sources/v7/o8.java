package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jm0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class o8 {
    public static void a(jm0 jm0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        jm0Var.q(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var), d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.i6.I.q());
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
