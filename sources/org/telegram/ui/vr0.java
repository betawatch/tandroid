package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class vr0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr0(zr0 zr0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = zr0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                zr0 zr0Var = this.b;
                if (zr0Var.D <= 0.0f || zr0Var.x == null) {
                    canvas2 = canvas;
                } else {
                    zr0Var.y.reset();
                    float width = getWidth() / zr0Var.s.getWidth();
                    zr0Var.y.postScale(width, width);
                    zr0Var.w.setLocalMatrix(zr0Var.y);
                    zr0Var.x.setAlpha((int) (zr0Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), zr0Var.x);
                }
                if (zr0Var.O && (q1Var = zr0Var.L) != null) {
                    q1Var.c6 = zr0Var.P;
                    q1Var.invalidate();
                    zr0Var.O = false;
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
                zr0 zr0Var = this.b;
                if (view != zr0Var.K && view != zr0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(zr0Var.M, 0.0f, zr0Var.D), getWidth(), org.telegram.messenger.g0.T1(zr0Var.N, getHeight(), zr0Var.D));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.b.d();
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                zr0 zr0Var = this.b;
                zr0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = zr0Var.T;
                    if (childAt == viewGroup) {
                        float f10 = zr0Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = zr0Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = zr0Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    org.telegram.ui.Components.ii0 ii0Var = zr0Var.Q;
                    if (childAt == ii0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(ii0Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
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
                zr0 zr0Var = this.b;
                ih.d.c(zr0Var.F, zr0Var.c);
                zr0Var.G.d();
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }
}
