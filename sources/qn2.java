// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qn2 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new qn2());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        long j = c4cVar.C;
        ((rn2) view).a((int) j, (int) (j >>> 32), c4cVar.k, c4cVar.m, c4cVar.o, c4cVar.r);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new rn2(wjbVar, context, false);
    }
}
