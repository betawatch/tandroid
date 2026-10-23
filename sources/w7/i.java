package w7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tm0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public abstract class i {
    public static void a(tm0 tm0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        tm0Var.r(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var), g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q());
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
