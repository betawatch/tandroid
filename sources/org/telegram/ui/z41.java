package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z41 extends e51 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ c61 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z41(c61 c61Var, Context context, int i10) {
        super(c61Var, context);
        this.o3 = c61Var;
        this.n3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        c61 c61Var = this.o3;
        t41 t41Var = c61Var.f0;
        if (i10 == 0) {
            c61Var.x1 = false;
            if (c61Var.a == -1 || t41Var.getVisibility() != 0 || t41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            c61.a(c61Var, t41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        int i11;
        c61 c61Var = this.o3;
        c61Var.h();
        if (!c61Var.x1) {
            int I0 = c61Var.r0.I0();
            ArrayList arrayList = c61Var.D0;
            SparseIntArray sparseIntArray = c61Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || c61Var.C0) ? arrayList.size() + (c61Var.N0 ? 1 : 0) : 40) && I0 > c61Var.I0.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i12);
                        int valueAt = sparseIntArray.valueAt(i12);
                        org.telegram.ui.Components.ey eyVar = valueAt >= 0 ? (org.telegram.ui.Components.ey) c61Var.M0.get(valueAt) : null;
                        if (eyVar != null) {
                            boolean z10 = eyVar.h;
                            int size = eyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = c61Var.d0;
                                kwVar.j(((kwVar.E == null || !kwVar.b0) ? 0 : 1) + (kwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i12++;
                    }
                } else {
                    c61Var.d0.j(0, true);
                }
            }
        }
        c61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(c61Var.e0, c61Var.h0.computeVerticalScrollOffset() != 0 || (i11 = this.n3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6, 1.0f, true);
        c61Var.m();
    }
}
