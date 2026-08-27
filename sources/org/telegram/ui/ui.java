package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ui extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public ui(org.telegram.ui.Components.hu0 hu0Var, boolean z10, int i10, org.telegram.ui.Components.zs0 zs0Var) {
        this.e = hu0Var;
        this.b = z10;
        this.c = i10;
        this.d = zs0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        f2.q0 adapter;
        switch (this.a) {
            case 0:
                rn rnVar = (rn) this.e;
                rnVar.K5 = true;
                ((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow = true;
                rnVar.R9 = null;
                if (this.b) {
                    rnVar.ga = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                kVar.invalidate();
                rnVar.T0.invalidate();
                AndroidUtilities.runOnUIThread(new ti(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.hu0 hu0Var = (org.telegram.ui.Components.hu0) this.e;
                int[] iArr = hu0Var.i1;
                org.telegram.ui.Components.zs0[] zs0VarArr = hu0Var.g0;
                hu0Var.k1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = hu0Var.m1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (hu0Var.c0(((org.telegram.ui.Components.zs0) this.d).B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(hu0Var.m1);
                    }
                }
                for (int i13 = 0; i13 < zs0VarArr.length; i13++) {
                    org.telegram.ui.Components.zs0 zs0Var = zs0VarArr[i13];
                    if (zs0Var != null && zs0Var.h != null && (((i10 = zs0Var.B) == 0 || org.telegram.ui.Components.hu0.p0(i10)) && (adapter = zs0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            hu0Var.p1[0].g(false);
                        }
                        if (z10) {
                            zs0VarArr[i13].x.y1(iArr[i11]);
                            zs0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(zs0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        zs0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (hu0Var.s >= 0) {
                    for (int i14 = 0; i14 < zs0VarArr.length; i14++) {
                        org.telegram.ui.Components.zs0 zs0Var2 = zs0VarArr[i14];
                        if (zs0Var2.B == hu0Var.l1) {
                            if (z10 && (m10 = zs0Var2.s.m(hu0Var.s)) != null) {
                                hu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.zs0 zs0Var3 = zs0VarArr[i14];
                            zs0Var3.x.h1(hu0Var.s, (-zs0Var3.h.getPaddingTop()) + hu0Var.v);
                        }
                    }
                } else {
                    hu0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((rn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ui(rn rnVar, boolean z10, Runnable runnable) {
        this.e = rnVar;
        this.b = z10;
        this.d = runnable;
    }
}
