package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t51 extends y51 {
    public final /* synthetic */ int c3;
    public final /* synthetic */ x61 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(x61 x61Var, Context context, int i10) {
        super(x61Var, context);
        this.d3 = x61Var;
        this.c3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        x61 x61Var = this.d3;
        n51 n51Var = x61Var.c0;
        if (i10 == 0) {
            x61Var.t1 = false;
            if (x61Var.a == -1 || n51Var.getVisibility() != 0 || n51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            x61.a(x61Var, n51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        x61 x61Var = this.d3;
        x61Var.h();
        if (!x61Var.t1) {
            int I0 = x61Var.o0.I0();
            ArrayList arrayList = x61Var.A0;
            SparseIntArray sparseIntArray = x61Var.t0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || x61Var.z0) ? arrayList.size() + (x61Var.K0 ? 1 : 0) : 40) && I0 > x61Var.F0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.vx vxVar = valueAt >= 0 ? (org.telegram.ui.Components.vx) x61Var.J0.get(valueAt) : null;
                        if (vxVar != null) {
                            boolean z4 = vxVar.h;
                            int size = vxVar.c.size();
                            if (!z4) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.wv wvVar = x61Var.a0;
                                wvVar.j(((wvVar.B == null || !wvVar.V) ? 0 : 1) + (wvVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    x61Var.a0.j(0, true);
                }
            }
        }
        x61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(x61Var.b0, x61Var.e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        x61Var.m();
    }
}
