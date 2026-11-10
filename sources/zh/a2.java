package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a2 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new a2());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        w70 w70Var = (w70) view;
        w70Var.setGravity(x31Var.z);
        Object obj = x31Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = x31Var.G;
            t6.U(w70Var, intValue, obj2 instanceof h6 ? (h6) obj2 : null);
        } else {
            s6 s6Var = t6.a;
            w70Var.setTag(R.id.theme_bind, null);
            w70Var.setTextColor((int) x31Var.B);
        }
        w70Var.setTextSize(1, x31Var.A);
        w70Var.setTypeface(x31Var.q ? org.telegram.messenger.g0.o() : null);
        int i7 = x31Var.i;
        w70Var.setPadding(i7, 0, i7, x31Var.k);
        w70Var.setText(x31Var.l);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new ib(7, context, null);
    }
}
