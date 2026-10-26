package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v6 extends FrameLayout {
    public org.telegram.ui.Components.s6 a;
    public u6 b;

    public final void a(float f7) {
        org.telegram.ui.Components.s6 s6Var = this.a;
        s6Var.a();
        s6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(a8.ee.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        u6 u6Var = this.b;
        u6Var.c = f7;
        u6Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
