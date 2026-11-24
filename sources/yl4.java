// default package

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yl4 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ fm4 e;

    public /* synthetic */ yl4(fm4 fm4Var, float f, float f2, int i, byte b) {
        this.a = b;
        this.e = fm4Var;
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        int i = this.d;
        fm4 fm4Var = this.e;
        float f2 = this.c;
        float f3 = this.b;
        switch (b) {
            case 0:
                float A = td4.A(f2, f3, f, f3);
                fm4Var.getClass();
                fm4Var.i.setX(A + (fm4Var.f.getWidth() - i));
                float f4 = 1.0f - f;
                fm4Var.l.setAlpha(f4);
                fm4Var.j.setAlpha(f4);
                break;
            default:
                float A2 = td4.A(f2, f3, f, f3);
                fm4Var.getClass();
                fm4Var.i.setX(A2 + (fm4Var.f.getWidth() - i));
                fm4Var.l.setAlpha(f);
                fm4Var.j.setAlpha(f);
                break;
        }
    }
}
