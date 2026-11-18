package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y20 extends Paint {
    public final /* synthetic */ f40 a;

    public y20(f40 f40Var) {
        this.a = f40Var;
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
