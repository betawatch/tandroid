package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vu0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ wu0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu0(wu0 wu0Var, Context context, int i10, u50 u50Var) {
        super(context, i10, u50Var, null);
        this.B = wu0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean e() {
        yu0 yu0Var = this.B.d;
        ta1 ta1Var = yu0Var.c;
        View F = ta1Var.F(this);
        f2.o1 T = F == null ? null : ta1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = yu0Var.y;
            if (i10 == yu0Var.n && b10 == (yu0Var.j0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        int b10;
        yu0 yu0Var = this.B.d;
        ta1 ta1Var = yu0Var.c;
        View F = ta1Var.F(z5Var);
        f2.o1 T = F == null ? null : ta1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return yu0Var.w[b10 - yu0Var.j0];
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(gh.r rVar, ActionMode actionMode) {
        if (rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            rn.k8(menu, this.B.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int b10;
        yu0 yu0Var = this.B.d;
        if (z10 && yu0Var.H) {
            Arrays.fill(yu0Var.w, false);
            yu0Var.c.getChildCount();
            for (int i10 = yu0Var.j0; i10 < yu0Var.j0 + yu0Var.y; i10++) {
                f2.o1 K = yu0Var.c.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        ta1 ta1Var = yu0Var.c;
        View F = ta1Var.F(z5Var);
        f2.o1 T = F == null ? null : ta1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            yu0Var.w[b10 - yu0Var.j0] = z10;
        }
        yu0Var.i0();
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        yu0.d0(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        yu0.e0(this.B.d, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean l(ArrayList arrayList) {
        yu0 yu0Var = this.B.d;
        if (!arrayList.isEmpty()) {
            yu0Var.c.getClass();
            int R = RecyclerView.R(this) - yu0Var.j0;
            if (R >= 0) {
                gh.r rVar = this.d;
                rVar.getText().replace(rVar.getSelectionStart(), rVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < yu0Var.n) {
                    for (int length = yu0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = yu0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    yu0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    yu0Var.y++;
                    i10++;
                }
                yu0Var.r0();
                yu0Var.c0 = (yu0Var.j0 + i10) - 1;
                yu0Var.b.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean p() {
        return this.B.d.H;
    }
}
