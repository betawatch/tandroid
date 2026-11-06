package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class xx extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public Paint a;
    public float[] b;
    public Path c;
    public float d;

    public final void a(float f10, float f11) {
        float[] fArr = this.b;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        Path path = this.c;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, measuredWidth - org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(4.0f)), getMeasuredHeight());
        a(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(8.0f)));
        float[] fArr = this.b;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint = this.a;
        canvas.drawPath(path, paint);
        path.rewind();
        rectF.set(measuredWidth + org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(4.0f)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a(org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f));
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(path, paint);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.a.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
