// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r43 extends View implements tjb {
    public final TextPaint a;
    public final TextPaint b;
    public final String c;
    public final String d;
    public final Rect e;

    public r43(Context context, String str, String str2) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        this.e = new Rect();
        this.c = str;
        this.d = str2;
        textPaint.setTextSize(gl.L(24.0f));
        textPaint2.setTextSize(gl.L(14.0f));
        textPaint.setColor(bkb.w0(null, bkb.F6, false));
        textPaint2.setColor(bkb.w0(null, bkb.G6, false));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.b;
        String str = this.d;
        float measureText = textPaint.measureText(str);
        TextPaint textPaint2 = this.a;
        String str2 = this.c;
        float measureText2 = textPaint2.measureText(str2);
        int length = str2.length();
        Rect rect = this.e;
        textPaint2.getTextBounds(str2, 0, length, rect);
        textPaint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str2, (getWidth() * 0.25f) - (measureText2 / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint2);
        canvas.drawText(str, (getWidth() * 0.7f) - (measureText / 2.0f), (getHeight() / 2.0f) + (rect.height() / 2.0f), textPaint);
    }

    @Override // tjb
    public final void updateColors() {
        this.a.setColor(bkb.w0(null, bkb.F6, false));
        this.b.setColor(bkb.w0(null, bkb.G6, false));
        invalidate();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
