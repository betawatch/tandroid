package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ze(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10 = this.a;
        int i11 = 1;
        un unVar = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.pj pjVar = (org.telegram.messenger.pj) obj;
                un unVar2 = this.b;
                unVar2.w5 = pjVar;
                unVar2.F5.k.suggested_post = pjVar.c();
                unVar2.Wb(true, null, unVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                unVar.S1 = (org.telegram.messenger.h3) obj;
                break;
            case 2:
                unVar.bc((org.telegram.messenger.pj) obj);
                break;
            case 3:
                unVar.Tb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    unVar.finishFragment();
                    break;
                }
                break;
            case 4:
                unVar.ya((String) obj, false);
                break;
            case 5:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.q1)) {
                    if (!(view instanceof org.telegram.ui.Cells.s0)) {
                        if (!(view instanceof org.telegram.ui.Cells.z1)) {
                            if (!(view instanceof org.telegram.ui.Cells.a0)) {
                                if (view instanceof org.telegram.ui.Cells.f0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(unVar.i9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                        s0Var.e0 = unVar.J9();
                        s0Var.i0 = unVar.U9();
                        unVar.T9();
                        unVar.h9();
                        int i92 = unVar.i9();
                        if (s0Var.j0 != i92) {
                            s0Var.j0 = i92;
                            s0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.U6 = unVar.J9();
                    q1Var.V6 = unVar.U9();
                    boolean T9 = unVar.T9();
                    if (q1Var.W6 != T9) {
                        q1Var.W6 = T9;
                        unVar.z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.D6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            unVar.C0.g(R);
                        }
                    }
                    q1Var.X6 = unVar.h9();
                    int i93 = unVar.i9();
                    if (q1Var.Y6 != i93) {
                        q1Var.Y6 = i93;
                        q1Var.V3();
                        q1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    unVar.R1 = tL_premium_boostsStatus;
                    unVar.getMessagesController().G0().b(unVar.j6, tL_premium_boostsStatus, new ze(unVar, i11));
                    break;
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.p21 p21Var = unVar.f2;
                if (p21Var != null) {
                    p21Var.n(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                unVar.e0.c.add(((org.telegram.ui.ActionBar.t0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i12 = un.bd;
                unVar.Va(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i13 = un.bd;
                unVar.Va(intValue2);
                break;
        }
    }
}
