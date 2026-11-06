package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b2 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new b2());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        w70 w70Var = (w70) view;
        w70Var.setGravity(r31Var.z);
        Object obj = r31Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = r31Var.G;
            r6.V(w70Var, intValue, obj2 instanceof f6 ? (f6) obj2 : null);
        } else {
            q6 q6Var = r6.a;
            w70Var.setTag(R.id.theme_bind, null);
            w70Var.setTextColor((int) r31Var.B);
        }
        w70Var.setTextSize(1, r31Var.A);
        w70Var.setTypeface(r31Var.q ? org.telegram.messenger.g0.o() : null);
        int i7 = r31Var.i;
        w70Var.setPadding(i7, 0, i7, r31Var.k);
        w70Var.setText(r31Var.l);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new jb(7, context, null);
    }
}
