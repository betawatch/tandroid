package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class to extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ to(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                wo woVar = (wo) this.b;
                if (i10 == -1) {
                    if (woVar.e0(true)) {
                        woVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    woVar.j0();
                    break;
                }
                break;
            case 1:
                kp kpVar = (kp) this.b;
                if (i10 == -1) {
                    kpVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.pr prVar = kpVar.r;
                    if (prVar == null || prVar.c <= 0.0f) {
                        kpVar.Y();
                        break;
                    }
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((wp) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((dq) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                pq pqVar = (pq) this.b;
                if (i10 == -1) {
                    if (pqVar.m0(true)) {
                        pqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    pqVar.r0(true);
                    break;
                }
                break;
            case 5:
                ur urVar = (ur) this.b;
                if (i10 == -1) {
                    if (urVar.g0(true)) {
                        urVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    urVar.u0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.b;
                if (i10 == -1) {
                    h8Var.dismiss();
                    break;
                } else {
                    h8Var.t0(i10);
                    break;
                }
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.za) this.b).dismiss();
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
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kf0) this.b).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qg0) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.iq0) this.b).onBackPressed();
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.a61) this.b).finishFragment();
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
                    ((mi1) this.b).a(false, false);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((cu) this.b).finishFragment();
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
                            if (RecyclerView.S(childAt) == e00Var.L && (childAt instanceof org.telegram.ui.Components.z00)) {
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
                    ((t20) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                g70 g70Var = (g70) this.b;
                if (i10 == -1) {
                    if (g70Var.f0(true)) {
                        g70Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    g70Var.o0();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((n70) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((p70) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((v70) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
