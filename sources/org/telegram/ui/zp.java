package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zp extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                dq dqVar = (dq) this.b;
                if (i10 == -1) {
                    if (dqVar.m0(true)) {
                        dqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    dqVar.r0(true);
                    break;
                }
                break;
            case 1:
                lr lrVar = (lr) this.b;
                if (i10 == -1) {
                    if (lrVar.g0(true)) {
                        lrVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    lrVar.u0();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.b;
                if (i10 == -1) {
                    b8Var.dismiss();
                    break;
                } else {
                    b8Var.t0(i10);
                    break;
                }
            case 3:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qa) this.b).dismiss();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.b;
                if (i10 != -1) {
                    giVar.u0.u(i10);
                    break;
                } else if (!giVar.u0.i()) {
                    giVar.dismiss();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.q30) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.we0) this.b).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.cg0) this.b).dismiss();
                    break;
                }
                break;
            case 8:
                ((org.telegram.ui.Components.sp0) this.b).onBackPressed();
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.f51) this.b).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.u0) this.b).b(false, false);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((eh1) this.b).a(false, false);
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((tt) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((DataSettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((ru) this.b).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((ev) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((yy) this.b).finishFragment();
                    break;
                }
                break;
            case 18:
                oz ozVar = (oz) this.b;
                if (i10 == -1) {
                    if (ozVar.W(true)) {
                        ozVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(ozVar.P - 1.0f) < 0.1f) {
                        ozVar.c0();
                        break;
                    } else if (Math.abs(ozVar.P - 0.5f) < 0.1f) {
                        for (int i11 = 0; i11 < ozVar.a.getChildCount(); i11++) {
                            View childAt = ozVar.a.getChildAt(i11);
                            ozVar.a.getClass();
                            if (RecyclerView.R(childAt) == ozVar.H && (childAt instanceof org.telegram.ui.Components.n00)) {
                                int i12 = -ozVar.s;
                                ozVar.s = i12;
                                AndroidUtilities.shakeViewSpring(childAt, i12);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 19:
                q00 q00Var = (q00) this.b;
                if (i10 == -1) {
                    if (q00Var.h0(true)) {
                        q00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    q00Var.q0();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((FiltersSetupActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((a20) this.b).finishFragment();
                    break;
                }
                break;
            case 22:
                o60 o60Var = (o60) this.b;
                if (i10 == -1) {
                    if (o60Var.f0(true)) {
                        o60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    o60Var.o0();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((u60) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((w60) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((c70) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((e70) this.b).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((t70) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((LanguageSelectActivity) this.b).finishFragment();
                    break;
                }
                break;
            default:
                fb0 fb0Var = (fb0) this.b;
                if (i10 == -1) {
                    fb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(fb0Var.B);
                    break;
                }
                break;
        }
    }
}
