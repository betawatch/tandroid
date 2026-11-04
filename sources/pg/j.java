package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ m e;

    public j(m mVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.e = mVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = z13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m mVar = this.e;
        mVar.G = false;
        if (this.a) {
            return;
        }
        mVar.e(this.b, this.c, this.d, true);
    }
}
