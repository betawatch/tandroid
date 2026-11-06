package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
