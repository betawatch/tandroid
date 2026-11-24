// default package

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xl4 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ fm4 e;

    public /* synthetic */ xl4(fm4 fm4Var, int i, int i2, float f, byte b) {
        this.a = b;
        this.e = fm4Var;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        float f2 = this.d;
        fm4 fm4Var = this.e;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                int i3 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout = fm4Var.f;
                fm4.l(relativeLayout, relativeLayout.getLayoutParams().width, i + i3);
                if (fm4Var.M) {
                    fm4Var.f.setY(f2 - r4.getHeight());
                    fm4Var.g();
                    break;
                }
                break;
            case 1:
                RelativeLayout relativeLayout2 = fm4Var.f;
                fm4.l(relativeLayout2, ((int) (f * (i2 - i))) + i, relativeLayout2.getLayoutParams().height);
                fm4Var.f.setX(f2 - r5.getWidth());
                fm4Var.g.setX(r5.getWidth() - i);
                fm4Var.h.setX(r5.getWidth() - i2);
                break;
            case 2:
                int i4 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout3 = fm4Var.f;
                fm4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i4 + i);
                if (fm4Var.M) {
                    fm4Var.f.setY(f2 - (r4.getHeight() - i));
                    fm4Var.g();
                    break;
                }
                break;
            default:
                RelativeLayout relativeLayout4 = fm4Var.f;
                fm4.l(relativeLayout4, ((int) (f * (i2 - i))) + i, relativeLayout4.getLayoutParams().height);
                fm4Var.f.setX(f2 - r5.getWidth());
                fm4Var.g.setX(r5.getWidth() - i2);
                fm4Var.h.setX(r5.getWidth() - i);
                break;
        }
    }

    public /* synthetic */ xl4(fm4 fm4Var, int i, int i2, float f, float f2, byte b) {
        this.a = b;
        this.e = fm4Var;
        this.b = i;
        this.c = i2;
        this.d = f2;
    }
}
