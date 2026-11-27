// default package

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r4b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fp b;
    public final /* synthetic */ int c;

    public /* synthetic */ r4b(fp fpVar, int i, byte b) {
        this.a = b;
        this.b = fpVar;
        this.c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.c;
        fp fpVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) fpVar.d;
                Float f = (Float) valueAnimator.getAnimatedValue();
                f.getClass();
                arrayList.set(i, f);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) fpVar.e;
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                f2.getClass();
                arrayList2.set(i, f2);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) fpVar.f;
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                f3.getClass();
                arrayList3.set(i, f3);
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) fpVar.d;
                Float f4 = (Float) valueAnimator.getAnimatedValue();
                f4.getClass();
                arrayList4.set(i, f4);
                break;
            case 4:
                ArrayList arrayList5 = (ArrayList) fpVar.e;
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                f5.getClass();
                arrayList5.set(i, f5);
                break;
            default:
                ArrayList arrayList6 = (ArrayList) fpVar.f;
                Float f6 = (Float) valueAnimator.getAnimatedValue();
                f6.getClass();
                arrayList6.set(i, f6);
                break;
        }
    }
}
