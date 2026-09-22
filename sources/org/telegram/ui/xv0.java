package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ yv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(yv0 yv0Var, Context context, int i10, k60 k60Var) {
        super(context, i10, k60Var, null);
        this.F = yv0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean e() {
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.c;
        View G = fc1Var.G(this);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U != null) {
            int b10 = U.b();
            int i10 = aw0Var.y;
            if (i10 == aw0Var.n && b10 == (aw0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        int b10;
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.c;
        View G = fc1Var.G(e6Var);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U == null || (b10 = U.b()) == -1) {
            return false;
        }
        return aw0Var.w[b10 - aw0Var.n0];
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            zn.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        aw0 aw0Var = this.F.d;
        if (z10 && aw0Var.L) {
            Arrays.fill(aw0Var.w, false);
            aw0Var.c.getChildCount();
            for (int i10 = aw0Var.n0; i10 < aw0Var.n0 + aw0Var.y; i10++) {
                s4.c1 L = aw0Var.c.L(i10);
                if (L != null) {
                    View view = L.a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        fc1 fc1Var = aw0Var.c;
        View G = fc1Var.G(e6Var);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U != null && (b10 = U.b()) != -1) {
            aw0Var.w[b10 - aw0Var.n0] = z10;
        }
        aw0Var.i0();
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        aw0.e0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            aw0Var.c.getClass();
            int S = RecyclerView.S(this) - aw0Var.n0;
            if (S >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < aw0Var.n) {
                    for (int length = aw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = aw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    aw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    aw0Var.y++;
                    i10++;
                }
                aw0Var.r0();
                aw0Var.g0 = (aw0Var.n0 + i10) - 1;
                aw0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean o() {
        return this.F.d.L;
    }
}
