// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uu4 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new uu4());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        kz9 kz9Var = (kz9) view;
        fm2 fm2Var = c4cVar.l;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        kz9Var.x.setVisibility(8);
        kz9Var.I = null;
        kz9Var.J = null;
        be0 be0Var = kz9Var.c;
        be0Var.setRoundRadius(gl.L(20.0f));
        be0Var.setImageDrawable(fm2Var);
        df0 df0Var = kz9Var.d;
        df0Var.k(charSequence);
        boolean[] zArr = kz9Var.s;
        zArr[0] = false;
        kz9Var.setSubtitle(charSequence2);
        zkb.W(kz9Var.e, zArr[0] ? bkb.m5 : bkb.q5, kz9Var.a);
        wf2 wf2Var = kz9Var.w;
        if (wf2Var != null) {
            wf2Var.setAlpha(1.0f);
        }
        df0Var.i(null);
        kz9Var.setDivider(z);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        kz9 kz9Var = new kz9(context, false, false, wjbVar, false);
        kz9Var.setCellBackgroundVisible(false);
        return kz9Var;
    }
}
