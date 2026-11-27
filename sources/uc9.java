// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uc9 extends a8c {
    static {
        a8c.h(new uc9());
    }

    public static b8c i(String str) {
        b8c K = b8c.K(uc9.class);
        K.m = str;
        return K;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((vc9) view).set(b8cVar.m);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new vc9(context, vnbVar);
    }
}
