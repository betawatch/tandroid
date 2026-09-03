package wh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class u0 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new u0());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) h51Var.G;
        n2 n2Var = (n2) h51Var.H;
        v0Var.a = aVar;
        v0Var.v = n2Var;
        v0Var.w = LocaleController.isRTL;
        v0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new v0(context, g6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
