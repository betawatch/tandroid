package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uj0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.r71 b;
    public final /* synthetic */ vj0 c;
    public final /* synthetic */ xj0 d;

    public uj0(xj0 xj0Var, int i10, org.telegram.ui.Components.r71 r71Var, vj0 vj0Var) {
        this.d = xj0Var;
        this.a = i10;
        this.b = r71Var;
        this.c = vj0Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            return;
        }
        int i11 = this.a;
        xj0 xj0Var = this.d;
        if (i11 != 2) {
            xj0.a0(xj0Var);
        } else if (xj0Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(xj0Var.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.a;
        xj0 xj0Var = this.d;
        vj0 vj0Var = this.c;
        if (i11 >= 0) {
            if (this.b.f3.N0() >= r5.g3.y.size() - 5 && !vj0Var.k) {
                xj0Var.l0(i12, false);
            }
        }
        if (i12 == 1) {
            xj0Var.m0(vj0Var);
        }
    }
}
