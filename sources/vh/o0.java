package vh;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.p6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class o0 implements d1 {
    public final /* synthetic */ r0 a;

    public o0(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // vh.d1
    public final void Q0(CharSequence charSequence) {
        a3 a3Var = this.a.h;
        if (a3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        a3Var.a.s4(charSequence.toString());
    }

    @Override // vh.d1
    public final /* synthetic */ boolean V0(e1 e1Var) {
        return false;
    }

    @Override // vh.d1
    public final void c(e1 e1Var) {
        a3 a3Var = this.a.h;
        if (a3Var != null) {
            s3 s3Var = a3Var.a;
            s3.L1(s3Var, e1Var);
            s3Var.e3.d(e1Var, true);
        }
    }

    @Override // vh.d1
    public final void g1(e1 e1Var) {
        a aVar;
        s3 s3Var;
        ArrayList arrayList;
        int indexOf;
        r0 r0Var = this.a;
        a3 a3Var = r0Var.h;
        if (a3Var == null || (aVar = r0Var.f) == null || (indexOf = (arrayList = (s3Var = a3Var.a).i3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            s3Var.V2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || s3.w3((a) arrayList.get(i10))) {
            return;
        }
        s3Var.post(new k2(s3Var, (a) arrayList.get(i10), 24));
    }

    @Override // vh.d1
    public final boolean h() {
        r0 r0Var = this.a;
        a3 a3Var = r0Var.h;
        if (a3Var == null || r0Var.f == null) {
            return false;
        }
        return a3Var.a.R4();
    }

    @Override // vh.d1
    public final boolean h0(e1 e1Var) {
        r0 r0Var = this.a;
        if (r0Var.h == null || r0Var.f == null || e1Var.length() != 0) {
            return false;
        }
        r0Var.h.a(r0Var.f);
        return true;
    }

    @Override // vh.d1
    public final void l1(Editable editable) {
        r0 r0Var = this.a;
        a aVar = r0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = r0Var.d.B;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = y5.f(editable);
            }
        }
        a3 a3Var = r0Var.h;
        if (a3Var == null || r0Var.f == null) {
            return;
        }
        s3 s3Var = a3Var.a;
        d2 d2Var = s3Var.G3;
        if (d2Var != null) {
            d2Var.g();
        }
        s3Var.e3.onContentChanged();
    }

    @Override // vh.d1
    public final void n1(e1 e1Var, int i10, int i11) {
        a3 a3Var;
        l9 textSelectionHelper;
        r0 r0Var = this.a;
        if (r0Var.n || i10 == i11 || (a3Var = r0Var.h) == null || (textSelectionHelper = a3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == r0Var) {
            return;
        }
        r0Var.post(new p6(this, e1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // vh.d1
    public final void q0() {
        a aVar;
        r0 r0Var = this.a;
        a3 a3Var = r0Var.h;
        if (a3Var == null || (aVar = r0Var.f) == null) {
            return;
        }
        a3Var.a(aVar);
    }

    @Override // vh.d1
    public final /* synthetic */ boolean w1(boolean z4) {
        return false;
    }

    @Override // vh.d1
    public final /* synthetic */ void r(int i10, int i11) {
    }
}
