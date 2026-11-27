// default package

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class uq5 extends TextureView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uq5(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View
    public final void invalidate() {
        ip9 ip9Var;
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                if (!qVar.K0 && (ip9Var = qVar.S) != null && ip9Var.a == 3) {
                    qVar.K0 = true;
                    try {
                        qVar.I0 = SystemClock.elapsedRealtimeNanos();
                        qVar.B();
                    } finally {
                        qVar.K0 = false;
                    }
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                View.MeasureSpec.getSize(i);
                super.onMeasure(i, i2);
                break;
            case 2:
                mpa mpaVar = (mpa) this.b;
                setMeasuredDimension(mpaVar.g, mpaVar.h);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        switch (this.a) {
            case 1:
                super.setTransform(matrix);
                rf4 rf4Var = ((c98) this.b).m0;
                if (rf4Var != null) {
                    int width = getWidth();
                    int height = getHeight();
                    yl0 yl0Var = rf4Var.J;
                    if (yl0Var != null) {
                        Matrix matrix2 = yl0Var.v;
                        matrix.invert(matrix2);
                        float f = width;
                        float f2 = height;
                        matrix2.preScale(f, f2);
                        matrix2.postScale(1.0f / f, 1.0f / f2);
                        yl0Var.c(matrix2);
                        rf4Var.b(false, false, false);
                        break;
                    }
                }
                break;
            default:
                super.setTransform(matrix);
                break;
        }
    }
}
