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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class qb5 extends FrameLayout implements vlb {
    public lka a;
    public lka b;
    public ImageView c;
    public ImageView d;
    public byte e;
    public boolean f;
    public int h;
    public byte n;
    public Paint r;

    public final void a(int i, int i2) {
        lka lkaVar = this.a;
        anb.q(lkaVar);
        ImageView imageView = this.c;
        anb.q(imageView);
        lkaVar.setTextColor(i2);
        lkaVar.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i, String str, boolean z) {
        this.a.l(str, false);
        lka lkaVar = this.b;
        lkaVar.l(null, false);
        ImageView imageView = this.c;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        lkaVar.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, gm.L(7.0f), 0, 0);
        this.f = z;
        setWillNotDraw(!z);
    }

    public lka getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public lka getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        ImageView imageView = this.c;
        if (this.f) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
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
        lka lkaVar = this.a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        lka lkaVar2 = this.b;
        int textHeight = (i5 - lkaVar2.getTextHeight()) / 2;
        int L2 = jb6.a0 ? gm.L(b2) : 0;
        lkaVar2.layout(L2, textHeight, lkaVar2.getMeasuredWidth() + L2, lkaVar2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i5 - lkaVar.getTextHeight()) / 2;
        if (jb6.a0) {
            L = (getMeasuredWidth() - lkaVar.getMeasuredWidth()) - gm.L(imageView2.getVisibility() == 0 ? this.h : b2);
        } else {
            L = gm.L(imageView2.getVisibility() == 0 ? this.h : b2);
        }
        lkaVar.layout(L, textHeight2, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L3 = gm.L(5.0f);
            int L4 = !jb6.a0 ? gm.L(b) : (i6 - imageView2.getMeasuredWidth()) - gm.L(b);
            imageView2.layout(L4, L3, imageView2.getMeasuredWidth() + L4, imageView2.getMeasuredHeight() + L3);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i5 - imageView.getMeasuredHeight()) / 2;
            int L5 = jb6.a0 ? gm.L(23.0f) : (i6 - imageView.getMeasuredWidth()) - gm.L(23.0f);
            imageView.layout(L5, measuredHeight, imageView.getMeasuredWidth() + L5, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(48.0f);
        lka lkaVar = this.b;
        lkaVar.measure(wi8.f(this.e, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - gm.L(r2 + 71)) - lkaVar.getTextWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        ImageView imageView2 = this.c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        setMeasuredDimension(size, gm.L(50.0f) + (this.f ? 1 : 0));
    }

    public void setOffsetFromImage(int i) {
        this.h = i;
    }

    public void setTextColor(int i) {
        lka lkaVar = this.a;
        anb.q(lkaVar);
        lkaVar.setTextColor(i);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.r.setColor(cmb.w0(null, cmb.Wg, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
