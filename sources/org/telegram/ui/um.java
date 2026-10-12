package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class um extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.y b;
    public final /* synthetic */ vm c;

    public /* synthetic */ um(vm vmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.a = i10;
        this.c = vmVar;
        this.b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.c.c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                break;
            default:
                vm vmVar = this.c;
                fo foVar = vmVar.c;
                foVar.i0.f(8);
                this.b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                vmVar.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                fo foVar = this.c.c;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                fo.S3(foVar);
                foVar.i0.f(0);
                this.b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                vm vmVar = this.c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) vmVar.c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                vmVar.b = true;
                break;
        }
    }
}
