package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wy extends f2.b0 {
    public boolean d;
    public final /* synthetic */ yy e;

    public wy(yy yyVar) {
        this.e = yyVar;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        return m1Var.f != 3 ? f2.b0.l(0, 0) : f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        if (m1Var.f != m1Var2.f) {
            return false;
        }
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        yy yyVar = this.e;
        vy vyVar = yyVar.a;
        yy yyVar2 = vyVar.d;
        int i10 = yyVar2.n;
        ArrayList arrayList = yyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = yyVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l10 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l10);
            vyVar.p(b10, b11);
            ((org.telegram.ui.Cells.g4) m1Var.a).setDrawDivider(b11 != yyVar.r - 1);
            ((org.telegram.ui.Cells.g4) m1Var2.a).setDrawDivider(b10 != yyVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        yy yyVar = this.e;
        if (i10 != 0) {
            yyVar.b.I0(false);
            m1Var.a.setPressed(true);
        } else if (this.d) {
            xy xyVar = yyVar.f;
            if (xyVar != null) {
                xyVar.a();
            }
            this.d = false;
        }
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }
}
