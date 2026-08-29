package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ uf(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.A1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.s1;
                tn tnVar = this.b;
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
                            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(tnVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.a0 = tnVar.t9();
                        v0Var.e0 = tnVar.C9();
                        tnVar.B9();
                        tnVar.Q8();
                        int R8 = tnVar.R8();
                        if (v0Var.f0 != R8) {
                            v0Var.f0 = R8;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.A8 = tnVar.t9();
                    s1Var.B8 = tnVar.C9();
                    boolean B9 = tnVar.B9();
                    if (s1Var.C8 != B9) {
                        s1Var.C8 = B9;
                        tnVar.t0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.j8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            tnVar.w0.m(R);
                        }
                    }
                    s1Var.D8 = tnVar.Q8();
                    int R82 = tnVar.R8();
                    if (s1Var.E8 != R82) {
                        s1Var.E8 = R82;
                        s1Var.y4();
                        s1Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    tn tnVar2 = this.b;
                    tnVar2.z1 = tL_premium_boostsStatus;
                    tnVar2.getMessagesController().getBoostsController().userCanBoostChannel(tnVar2.P5, tL_premium_boostsStatus, new uf(tnVar2, 0));
                    break;
                }
                break;
        }
    }
}
