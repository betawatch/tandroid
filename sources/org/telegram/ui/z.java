package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z extends FrameLayout {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.a = photoViewer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zu1 zu1Var = this.a.k4;
        if (zu1Var != null) {
            zu1Var.i6();
            UndoView undoView = zu1Var.N3;
            if (undoView == null || undoView.getVisibility() != 0) {
                return;
            }
            canvas.save();
            View view = (View) undoView.getParent();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            canvas.translate(undoView.getX(), undoView.getY());
            undoView.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.r && photoViewer.d2 != 1 && photoViewer.s1 && photoViewer.G2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.G2.A0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        PhotoViewer photoViewer = this.a;
        if (photoViewer.R.w()) {
            photoViewer.R.e(false);
        }
        if (photoViewer.K0()) {
            photoViewer.y(true);
            return false;
        }
        if (rw2.e().E) {
            rw2.e().c();
            return false;
        }
        PhotoViewer.q0().A(true, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r1 == 6) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.l3 && photoViewer.P3) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1 && actionMasked != 3) {
                    if (actionMasked != 5) {
                    }
                }
                r47 r47Var = photoViewer.S4;
                if (r47Var == null || !r47Var.q4()) {
                    photoViewer.A1();
                }
            }
            hl.r(photoViewer.y2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr = PhotoViewer.d9;
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.B4.I();
        photoViewer.A4.I();
        photoViewer.C4.I();
        photoViewer.R5 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.B4.K();
        photoViewer.A4.K();
        photoViewer.C4.K();
        photoViewer.R5 = false;
        photoViewer.S5 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        PhotoViewer photoViewer = this.a;
        Paint paint = photoViewer.N0;
        vl4 vl4Var = photoViewer.r5;
        if (vl4Var != null && vl4Var.getVisibility() == 0) {
            View view = (View) photoViewer.r5.getParent();
            float min = Math.min(photoViewer.r5.getAlpha(), view != null ? view.getAlpha() : 1.0f);
            if (min > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (min * 255.0f), 31);
                canvas2 = canvas;
                photoViewer.r5.draw(canvas2);
                canvas2.restore();
                if (photoViewer.e) {
                    return;
                }
                paint.setAlpha(photoViewer.M0.getAlpha());
                canvas2.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + photoViewer.t2.bottom, paint);
                return;
            }
        }
        canvas2 = canvas;
        if (photoViewer.e) {
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.e && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        PhotoViewer photoViewer = this.a;
        photoViewer.i0.layout(getPaddingLeft(), 0, photoViewer.i0.getMeasuredWidth() + getPaddingLeft(), photoViewer.i0.getMeasuredHeight());
        photoViewer.f0.layout(getPaddingLeft(), 0, photoViewer.f0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f0.getMeasuredHeight());
        photoViewer.k0.layout(getPaddingLeft(), photoViewer.f0.getMeasuredHeight(), photoViewer.k0.getMeasuredWidth(), photoViewer.k0.getMeasuredHeight() + photoViewer.f0.getMeasuredHeight());
        photoViewer.S5 = true;
        if (z) {
            if (!photoViewer.T5) {
                float z1 = photoViewer.z1(true);
                photoViewer.Z5 = z1;
                photoViewer.W5 = 0.0f;
                photoViewer.X5 = 0.0f;
                photoViewer.I2(z1);
            }
            CheckBox checkBox = photoViewer.O0;
            if (checkBox != null) {
                checkBox.post(new x38(this, (byte) 19));
            }
        }
        if (photoViewer.T5) {
            photoViewer.W1();
            photoViewer.T5 = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.s && hl.y) {
            int i3 = hl.q.y;
            if (size2 > i3) {
                size2 = i3;
            }
            size2 += hl.m;
        }
        setMeasuredDimension(size, size2);
        int i4 = size2 - photoViewer.t2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i4 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.i0.getLayoutParams();
        photoViewer.i0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_31));
        photoViewer.f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        photoViewer.k0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(photoViewer.l0, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.a;
        return photoViewer.e && photoViewer.h1(motionEvent);
    }
}
