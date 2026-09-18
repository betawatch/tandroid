package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.r8;
import yh.s8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c0.g((View) arrayList.get(i10), floatValue);
                }
                c0Var.m.k0.invalidate();
                break;
            default:
                s8 s8Var = (s8) this.b;
                r8 r8Var = (r8) this.c;
                s8Var.getClass();
                r8Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.a1();
                break;
        }
    }
}
