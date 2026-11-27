// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class r95 extends FrameLayout implements snb {
    public de0 a;
    public ema b;
    public ema c;
    public ImageView d;
    public rb0 e;
    public TLRPC.User f;
    public Paint h;
    public int n;
    public boolean r;
    public int s;

    public final void a(int i, int i2) {
        this.n = i;
        ImageView imageView = this.d;
        imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(i2);
        aob.F1(imageView.getDrawable(), i2 & 620756991, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.r) {
            canvas2 = canvas;
            canvas2.drawLine(ob6.a0 ? 0.0f : hl.L(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(68.0f) : 0), getMeasuredHeight() - 1, this.h);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    public CharSequence getName() {
        return this.b.getText();
    }

    public TLRPC.User getUser() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), TLObject.FLAG_30));
    }

    public void setDrawDivider(boolean z) {
        this.r = z;
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        int w0;
        try {
            this.h.setColor(aob.w0(null, aob.Xg, false));
            if (this.d != null && this.c != null && (w0 = aob.w0(null, this.n, false)) != this.s) {
                this.s = w0;
                a(this.n, w0);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
