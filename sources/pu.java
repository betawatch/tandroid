// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pu extends View implements Drawable.Callback, zlb {
    public final xi5 a;
    public final ex b;
    public cw c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f;
    public TL_iv.pageBlockDetails h;

    public pu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
        this.f = new AnimatedArrowDrawable(aob.w0(null, aob.y6, false), true);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        xi5 xi5Var = this.a;
        xi5Var.getClass();
        canvas.translate(hl.L(18.0f), ((getMeasuredHeight() - hl.L(13.0f)) - 1) / 2);
        this.f.draw(canvas);
        canvas.restore();
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(xi5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        float measuredHeight = getMeasuredHeight() - 1;
        canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, o.t1);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence g;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        cw cwVar = this.c;
        if (cwVar != null && (g = o.g(this.a, this.b, cwVar)) != null) {
            spannableStringBuilder.append(g).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) ob6.M0(2131754864, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        spannableStringBuilder.append((CharSequence) ob6.M0((pageblockdetails == null || !pageblockdetails.open) ? 2131754865 : 2131754861, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        pu puVar;
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(39.0f);
        this.d = hl.L(50.0f);
        this.e = hl.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            xi5 xi5Var = this.a;
            int h = ik8.h(xi5Var, 54.0f, size);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            ex exVar = this.b;
            puVar = this;
            cw n = o.n(xi5Var, puVar, null, richText, h, 0, pageblockdetails2, (exVar == null || !exVar.H) ? Layout.Alignment.ALIGN_NORMAL : o0b.a(), 0, this.b);
            puVar.c = n;
            if (n != null) {
                L = Math.max(L, puVar.c.d.getHeight() + hl.L(21.0f));
                int L2 = ((hl.L(21.0f) + puVar.c.d.getHeight()) - puVar.c.d.getHeight()) / 2;
                puVar.e = L2;
                cw cwVar = puVar.c;
                cwVar.s = puVar.d;
                cwVar.w = L2;
            }
        } else {
            puVar = this;
        }
        puVar.setMeasuredDimension(size, L + 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
        this.h = pageblockdetails;
        float f = pageblockdetails.open ? 0.0f : 1.0f;
        AnimatedArrowDrawable animatedArrowDrawable = this.f;
        animatedArrowDrawable.setAnimationProgress(f);
        animatedArrowDrawable.setCallback(this);
        requestLayout();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
