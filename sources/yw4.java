// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yw4 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new yw4());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        e3a e3aVar = (e3a) view;
        zm2 zm2Var = b8cVar.l;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        e3aVar.x.setVisibility(8);
        e3aVar.I = null;
        e3aVar.J = null;
        de0 de0Var = e3aVar.c;
        de0Var.setRoundRadius(hl.L(20.0f));
        de0Var.setImageDrawable(zm2Var);
        ff0 ff0Var = e3aVar.d;
        ff0Var.k(charSequence);
        boolean[] zArr = e3aVar.s;
        zArr[0] = false;
        e3aVar.setSubtitle(charSequence2);
        yob.W(e3aVar.e, zArr[0] ? aob.n5 : aob.r5, e3aVar.a);
        og2 og2Var = e3aVar.w;
        if (og2Var != null) {
            og2Var.setAlpha(1.0f);
        }
        ff0Var.i(null);
        e3aVar.setDivider(z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        e3a e3aVar = new e3a(context, false, false, vnbVar, false);
        e3aVar.setCellBackgroundVisible(false);
        return e3aVar;
    }
}
