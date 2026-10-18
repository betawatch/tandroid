package w7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class i {
    public static void a(pm0 pm0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        pm0Var.q(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q());
    }

    public static int b(ki.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return c(aVar) + (Math.max(0, aVar.c) > 0 ? AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r4, 1, 24, 28)) : 0);
    }

    public static int c(ki.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r3, 1, 16, 12));
    }

    public static int d(ki.a aVar) {
        if ((aVar == null ? 0 : aVar.k.size()) <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r3, 1, 16, 8));
    }
}
