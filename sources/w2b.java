// default package

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w2b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eq b;
    public final /* synthetic */ int c;

    public /* synthetic */ w2b(eq eqVar, int i, byte b) {
        this.a = b;
        this.b = eqVar;
        this.c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.c;
        eq eqVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) eqVar.d;
                Float f = (Float) valueAnimator.getAnimatedValue();
                f.getClass();
                arrayList.set(i, f);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) eqVar.e;
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                f2.getClass();
                arrayList2.set(i, f2);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) eqVar.f;
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                f3.getClass();
                arrayList3.set(i, f3);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) eqVar.d;
                Float f4 = (Float) valueAnimator.getAnimatedValue();
                f4.getClass();
                arrayList4.set(i, f4);
                break;
            case 4:
                ArrayList arrayList5 = (ArrayList) eqVar.e;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                f5.getClass();
                arrayList5.set(i, f5);
                break;
            default:
                ArrayList arrayList6 = (ArrayList) eqVar.f;
                Float f6 = (Float) valueAnimator.getAnimatedValue();
                f6.getClass();
                arrayList6.set(i, f6);
                break;
        }
    }
}
