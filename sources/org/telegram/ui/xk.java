package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xk extends qq0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ cn c;

    public xk(cn cnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = cnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final org.telegram.messenger.jc j(int i7) {
        return new org.telegram.messenger.jc(this.a, null, 0);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.c.u((org.telegram.messenger.gf) this.b.get(0), j20Var, z9, i10, 0, z10, 0L);
    }
}
