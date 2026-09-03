package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t6 extends FrameLayout {
    public org.telegram.ui.Components.k6 a;
    public dg.r b;

    public final void a(float f10) {
        org.telegram.ui.Components.k6 k6Var = this.a;
        k6Var.a();
        k6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(k7.o.a(f10, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        dg.r rVar = this.b;
        rVar.d = f10;
        rVar.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
