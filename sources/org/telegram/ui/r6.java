package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r6 extends FrameLayout {
    public org.telegram.ui.Components.q6 a;
    public q6 b;

    public final void a(float f7) {
        org.telegram.ui.Components.q6 q6Var = this.a;
        q6Var.a();
        q6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.p.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        q6 q6Var2 = this.b;
        q6Var2.d = f7;
        q6Var2.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
