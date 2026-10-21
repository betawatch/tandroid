package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class u41 extends z41 {
    public final /* synthetic */ int d3;
    public final /* synthetic */ x51 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(x51 x51Var, Context context, int i10) {
        super(x51Var, context);
        this.e3 = x51Var;
        this.d3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        x51 x51Var = this.e3;
        o41 o41Var = x51Var.f0;
        if (i10 == 0) {
            x51Var.w1 = false;
            if (x51Var.a == -1 || o41Var.getVisibility() != 0 || o41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            x51.a(x51Var, o41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        x51 x51Var = this.e3;
        x51Var.h();
        if (!x51Var.w1) {
            int I0 = x51Var.r0.I0();
            ArrayList arrayList = x51Var.D0;
            SparseIntArray sparseIntArray = x51Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || x51Var.C0) ? arrayList.size() + (x51Var.N0 ? 1 : 0) : 40) && I0 > x51Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.fy fyVar = valueAt >= 0 ? (org.telegram.ui.Components.fy) x51Var.M0.get(valueAt) : null;
                        if (fyVar != null) {
                            boolean z10 = fyVar.h;
                            int size = fyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = x51Var.d0;
                                kwVar.j(((kwVar.E == null || !kwVar.b0) ? 0 : 1) + (kwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    x51Var.d0.j(0, true);
                }
            }
        }
        x51Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(x51Var.e0, x51Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        x51Var.m();
    }
}
