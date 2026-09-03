package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t2 extends View {
    public final /* synthetic */ u2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(u2 u2Var, Context context) {
        super(context);
        this.a = u2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float clamp;
        u2 u2Var = this.a;
        if (u2Var.d == null) {
            return;
        }
        int b10 = u2Var.b.b();
        int dp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y3.D(6.0f, b10 - 1, AndroidUtilities.dp(7.0f) * b10);
        float f10 = u2Var.v + u2Var.s;
        if (dp < getMeasuredWidth()) {
            clamp = (getMeasuredWidth() - dp) / 2.0f;
        } else {
            float dp2 = AndroidUtilities.dp(4.0f);
            int dp3 = AndroidUtilities.dp(13.0f);
            clamp = dp2 - (Utilities.clamp(f10 - (((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3), Math.max(0, (b10 - (r10 * 2)) - 1), 0.0f) * dp3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < u2Var.d.items.size(); i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            n4.y1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(AndroidUtilities.dp(4.0f) + clamp + (AndroidUtilities.dp(13.0f) * i10), getMeasuredHeight() / 2.0f, (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(2.0f), n4.y1);
        }
        canvas.restore();
    }
}
