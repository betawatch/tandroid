package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class u6 extends FrameLayout {
    public org.telegram.ui.Components.q6 a;
    public t6 b;

    public final void a(float f7) {
        org.telegram.ui.Components.q6 q6Var = this.a;
        q6Var.a();
        q6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.r.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        t6 t6Var = this.b;
        t6Var.c = f7;
        t6Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
