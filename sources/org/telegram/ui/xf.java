package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ xf(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.A1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = view instanceof org.telegram.ui.Cells.t1;
                qn qnVar = this.b;
                if (!z10) {
                    if (!(view instanceof org.telegram.ui.Cells.w0)) {
                        if (!(view instanceof org.telegram.ui.Cells.v1)) {
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
                            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(qnVar.R8() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                        w0Var.a0 = qnVar.t9();
                        w0Var.e0 = qnVar.C9();
                        qnVar.B9();
                        qnVar.Q8();
                        int R8 = qnVar.R8();
                        if (w0Var.f0 != R8) {
                            w0Var.f0 = R8;
                            w0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    t1Var.A8 = qnVar.t9();
                    t1Var.B8 = qnVar.C9();
                    boolean B9 = qnVar.B9();
                    if (t1Var.C8 != B9) {
                        t1Var.C8 = B9;
                        qnVar.t0.getClass();
                        int R = RecyclerView.R(view);
                        t1Var.j8 = true;
                        t1Var.forceLayout();
                        if (R >= 0) {
                            qnVar.w0.m(R);
                        }
                    }
                    t1Var.D8 = qnVar.Q8();
                    int R82 = qnVar.R8();
                    if (t1Var.E8 != R82) {
                        t1Var.E8 = R82;
                        t1Var.y4();
                        t1Var.invalidate();
                        break;
                    }
                }
                break;
            default:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    qn qnVar2 = this.b;
                    qnVar2.z1 = tL_premium_boostsStatus;
                    qnVar2.getMessagesController().getBoostsController().userCanBoostChannel(qnVar2.P5, tL_premium_boostsStatus, new xf(qnVar2, 0));
                    break;
                }
                break;
        }
    }
}
