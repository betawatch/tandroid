package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ aw0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(aw0 aw0Var, Context context, int i10, m60 m60Var) {
        super(context, i10, m60Var, null);
        this.F = aw0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        cw0 cw0Var = this.F.d;
        fc1 fc1Var = cw0Var.c;
        View G = fc1Var.G(this);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U != null) {
            int b10 = U.b();
            int i10 = cw0Var.y;
            if (i10 == cw0Var.n && b10 == (cw0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        cw0 cw0Var = this.F.d;
        fc1 fc1Var = cw0Var.c;
        View G = fc1Var.G(c6Var);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U == null || (b10 = U.b()) == -1) {
            return false;
        }
        return cw0Var.w[b10 - cw0Var.n0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            bo.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        cw0 cw0Var = this.F.d;
        if (z10 && cw0Var.L) {
            Arrays.fill(cw0Var.w, false);
            cw0Var.c.getChildCount();
            for (int i10 = cw0Var.n0; i10 < cw0Var.n0 + cw0Var.y; i10++) {
                s4.c1 L = cw0Var.c.L(i10);
                if (L != null) {
                    View view = L.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        fc1 fc1Var = cw0Var.c;
        View G = fc1Var.G(c6Var);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U != null && (b10 = U.b()) != -1) {
            cw0Var.w[b10 - cw0Var.n0] = z10;
        }
        cw0Var.i0();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        cw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        cw0.e0(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        cw0 cw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            cw0Var.c.getClass();
            int S = RecyclerView.S(this) - cw0Var.n0;
            if (S >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < cw0Var.n) {
                    for (int length = cw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = cw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    cw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    cw0Var.y++;
                    i10++;
                }
                cw0Var.r0();
                cw0Var.g0 = (cw0Var.n0 + i10) - 1;
                cw0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean o() {
        return this.F.d.L;
    }
}
