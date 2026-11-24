// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class qk3 extends on implements vlb {
    public FragmentContextView E;
    public boolean F;
    public boolean G;
    public im0 s;
    public final Path w;
    public final RectF x;
    public int y;

    public qk3(Context context) {
        super(context);
        this.w = new Path();
        this.x = new RectF();
        this.y = 24;
        setOrientation(1);
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int currentStyle;
        FragmentContextView fragmentContextView;
        Canvas canvas2 = canvas;
        if (getMetadata().c.a != 0.0f) {
            im0 im0Var = this.s;
            if (im0Var != null) {
                im0Var.draw(canvas2);
            }
            FragmentContextView fragmentContextView2 = this.E;
            x66 x66Var = this.c;
            View view = null;
            if (fragmentContextView2 != null && ((currentStyle = fragmentContextView2.getCurrentStyle()) == 3 || currentStyle == 1)) {
                int entriesCount = getEntriesCount();
                for (int i = 0; i < entriesCount; i++) {
                    u66 i2 = x66Var.i(i);
                    float paddingTop = getPaddingTop() + i2.b().top;
                    View view2 = ((nn) i2.a).a;
                    float c = i2.c();
                    if (c > 0.0f && (fragmentContextView = this.E) != null && (fragmentContextView == view2 || fragmentContextView.getParent() == view2)) {
                        cc1 capsuleBlobDrawable = this.E.getCapsuleBlobDrawable();
                        int L = gm.L(1.0f) + ((int) capsuleBlobDrawable.d());
                        int i3 = -L;
                        capsuleBlobDrawable.setBounds(getPaddingLeft() - L, i3, (getMeasuredWidth() - getPaddingRight()) + L, gm.L(36.0f) + (L << 1) + i3);
                        capsuleBlobDrawable.setAlpha((int) (c * 255.0f));
                        canvas2.save();
                        canvas2.translate(0.0f, paddingTop);
                        capsuleBlobDrawable.draw(canvas2);
                        canvas2.restore();
                        view = view2;
                    }
                }
            }
            View view3 = view;
            canvas2.save();
            canvas2.clipPath(this.w);
            int entriesCount2 = getEntriesCount();
            int i4 = 0;
            while (i4 < entriesCount2) {
                u66 i5 = x66Var.i(i4);
                float paddingTop2 = getPaddingTop() + i5.b().top;
                View view4 = ((nn) i5.a).a;
                float min = Math.min(1.0f, i5.c.a) * i5.c();
                if (min > 0.0f && view3 != view4) {
                    int alpha = cmb.j0.getAlpha();
                    cmb.j0.setAlpha((int) (alpha * min));
                    float f = 1.0f - min;
                    canvas2.drawLine(getPaddingLeft() + (gm.L(16.0f) * f), paddingTop2, getWidth() - ((gm.L(16.0f) * f) + getPaddingRight()), paddingTop2, cmb.j0);
                    cmb.j0.setAlpha(alpha);
                }
                i4++;
                canvas2 = canvas;
            }
            this.F = view3 != null;
            this.G = false;
            super.dispatchDraw(canvas);
            canvas.restore();
            if (view3 != null) {
                this.G = true;
                this.F = false;
                super.dispatchDraw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        im0 im0Var;
        if (super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return motionEvent.getAction() == 0 && (im0Var = this.s) != null && im0Var.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        FragmentContextView fragmentContextView = this.E;
        if (fragmentContextView == null || !(fragmentContextView == view || fragmentContextView.getParent() == view)) {
            if (this.G) {
                return false;
            }
        } else if (this.F) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // on
    public final void f() {
        k();
        invalidate();
    }

    public final void k() {
        float f = getMetadata().g.a;
        float f2 = getMetadata().c.a;
        RectF rectF = this.x;
        rectF.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getPaddingTop() + f);
        float min = Math.min(gm.L(this.y), Math.min(rectF.width(), rectF.height()) / 2.0f);
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        im0 im0Var = this.s;
        if (im0Var != null) {
            im0Var.setAlpha((int) (f2 * 255.0f));
            this.s.setBounds(gm.L(4.0f), gm.L(14.0f), getMeasuredWidth() - gm.L(4.0f), ((getPaddingBottom() + getPaddingTop()) + ((int) f)) - gm.L(14.0f));
            this.s.r(Math.min(gm.L(this.y), f / 2.0f));
        }
    }

    @Override // on, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    public void setBlurredBackground(im0 im0Var) {
        this.s = im0Var;
    }

    public void setCallFragmentContextView(FragmentContextView fragmentContextView) {
        this.E = fragmentContextView;
        fragmentContextView.getCapsuleBlobDrawable().setCallback(this);
    }

    public void setDefaultRadiusDp(int i) {
        this.y = i;
    }

    @Override // vlb
    public final void updateColors() {
        im0 im0Var = this.s;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        FragmentContextView fragmentContextView = this.E;
        return fragmentContextView != null && fragmentContextView.getCapsuleBlobDrawable() == drawable;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
