package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ xs0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(xs0 xs0Var, Context context, int i10, e50 e50Var) {
        super(context, i10, e50Var, null);
        this.F = xs0Var;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean e() {
        zs0 zs0Var = this.F.d;
        u71 u71Var = zs0Var.c;
        View F = u71Var.F(this);
        s4.c1 T = F == null ? null : u71Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = zs0Var.D;
            if (i10 == zs0Var.n && b10 == (zs0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        int b10;
        zs0 zs0Var = this.F.d;
        u71 u71Var = zs0Var.c;
        View F = u71Var.F(e6Var);
        s4.c1 T = F == null ? null : u71Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return zs0Var.x[b10 - zs0Var.n0];
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            un.x8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        zs0 zs0Var = this.F.d;
        zs0Var.c.getChildCount();
        if (z10 && zs0Var.L) {
            Arrays.fill(zs0Var.x, false);
            for (int i10 = zs0Var.n0; i10 < zs0Var.n0 + zs0Var.D; i10++) {
                s4.c1 K = zs0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        u71 u71Var = zs0Var.c;
        View F = u71Var.F(e6Var);
        s4.c1 T = F == null ? null : u71Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            zs0Var.x[b10 - zs0Var.n0] = z10;
        }
        zs0Var.n0();
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        zs0.i0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zs0.j0(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        zs0 zs0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            zs0Var.c.getClass();
            int R = RecyclerView.R(this) - zs0Var.n0;
            if (R >= 0) {
                ih.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < zs0Var.n) {
                    for (int length = zs0Var.w.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = zs0Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    zs0Var.w[i10] = (CharSequence) arrayList.remove(0);
                    zs0Var.D++;
                    i10++;
                }
                zs0Var.w0();
                zs0Var.g0 = (zs0Var.n0 + i10) - 1;
                zs0Var.b.f();
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
