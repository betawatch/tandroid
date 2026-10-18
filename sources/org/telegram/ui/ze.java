package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ze(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        sn snVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                sn snVar2 = this.b;
                snVar2.g5 = messageSuggestionParams;
                snVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                snVar2.Cb(true, null, snVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                snVar.zb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    snVar.finishFragment();
                    break;
                }
                break;
            case 2:
                snVar.ia((String) obj, false);
                break;
            case 3:
                snVar.E1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 4:
                snVar.Hb((MessageSuggestionParams) obj);
                break;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    snVar.D1 = tL_premium_boostsStatus;
                    snVar.getMessagesController().getBoostsController().userCanBoostChannel(snVar.T5, tL_premium_boostsStatus, new ze(snVar, 3));
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
                            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(snVar.W8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.e0 = snVar.y9();
                        w0Var.i0 = snVar.H9();
                        snVar.G9();
                        snVar.V8();
                        int W8 = snVar.W8();
                        if (w0Var.j0 != W8) {
                            w0Var.j0 = W8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.E8 = snVar.y9();
                    u1Var.F8 = snVar.H9();
                    boolean G9 = snVar.G9();
                    if (u1Var.G8 != G9) {
                        u1Var.G8 = G9;
                        snVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        if (R >= 0) {
                            snVar.A0.m(R);
                        }
                    }
                    u1Var.H8 = snVar.V8();
                    int W82 = snVar.W8();
                    if (u1Var.I8 != W82) {
                        u1Var.I8 = W82;
                        u1Var.y4();
                        u1Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.q31 q31Var = snVar.R1;
                if (q31Var != null) {
                    q31Var.m(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                snVar.d0.c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = sn.Ic;
                snVar.Fa(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = sn.Ic;
                snVar.Fa(intValue2);
                break;
        }
    }
}
