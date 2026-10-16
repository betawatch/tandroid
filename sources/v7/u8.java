package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class u8 {
    public static void a(tm0 tm0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        tm0Var.q(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var), c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q());
    }

    public static int b(ji.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r4, 1, 24, 28)) : 0);
    }

    public static int c(ji.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r3, 1, 16, 12));
    }

    public static int d(ji.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r3, 1, 16, 8));
    }
}
