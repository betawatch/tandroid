package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tr0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tr0(xr0 xr0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = xr0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                xr0 xr0Var = this.b;
                if (xr0Var.E <= 0.0f || xr0Var.x == null) {
                    canvas2 = canvas;
                } else {
                    xr0Var.y.reset();
                    float width = getWidth() / xr0Var.s.getWidth();
                    xr0Var.y.postScale(width, width);
                    xr0Var.w.setLocalMatrix(xr0Var.y);
                    xr0Var.x.setAlpha((int) (xr0Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), xr0Var.x);
                }
                if (xr0Var.P && (q1Var = xr0Var.M) != null) {
                    q1Var.d6 = xr0Var.Q;
                    q1Var.invalidate();
                    xr0Var.P = false;
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.c(true);
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 1:
                xr0 xr0Var = this.b;
                if (view != xr0Var.L && view != xr0Var.K) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(xr0Var.N, 0.0f, xr0Var.E), getWidth(), org.telegram.messenger.g0.T1(xr0Var.O, getHeight(), xr0Var.E));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                this.b.d();
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                xr0 xr0Var = this.b;
                xr0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = xr0Var.U;
                    if (childAt == viewGroup) {
                        float f10 = xr0Var.V;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = xr0Var.S;
                    if (childAt == viewGroup2) {
                        float f11 = xr0Var.T;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    org.telegram.ui.Components.mi0 mi0Var = xr0Var.R;
                    if (childAt == mi0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mi0Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                xr0 xr0Var = this.b;
                ih.d.c(xr0Var.G, xr0Var.c);
                xr0Var.H.d();
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }
}
