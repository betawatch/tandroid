package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ rm c;

    public /* synthetic */ qm(rm rmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = rmVar;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                rm rmVar = this.c;
                bo boVar = rmVar.c;
                boVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                rmVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                bo boVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                bo.J3(boVar);
                boVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                rm rmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) rmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                rmVar.b = true;
                break;
        }
    }
}
