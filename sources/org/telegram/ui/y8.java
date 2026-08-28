package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y8 extends TextView {
    public final Paint a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = b6Var;
        this.a = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.8f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, this.b));
        Paint paint = this.a;
        paint.setColor(l1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i9 = 0;
        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
            i9 = Math.max(i9, (int) layout.getLineWidth(i10));
        }
        float f10 = i9 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
