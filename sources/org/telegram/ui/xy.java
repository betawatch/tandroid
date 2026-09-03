package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xy extends f2.b0 {
    public boolean d;
    public final /* synthetic */ zy e;

    public xy(zy zyVar) {
        this.e = zyVar;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        return l1Var.f != 3 ? f2.b0.l(0, 0) : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        if (l1Var.f != l1Var2.f) {
            return false;
        }
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        zy zyVar = this.e;
        wy wyVar = zyVar.a;
        zy zyVar2 = wyVar.d;
        int i10 = zyVar2.n;
        ArrayList arrayList = zyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = zyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l10 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l10);
            wyVar.p(b10, b11);
            ((org.telegram.ui.Cells.f4) l1Var.a).setDrawDivider(b11 != zyVar.r - 1);
            ((org.telegram.ui.Cells.f4) l1Var2.a).setDrawDivider(b10 != zyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        zy zyVar = this.e;
        if (i10 != 0) {
            zyVar.b.I0(false);
            l1Var.a.setPressed(true);
        } else if (this.d) {
            yy yyVar = zyVar.f;
            if (yyVar != null) {
                yyVar.a();
            }
            this.d = false;
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }
}
