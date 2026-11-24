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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class s95 extends FrameLayout implements tjb {
    public jia a;
    public jia b;
    public ImageView c;
    public ImageView d;
    public byte e;
    public boolean f;
    public int h;
    public byte n;
    public Paint r;

    public final void a(int i, int i2) {
        jia jiaVar = this.a;
        zkb.q(jiaVar);
        ImageView imageView = this.c;
        zkb.q(imageView);
        jiaVar.setTextColor(i2);
        jiaVar.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i, String str, boolean z) {
        this.a.l(str, false);
        jia jiaVar = this.b;
        jiaVar.l(null, false);
        ImageView imageView = this.c;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        jiaVar.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, gl.L(7.0f), 0, 0);
        this.f = z;
        setWillNotDraw(!z);
    }

    public jia getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public jia getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        ImageView imageView = this.c;
        if (this.f) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
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
        jia jiaVar = this.a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        jia jiaVar2 = this.b;
        int textHeight = (i5 - jiaVar2.getTextHeight()) / 2;
        int L2 = k96.a0 ? gl.L(b2) : 0;
        jiaVar2.layout(L2, textHeight, jiaVar2.getMeasuredWidth() + L2, jiaVar2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i5 - jiaVar.getTextHeight()) / 2;
        if (k96.a0) {
            L = (getMeasuredWidth() - jiaVar.getMeasuredWidth()) - gl.L(imageView2.getVisibility() == 0 ? this.h : b2);
        } else {
            L = gl.L(imageView2.getVisibility() == 0 ? this.h : b2);
        }
        jiaVar.layout(L, textHeight2, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L3 = gl.L(5.0f);
            int L4 = !k96.a0 ? gl.L(b) : (i6 - imageView2.getMeasuredWidth()) - gl.L(b);
            imageView2.layout(L4, L3, imageView2.getMeasuredWidth() + L4, imageView2.getMeasuredHeight() + L3);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i5 - imageView.getMeasuredHeight()) / 2;
            int L5 = k96.a0 ? gl.L(23.0f) : (i6 - imageView.getMeasuredWidth()) - gl.L(23.0f);
            imageView.layout(L5, measuredHeight, imageView.getMeasuredWidth() + L5, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(48.0f);
        jia jiaVar = this.b;
        jiaVar.measure(ug8.f(this.e, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - gl.L(r2 + 71)) - jiaVar.getTextWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        ImageView imageView2 = this.c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        setMeasuredDimension(size, gl.L(50.0f) + (this.f ? 1 : 0));
    }

    public void setOffsetFromImage(int i) {
        this.h = i;
    }

    public void setTextColor(int i) {
        jia jiaVar = this.a;
        zkb.q(jiaVar);
        jiaVar.setTextColor(i);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.r.setColor(bkb.w0(null, bkb.Wg, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
