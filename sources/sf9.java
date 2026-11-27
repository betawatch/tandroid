// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class sf9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new sf9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((tf9) view).c = (mk0) b8cVar.H;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new tf9(context, vnbVar);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
