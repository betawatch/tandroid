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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ov extends View implements Drawable.Callback, fkb {
    public final ui5 a;
    public final ey b;
    public bx c;
    public int d;
    public int e;
    public final AnimatedArrowDrawable f;
    public TL_iv.pageBlockDetails h;

    public ov(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
        this.f = new AnimatedArrowDrawable(cmb.w0(null, cmb.x6, false), true);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        canvas.save();
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        canvas.translate(gm.L(18.0f), ((getMeasuredHeight() - gm.L(13.0f)) - 1) / 2);
        this.f.draw(canvas);
        canvas.restore();
        if (this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(ui5Var, canvas, this, 0);
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
        bx bxVar = this.c;
        if (bxVar != null && (g = o.g(this.a, this.b, bxVar)) != null) {
            spannableStringBuilder.append(g).append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) jb6.M0(2131754868, null)).append((CharSequence) ", ");
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        spannableStringBuilder.append((CharSequence) jb6.M0((pageblockdetails == null || !pageblockdetails.open) ? 2131754869 : 2131754865, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ov ovVar;
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(39.0f);
        this.d = gm.L(50.0f);
        this.e = gm.L(11.0f) + 1;
        TL_iv.pageBlockDetails pageblockdetails = this.h;
        if (pageblockdetails != null) {
            TL_iv.RichText richText = pageblockdetails.title;
            ui5 ui5Var = this.a;
            int h = wi8.h(ui5Var, 54.0f, size);
            TL_iv.pageBlockDetails pageblockdetails2 = this.h;
            ey eyVar = this.b;
            ovVar = this;
            bx n = o.n(ui5Var, ovVar, null, richText, h, 0, pageblockdetails2, (eyVar == null || !eyVar.H) ? Layout.Alignment.ALIGN_NORMAL : oya.a(), 0, this.b);
            ovVar.c = n;
            if (n != null) {
                L = Math.max(L, ovVar.c.d.getHeight() + gm.L(21.0f));
                int L2 = ((gm.L(21.0f) + ovVar.c.d.getHeight()) - ovVar.c.d.getHeight()) / 2;
                ovVar.e = L2;
                bx bxVar = ovVar.c;
                bxVar.s = ovVar.d;
                bxVar.w = L2;
            }
        } else {
            ovVar = this;
        }
        ovVar.setMeasuredDimension(size, L + 1);
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
