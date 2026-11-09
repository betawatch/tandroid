package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a2 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new a2());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        x70 x70Var = (x70) view;
        x70Var.setGravity(y31Var.z);
        Object obj = y31Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = y31Var.G;
            s6.U(x70Var, intValue, obj2 instanceof g6 ? (g6) obj2 : null);
        } else {
            r6 r6Var = s6.a;
            x70Var.setTag(R.id.theme_bind, null);
            x70Var.setTextColor((int) y31Var.B);
        }
        x70Var.setTextSize(1, y31Var.A);
        x70Var.setTypeface(y31Var.q ? org.telegram.messenger.g0.o() : null);
        int i7 = y31Var.i;
        x70Var.setPadding(i7, 0, i7, y31Var.k);
        x70Var.setText(y31Var.l);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new jb(7, context, null);
    }
}
