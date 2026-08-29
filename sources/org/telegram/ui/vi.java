package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public vi(org.telegram.ui.Components.qu0 qu0Var, boolean z10, int i10, org.telegram.ui.Components.it0 it0Var) {
        this.e = qu0Var;
        this.b = z10;
        this.c = i10;
        this.d = it0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        int i10;
        f2.p0 adapter;
        switch (this.a) {
            case 0:
                tn tnVar = (tn) this.e;
                tnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow = true;
                tnVar.R9 = null;
                if (this.b) {
                    tnVar.ga = false;
                }
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar.invalidate();
                tnVar.T0.invalidate();
                AndroidUtilities.runOnUIThread(new ui(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.qu0 qu0Var = (org.telegram.ui.Components.qu0) this.e;
                int[] iArr = qu0Var.i1;
                org.telegram.ui.Components.it0[] it0VarArr = qu0Var.g0;
                qu0Var.k1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = qu0Var.m1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (qu0Var.c0(((org.telegram.ui.Components.it0) this.d).B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(qu0Var.m1);
                    }
                }
                for (int i13 = 0; i13 < it0VarArr.length; i13++) {
                    org.telegram.ui.Components.it0 it0Var = it0VarArr[i13];
                    if (it0Var != null && it0Var.h != null && (((i10 = it0Var.B) == 0 || org.telegram.ui.Components.qu0.p0(i10)) && (adapter = it0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            qu0Var.p1[0].g(false);
                        }
                        if (z10) {
                            it0VarArr[i13].x.y1(iArr[i11]);
                            it0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(it0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        it0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (qu0Var.s >= 0) {
                    for (int i14 = 0; i14 < it0VarArr.length; i14++) {
                        org.telegram.ui.Components.it0 it0Var2 = it0VarArr[i14];
                        if (it0Var2.B == qu0Var.l1) {
                            if (z10 && (m10 = it0Var2.s.m(qu0Var.s)) != null) {
                                qu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.it0 it0Var3 = it0VarArr[i14];
                            it0Var3.x.h1(qu0Var.s, (-it0Var3.h.getPaddingTop()) + qu0Var.v);
                        }
                    }
                } else {
                    qu0Var.X0();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((tn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public vi(tn tnVar, boolean z10, Runnable runnable) {
        this.e = tnVar;
        this.b = z10;
        this.d = runnable;
    }
}
