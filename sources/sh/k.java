package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.lf0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new k());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        lf0 lf0Var = (lf0) view;
        lf0Var.a((TLObject) x31Var.G, x31Var.z, true);
        lf0Var.setOnClickListener(x31Var.D);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.B == x31Var2.B;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        lf0 lf0Var = new lf0(context);
        lf0Var.setBackground(m6.N0(false));
        return lf0Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.B == x31Var2.B;
    }
}
