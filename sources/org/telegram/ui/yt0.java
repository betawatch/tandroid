package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yt0 extends FrameLayout {
    public final /* synthetic */ PhotoViewer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.a = photoViewer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        tn tnVar = this.a.h4;
        if (tnVar != null) {
            tnVar.Q7();
            UndoView undoView = tnVar.u3;
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
        if (!photoViewer.r && photoViewer.Y1 != 1 && photoViewer.n1 && photoViewer.B2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.B2.X(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        PhotoViewer photoViewer = this.a;
        if (photoViewer.M.y()) {
            photoViewer.M.f(false);
        }
        if (photoViewer.H1()) {
            photoViewer.E0(true);
            return false;
        }
        if (ht.q().E) {
            ht.q().o();
            return false;
        }
        PhotoViewer.t1().G0(true, false);
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
        if (photoViewer.h3 && photoViewer.L3) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1 && actionMasked != 3) {
                    if (actionMasked != 5) {
                    }
                }
                MessageObject messageObject = photoViewer.P4;
                if (messageObject == null || !messageObject.isSponsored()) {
                    photoViewer.s2();
                }
            }
            AndroidUtilities.cancelRunOnUIThread(photoViewer.t2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.a.N8) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.y4.onAttachedToWindow();
        photoViewer.x4.onAttachedToWindow();
        photoViewer.z4.onAttachedToWindow();
        photoViewer.O5 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.y4.onDetachedFromWindow();
        photoViewer.x4.onDetachedFromWindow();
        photoViewer.z4.onDetachedFromWindow();
        photoViewer.O5 = false;
        photoViewer.P5 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        PhotoViewer photoViewer = this.a;
        Paint paint = photoViewer.I0;
        lh.z2 z2Var = photoViewer.o5;
        if (z2Var != null && z2Var.getVisibility() == 0) {
            View view = (View) photoViewer.o5.getParent();
            float min = Math.min(photoViewer.o5.getAlpha(), view != null ? view.getAlpha() : 1.0f);
            if (min > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (min * 255.0f), 31);
                canvas2 = canvas;
                photoViewer.o5.draw(canvas2);
                canvas2.restore();
                if (photoViewer.e) {
                    return;
                }
                paint.setAlpha(photoViewer.H0.getAlpha());
                canvas2.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + photoViewer.o2.bottom, paint);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.a;
        photoViewer.d0.layout(getPaddingLeft(), 0, photoViewer.d0.getMeasuredWidth() + getPaddingLeft(), photoViewer.d0.getMeasuredHeight());
        photoViewer.a0.layout(getPaddingLeft(), 0, photoViewer.a0.getMeasuredWidth() + getPaddingLeft(), photoViewer.a0.getMeasuredHeight());
        photoViewer.f0.layout(getPaddingLeft(), photoViewer.a0.getMeasuredHeight(), photoViewer.f0.getMeasuredWidth(), photoViewer.f0.getMeasuredHeight() + photoViewer.a0.getMeasuredHeight());
        photoViewer.P5 = true;
        if (z10) {
            if (!photoViewer.Q5) {
                float r22 = photoViewer.r2(true);
                photoViewer.W5 = r22;
                photoViewer.T5 = 0.0f;
                photoViewer.U5 = 0.0f;
                photoViewer.w3(r22);
            }
            CheckBox checkBox = photoViewer.J0;
            if (checkBox != null) {
                checkBox.post(new it0(this, 1));
            }
        }
        if (photoViewer.Q5) {
            photoViewer.N2();
            photoViewer.Q5 = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i12 = AndroidUtilities.displaySize.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.o2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.d0.getLayoutParams();
        photoViewer.d0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_31));
        photoViewer.a0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30));
        photoViewer.f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(photoViewer.g0, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.a;
        return photoViewer.e && PhotoViewer.k(photoViewer, motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        AndroidUtilities.printStackTrace("requestLayout");
    }
}
