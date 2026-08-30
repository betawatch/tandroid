package vh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class n0 implements c1 {
    public final /* synthetic */ q0 a;

    public n0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // vh.c1
    public final void D(CharSequence charSequence) {
        z2 z2Var = this.a.h;
        if (z2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        z2Var.a.t4(charSequence.toString());
    }

    @Override // vh.c1
    public final /* synthetic */ boolean F(d1 d1Var) {
        return false;
    }

    @Override // vh.c1
    public final void G(d1 d1Var) {
        a aVar;
        r3 r3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.a;
        z2 z2Var = q0Var.h;
        if (z2Var == null || (aVar = q0Var.f) == null || (indexOf = (arrayList = (r3Var = z2Var.a).i3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            r3Var.V2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || r3.x3((a) arrayList.get(i10))) {
            return;
        }
        r3Var.post(new j2(r3Var, (a) arrayList.get(i10), 24));
    }

    @Override // vh.c1
    public final void N(Editable editable) {
        q0 q0Var = this.a;
        a aVar = q0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = q0Var.d.B;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = x5.f(editable);
            }
        }
        z2 z2Var = q0Var.h;
        if (z2Var == null || q0Var.f == null) {
            return;
        }
        r3 r3Var = z2Var.a;
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.g();
        }
        r3Var.e3.onContentChanged();
    }

    @Override // vh.c1
    public final void O(d1 d1Var, int i10, int i11) {
        z2 z2Var;
        m9 textSelectionHelper;
        q0 q0Var = this.a;
        if (q0Var.n || i10 == i11 || (z2Var = q0Var.h) == null || (textSelectionHelper = z2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == q0Var) {
            return;
        }
        q0Var.post(new p6(this, d1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // vh.c1
    public final /* synthetic */ boolean R(boolean z4) {
        return false;
    }

    @Override // vh.c1
    public final void c(d1 d1Var) {
        z2 z2Var = this.a.h;
        if (z2Var != null) {
            r3 r3Var = z2Var.a;
            r3.M1(r3Var, d1Var);
            r3Var.e3.e(d1Var, true);
        }
    }

    @Override // vh.c1
    public final boolean d() {
        q0 q0Var = this.a;
        z2 z2Var = q0Var.h;
        if (z2Var == null || q0Var.f == null) {
            return false;
        }
        return z2Var.a.S4();
    }

    @Override // vh.c1
    public final boolean o(d1 d1Var) {
        q0 q0Var = this.a;
        if (q0Var.h == null || q0Var.f == null || d1Var.length() != 0) {
            return false;
        }
        q0Var.h.a(q0Var.f);
        return true;
    }

    @Override // vh.c1
    public final void r() {
        a aVar;
        q0 q0Var = this.a;
        z2 z2Var = q0Var.h;
        if (z2Var == null || (aVar = q0Var.f) == null) {
            return;
        }
        z2Var.a(aVar);
    }

    @Override // vh.c1
    public final /* synthetic */ void i(int i10, int i11) {
    }
}
