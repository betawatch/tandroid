// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class os1 extends de0 {
    public final /* synthetic */ byte H = 0;
    public Object I;
    public Object J;
    public Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os1(fd2 fd2Var, Context context, npa npaVar) {
        super(context);
        this.K = fd2Var;
        this.J = npaVar;
        this.I = new Path();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.H) {
            case 1:
                npa npaVar = (npa) this.J;
                Path path = (Path) this.I;
                super.draw(canvas);
                if (((fd2) this.K).h) {
                    path.rewind();
                    RectF rectF = hl.P;
                    ImageReceiver imageReceiver = this.a;
                    rectF.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), this.a.x());
                    path.addRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    npaVar.h(vm2.o(-1, 82));
                    ImageReceiver imageReceiver2 = this.a;
                    npaVar.setBounds((int) imageReceiver2.L0, (int) imageReceiver2.M0, (int) imageReceiver2.w(), (int) this.a.x());
                    npaVar.draw(canvas);
                    invalidate();
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                float[] fArr = (float[]) this.K;
                npa npaVar = (npa) this.J;
                Path path = (Path) this.I;
                super.onDraw(canvas);
                if (this.r) {
                    canvas.save();
                    RectF rectF = hl.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] iArr = this.a.X0;
                    float f = iArr[0];
                    fArr[1] = f;
                    fArr[0] = f;
                    float f2 = iArr[1];
                    fArr[3] = f2;
                    fArr[2] = f2;
                    float f3 = iArr[2];
                    fArr[5] = f3;
                    fArr[4] = f3;
                    float f4 = iArr[3];
                    fArr[7] = f4;
                    fArr[6] = f4;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    npaVar.h(vm2.o(-1, 82));
                    npaVar.setBounds(0, 0, getWidth(), getHeight());
                    npaVar.draw(canvas);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 1:
            default:
                super.onDraw(canvas);
                break;
            case 2:
                fe1 fe1Var = (fe1) this.J;
                super.onDraw(canvas);
                if (((q) this.K).o0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF2 = hl.P;
                    rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF2, min, min, (Paint) this.I);
                    rectF2.inset(hl.L(1.0f), hl.L(1.0f));
                    fe1Var.f = getWidth();
                    fe1Var.a(min, canvas, rectF2, null);
                    invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ os1(Context context) {
        super(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os1(q qVar, Context context, Paint paint) {
        super(context);
        this.K = qVar;
        this.I = paint;
        this.J = new fe1();
    }
}
