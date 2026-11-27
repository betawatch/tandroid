// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yb extends a8c {
    static {
        a8c.h(new yb());
    }

    public static b8c i(int i, int i2, CharSequence charSequence, String str) {
        b8c K = b8c.K(yb.class);
        K.d = i;
        K.A = i2;
        K.k = R.drawable.filled_earn_stars;
        K.m = charSequence;
        K.n = str;
        return K;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((zb) view).a(b8cVar.A, b8cVar.k, b8cVar.m, b8cVar.n);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new zb(context, vnbVar);
    }
}
