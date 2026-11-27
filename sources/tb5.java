// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class tb5 extends FrameLayout implements snb {
    public ema a;
    public ema b;
    public ImageView c;
    public ImageView d;
    public byte e;
    public boolean f;
    public int h;
    public byte n;
    public Paint r;

    public final void a(int i, int i2) {
        ema emaVar = this.a;
        yob.q(emaVar);
        ImageView imageView = this.c;
        yob.q(imageView);
        emaVar.setTextColor(i2);
        emaVar.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i, String str, boolean z) {
        this.a.l(str, false);
        ema emaVar = this.b;
        emaVar.l(null, false);
        ImageView imageView = this.c;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        emaVar.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, hl.L(7.0f), 0, 0);
        this.f = z;
        setWillNotDraw(!z);
    }

    public ema getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public ema getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        ImageView imageView = this.c;
        if (this.f) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, this.r);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.a.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        CharSequence text2 = this.b.getText();
        if (TextUtils.isEmpty(text2)) {
            accessibilityNodeInfo.setText(text);
            return;
        }
        accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        byte b = this.n;
        byte b2 = this.e;
        ema emaVar = this.a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        ema emaVar2 = this.b;
        int textHeight = (i5 - emaVar2.getTextHeight()) / 2;
        int L2 = ob6.a0 ? hl.L(b2) : 0;
        emaVar2.layout(L2, textHeight, emaVar2.getMeasuredWidth() + L2, emaVar2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i5 - emaVar.getTextHeight()) / 2;
        if (ob6.a0) {
            L = (getMeasuredWidth() - emaVar.getMeasuredWidth()) - hl.L(imageView2.getVisibility() == 0 ? this.h : b2);
        } else {
            L = hl.L(imageView2.getVisibility() == 0 ? this.h : b2);
        }
        emaVar.layout(L, textHeight2, emaVar.getMeasuredWidth() + L, emaVar.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L3 = hl.L(5.0f);
            int L4 = !ob6.a0 ? hl.L(b) : (i6 - imageView2.getMeasuredWidth()) - hl.L(b);
            imageView2.layout(L4, L3, imageView2.getMeasuredWidth() + L4, imageView2.getMeasuredHeight() + L3);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i5 - imageView.getMeasuredHeight()) / 2;
            int L5 = ob6.a0 ? hl.L(23.0f) : (i6 - imageView.getMeasuredWidth()) - hl.L(23.0f);
            imageView.layout(L5, measuredHeight, imageView.getMeasuredWidth() + L5, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(48.0f);
        ema emaVar = this.b;
        emaVar.measure(ik8.f(this.e, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - hl.L(r2 + 71)) - emaVar.getTextWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        ImageView imageView2 = this.c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        setMeasuredDimension(size, hl.L(50.0f) + (this.f ? 1 : 0));
    }

    public void setOffsetFromImage(int i) {
        this.h = i;
    }

    public void setTextColor(int i) {
        ema emaVar = this.a;
        yob.q(emaVar);
        emaVar.setTextColor(i);
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.r.setColor(aob.w0(null, aob.Xg, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
