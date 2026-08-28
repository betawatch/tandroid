package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y41 extends d51 {
    public final /* synthetic */ int b3;
    public final /* synthetic */ b61 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(b61 b61Var, Context context, int i9) {
        super(b61Var, context);
        this.c3 = b61Var;
        this.b3 = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i9) {
        b61 b61Var = this.c3;
        s41 s41Var = b61Var.b0;
        if (i9 == 0) {
            b61Var.s1 = false;
            if (b61Var.a == -1 || s41Var.getVisibility() != 0 || s41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            b61.a(b61Var, s41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i9, int i10) {
        int i11;
        b61 b61Var = this.c3;
        b61Var.h();
        if (!b61Var.s1) {
            int I0 = b61Var.n0.I0();
            ArrayList arrayList = b61Var.z0;
            SparseIntArray sparseIntArray = b61Var.s0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || b61Var.y0) ? arrayList.size() + (b61Var.J0 ? 1 : 0) : 40) && I0 > b61Var.E0.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i12);
                        int valueAt = sparseIntArray.valueAt(i12);
                        org.telegram.ui.Components.jx jxVar = valueAt >= 0 ? (org.telegram.ui.Components.jx) b61Var.I0.get(valueAt) : null;
                        if (jxVar != null) {
                            boolean z10 = jxVar.h;
                            int size = jxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.nv nvVar = b61Var.W;
                                nvVar.j(((nvVar.A == null || !nvVar.U) ? 0 : 1) + (nvVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i12++;
                    }
                } else {
                    b61Var.W.j(0, true);
                }
            }
        }
        b61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(b61Var.a0, b61Var.d0.computeVerticalScrollOffset() != 0 || (i11 = this.b3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6, 1.0f, true);
        b61Var.m();
    }
}
