package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z b;
    public final /* synthetic */ tm c;

    public /* synthetic */ sm(tm tmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.a = i10;
        this.c = tmVar;
        this.b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.p2) this.c.c).actionBar;
                lVar.setMenuOffsetSuppressed(false);
                break;
            default:
                tm tmVar = this.c;
                eo eoVar = tmVar.c;
                eoVar.i0.f(8);
                this.b.r(0.0f);
                lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                lVar2.setMenuOffsetSuppressed(false);
                tmVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                eo eoVar = this.c.c;
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                lVar.setMenuOffsetSuppressed(true);
                eo.J3(eoVar);
                eoVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                tm tmVar = this.c;
                lVar2 = ((org.telegram.ui.ActionBar.p2) tmVar.c).actionBar;
                lVar2.setMenuOffsetSuppressed(true);
                tmVar.b = true;
                break;
        }
    }
}
