package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class y41 extends d51 {
    public final /* synthetic */ int g3;
    public final /* synthetic */ b61 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(b61 b61Var, Context context, int i10) {
        super(b61Var, context);
        this.h3 = b61Var;
        this.g3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        b61 b61Var = this.h3;
        s41 s41Var = b61Var.f0;
        if (i10 == 0) {
            b61Var.x1 = false;
            if (b61Var.a == -1 || s41Var.getVisibility() != 0 || s41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            b61.a(b61Var, s41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        b61 b61Var = this.h3;
        b61Var.h();
        if (!b61Var.x1) {
            int I0 = b61Var.r0.I0();
            ArrayList arrayList = b61Var.D0;
            SparseIntArray sparseIntArray = b61Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || b61Var.C0) ? arrayList.size() + (b61Var.N0 ? 1 : 0) : 40) && I0 > b61Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.fy fyVar = valueAt >= 0 ? (org.telegram.ui.Components.fy) b61Var.M0.get(valueAt) : null;
                        if (fyVar != null) {
                            boolean z10 = fyVar.h;
                            int size = fyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = b61Var.d0;
                                kwVar.j(((kwVar.E == null || !kwVar.b0) ? 0 : 1) + (kwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    b61Var.d0.j(0, true);
                }
            }
        }
        b61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(b61Var.e0, b61Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.g3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        b61Var.m();
    }
}
