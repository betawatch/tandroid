package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ye(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        un unVar = this.b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                un unVar2 = this.b;
                unVar2.s5 = messageSuggestionParams;
                unVar2.B5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                unVar2.Lb(true, null, unVar2.B5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
                unVar.Pb((MessageSuggestionParams) obj);
                break;
            case 2:
                unVar.Gb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    unVar.finishFragment();
                    break;
                }
                break;
            case 3:
                unVar.Q1 = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            case 4:
                unVar.na((String) obj, false);
                break;
            case 5:
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
                            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(unVar.b9() / 2.0f);
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                        v0Var.e0 = unVar.B9();
                        v0Var.i0 = unVar.L9();
                        unVar.K9();
                        unVar.a9();
                        int b92 = unVar.b9();
                        if (v0Var.j0 != b92) {
                            v0Var.j0 = b92;
                            v0Var.invalidate();
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    s1Var.E8 = unVar.B9();
                    s1Var.F8 = unVar.L9();
                    boolean K9 = unVar.K9();
                    if (s1Var.G8 != K9) {
                        s1Var.G8 = K9;
                        unVar.x0.getClass();
                        int R = RecyclerView.R(view);
                        s1Var.n8 = true;
                        s1Var.forceLayout();
                        if (R >= 0) {
                            unVar.A0.m(R);
                        }
                    }
                    s1Var.H8 = unVar.a9();
                    int b93 = unVar.b9();
                    if (s1Var.I8 != b93) {
                        s1Var.I8 = b93;
                        s1Var.A4();
                        s1Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    unVar.P1 = tL_premium_boostsStatus;
                    unVar.getMessagesController().getBoostsController().userCanBoostChannel(unVar.f6, tL_premium_boostsStatus, new ye(unVar, 3));
                    break;
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.e41 e41Var = unVar.d2;
                if (e41Var != null) {
                    e41Var.n(l4.longValue(), true);
                    break;
                }
                break;
            case 8:
                unVar.d0.c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                break;
            case 9:
                int intValue = ((Integer) obj).intValue();
                int i11 = un.bd;
                unVar.Ka(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = un.bd;
                unVar.Ka(intValue2);
                break;
        }
    }
}
