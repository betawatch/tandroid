package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class x51 extends c61 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ a71 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(a71 a71Var, Context context, int i10) {
        super(a71Var, context);
        this.g3 = a71Var;
        this.f3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        a71 a71Var = this.g3;
        r51 r51Var = a71Var.f0;
        if (i10 == 0) {
            a71Var.w1 = false;
            if (a71Var.a == -1 || r51Var.getVisibility() != 0 || r51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            a71.a(a71Var, r51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        a71 a71Var = this.g3;
        a71Var.h();
        if (!a71Var.w1) {
            int I0 = a71Var.r0.I0();
            ArrayList arrayList = a71Var.D0;
            SparseIntArray sparseIntArray = a71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || a71Var.C0) ? arrayList.size() + (a71Var.N0 ? 1 : 0) : 40) && I0 > a71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.yx yxVar = valueAt >= 0 ? (org.telegram.ui.Components.yx) a71Var.M0.get(valueAt) : null;
                        if (yxVar != null) {
                            boolean z10 = yxVar.h;
                            int size = yxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.ew ewVar = a71Var.d0;
                                ewVar.j(((ewVar.E == null || !ewVar.b0) ? 0 : 1) + (ewVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    a71Var.d0.j(0, true);
                }
            }
        }
        a71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(a71Var.e0, a71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.f3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        a71Var.m();
    }
}
