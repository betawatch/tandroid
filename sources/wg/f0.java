package wg;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f0 extends View implements z5 {
    public TextPaint a;
    public int b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        TextPaint textPaint = this.a;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, textPaint);
        ia.f.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(1.5f), ia.f.d().e());
        canvas.drawText("+" + this.b, measuredWidth, (int) (measuredHeight - ((textPaint.ascent() + textPaint.descent()) / 2.0f)), textPaint);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.a.setColor(j6.x0(null, j6.a7, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
