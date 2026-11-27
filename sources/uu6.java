// default package

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uu6 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public /* synthetic */ uu6(int i, int i2, View view, byte b) {
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
                bv6.o(i2 - ((int) ((i2 - i) * f)), view);
                break;
            default:
                int i3 = i + ((int) ((i2 - i) * f));
                int i4 = wv6.k0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
                break;
        }
    }
}
