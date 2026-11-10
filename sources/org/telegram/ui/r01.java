package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r01 extends w01 {
    public final /* synthetic */ int m3;
    public final /* synthetic */ t11 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(t11 t11Var, Context context, int i7) {
        super(t11Var, context);
        this.n3 = t11Var;
        this.m3 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            t11 t11Var = this.n3;
            t11Var.x1 = false;
            if (t11Var.a == -1 || t11Var.f0.getVisibility() != 0 || t11Var.f0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            t11.a(t11Var, t11Var.f0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        int i10;
        t11 t11Var = this.n3;
        t11Var.h();
        if (!t11Var.x1) {
            int I0 = t11Var.r0.I0();
            ArrayList arrayList = t11Var.D0;
            SparseIntArray sparseIntArray = t11Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || t11Var.C0) ? arrayList.size() + (t11Var.N0 ? 1 : 0) : 40) && I0 > t11Var.I0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.tw twVar = valueAt >= 0 ? (org.telegram.ui.Components.tw) t11Var.M0.get(valueAt) : null;
                        if (twVar != null) {
                            boolean z9 = twVar.h;
                            int size = twVar.c.size();
                            if (!z9) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.av avVar = t11Var.d0;
                                avVar.j(((avVar.E == null || !avVar.b0) ? 0 : 1) + (avVar.D != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    t11Var.d0.j(0, true);
                }
            }
        }
        t11Var.C();
        org.telegram.messenger.g0.Z3(t11Var.e0, t11Var.h0.computeVerticalScrollOffset() != 0 || (i10 = this.m3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        t11Var.m();
    }
}
