package qh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n0 implements c1 {
    public final /* synthetic */ q0 a;

    public n0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // qh.c1
    public final boolean A(d1 d1Var) {
        q0 q0Var = this.a;
        if (q0Var.h == null || q0Var.f == null || d1Var.length() != 0) {
            return false;
        }
        q0Var.h.a(q0Var.f);
        return true;
    }

    @Override // qh.c1
    public final void B1(Editable editable) {
        q0 q0Var = this.a;
        a aVar = q0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = q0Var.d.A;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = u5.f(editable);
            }
        }
        w2 w2Var = q0Var.h;
        if (w2Var == null || q0Var.f == null) {
            return;
        }
        o3 o3Var = w2Var.a;
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.g();
        }
        o3Var.d3.onContentChanged();
    }

    @Override // qh.c1
    public final void J0() {
        a aVar;
        q0 q0Var = this.a;
        w2 w2Var = q0Var.h;
        if (w2Var == null || (aVar = q0Var.f) == null) {
            return;
        }
        w2Var.a(aVar);
    }

    @Override // qh.c1
    public final void L0(d1 d1Var) {
        a aVar;
        o3 o3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.a;
        w2 w2Var = q0Var.h;
        if (w2Var == null || (aVar = q0Var.f) == null || (indexOf = (arrayList = (o3Var = w2Var.a).h3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            o3Var.U2.N(true);
        }
        int i9 = indexOf + 1;
        if (i9 >= arrayList.size() || ((a) arrayList.get(i9)).i || o3.x3((a) arrayList.get(i9))) {
            return;
        }
        o3Var.post(new i2(o3Var, (a) arrayList.get(i9), 24));
    }

    @Override // qh.c1
    public final /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // qh.c1
    public final /* synthetic */ boolean U1(d1 d1Var) {
        return false;
    }

    @Override // qh.c1
    public final void d(d1 d1Var) {
        w2 w2Var = this.a.h;
        if (w2Var != null) {
            o3 o3Var = w2Var.a;
            o3.M1(o3Var, d1Var);
            o3Var.d3.f1(d1Var, true);
        }
    }

    @Override // qh.c1
    public final void h1(CharSequence charSequence) {
        w2 w2Var = this.a.h;
        if (w2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        w2Var.a.t4(charSequence.toString());
    }

    @Override // qh.c1
    public final void k1(d1 d1Var, int i9, int i10) {
        w2 w2Var;
        n9 textSelectionHelper;
        q0 q0Var = this.a;
        if (q0Var.n || i9 == i10 || (w2Var = q0Var.h) == null || (textSelectionHelper = w2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == q0Var) {
            return;
        }
        q0Var.post(new mh.l4(this, d1Var, i10, textSelectionHelper, i9, 4));
    }

    @Override // qh.c1
    public final boolean p() {
        q0 q0Var = this.a;
        w2 w2Var = q0Var.h;
        if (w2Var == null || q0Var.f == null) {
            return false;
        }
        return w2Var.a.S4();
    }

    @Override // qh.c1
    public final /* synthetic */ void E(int i9, int i10) {
    }
}
