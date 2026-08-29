package th;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.o6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n0 implements c1 {
    public final /* synthetic */ q0 a;

    public n0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // th.c1
    public final void S0(d1 d1Var) {
        a aVar;
        p3 p3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.a;
        x2 x2Var = q0Var.h;
        if (x2Var == null || (aVar = q0Var.f) == null || (indexOf = (arrayList = (p3Var = x2Var.a).h3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            p3Var.U2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || p3.x3((a) arrayList.get(i10))) {
            return;
        }
        p3Var.post(new i2(p3Var, (a) arrayList.get(i10), 24));
    }

    @Override // th.c1
    public final void T0(d1 d1Var, int i10, int i11) {
        x2 x2Var;
        k9 textSelectionHelper;
        q0 q0Var = this.a;
        if (q0Var.n || i10 == i11 || (x2Var = q0Var.h) == null || (textSelectionHelper = x2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == q0Var) {
            return;
        }
        q0Var.post(new o6(this, d1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // th.c1
    public final void Z0(CharSequence charSequence) {
        x2 x2Var = this.a.h;
        if (x2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        x2Var.a.t4(charSequence.toString());
    }

    @Override // th.c1
    public final void e(d1 d1Var) {
        x2 x2Var = this.a.h;
        if (x2Var != null) {
            p3 p3Var = x2Var.a;
            p3.M1(p3Var, d1Var);
            p3Var.d3.U(d1Var, true);
        }
    }

    @Override // th.c1
    public final /* synthetic */ boolean i1(d1 d1Var) {
        return false;
    }

    @Override // th.c1
    public final boolean m() {
        q0 q0Var = this.a;
        x2 x2Var = q0Var.h;
        if (x2Var == null || q0Var.f == null) {
            return false;
        }
        return x2Var.a.S4();
    }

    @Override // th.c1
    public final void n1(Editable editable) {
        q0 q0Var = this.a;
        a aVar = q0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = q0Var.d.A;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = v5.f(editable);
            }
        }
        x2 x2Var = q0Var.h;
        if (x2Var == null || q0Var.f == null) {
            return;
        }
        p3 p3Var = x2Var.a;
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.g();
        }
        p3Var.d3.onContentChanged();
    }

    @Override // th.c1
    public final boolean r0(d1 d1Var) {
        q0 q0Var = this.a;
        if (q0Var.h == null || q0Var.f == null || d1Var.length() != 0) {
            return false;
        }
        q0Var.h.a(q0Var.f);
        return true;
    }

    @Override // th.c1
    public final /* synthetic */ boolean t1(boolean z10) {
        return false;
    }

    @Override // th.c1
    public final void u0() {
        a aVar;
        q0 q0Var = this.a;
        x2 x2Var = q0Var.h;
        if (x2Var == null || (aVar = q0Var.f) == null) {
            return;
        }
        x2Var.a(aVar);
    }

    @Override // th.c1
    public final /* synthetic */ void z(int i10, int i11) {
    }
}
