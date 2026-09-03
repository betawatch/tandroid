package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t51 extends y51 {
    public final /* synthetic */ int c3;
    public final /* synthetic */ w61 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(w61 w61Var, Context context, int i10) {
        super(w61Var, context);
        this.d3 = w61Var;
        this.c3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        w61 w61Var = this.d3;
        n51 n51Var = w61Var.c0;
        if (i10 == 0) {
            w61Var.t1 = false;
            if (w61Var.a == -1 || n51Var.getVisibility() != 0 || n51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            w61.a(w61Var, n51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        w61 w61Var = this.d3;
        w61Var.h();
        if (!w61Var.t1) {
            int I0 = w61Var.o0.I0();
            ArrayList arrayList = w61Var.A0;
            SparseIntArray sparseIntArray = w61Var.t0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || w61Var.z0) ? arrayList.size() + (w61Var.K0 ? 1 : 0) : 40) && I0 > w61Var.F0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.xx xxVar = valueAt >= 0 ? (org.telegram.ui.Components.xx) w61Var.J0.get(valueAt) : null;
                        if (xxVar != null) {
                            boolean z4 = xxVar.h;
                            int size = xxVar.c.size();
                            if (!z4) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.zv zvVar = w61Var.a0;
                                zvVar.j(((zvVar.B == null || !zvVar.V) ? 0 : 1) + (zvVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    w61Var.a0.j(0, true);
                }
            }
        }
        w61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(w61Var.b0, w61Var.e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        w61Var.m();
    }
}
