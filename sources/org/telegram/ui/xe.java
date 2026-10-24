package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ xe(sn snVar, int i10) {
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
                snVar2.s5 = messageSuggestionParams;
                snVar2.B5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                snVar2.Eb(true, null, snVar2.B5, null, null, null, false);
                break;
            case 1:
                snVar.Bb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    snVar.finishFragment();
                    break;
                }
                break;
            case 2:
                snVar.ia((String) obj, false);
                break;
            case 3:
                snVar.Q1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 4:
                snVar.Jb((MessageSuggestionParams) obj);
                break;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    snVar.P1 = tL_premium_boostsStatus;
                    snVar.getMessagesController().getBoostsController().userCanBoostChannel(snVar.f6, tL_premium_boostsStatus, new xe(snVar, 3));
                    break;
                }
                break;
            case 6:
                View view = (View) obj;
                if (!(view instanceof org.telegram.ui.Cells.t1)) {
                    if (!(view instanceof org.telegram.ui.Cells.v0)) {
                        if (!(view instanceof org.telegram.ui.Cells.v1)) {
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
                            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(snVar.W8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.e0 = snVar.y9();
                        v0Var.i0 = snVar.H9();
                        snVar.G9();
                        snVar.V8();
                        int W8 = snVar.W8();
                        if (v0Var.j0 != W8) {
                            v0Var.j0 = W8;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.E8 = snVar.y9();
                    t1Var.F8 = snVar.H9();
                    boolean G9 = snVar.G9();
                    if (t1Var.G8 != G9) {
                        t1Var.G8 = G9;
                        snVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            snVar.A0.m(R);
                        }
                    }
                    t1Var.H8 = snVar.V8();
                    int W82 = snVar.W8();
                    if (t1Var.I8 != W82) {
                        t1Var.I8 = W82;
                        t1Var.x4();
                        t1Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.w31 w31Var = snVar.d2;
                if (w31Var != null) {
                    w31Var.n(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                snVar.d0.c.add(((org.telegram.ui.ActionBar.u0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = sn.Vc;
                snVar.Fa(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = sn.Vc;
                snVar.Fa(intValue2);
                break;
        }
    }
}
