package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class u6 extends FrameLayout {
    public org.telegram.ui.Components.q6 a;
    public t6 b;

    public final void a(float f7) {
        org.telegram.ui.Components.q6 q6Var = this.a;
        q6Var.a();
        q6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.r.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        t6 t6Var = this.b;
        t6Var.d = f7;
        t6Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
