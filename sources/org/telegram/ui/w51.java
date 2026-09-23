package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class w51 extends b61 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ z61 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w51(z61 z61Var, Context context, int i10) {
        super(z61Var, context);
        this.g3 = z61Var;
        this.f3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        z61 z61Var = this.g3;
        q51 q51Var = z61Var.f0;
        if (i10 == 0) {
            z61Var.w1 = false;
            if (z61Var.a == -1 || q51Var.getVisibility() != 0 || q51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            z61.a(z61Var, q51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        z61 z61Var = this.g3;
        z61Var.h();
        if (!z61Var.w1) {
            int I0 = z61Var.r0.I0();
            ArrayList arrayList = z61Var.D0;
            SparseIntArray sparseIntArray = z61Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || z61Var.C0) ? arrayList.size() + (z61Var.N0 ? 1 : 0) : 40) && I0 > z61Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.xx xxVar = valueAt >= 0 ? (org.telegram.ui.Components.xx) z61Var.M0.get(valueAt) : null;
                        if (xxVar != null) {
                            boolean z10 = xxVar.h;
                            int size = xxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.dw dwVar = z61Var.d0;
                                dwVar.j(((dwVar.E == null || !dwVar.b0) ? 0 : 1) + (dwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    z61Var.d0.j(0, true);
                }
            }
        }
        z61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(z61Var.e0, z61Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        z61Var.m();
    }
}
