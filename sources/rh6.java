// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rh6 extends View implements snb {
    public final TextPaint a;
    public final Paint b;
    public final String c;
    public final Rect d;
    public View e;

    public rh6(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new Paint(1);
        this.d = new Rect();
        this.c = ob6.M0(2131748481, null);
        textPaint.setTextSize(hl.L(14.0f));
        updateColors();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.e;
        Rect rect = this.d;
        float width = view != null ? ((((getWidth() - rect.width()) - hl.L(8.0f)) - this.e.getPaddingLeft()) - this.e.getPaddingRight()) / 2.0f : hl.L(64.0f);
        Paint paint = this.b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - hl.L(8.0f)) - width, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - hl.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + hl.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + hl.L(8.0f) + width, getHeight() / 2.0f, paint);
        canvas.drawText(this.c, (getWidth() - rect.width()) / 2.0f, (rect.height() + getHeight()) / 2.0f, this.a);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.e;
        if (view != null) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
        String str = this.c;
        this.a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.e = view;
    }

    @Override // snb
    public final void updateColors() {
        this.a.setColor(aob.w0(null, aob.y6, false));
        this.b.setColor(aob.w0(null, aob.zj, false));
        invalidate();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
