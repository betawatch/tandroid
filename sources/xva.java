// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xva extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yva e;

    public xva(yva yvaVar, int i, int i2, int i3, int i4) {
        this.e = yvaVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f = bm2.f(1.0f, this.a, this.b);
        yva yvaVar = this.e;
        yvaVar.r = f;
        yvaVar.s = bm2.f(1.0f, this.c, this.d);
        yvaVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{yvaVar.r, yvaVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        yvaVar.invalidate();
    }
}
