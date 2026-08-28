package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class si extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public si(org.telegram.ui.Components.eu0 eu0Var, boolean z10, int i9, org.telegram.ui.Components.xs0 xs0Var) {
        this.e = eu0Var;
        this.b = z10;
        this.c = i9;
        this.d = xs0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i9;
        f2.r0 adapter;
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.e;
                qnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow = true;
                qnVar.R9 = null;
                if (this.b) {
                    qnVar.ga = false;
                }
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar.invalidate();
                qnVar.T0.invalidate();
                AndroidUtilities.runOnUIThread(new ri(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.eu0 eu0Var = (org.telegram.ui.Components.eu0) this.e;
                int[] iArr = eu0Var.i1;
                org.telegram.ui.Components.xs0[] xs0VarArr = eu0Var.g0;
                eu0Var.k1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i11 = eu0Var.m1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        SharedConfig.setMediaColumnsCount(i11);
                    } else if (eu0Var.c0(((org.telegram.ui.Components.xs0) this.d).B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(eu0Var.m1);
                    }
                }
                for (int i12 = 0; i12 < xs0VarArr.length; i12++) {
                    org.telegram.ui.Components.xs0 xs0Var = xs0VarArr[i12];
                    if (xs0Var != null && xs0Var.h != null && (((i9 = xs0Var.B) == 0 || org.telegram.ui.Components.eu0.p0(i9)) && (adapter = xs0VarArr[i12].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i12 == 0) {
                            eu0Var.p1[0].g(false);
                        }
                        if (z10) {
                            xs0VarArr[i12].x.y1(iArr[i10]);
                            xs0VarArr[i12].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(xs0VarArr[i12].h);
                            } else {
                                adapter.l();
                            }
                        }
                        xs0VarArr[i12].r.setVisibility(8);
                    }
                }
                if (eu0Var.s >= 0) {
                    for (int i13 = 0; i13 < xs0VarArr.length; i13++) {
                        org.telegram.ui.Components.xs0 xs0Var2 = xs0VarArr[i13];
                        if (xs0Var2.B == eu0Var.l1) {
                            if (z10 && (m10 = xs0Var2.s.m(eu0Var.s)) != null) {
                                eu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.xs0 xs0Var3 = xs0VarArr[i13];
                            xs0Var3.x.h1(eu0Var.s, (-xs0Var3.h.getPaddingTop()) + eu0Var.v);
                        }
                    }
                } else {
                    eu0Var.X0();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i9;
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                i9 = ((org.telegram.ui.ActionBar.o2) ((qn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i9).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public si(qn qnVar, boolean z10, Runnable runnable) {
        this.e = qnVar;
        this.b = z10;
        this.d = runnable;
    }
}
