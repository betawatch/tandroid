package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ro extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ro(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                uo uoVar = (uo) this.b;
                if (i10 == -1) {
                    if (uoVar.e0(true)) {
                        uoVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    uoVar.j0();
                    break;
                }
                break;
            case 1:
                ip ipVar = (ip) this.b;
                if (i10 == -1) {
                    ipVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.pr prVar = ipVar.r;
                    if (prVar == null || prVar.c <= 0.0f) {
                        ipVar.Y();
                        break;
                    }
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((up) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((bq) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                nq nqVar = (nq) this.b;
                if (i10 == -1) {
                    if (nqVar.m0(true)) {
                        nqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    nqVar.r0(true);
                    break;
                }
                break;
            case 5:
                sr srVar = (sr) this.b;
                if (i10 == -1) {
                    if (srVar.g0(true)) {
                        srVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    srVar.u0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                if (i10 == -1) {
                    j8Var.dismiss();
                    break;
                } else {
                    j8Var.t0(i10);
                    break;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) this.b).dismiss();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.b;
                if (i10 != -1) {
                    viVar.y0.t(i10);
                    break;
                } else if (!viVar.y0.i()) {
                    viVar.dismiss();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.b40) this.b).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.tf0) this.b).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ah0) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.vq0) this.b).onBackPressed();
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.o61) this.b).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.x0) this.b).b(false, false);
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((li1) this.b).a(false, false);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((au) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((av) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((ov) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((mz) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                c00 c00Var = (c00) this.b;
                if (i10 == -1) {
                    if (c00Var.W(true)) {
                        c00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(c00Var.T - 1.0f) < 0.1f) {
                        c00Var.c0();
                        break;
                    } else if (Math.abs(c00Var.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < c00Var.a.getChildCount(); i11++) {
                            View childAt = c00Var.a.getChildAt(i11);
                            c00Var.a.getClass();
                            if (RecyclerView.S(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.z00)) {
                                int i12 = -c00Var.s;
                                c00Var.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 23:
                f10 f10Var = (f10) this.b;
                if (i10 == -1) {
                    if (f10Var.h0(true)) {
                        f10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    f10Var.q0();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((r20) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                e70 e70Var = (e70) this.b;
                if (i10 == -1) {
                    if (e70Var.f0(true)) {
                        e70Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    e70Var.o0();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((l70) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((n70) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((t70) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
