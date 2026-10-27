package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wj0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.s71 b;
    public final /* synthetic */ xj0 c;
    public final /* synthetic */ zj0 d;

    public wj0(zj0 zj0Var, int i10, org.telegram.ui.Components.s71 s71Var, xj0 xj0Var) {
        this.d = zj0Var;
        this.a = i10;
        this.b = s71Var;
        this.c = xj0Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            return;
        }
        int i11 = this.a;
        zj0 zj0Var = this.d;
        if (i11 != 2) {
            zj0.a0(zj0Var);
        } else if (zj0Var.getParentActivity() != null) {
            AndroidUtilities.hideKeyboard(zj0Var.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.a;
        zj0 zj0Var = this.d;
        xj0 xj0Var = this.c;
        if (i11 >= 0) {
            if (this.b.f3.N0() >= r5.g3.y.size() - 5 && !xj0Var.k) {
                zj0Var.l0(i12, false);
            }
        }
        if (i12 == 1) {
            zj0Var.m0(xj0Var);
        }
    }
}
