package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s2 extends View {
    public final /* synthetic */ t2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, Context context) {
        super(context);
        this.a = t2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float clamp;
        t2 t2Var = this.a;
        if (t2Var.d == null) {
            return;
        }
        int b10 = t2Var.b.b();
        int dp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.l0.D(6.0f, b10 - 1, AndroidUtilities.dp(7.0f) * b10);
        float f10 = t2Var.v + t2Var.s;
        if (dp < getMeasuredWidth()) {
            clamp = (getMeasuredWidth() - dp) / 2.0f;
        } else {
            float dp2 = AndroidUtilities.dp(4.0f);
            int dp3 = AndroidUtilities.dp(13.0f);
            clamp = dp2 - (Utilities.clamp(f10 - (((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3), Math.max(0, (b10 - (r10 * 2)) - 1), 0.0f) * dp3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i9 = 0; i9 < t2Var.d.items.size(); i9++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i9 - f10));
            l4.x1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(AndroidUtilities.dp(4.0f) + clamp + (AndroidUtilities.dp(13.0f) * i9), getMeasuredHeight() / 2.0f, (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(2.0f), l4.x1);
        }
        canvas.restore();
    }
}
