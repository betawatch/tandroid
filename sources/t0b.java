// default package

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t0b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ep b;
    public final /* synthetic */ int c;

    public /* synthetic */ t0b(ep epVar, int i, byte b) {
        this.a = b;
        this.b = epVar;
        this.c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.c;
        ep epVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) epVar.d;
                Float f = (Float) valueAnimator.getAnimatedValue();
                f.getClass();
                arrayList.set(i, f);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) epVar.e;
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                f2.getClass();
                arrayList2.set(i, f2);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) epVar.f;
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                f3.getClass();
                arrayList3.set(i, f3);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) epVar.d;
                Float f4 = (Float) valueAnimator.getAnimatedValue();
                f4.getClass();
                arrayList4.set(i, f4);
                break;
            case 4:
                ArrayList arrayList5 = (ArrayList) epVar.e;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                f5.getClass();
                arrayList5.set(i, f5);
                break;
            default:
                ArrayList arrayList6 = (ArrayList) epVar.f;
                Float f6 = (Float) valueAnimator.getAnimatedValue();
                f6.getClass();
                arrayList6.set(i, f6);
                break;
        }
    }
}
