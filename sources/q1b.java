// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q1b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s1b c;

    public /* synthetic */ q1b(s1b s1bVar, boolean z, byte b) {
        this.a = b;
        this.c = s1bVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s1b s1bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    s1bVar.h.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z) {
                    s1bVar.y.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        s1b s1bVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    s1bVar.h.setVisibility(0);
                    break;
                }
                break;
            default:
                if (z) {
                    s1bVar.y.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
