// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class um3 implements cn3, yv4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bn3 b;

    public /* synthetic */ um3(bn3 bn3Var, byte b) {
        this.a = b;
        this.b = bn3Var;
    }

    @Override // yv4
    public final void a(Canvas canvas) {
        byte b = this.a;
        bn3 bn3Var = this.b;
        switch (b) {
            case 3:
                d dVar = bn3Var.f;
                dVar.a.b2.getLocationInWindow(new int[2]);
                bn3Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r0[0] - r3[0], r0[1] - r3[1]);
                dVar.a(canvas);
                canvas.restore();
                break;
            default:
                d dVar2 = bn3Var.f;
                dVar2.a.b2.getLocationInWindow(new int[2]);
                bn3Var.w.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r0[0] - r3[0], r0[1] - r3[1]);
                dVar2.a(canvas);
                canvas.restore();
                break;
        }
    }

    public final int b(float f, float f2) {
        bn3 bn3Var = this.b;
        RectF rectF = bn3Var.y;
        if (bn3Var.p(rectF)) {
            return bn3Var.x.a(f, f2, rectF);
        }
        return 0;
    }
}
