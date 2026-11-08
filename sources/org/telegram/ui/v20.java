package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v20 extends Paint {
    public final /* synthetic */ c40 a;

    public v20(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        ViewGroup viewGroup = this.a.b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
