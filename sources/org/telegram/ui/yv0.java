package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yv0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ zv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv0(zv0 zv0Var, Context context, int i10, l60 l60Var) {
        super(context, i10, l60Var, null);
        this.F = zv0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean e() {
        bw0 bw0Var = this.F.d;
        ic1 ic1Var = bw0Var.c;
        View F = ic1Var.F(this);
        s4.c1 T = F == null ? null : ic1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = bw0Var.y;
            if (i10 == bw0Var.n && b10 == (bw0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        int b10;
        bw0 bw0Var = this.F.d;
        ic1 ic1Var = bw0Var.c;
        View F = ic1Var.F(e6Var);
        s4.c1 T = F == null ? null : ic1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return bw0Var.w[b10 - bw0Var.n0];
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            eo.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        bw0 bw0Var = this.F.d;
        if (z10 && bw0Var.L) {
            Arrays.fill(bw0Var.w, false);
            bw0Var.c.getChildCount();
            for (int i10 = bw0Var.n0; i10 < bw0Var.n0 + bw0Var.y; i10++) {
                s4.c1 K = bw0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        ic1 ic1Var = bw0Var.c;
        View F = ic1Var.F(e6Var);
        s4.c1 T = F == null ? null : ic1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            bw0Var.w[b10 - bw0Var.n0] = z10;
        }
        bw0Var.i0();
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        bw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        bw0.e0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        bw0 bw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            bw0Var.c.getClass();
            int R = RecyclerView.R(this) - bw0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < bw0Var.n) {
                    for (int length = bw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = bw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    bw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    bw0Var.y++;
                    i10++;
                }
                bw0Var.r0();
                bw0Var.g0 = (bw0Var.n0 + i10) - 1;
                bw0Var.b.l();
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
