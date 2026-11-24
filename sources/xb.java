// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xb extends b4c {
    static {
        b4c.h(new xb());
    }

    public static c4c i(int i, int i2, CharSequence charSequence, String str) {
        c4c K = c4c.K(xb.class);
        K.d = i;
        K.A = i2;
        K.k = R.drawable.filled_earn_stars;
        K.m = charSequence;
        K.n = str;
        return K;
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((yb) view).a(c4cVar.A, c4cVar.k, c4cVar.m, c4cVar.n);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new yb(context, wjbVar);
    }
}
