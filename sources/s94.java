// default package

import android.content.Context;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s94 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new s94());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        v94 v94Var = (v94) view;
        v94Var.P = z;
        v94Var.setHost(q9cVar instanceof t94 ? (t94) q9cVar : null);
        v94Var.o(false, 0.0f);
        v94Var.setScrimHidden(false);
        v94Var.m((r47) b8cVar.H, (ArrayList) b8cVar.I);
        v94Var.invalidate();
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.H == b8cVar2.H && Objects.equals(b8cVar.I, b8cVar2.I) && b8cVar.j == b8cVar2.j;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new v94(i, vnbVar, context);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d && b8cVar.C == b8cVar2.C;
    }
}
