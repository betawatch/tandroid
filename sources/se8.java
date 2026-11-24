// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class se8 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ve8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se8(ve8 ve8Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = ve8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        gb2 gb2Var;
        switch (this.a) {
            case 0:
                ve8 ve8Var = this.b;
                if (ve8Var.E <= 0.0f || ve8Var.x == null) {
                    canvas2 = canvas;
                } else {
                    ve8Var.y.reset();
                    float width = getWidth() / ve8Var.s.getWidth();
                    ve8Var.y.postScale(width, width);
                    ve8Var.w.setLocalMatrix(ve8Var.y);
                    ve8Var.x.setAlpha((int) (ve8Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ve8Var.x);
                }
                if (ve8Var.P && (gb2Var = ve8Var.M) != null) {
                    gb2Var.d6 = ve8Var.Q;
                    gb2Var.invalidate();
                    ve8Var.P = false;
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.b(true);
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                ve8 ve8Var = this.b;
                if (view != ve8Var.L && view != ve8Var.K) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, gl.R1(ve8Var.N, 0.0f, ve8Var.E), getWidth(), gl.R1(ve8Var.O, getHeight(), ve8Var.E));
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                this.b.d();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                ve8 ve8Var = this.b;
                ve8Var.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = ve8Var.U;
                    if (childAt == viewGroup) {
                        float f = ve8Var.V;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = ve8Var.S;
                    if (childAt == viewGroup2) {
                        float f2 = ve8Var.T;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    t09 t09Var = ve8Var.R;
                    if (childAt == t09Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(t09Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                ve8 ve8Var = this.b;
                tk0.c(ve8Var.G, ve8Var.c);
                ve8Var.H.d();
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }
}
