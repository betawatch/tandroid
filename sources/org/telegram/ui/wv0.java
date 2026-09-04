package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class wv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ xv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(xv0 xv0Var, Context context, int i10, l60 l60Var) {
        super(context, i10, l60Var, null);
        this.F = xv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean d() {
        zv0 zv0Var = this.F.d;
        ec1 ec1Var = zv0Var.c;
        View F = ec1Var.F(this);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = zv0Var.y;
            if (i10 == zv0Var.n && b10 == (zv0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        zv0 zv0Var = this.F.d;
        ec1 ec1Var = zv0Var.c;
        View F = ec1Var.F(c6Var);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return zv0Var.w[b10 - zv0Var.n0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            co.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        zv0 zv0Var = this.F.d;
        if (z10 && zv0Var.L) {
            Arrays.fill(zv0Var.w, false);
            zv0Var.c.getChildCount();
            for (int i10 = zv0Var.n0; i10 < zv0Var.n0 + zv0Var.y; i10++) {
                s4.c1 K = zv0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        ec1 ec1Var = zv0Var.c;
        View F = ec1Var.F(c6Var);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            zv0Var.w[b10 - zv0Var.n0] = z10;
        }
        zv0Var.i0();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        zv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        zv0.e0(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        zv0 zv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            zv0Var.c.getClass();
            int R = RecyclerView.R(this) - zv0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < zv0Var.n) {
                    for (int length = zv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = zv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    zv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    zv0Var.y++;
                    i10++;
                }
                zv0Var.r0();
                zv0Var.g0 = (zv0Var.n0 + i10) - 1;
                zv0Var.b.l();
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
