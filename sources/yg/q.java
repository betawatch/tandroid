package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ r e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z9) {
        this.e = rVar;
        this.a = fArr;
        this.b = f10;
        this.c = f11;
        this.d = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f10 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        this.e.a.b.l = g0.T1(this.b, this.c, 1.0f);
        vg.f fVar = this.e.a.b;
        fVar.f = (f10 * 360.0f * (this.d ? 1 : -1)) + fVar.f;
        this.e.a.b.b();
        r rVar = this.e;
        rVar.a(rVar.a.b.l);
        this.e.a.j(750L);
    }
}
