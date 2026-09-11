package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class j8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ k8 e;

    public j8(k8 k8Var, int i10, int i11, int i12, int i13) {
        this.e = k8Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        k8 k8Var = this.e;
        k8Var.r = d;
        k8Var.s = i0.a.d(1.0f, this.c, this.d);
        k8Var.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{k8Var.r, k8Var.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        k8Var.invalidate();
    }
}
