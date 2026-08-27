package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r6 extends FrameLayout {
    public org.telegram.ui.Components.j6 a;
    public q6 b;

    public final void a(float f10) {
        org.telegram.ui.Components.j6 j6Var = this.a;
        j6Var.a();
        j6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(h7.n.a(f10, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        q6 q6Var = this.b;
        q6Var.d = f10;
        q6Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
