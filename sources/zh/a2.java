package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a2 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new a2());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        w70 w70Var = (w70) view;
        w70Var.setGravity(x31Var.z);
        Object obj = x31Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = x31Var.G;
            r6.V(w70Var, intValue, obj2 instanceof f6 ? (f6) obj2 : null);
        } else {
            q6 q6Var = r6.a;
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
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new jb(7, context, null);
    }
}
