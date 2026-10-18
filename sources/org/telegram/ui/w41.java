package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class w41 extends b51 {
    public final /* synthetic */ int d3;
    public final /* synthetic */ z51 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(z51 z51Var, Context context, int i10) {
        super(z51Var, context);
        this.e3 = z51Var;
        this.d3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        z51 z51Var = this.e3;
        q41 q41Var = z51Var.f0;
        if (i10 == 0) {
            z51Var.w1 = false;
            if (z51Var.a == -1 || q41Var.getVisibility() != 0 || q41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            z51.a(z51Var, q41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        z51 z51Var = this.e3;
        z51Var.h();
        if (!z51Var.w1) {
            int I0 = z51Var.r0.I0();
            ArrayList arrayList = z51Var.D0;
            SparseIntArray sparseIntArray = z51Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || z51Var.C0) ? arrayList.size() + (z51Var.N0 ? 1 : 0) : 40) && I0 > z51Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.fy fyVar = valueAt >= 0 ? (org.telegram.ui.Components.fy) z51Var.M0.get(valueAt) : null;
                        if (fyVar != null) {
                            boolean z10 = fyVar.h;
                            int size = fyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = z51Var.d0;
                                kwVar.j(((kwVar.E == null || !kwVar.b0) ? 0 : 1) + (kwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    z51Var.d0.j(0, true);
                }
            }
        }
        z51Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(z51Var.e0, z51Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        z51Var.m();
    }
}
