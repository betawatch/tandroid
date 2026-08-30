package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vy extends f2.b0 {
    public boolean d;
    public final /* synthetic */ xy e;

    public vy(xy xyVar) {
        this.e = xyVar;
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
        xy xyVar = this.e;
        uy uyVar = xyVar.a;
        xy xyVar2 = uyVar.d;
        int i10 = xyVar2.n;
        ArrayList arrayList = xyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = xyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l10 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l10);
            uyVar.p(b10, b11);
            ((org.telegram.ui.Cells.g4) l1Var.a).setDrawDivider(b11 != xyVar.r - 1);
            ((org.telegram.ui.Cells.g4) l1Var2.a).setDrawDivider(b10 != xyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        xy xyVar = this.e;
        if (i10 != 0) {
            xyVar.b.I0(false);
            l1Var.a.setPressed(true);
        } else if (this.d) {
            wy wyVar = xyVar.f;
            if (wyVar != null) {
                wyVar.a();
            }
            this.d = false;
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }
}
