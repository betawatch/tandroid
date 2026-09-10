package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vo extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vo(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                yo yoVar = (yo) this.b;
                if (i10 == -1) {
                    if (yoVar.e0(true)) {
                        yoVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    yoVar.j0();
                    break;
                }
                break;
            case 1:
                mp mpVar = (mp) this.b;
                if (i10 == -1) {
                    mpVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.vr vrVar = mpVar.r;
                    if (vrVar == null || vrVar.c <= 0.0f) {
                        mpVar.Y();
                        break;
                    }
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((yp) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((fq) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                rq rqVar = (rq) this.b;
                if (i10 == -1) {
                    if (rqVar.m0(true)) {
                        rqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    rqVar.r0(true);
                    break;
                }
                break;
            case 5:
                wr wrVar = (wr) this.b;
                if (i10 == -1) {
                    if (wrVar.g0(true)) {
                        wrVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    wrVar.u0();
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
                    ((org.telegram.ui.Components.ab) this.b).dismiss();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) this.b;
                if (i10 != -1) {
                    yiVar.y0.t(i10);
                    break;
                } else if (!yiVar.y0.i()) {
                    yiVar.dismiss();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.l40) this.b).finishFragment();
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
                    ((org.telegram.ui.Components.zg0) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.sq0) this.b).onBackPressed();
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.m61) this.b).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.w0) this.b).b(false, false);
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((si1) this.b).a(false, false);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((bu) this.b).finishFragment();
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
                    ((bv) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((pv) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((oz) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                e00 e00Var = (e00) this.b;
                if (i10 == -1) {
                    if (e00Var.W(true)) {
                        e00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(e00Var.T - 1.0f) < 0.1f) {
                        e00Var.c0();
                        break;
                    } else if (Math.abs(e00Var.T - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < e00Var.a.getChildCount(); i11++) {
                            View childAt = e00Var.a.getChildAt(i11);
                            e00Var.a.getClass();
                            if (RecyclerView.R(childAt) == e00Var.L && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i12 = -e00Var.s;
                                e00Var.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 23:
                h10 h10Var = (h10) this.b;
                if (i10 == -1) {
                    if (h10Var.h0(true)) {
                        h10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    h10Var.q0();
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
                    ((s20) this.b).finishFragment();
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
                    ((k70) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((m70) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((s70) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
