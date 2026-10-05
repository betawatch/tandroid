package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class x51 extends c61 {
    public final /* synthetic */ int m3;
    public final /* synthetic */ a71 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(a71 a71Var, Context context, int i10) {
        super(a71Var, context);
        this.n3 = a71Var;
        this.m3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        a71 a71Var = this.n3;
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
    public final void l0(int i10) {
        int i11;
        a71 a71Var = this.n3;
        a71Var.h();
        if (!a71Var.w1) {
            int I0 = a71Var.r0.I0();
            ArrayList arrayList = a71Var.D0;
            SparseIntArray sparseIntArray = a71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || a71Var.C0) ? arrayList.size() + (a71Var.N0 ? 1 : 0) : 40) && I0 > a71Var.I0.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i12);
                        int valueAt = sparseIntArray.valueAt(i12);
                        org.telegram.ui.Components.ay ayVar = valueAt >= 0 ? (org.telegram.ui.Components.ay) a71Var.M0.get(valueAt) : null;
                        if (ayVar != null) {
                            boolean z10 = ayVar.h;
                            int size = ayVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gw gwVar = a71Var.d0;
                                gwVar.j(((gwVar.E == null || !gwVar.b0) ? 0 : 1) + (gwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i12++;
                    }
                } else {
                    a71Var.d0.j(0, true);
                }
            }
        }
        a71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(a71Var.e0, a71Var.h0.computeVerticalScrollOffset() != 0 || (i11 = this.m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6, 1.0f, true);
        a71Var.m();
    }
}
