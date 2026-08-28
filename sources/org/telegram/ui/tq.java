package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tq extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tq(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        Runnable runnable;
        switch (this.a) {
            case 0:
                jr jrVar = (jr) this.b;
                if (i9 == -1) {
                    if (jrVar.f0(true)) {
                        jrVar.finishFragment();
                        break;
                    }
                } else if (i9 == 1) {
                    jrVar.t0();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.b;
                if (i9 == -1) {
                    c8Var.dismiss();
                    break;
                } else {
                    c8Var.s0(i9);
                    break;
                }
            case 2:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.sa) this.b).dismiss();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) this.b;
                if (i9 != -1) {
                    kiVar.u0.t(i9);
                    break;
                } else if (!kiVar.u0.i()) {
                    kiVar.dismiss();
                    break;
                }
                break;
            case 4:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.l30) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i9 == -1 && (runnable = ((org.telegram.ui.Components.re0) this.b).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 6:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.ag0) this.b).dismiss();
                    break;
                }
                break;
            case 7:
                ((org.telegram.ui.Components.rp0) this.b).onBackPressed();
                break;
            case 8:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.d51) this.b).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i9 == -1) {
                    ((org.telegram.ui.Components.voip.u0) this.b).b(false, false);
                    break;
                }
                break;
            case 10:
                if (i9 == -1) {
                    ((fh1) this.b).a(false, false);
                    break;
                }
                break;
            case 11:
                if (i9 == -1) {
                    ((qt) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i9 == -1) {
                    ((DataAutoDownloadActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i9 == -1) {
                    ((DataSettingsActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i9 == -1) {
                    ((ou) this.b).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i9 == -1) {
                    ((bv) this.b).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i9 == -1) {
                    ((vy) this.b).finishFragment();
                    break;
                }
                break;
            case 17:
                lz lzVar = (lz) this.b;
                if (i9 == -1) {
                    if (lzVar.V(true)) {
                        lzVar.finishFragment();
                        break;
                    }
                } else if (i9 == 1) {
                    if (Math.abs(lzVar.P - 1.0f) < 0.1f) {
                        lzVar.b0();
                        break;
                    } else if (Math.abs(lzVar.P - 0.5f) < 0.1f) {
                        for (int i10 = 0; i10 < lzVar.a.getChildCount(); i10++) {
                            View childAt = lzVar.a.getChildAt(i10);
                            lzVar.a.getClass();
                            if (RecyclerView.R(childAt) == lzVar.H && (childAt instanceof org.telegram.ui.Components.k00)) {
                                int i11 = -lzVar.s;
                                lzVar.s = i11;
                                AndroidUtilities.shakeViewSpring(childAt, i11);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 18:
                n00 n00Var = (n00) this.b;
                if (i9 == -1) {
                    if (n00Var.g0(true)) {
                        n00Var.finishFragment();
                        break;
                    }
                } else if (i9 == 1) {
                    n00Var.p0();
                    break;
                }
                break;
            case 19:
                if (i9 == -1) {
                    ((FiltersSetupActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i9 == -1) {
                    ((x10) this.b).finishFragment();
                    break;
                }
                break;
            case 21:
                k60 k60Var = (k60) this.b;
                if (i9 == -1) {
                    if (k60Var.e0(true)) {
                        k60Var.finishFragment();
                        break;
                    }
                } else if (i9 == 1) {
                    k60Var.n0();
                    break;
                }
                break;
            case 22:
                if (i9 == -1) {
                    ((r60) this.b).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i9 == -1) {
                    ((t60) this.b).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i9 == -1) {
                    ((z60) this.b).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i9 == -1) {
                    ((b70) this.b).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i9 == -1) {
                    ((q70) this.b).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i9 == -1) {
                    ((LanguageSelectActivity) this.b).finishFragment();
                    break;
                }
                break;
            case 28:
                bb0 bb0Var = (bb0) this.b;
                if (i9 == -1) {
                    bb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(bb0Var.B);
                    break;
                }
                break;
            default:
                if (i9 == -1) {
                    ((sb0) this.b).finishFragment();
                    break;
                }
                break;
        }
    }
}
