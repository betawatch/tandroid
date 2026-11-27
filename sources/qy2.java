// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qy2 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new qy2());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        v2a v2aVar = (v2a) view;
        v2aVar.w = (TLRPC.TL_help_country) b8cVar.H;
        v2aVar.f();
        v2aVar.setDivider(z);
        v2aVar.c(b8cVar.e, false);
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.I(b8cVar2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        v2a v2aVar = new v2a(context, vnbVar);
        v2aVar.setBackground(null);
        return v2aVar;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.J(b8cVar2);
    }
}
