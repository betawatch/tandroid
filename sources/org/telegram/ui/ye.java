package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ ye(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        wn wnVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                wn wnVar2 = this.b;
                wnVar2.w5 = messageSuggestionParams;
                wnVar2.F5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                wnVar2.Pb(true, null, wnVar2.F5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                wnVar.Tb((MessageSuggestionParams) obj);
                break;
            case 2:
                wnVar.Kb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    wnVar.finishFragment();
                    break;
                }
                break;
            case 3:
                wnVar.qa((String) obj, false);
                break;
            case 4:
                wnVar.Q1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    wnVar.P1 = tL_premium_boostsStatus;
                    wnVar.getMessagesController().getBoostsController().userCanBoostChannel(wnVar.j6, tL_premium_boostsStatus, new ye(wnVar, 4));
                    break;
                }
                break;
            case 6:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.s1)) {
                    if (!(view instanceof org.telegram.ui.Cells.v0)) {
                        if (!(view instanceof org.telegram.ui.Cells.u1)) {
                            if (!(view instanceof org.telegram.ui.Cells.a0)) {
                                if (view instanceof org.telegram.ui.Cells.g0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(wnVar.e9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.e0 = wnVar.E9();
                        v0Var.i0 = wnVar.O9();
                        wnVar.N9();
                        wnVar.d9();
                        int e92 = wnVar.e9();
                        if (v0Var.j0 != e92) {
                            v0Var.j0 = e92;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.E8 = wnVar.E9();
                    s1Var.F8 = wnVar.O9();
                    boolean N9 = wnVar.N9();
                    if (s1Var.G8 != N9) {
                        s1Var.G8 = N9;
                        wnVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.n8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            wnVar.A0.m(R);
                        }
                    }
                    s1Var.H8 = wnVar.d9();
                    int e93 = wnVar.e9();
                    if (s1Var.I8 != e93) {
                        s1Var.I8 = e93;
                        s1Var.A4();
                        s1Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.f41 f41Var = wnVar.d2;
                if (f41Var != null) {
                    f41Var.n(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                wnVar.d0.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = wn.fd;
                wnVar.Na(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = wn.fd;
                wnVar.Na(intValue2);
                break;
        }
    }
}
