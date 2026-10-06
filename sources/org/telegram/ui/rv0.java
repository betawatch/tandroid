package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class rv0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ sv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv0(sv0 sv0Var, Context context, int i10, j60 j60Var) {
        super(context, i10, j60Var, null);
        this.F = sv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        uv0 uv0Var = this.F.d;
        xb1 xb1Var = uv0Var.c;
        View F = xb1Var.F(this);
        s4.c1 T = F == null ? null : xb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = uv0Var.y;
            if (i10 == uv0Var.n && b10 == (uv0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        uv0 uv0Var = this.F.d;
        xb1 xb1Var = uv0Var.c;
        View F = xb1Var.F(d6Var);
        s4.c1 T = F == null ? null : xb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return uv0Var.w[b10 - uv0Var.n0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            yn.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        uv0 uv0Var = this.F.d;
        if (z10 && uv0Var.L) {
            Arrays.fill(uv0Var.w, false);
            uv0Var.c.getChildCount();
            for (int i10 = uv0Var.n0; i10 < uv0Var.n0 + uv0Var.y; i10++) {
                s4.c1 K = uv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        xb1 xb1Var = uv0Var.c;
        View F = xb1Var.F(d6Var);
        s4.c1 T = F == null ? null : xb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            uv0Var.w[b10 - uv0Var.n0] = z10;
        }
        uv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        uv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        uv0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        uv0 uv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            uv0Var.c.getClass();
            int R = RecyclerView.R(this) - uv0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < uv0Var.n) {
                    for (int length = uv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = uv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    uv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    uv0Var.y++;
                    i10++;
                }
                uv0Var.r0();
                uv0Var.g0 = (uv0Var.n0 + i10) - 1;
                uv0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean o() {
        return this.F.d.L;
    }
}
