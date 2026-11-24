// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zoc extends AnimatorListenerAdapter {
    public final /* synthetic */ i22 a;
    public final /* synthetic */ npc b;
    public final /* synthetic */ apc c;

    public zoc(apc apcVar, i22 i22Var, npc npcVar) {
        this.c = apcVar;
        this.a = i22Var;
        this.b = npcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            gm.t1(this.b);
        }
    }
}
