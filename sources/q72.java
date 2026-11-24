// default package

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q72 extends ng8 {
    public final /* synthetic */ int G;
    public final /* synthetic */ s30 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(s30 s30Var, Context context, int i, ylb ylbVar, int i2) {
        super(context, i, null, ylbVar);
        this.H = s30Var;
        this.G = i2;
    }

    @Override // ng8
    public final void h(pz pzVar, ActionMode actionMode) {
        v72 v72Var = (v72) this.H.e;
        if (!v72Var.n && this.G == 11 && pzVar.isFocused() && pzVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) != null) {
                yv1.E6(menu, ((yv1) v72Var.b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override // ng8
    public final void j(boolean z) {
        ((v72) this.H.e).b0(this, z);
    }

    @Override // ng8
    public final void k(ng8 ng8Var) {
        ((v72) this.H.e).c0(ng8Var);
    }

    @Override // ng8
    public final void l(pz pzVar) {
        ((v72) this.H.e).b.c1(pzVar, true);
    }

    @Override // ng8
    public final boolean m(ArrayList arrayList) {
        v72 v72Var = (v72) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        pz pzVar = this.d;
        pzVar.getText().replace(pzVar.getSelectionStart(), pzVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i = 0;
        while (!arrayList.isEmpty() && i < v72Var.K) {
            for (int length = v72Var.L.length - 1; length > i; length--) {
                CharSequence[] charSequenceArr = v72Var.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            v72Var.L[i] = (CharSequence) arrayList.remove(0);
            v72Var.N++;
            i++;
        }
        v72Var.n0();
        v72Var.l0 = (v72Var.u0 + i) - 1;
        v72Var.s.setItemAnimator(v72Var.w);
        v72Var.r.f();
        return true;
    }
}
