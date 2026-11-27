// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yj9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new yj9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        zj9 zj9Var = (zj9) view;
        zj9Var.set((TL_iv.RichMessage) b8cVar.H);
        zj9Var.setTranslationLoading(b8cVar.e);
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d && b8cVar.H == b8cVar2.H && b8cVar.e == b8cVar2.e;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        zj9 zj9Var = new zj9(i, vnbVar, context);
        zj9Var.setPadding(hl.L(20.0f), 0, hl.L(20.0f), hl.L(16.0f));
        return zj9Var;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }
}
