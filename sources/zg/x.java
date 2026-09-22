package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.p8;
import yh.q8;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                q8 q8Var = (q8) this.b;
                p8 p8Var = (p8) this.c;
                q8Var.getClass();
                p8Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                break;
        }
    }
}
