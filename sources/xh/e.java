package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends z41 {
    static {
        z41.h(new e());
    }

    public static a51 i(int i10, int i11, CharSequence charSequence, String str) {
        a51 K = a51.K(e.class);
        K.d = i10;
        K.z = i11;
        K.k = R.drawable.filled_earn_stars;
        K.l = charSequence;
        K.m = str;
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        ((f) view).a(a51Var.z, a51Var.k, a51Var.l, a51Var.m);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new f(context, p6Var);
    }
}
