package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class vi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public vi(org.telegram.ui.Components.uv0 uv0Var, boolean z10, int i10, org.telegram.ui.Components.nu0 nu0Var) {
        this.e = uv0Var;
        this.b = z10;
        this.c = i10;
        this.d = nu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.e;
                qnVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow = true;
                qnVar.V9 = null;
                if (this.b) {
                    qnVar.ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.invalidate();
                qnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new ti(this, 1), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.uv0 uv0Var = (org.telegram.ui.Components.uv0) this.e;
                int[] iArr = uv0Var.m1;
                org.telegram.ui.Components.nu0[] nu0VarArr = uv0Var.k0;
                uv0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = uv0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (uv0Var.c0(((org.telegram.ui.Components.nu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(uv0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < nu0VarArr.length; i13++) {
                    org.telegram.ui.Components.nu0 nu0Var = nu0VarArr[i13];
                    if (nu0Var != null && nu0Var.h != null && (((i10 = nu0Var.F) == 0 || org.telegram.ui.Components.uv0.q0(i10)) && (adapter = nu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            uv0Var.t1[0].g(false);
                        }
                        if (z10) {
                            nu0VarArr[i13].x.y1(iArr[i11]);
                            nu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(nu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        nu0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (uv0Var.s >= 0) {
                    for (int i14 = 0; i14 < nu0VarArr.length; i14++) {
                        org.telegram.ui.Components.nu0 nu0Var2 = nu0VarArr[i14];
                        if (nu0Var2.F == uv0Var.p1) {
                            if (z10 && (m10 = nu0Var2.s.m(uv0Var.s)) != null) {
                                uv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.nu0 nu0Var3 = nu0VarArr[i14];
                            nu0Var3.x.h1(uv0Var.s, (-nu0Var3.h.getPaddingTop()) + uv0Var.v);
                        }
                    }
                } else {
                    uv0Var.Z0();
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((qn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public vi(qn qnVar, boolean z10, Runnable runnable) {
        this.e = qnVar;
        this.b = z10;
        this.d = runnable;
    }
}
