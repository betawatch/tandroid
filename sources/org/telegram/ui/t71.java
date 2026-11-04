package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t71 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t71(w71 w71Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = w71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                w71 w71Var = this.b;
                if (w71Var.y <= 0.0f || w71Var.w == null) {
                    canvas2 = canvas;
                } else {
                    w71Var.x.reset();
                    float width = getWidth() / w71Var.r.getWidth();
                    w71Var.x.postScale(width, width);
                    w71Var.s.setLocalMatrix(w71Var.x);
                    w71Var.w.setAlpha((int) (w71Var.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), w71Var.w);
                }
                if (w71Var.O && (q1Var = w71Var.L) != null) {
                    q1Var.b6 = w71Var.P;
                    q1Var.invalidate();
                    w71Var.O = false;
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
                w71 w71Var = this.b;
                if (view != w71Var.K && view != w71Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(w71Var.M, 0.0f, w71Var.y), getWidth(), org.telegram.messenger.g0.T1(w71Var.N, getHeight(), w71Var.y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                this.b.d();
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                w71 w71Var = this.b;
                w71Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = w71Var.T;
                    if (childAt == viewGroup) {
                        float f10 = w71Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = w71Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = w71Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    org.telegram.ui.Components.li0 li0Var = w71Var.Q;
                    if (childAt == li0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(li0Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                w71 w71Var = this.b;
                jh.d.c(w71Var.F, w71Var.b);
                w71Var.G.d();
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }
}
