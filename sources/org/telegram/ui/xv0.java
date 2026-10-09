package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ yv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(yv0 yv0Var, Context context, int i10, m60 m60Var) {
        super(context, i10, m60Var, null);
        this.F = yv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.c;
        View F = fc1Var.F(this);
        s4.d1 T = F == null ? null : fc1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = aw0Var.y;
            if (i10 == aw0Var.n && b10 == (aw0Var.n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        aw0 aw0Var = this.F.d;
        fc1 fc1Var = aw0Var.c;
        View F = fc1Var.F(d6Var);
        s4.d1 T = F == null ? null : fc1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return aw0Var.w[b10 - aw0Var.n0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            zn.n8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        aw0 aw0Var = this.F.d;
        if (z10 && aw0Var.L) {
            Arrays.fill(aw0Var.w, false);
            aw0Var.c.getChildCount();
            for (int i10 = aw0Var.n0; i10 < aw0Var.n0 + aw0Var.y; i10++) {
                s4.d1 K = aw0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        fc1 fc1Var = aw0Var.c;
        View F = fc1Var.F(d6Var);
        s4.d1 T = F == null ? null : fc1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            aw0Var.w[b10 - aw0Var.n0] = z10;
        }
        aw0Var.i0();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        aw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        aw0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        aw0 aw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            aw0Var.c.getClass();
            int R = RecyclerView.R(this) - aw0Var.n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
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

    @Override // org.telegram.ui.Cells.d6
    public final boolean p() {
        return this.F.d.L;
    }
}
