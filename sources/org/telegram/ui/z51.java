package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class z51 extends e61 {
    public final /* synthetic */ int m3;
    public final /* synthetic */ c71 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(c71 c71Var, Context context, int i10) {
        super(c71Var, context);
        this.n3 = c71Var;
        this.m3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        c71 c71Var = this.n3;
        t51 t51Var = c71Var.f0;
        if (i10 == 0) {
            c71Var.w1 = false;
            if (c71Var.a == -1 || t51Var.getVisibility() != 0 || t51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            c71.a(c71Var, t51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        int i11;
        c71 c71Var = this.n3;
        c71Var.h();
        if (!c71Var.w1) {
            int I0 = c71Var.r0.I0();
            ArrayList arrayList = c71Var.D0;
            SparseIntArray sparseIntArray = c71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || c71Var.C0) ? arrayList.size() + (c71Var.N0 ? 1 : 0) : 40) && I0 > c71Var.I0.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i12);
                        int valueAt = sparseIntArray.valueAt(i12);
                        org.telegram.ui.Components.ay ayVar = valueAt >= 0 ? (org.telegram.ui.Components.ay) c71Var.M0.get(valueAt) : null;
                        if (ayVar != null) {
                            boolean z10 = ayVar.h;
                            int size = ayVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gw gwVar = c71Var.d0;
                                gwVar.j(((gwVar.E == null || !gwVar.b0) ? 0 : 1) + (gwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i12++;
                    }
                } else {
                    c71Var.d0.j(0, true);
                }
            }
        }
        c71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(c71Var.e0, c71Var.h0.computeVerticalScrollOffset() != 0 || (i11 = this.m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6, 1.0f, true);
        c71Var.m();
    }
}
