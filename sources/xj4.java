// default package

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xj4 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ek4 e;

    public /* synthetic */ xj4(ek4 ek4Var, float f, float f2, int i, byte b) {
        this.a = b;
        this.e = ek4Var;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        int i = this.d;
        ek4 ek4Var = this.e;
        float f2 = this.c;
        float f3 = this.b;
        switch (b) {
            case 0:
                float A = tb4.A(f2, f3, f, f3);
                ek4Var.getClass();
                ek4Var.i.setX(A + (ek4Var.f.getWidth() - i));
                float f4 = 1.0f - f;
                ek4Var.l.setAlpha(f4);
                ek4Var.j.setAlpha(f4);
                break;
            default:
                float A2 = tb4.A(f2, f3, f, f3);
                ek4Var.getClass();
                ek4Var.i.setX(A2 + (ek4Var.f.getWidth() - i));
                ek4Var.l.setAlpha(f);
                ek4Var.j.setAlpha(f);
                break;
        }
    }
}
