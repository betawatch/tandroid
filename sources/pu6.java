// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pu6 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ pu6(int i, int i2, View view, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        View view = this.d;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                wu6.o(i2 - ((int) ((i2 - i) * f)), view);
                break;
            default:
                int i3 = i + ((int) ((i2 - i) * f));
                int i4 = rv6.k0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
