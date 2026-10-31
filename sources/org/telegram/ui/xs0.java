package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ ys0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(ys0 ys0Var, Context context, int i10, f50 f50Var) {
        super(context, i10, f50Var, null);
        this.F = ys0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean e() {
        at0 at0Var = this.F.d;
        w71 w71Var = at0Var.c;
        View F = w71Var.F(this);
        s4.c1 T = F == null ? null : w71Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = at0Var.D;
            if (i10 == at0Var.n && b10 == (at0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        int b10;
        at0 at0Var = this.F.d;
        w71 w71Var = at0Var.c;
        View F = w71Var.F(e6Var);
        s4.c1 T = F == null ? null : w71Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return at0Var.x[b10 - at0Var.n0];
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            un.t8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        at0 at0Var = this.F.d;
        at0Var.c.getChildCount();
        if (z10 && at0Var.L) {
            Arrays.fill(at0Var.x, false);
            for (int i10 = at0Var.n0; i10 < at0Var.n0 + at0Var.D; i10++) {
                s4.c1 K = at0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        w71 w71Var = at0Var.c;
        View F = w71Var.F(e6Var);
        s4.c1 T = F == null ? null : w71Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            at0Var.x[b10 - at0Var.n0] = z10;
        }
        at0Var.m0();
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        at0.h0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        at0.i0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        at0 at0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            at0Var.c.getClass();
            int R = RecyclerView.R(this) - at0Var.n0;
            if (R >= 0) {
                ih.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < at0Var.n) {
                    for (int length = at0Var.w.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = at0Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    at0Var.w[i10] = (CharSequence) arrayList.remove(0);
                    at0Var.D++;
                    i10++;
                }
                at0Var.v0();
                at0Var.g0 = (at0Var.n0 + i10) - 1;
                at0Var.b.f();
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
