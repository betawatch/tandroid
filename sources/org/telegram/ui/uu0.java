package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uu0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ vu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu0(vu0 vu0Var, Context context, int i9, q50 q50Var) {
        super(context, i9, q50Var, null);
        this.B = vu0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean d() {
        xu0 xu0Var = this.B.d;
        va1 va1Var = xu0Var.c;
        View F = va1Var.F(this);
        f2.q1 T = F == null ? null : va1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i9 = xu0Var.y;
            if (i9 == xu0Var.n && b10 == (xu0Var.j0 + i9) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        xu0 xu0Var = this.B.d;
        va1 va1Var = xu0Var.c;
        View F = va1Var.F(c6Var);
        f2.q1 T = F == null ? null : va1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return xu0Var.w[b10 - xu0Var.j0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(fh.s sVar, ActionMode actionMode) {
        if (sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            qn.k8(menu, this.B.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        xu0 xu0Var = this.B.d;
        if (z10 && xu0Var.H) {
            Arrays.fill(xu0Var.w, false);
            xu0Var.c.getChildCount();
            for (int i9 = xu0Var.j0; i9 < xu0Var.j0 + xu0Var.y; i9++) {
                f2.q1 K = xu0Var.c.K(i9);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        va1 va1Var = xu0Var.c;
        View F = va1Var.F(c6Var);
        f2.q1 T = F == null ? null : va1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            xu0Var.w[b10 - xu0Var.j0] = z10;
        }
        xu0Var.h0();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        xu0.c0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        xu0.d0(this.B.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        xu0 xu0Var = this.B.d;
        if (!arrayList.isEmpty()) {
            xu0Var.c.getClass();
            int R = RecyclerView.R(this) - xu0Var.j0;
            if (R >= 0) {
                fh.s sVar = this.d;
                sVar.getText().replace(sVar.getSelectionStart(), sVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i9 = R + 1;
                while (!arrayList.isEmpty() && i9 < xu0Var.n) {
                    for (int length = xu0Var.v.length - 1; length > i9; length--) {
                        CharSequence[] charSequenceArr = xu0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    xu0Var.v[i9] = (CharSequence) arrayList.remove(0);
                    xu0Var.y++;
                    i9++;
                }
                xu0Var.q0();
                xu0Var.c0 = (xu0Var.j0 + i9) - 1;
                xu0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean o() {
        return this.B.d.H;
    }
}
