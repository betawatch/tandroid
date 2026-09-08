package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class rm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ sm c;

    public /* synthetic */ rm(sm smVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = smVar;
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
                sm smVar = this.c;
                co coVar = smVar.c;
                coVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                smVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                co coVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                co.J3(coVar);
                coVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                sm smVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) smVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                smVar.b = true;
                break;
        }
    }
}
