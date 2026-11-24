// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ya3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gb3 b;

    public /* synthetic */ ya3(gb3 gb3Var, s49 s49Var, byte b) {
        this.a = b;
        this.b = gb3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gb3 gb3Var = this.b;
        switch (b) {
            case 0:
                gb3Var.Q();
                break;
            default:
                gb3Var.M();
                break;
        }
    }
}
