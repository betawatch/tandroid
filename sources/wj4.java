// default package

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wj4 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ek4 e;

    public /* synthetic */ wj4(ek4 ek4Var, int i, int i2, float f, byte b) {
        this.a = b;
        this.e = ek4Var;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        float f2 = this.d;
        ek4 ek4Var = this.e;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                int i3 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout = ek4Var.f;
                ek4.l(relativeLayout, relativeLayout.getLayoutParams().width, i + i3);
                if (ek4Var.M) {
                    ek4Var.f.setY(f2 - r4.getHeight());
                    ek4Var.g();
                    break;
                }
                break;
            case 1:
                RelativeLayout relativeLayout2 = ek4Var.f;
                ek4.l(relativeLayout2, ((int) (f * (i2 - i))) + i, relativeLayout2.getLayoutParams().height);
                ek4Var.f.setX(f2 - r5.getWidth());
                ek4Var.g.setX(r5.getWidth() - i);
                ek4Var.h.setX(r5.getWidth() - i2);
                break;
            case 2:
                int i4 = (int) (f * (i2 - i));
                RelativeLayout relativeLayout3 = ek4Var.f;
                ek4.l(relativeLayout3, relativeLayout3.getLayoutParams().width, i4 + i);
                if (ek4Var.M) {
                    ek4Var.f.setY(f2 - (r4.getHeight() - i));
                    ek4Var.g();
                    break;
                }
                break;
            default:
                RelativeLayout relativeLayout4 = ek4Var.f;
                ek4.l(relativeLayout4, ((int) (f * (i2 - i))) + i, relativeLayout4.getLayoutParams().height);
                ek4Var.f.setX(f2 - r5.getWidth());
                ek4Var.g.setX(r5.getWidth() - i2);
                ek4Var.h.setX(r5.getWidth() - i);
                break;
        }
    }

    public /* synthetic */ wj4(ek4 ek4Var, int i, int i2, float f, float f2, byte b) {
        this.a = b;
        this.e = ek4Var;
        this.b = i;
        this.c = i2;
        this.d = f2;
    }
}
