package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class e extends a51 {
    static {
        a51.h(new e());
    }

    public static b51 i(int i10, int i11, CharSequence charSequence, String str) {
        b51 K = b51.K(e.class);
        K.d = i10;
        K.z = i11;
        K.k = R.drawable.filled_earn_stars;
        K.l = charSequence;
        K.m = str;
        return K;
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        ((f) view).a(b51Var.z, b51Var.k, b51Var.l, b51Var.m);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new f(context, p6Var);
    }
}
