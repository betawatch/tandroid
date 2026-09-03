package ph;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.kc0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s extends f2.o0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ d2 d;
    public final /* synthetic */ u e;

    public s(u uVar, Context context, d2 d2Var) {
        this.e = uVar;
        this.c = context;
        this.d = d2Var;
    }

    @Override // f2.o0
    public final int h() {
        return r.a().size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        t tVar = (t) l1Var.a;
        r rVar = (r) r.a().get(i10);
        boolean z4 = i10 == tVar.s;
        tVar.setDrawable(new kc0(rVar, false));
        tVar.b(rVar.equals(this.e.b), z4);
        tVar.s = i10;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        t tVar = new t(this.c);
        tVar.setLayoutParams(new f2.w0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        tVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        return new dl0(tVar);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        t tVar = (t) l1Var.a;
        this.d.a(tVar);
        int i10 = tVar.s;
        if (i10 < 0 || i10 >= r.a().size()) {
            return;
        }
        r rVar = (r) r.a().get(tVar.s);
        tVar.setDrawable(new kc0(rVar, false));
        tVar.b(rVar.equals(this.e.b), false);
    }

    @Override // f2.o0
    public final void z(f2.l1 l1Var) {
        this.d.d.remove((t) l1Var.a);
    }
}
