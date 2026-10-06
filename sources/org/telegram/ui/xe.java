package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ xe(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        yn ynVar = this.b;
        switch (i10) {
            case 0:
                ynVar.ub(true, false);
                if (((Boolean) obj).booleanValue()) {
                    ynVar.finishFragment();
                    break;
                }
                break;
            case 1:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                yn ynVar2 = this.b;
                ynVar2.e5 = messageSuggestionParams;
                ynVar2.n5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                ynVar2.xb(true, null, ynVar2.n5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 2:
                ynVar.ca((String) obj, false);
                break;
            case 3:
                ynVar.Cb((MessageSuggestionParams) obj);
                break;
            case 4:
                ynVar.C1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ynVar.B1 = tL_premium_boostsStatus;
                    ynVar.getMessagesController().getBoostsController().userCanBoostChannel(ynVar.R5, tL_premium_boostsStatus, new xe(ynVar, 4));
                    break;
                }
                break;
            case 6:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.u1)) {
                    if (!(view instanceof org.telegram.ui.Cells.w0)) {
                        if (!(view instanceof org.telegram.ui.Cells.w1)) {
                            if (!(view instanceof org.telegram.ui.Cells.b0)) {
                                if (view instanceof org.telegram.ui.Cells.h0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(ynVar.S8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = ynVar.s9();
                        w0Var.i0 = ynVar.B9();
                        ynVar.A9();
                        ynVar.R8();
                        int S8 = ynVar.S8();
                        if (w0Var.j0 != S8) {
                            w0Var.j0 = S8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = ynVar.s9();
                    u1Var.F8 = ynVar.B9();
                    boolean A9 = ynVar.A9();
                    if (u1Var.G8 != A9) {
                        u1Var.G8 = A9;
                        ynVar.v0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            ynVar.y0.m(R);
                        }
                    }
                    u1Var.H8 = ynVar.R8();
                    int S82 = ynVar.S8();
                    if (u1Var.I8 != S82) {
                        u1Var.I8 = S82;
                        u1Var.y4();
                        u1Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.w31 w31Var = ynVar.P1;
                if (w31Var != null) {
                    w31Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                ynVar.b0.c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = yn.Bc;
                ynVar.Aa(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = yn.Bc;
                ynVar.Aa(intValue2);
                break;
        }
    }
}
