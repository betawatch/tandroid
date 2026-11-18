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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vq0 extends FrameLayout {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.a = photoViewer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        bn bnVar = this.a.l4;
        if (bnVar != null) {
            bnVar.h8();
            UndoView undoView = bnVar.N3;
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
            photoViewer.G2.B0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        PhotoViewer photoViewer = this.a;
        if (photoViewer.R.x()) {
            photoViewer.R.f(false);
        }
        if (photoViewer.F1()) {
            photoViewer.x0(true);
            return false;
        }
        if (ns.p().E) {
            ns.p().n();
            return false;
        }
        PhotoViewer.p1().z0(true, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r1 != 6) goto L23;
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
                org.telegram.messenger.fj fjVar = photoViewer.T4;
                if (fjVar == null || !fjVar.r4()) {
                    photoViewer.q2();
                }
            }
            org.telegram.messenger.g0.r(photoViewer.y2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.a.getClass();
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        try {
            return super.drawChild(canvas, view, j3);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.C4.P();
        photoViewer.B4.P();
        photoViewer.D4.P();
        photoViewer.S5 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.C4.R();
        photoViewer.B4.R();
        photoViewer.D4.R();
        photoViewer.S5 = false;
        photoViewer.T5 = false;
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
        fi.u2 u2Var = photoViewer.s5;
        if (u2Var != null && u2Var.getVisibility() == 0) {
            View view = (View) photoViewer.s5.getParent();
            float min = Math.min(photoViewer.s5.getAlpha(), view != null ? view.getAlpha() : 1.0f);
            if (min > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (min * 255.0f), 31);
                canvas2 = canvas;
                photoViewer.s5.draw(canvas2);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        PhotoViewer photoViewer = this.a;
        photoViewer.i0.layout(getPaddingLeft(), 0, photoViewer.i0.getMeasuredWidth() + getPaddingLeft(), photoViewer.i0.getMeasuredHeight());
        photoViewer.f0.layout(getPaddingLeft(), 0, photoViewer.f0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f0.getMeasuredHeight());
        photoViewer.k0.layout(getPaddingLeft(), photoViewer.f0.getMeasuredHeight(), photoViewer.k0.getMeasuredWidth(), photoViewer.k0.getMeasuredHeight() + photoViewer.f0.getMeasuredHeight());
        photoViewer.T5 = true;
        if (z10) {
            if (!photoViewer.U5) {
                float p22 = photoViewer.p2(true);
                photoViewer.a6 = p22;
                photoViewer.X5 = 0.0f;
                photoViewer.Y5 = 0.0f;
                photoViewer.u3(p22);
            }
            CheckBox checkBox = photoViewer.O0;
            if (checkBox != null) {
                checkBox.post(new hq0(this, 1));
            }
        }
        if (photoViewer.U5) {
            photoViewer.L2();
            photoViewer.U5 = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.s && org.telegram.messenger.g0.y) {
            int i11 = org.telegram.messenger.g0.q.y;
            if (size2 > i11) {
                size2 = i11;
            }
            size2 += org.telegram.messenger.g0.m;
        }
        setMeasuredDimension(size, size2);
        int i12 = size2 - photoViewer.t2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.i0.getLayoutParams();
        photoViewer.i0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_31));
        photoViewer.f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        photoViewer.k0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(photoViewer.l0, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.a;
        return photoViewer.e && PhotoViewer.c(photoViewer, motionEvent);
    }
}
