package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v6 extends FrameLayout {
    public org.telegram.ui.Components.s6 a;
    public u6 b;

    public final void a(float f7) {
        org.telegram.ui.Components.s6 s6Var = this.a;
        s6Var.a();
        s6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.r.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        u6 u6Var = this.b;
        u6Var.d = f7;
        u6Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
