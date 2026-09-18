package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s6 extends FrameLayout {
    public org.telegram.ui.Components.n6 a;
    public r6 b;

    public final void a(float f7) {
        org.telegram.ui.Components.n6 n6Var = this.a;
        n6Var.a();
        n6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.p.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        r6 r6Var = this.b;
        r6Var.d = f7;
        r6Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
