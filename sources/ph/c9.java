package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ da d;

    public /* synthetic */ c9(da daVar, int i10, int i11, int i12) {
        this.a = i12;
        this.d = daVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.N(this.b, this.c);
                break;
            default:
                int i10 = this.b;
                int i11 = this.c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    break;
                }
                break;
        }
    }
}
