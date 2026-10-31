package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ze(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        un unVar = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.oj ojVar = (org.telegram.messenger.oj) obj;
                un unVar2 = this.b;
                unVar2.w5 = ojVar;
                unVar2.F5.k.suggested_post = ojVar.c();
                unVar2.Rb(true, null, unVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                unVar.Wb((org.telegram.messenger.oj) obj);
                break;
            case 2:
                unVar.Ob(true, false);
                if (((Boolean) obj).booleanValue()) {
                    unVar.finishFragment();
                    break;
                }
                break;
            case 3:
                unVar.ta((String) obj, false);
                break;
            case 4:
                unVar.S1 = (org.telegram.messenger.h3) obj;
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
                            ((org.telegram.ui.Cells.z1) view).getTextView().setTranslationX(unVar.e9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                        s0Var.e0 = unVar.E9();
                        s0Var.i0 = unVar.P9();
                        unVar.O9();
                        unVar.d9();
                        int e92 = unVar.e9();
                        if (s0Var.j0 != e92) {
                            s0Var.j0 = e92;
                            s0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                    q1Var.U6 = unVar.E9();
                    q1Var.V6 = unVar.P9();
                    boolean O9 = unVar.O9();
                    if (q1Var.W6 != O9) {
                        q1Var.W6 = O9;
                        unVar.z0.getClass();
                        int R = RecyclerView.R(view);
                        q1Var.D6 = true;
                        q1Var.forceLayout();
                        if (R >= 0) {
                            unVar.C0.g(R);
                        }
                    }
                    q1Var.X6 = unVar.d9();
                    int e93 = unVar.e9();
                    if (q1Var.Y6 != e93) {
                        q1Var.Y6 = e93;
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
                    unVar.getMessagesController().G0().b(unVar.j6, tL_premium_boostsStatus, new ze(unVar, 4));
                    break;
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.o21 o21Var = unVar.f2;
                if (o21Var != null) {
                    o21Var.n(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                unVar.e0.c.add(((org.telegram.ui.ActionBar.t0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = un.ad;
                unVar.Qa(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = un.ad;
                unVar.Qa(intValue2);
                break;
        }
    }
}
