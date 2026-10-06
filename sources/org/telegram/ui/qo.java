package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class qo extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qo(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                to toVar = (to) this.b;
                if (i10 == -1) {
                    if (toVar.e0(true)) {
                        toVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    toVar.j0();
                    break;
                }
                break;
            case 1:
                hp hpVar = (hp) this.b;
                if (i10 == -1) {
                    hpVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.sr srVar = hpVar.s;
                    if (srVar == null || srVar.c <= 0.0f) {
                        hpVar.X();
                        break;
                    }
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((tp) this.b).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((aq) this.b).finishFragment();
                    break;
                }
                break;
            case 4:
                mq mqVar = (mq) this.b;
                if (i10 == -1) {
                    if (mqVar.m0(true)) {
                        mqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    mqVar.r0(true);
                    break;
                }
                break;
            case 5:
                rr rrVar = (rr) this.b;
                if (i10 == -1) {
                    if (rrVar.g0(true)) {
                        rrVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    rrVar.u0();
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
                    ((org.telegram.ui.Components.cb) this.b).dismiss();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) this.b;
                if (i10 != -1) {
                    xiVar.y0.t(i10);
                    break;
                } else if (!xiVar.y0.i()) {
                    xiVar.dismiss();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.f40) this.b).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.wf0) this.b).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ch0) this.b).dismiss();
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.br0) this.b).onBackPressed();
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.z61) this.b).finishFragment();
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
                    ((di1) this.b).a(false, false);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((zt) this.b).finishFragment();
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
                    ((zu) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((nv) this.b).finishFragment();
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
                    if (c00Var.U(true)) {
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
                            if (RecyclerView.R(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.c10)) {
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
                d70 d70Var = (d70) this.b;
                if (i10 == -1) {
                    if (d70Var.f0(true)) {
                        d70Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    d70Var.o0();
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
