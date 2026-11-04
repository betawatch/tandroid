package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ r e;

    public q(r rVar, float[] fArr, float f10, float f11, boolean z10) {
        this.e = rVar;
        this.a = fArr;
        this.b = f10;
        this.c = f11;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f10 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        this.e.a.b.l = g0.T1(this.b, this.c, 1.0f);
        wg.f fVar = this.e.a.b;
        fVar.f = (f10 * 360.0f * (this.d ? 1 : -1)) + fVar.f;
        this.e.a.b.b();
        r rVar = this.e;
        rVar.a(rVar.a.b.l);
        this.e.a.j(750L);
    }
}
