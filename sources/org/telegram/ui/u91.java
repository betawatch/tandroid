package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u91 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ x91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u91(x91 x91Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = x91Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                x91 x91Var = this.b;
                if (x91Var.y <= 0.0f || x91Var.w == null) {
                    canvas2 = canvas;
                } else {
                    x91Var.x.reset();
                    float width = getWidth() / x91Var.r.getWidth();
                    x91Var.x.postScale(width, width);
                    x91Var.s.setLocalMatrix(x91Var.x);
                    x91Var.w.setAlpha((int) (x91Var.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), x91Var.w);
                }
                if (x91Var.N && (q1Var = x91Var.K) != null) {
                    q1Var.a6 = x91Var.O;
                    q1Var.invalidate();
                    x91Var.N = false;
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                x91 x91Var = this.b;
                if (view != x91Var.J && view != x91Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.i0.T1(x91Var.L, 0.0f, x91Var.y), getWidth(), org.telegram.messenger.i0.T1(x91Var.M, getHeight(), x91Var.y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.b.d();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                x91 x91Var = this.b;
                x91Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = x91Var.S;
                    if (childAt == viewGroup) {
                        float f7 = x91Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = x91Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = x91Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    org.telegram.ui.Components.mj0 mj0Var = x91Var.P;
                    if (childAt == mj0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mj0Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                x91 x91Var = this.b;
                yg.d.c(x91Var.E, x91Var.b);
                x91Var.F.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
