package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ xf(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.A1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.s1;
                rn rnVar = this.b;
                if (!z10) {
                    if (!(view instanceof org.telegram.ui.Cells.v0)) {
                        if (!(view instanceof org.telegram.ui.Cells.u1)) {
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
                            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(rnVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.a0 = rnVar.t9();
                        v0Var.e0 = rnVar.C9();
                        rnVar.B9();
                        rnVar.Q8();
                        int R8 = rnVar.R8();
                        if (v0Var.f0 != R8) {
                            v0Var.f0 = R8;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.A8 = rnVar.t9();
                    s1Var.B8 = rnVar.C9();
                    boolean B9 = rnVar.B9();
                    if (s1Var.C8 != B9) {
                        s1Var.C8 = B9;
                        rnVar.t0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.j8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            rnVar.w0.m(R);
                        }
                    }
                    s1Var.D8 = rnVar.Q8();
                    int R82 = rnVar.R8();
                    if (s1Var.E8 != R82) {
                        s1Var.E8 = R82;
                        s1Var.x4();
                        s1Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    rn rnVar2 = this.b;
                    rnVar2.z1 = tL_premium_boostsStatus;
                    rnVar2.getMessagesController().getBoostsController().userCanBoostChannel(rnVar2.P5, tL_premium_boostsStatus, new xf(rnVar2, 0));
                    break;
                }
                break;
        }
    }
}
