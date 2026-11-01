package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t30 extends Paint {
    public final /* synthetic */ a50 a;

    public t30(a50 a50Var) {
        this.a = a50Var;
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        ViewGroup viewGroup = this.a.b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
