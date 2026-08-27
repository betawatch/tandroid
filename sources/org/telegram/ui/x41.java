package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x41 extends c51 {
    public final /* synthetic */ int b3;
    public final /* synthetic */ a61 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(a61 a61Var, Context context, int i10) {
        super(a61Var, context);
        this.c3 = a61Var;
        this.b3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        a61 a61Var = this.c3;
        r41 r41Var = a61Var.b0;
        if (i10 == 0) {
            a61Var.s1 = false;
            if (a61Var.a == -1 || r41Var.getVisibility() != 0 || r41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            a61.a(a61Var, r41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        a61 a61Var = this.c3;
        a61Var.h();
        if (!a61Var.s1) {
            int I0 = a61Var.n0.I0();
            ArrayList arrayList = a61Var.z0;
            SparseIntArray sparseIntArray = a61Var.s0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || a61Var.y0) ? arrayList.size() + (a61Var.J0 ? 1 : 0) : 40) && I0 > a61Var.E0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.kx kxVar = valueAt >= 0 ? (org.telegram.ui.Components.kx) a61Var.I0.get(valueAt) : null;
                        if (kxVar != null) {
                            boolean z10 = kxVar.h;
                            int size = kxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.mv mvVar = a61Var.W;
                                mvVar.j(((mvVar.A == null || !mvVar.V) ? 0 : 1) + (mvVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    a61Var.W.j(0, true);
                }
            }
        }
        a61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(a61Var.a0, a61Var.d0.computeVerticalScrollOffset() != 0 || (i12 = this.b3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        a61Var.m();
    }
}
