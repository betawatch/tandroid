package wh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class o0 implements d1 {
    public final /* synthetic */ r0 a;

    public o0(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // wh.d1
    public final boolean D(e1 e1Var) {
        r0 r0Var = this.a;
        if (r0Var.h == null || r0Var.f == null || e1Var.length() != 0) {
            return false;
        }
        r0Var.h.a(r0Var.f);
        return true;
    }

    @Override // wh.d1
    public final void H(CharSequence charSequence) {
        z2 z2Var = this.a.h;
        if (z2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        z2Var.a.s4(charSequence.toString());
    }

    @Override // wh.d1
    public final void O(Editable editable) {
        r0 r0Var = this.a;
        a aVar = r0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = r0Var.d.B;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = x5.f(editable);
            }
        }
        z2 z2Var = r0Var.h;
        if (z2Var == null || r0Var.f == null) {
            return;
        }
        r3 r3Var = z2Var.a;
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.g();
        }
        r3Var.e3.onContentChanged();
    }

    @Override // wh.d1
    public final /* synthetic */ boolean T(boolean z4) {
        return false;
    }

    @Override // wh.d1
    public final void c(e1 e1Var) {
        z2 z2Var = this.a.h;
        if (z2Var != null) {
            r3 r3Var = z2Var.a;
            r3.L1(r3Var, e1Var);
            r3Var.e3.h(e1Var, true);
        }
    }

    @Override // wh.d1
    public final boolean e() {
        r0 r0Var = this.a;
        z2 z2Var = r0Var.h;
        if (z2Var == null || r0Var.f == null) {
            return false;
        }
        return z2Var.a.R4();
    }

    @Override // wh.d1
    public final void o(e1 e1Var) {
        a aVar;
        r3 r3Var;
        ArrayList arrayList;
        int indexOf;
        r0 r0Var = this.a;
        z2 z2Var = r0Var.h;
        if (z2Var == null || (aVar = r0Var.f) == null || (indexOf = (arrayList = (r3Var = z2Var.a).i3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            r3Var.V2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || r3.w3((a) arrayList.get(i10))) {
            return;
        }
        r3Var.post(new k2(r3Var, (a) arrayList.get(i10), 24));
    }

    @Override // wh.d1
    public final /* synthetic */ boolean r(e1 e1Var) {
        return false;
    }

    @Override // wh.d1
    public final void s(e1 e1Var, int i10, int i11) {
        z2 z2Var;
        m9 textSelectionHelper;
        r0 r0Var = this.a;
        if (r0Var.n || i10 == i11 || (z2Var = r0Var.h) == null || (textSelectionHelper = z2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == r0Var) {
            return;
        }
        r0Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // wh.d1
    public final void v() {
        a aVar;
        r0 r0Var = this.a;
        z2 z2Var = r0Var.h;
        if (z2Var == null || (aVar = r0Var.f) == null) {
            return;
        }
        z2Var.a(aVar);
    }

    @Override // wh.d1
    public final /* synthetic */ void j(int i10, int i11) {
    }
}
