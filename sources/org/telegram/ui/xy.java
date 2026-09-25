package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xy extends s4.v {
    public boolean d;
    public final /* synthetic */ zy e;

    public xy(zy zyVar) {
        this.e = zyVar;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        return c1Var.f != 3 ? s4.v.l(0, 0) : s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        if (c1Var.f != c1Var2.f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        zy zyVar = this.e;
        wy wyVar = zyVar.a;
        zy zyVar2 = wyVar.d;
        int i10 = zyVar2.n;
        ArrayList arrayList = zyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = zyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            wyVar.p(b10, b11);
            ((org.telegram.ui.Cells.g4) c1Var.a).setDrawDivider(b11 != zyVar.r - 1);
            ((org.telegram.ui.Cells.g4) c1Var2.a).setDrawDivider(b10 != zyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        zy zyVar = this.e;
        if (i10 != 0) {
            zyVar.b.I0(false);
            c1Var.a.setPressed(true);
        } else if (this.d) {
            yy yyVar = zyVar.f;
            if (yyVar != null) {
                yyVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
