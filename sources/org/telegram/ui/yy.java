package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class yy extends s4.v {
    public boolean d;
    public final /* synthetic */ az e;

    public yy(az azVar) {
        this.e = azVar;
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
        az azVar = this.e;
        xy xyVar = azVar.a;
        az azVar2 = xyVar.d;
        int i10 = azVar2.n;
        ArrayList arrayList = azVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = azVar2.r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l4 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l4);
            xyVar.p(b10, b11);
            ((org.telegram.ui.Cells.g4) c1Var.a).setDrawDivider(b11 != azVar.r - 1);
            ((org.telegram.ui.Cells.g4) c1Var2.a).setDrawDivider(b10 != azVar.r - 1);
            this.d = true;
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        az azVar = this.e;
        if (i10 != 0) {
            azVar.b.I0(false);
            c1Var.a.setPressed(true);
        } else if (this.d) {
            zy zyVar = azVar.f;
            if (zyVar != null) {
                zyVar.a();
            }
            this.d = false;
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
