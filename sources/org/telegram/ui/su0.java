package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class su0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ tu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(tu0 tu0Var, Context context, int i10, t50 t50Var) {
        super(context, i10, t50Var, null);
        this.B = tu0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean e() {
        vu0 vu0Var = this.B.d;
        wa1 wa1Var = vu0Var.c;
        View F = wa1Var.F(this);
        f2.n1 T = F == null ? null : wa1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = vu0Var.y;
            if (i10 == vu0Var.n && b10 == (vu0Var.j0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        int b10;
        vu0 vu0Var = this.B.d;
        wa1 wa1Var = vu0Var.c;
        View F = wa1Var.F(a6Var);
        f2.n1 T = F == null ? null : wa1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return vu0Var.w[b10 - vu0Var.j0];
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(bh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            tn.k8(menu, this.B.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        int b10;
        vu0 vu0Var = this.B.d;
        if (z10 && vu0Var.H) {
            Arrays.fill(vu0Var.w, false);
            vu0Var.c.getChildCount();
            for (int i10 = vu0Var.j0; i10 < vu0Var.j0 + vu0Var.y; i10++) {
                f2.n1 K = vu0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z10);
        wa1 wa1Var = vu0Var.c;
        View F = wa1Var.F(a6Var);
        f2.n1 T = F == null ? null : wa1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            vu0Var.w[b10 - vu0Var.j0] = z10;
        }
        vu0Var.i0();
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z10) {
        vu0.d0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        vu0.e0(this.B.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        vu0 vu0Var = this.B.d;
        if (!arrayList.isEmpty()) {
            vu0Var.c.getClass();
            int R = RecyclerView.R(this) - vu0Var.j0;
            if (R >= 0) {
                bh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < vu0Var.n) {
                    for (int length = vu0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = vu0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    vu0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    vu0Var.y++;
                    i10++;
                }
                vu0Var.r0();
                vu0Var.c0 = (vu0Var.j0 + i10) - 1;
                vu0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean o() {
        return this.B.d.H;
    }
}
