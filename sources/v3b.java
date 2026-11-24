// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v3b extends b4c {
    public static final /* synthetic */ int c = 0;
    public jb4 b;

    static {
        b4c.h(new v3b());
    }

    @Override // b4c
    public final void a(o39 o39Var, View view, c4c c4cVar) {
        ((qfa) view).l(c4cVar != null && c4cVar.h, false);
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        qfa qfaVar = (qfa) view;
        qfaVar.k((k27) c4cVar.H, c4cVar.w, false);
        qfaVar.i(c4cVar.e, false);
        qfaVar.l(c4cVar.h, false);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        if (this.b == null) {
            this.b = new jb4(context, wjbVar);
        }
        qfa qfaVar = new qfa(context, this.b, i);
        qfaVar.x0 = true;
        qfaVar.e0 = true;
        return qfaVar;
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.r == c4cVar2.r && c4cVar.e == c4cVar2.e && c4cVar.C == c4cVar2.C;
    }
}
