package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xb(dc dcVar, Context context, long j3, org.telegram.ui.ActionBar.d6 d6Var, ta1 ta1Var) {
        this.d = dcVar;
        this.c = context;
        this.b = j3;
        this.e = d6Var;
        this.f = ta1Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                dc dcVar = (dc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                ta1 ta1Var = (ta1) this.f;
                boolean z10 = view instanceof yg.b;
                long j3 = this.b;
                if (z10) {
                    yg.b bVar = (yg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (!z11 || boost.stars <= 0) {
                        boolean z12 = boost.gift;
                        if (((z12 || z11) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-dcVar.I.id);
                            int i11 = boost.date;
                            tL_payments_checkedGiftCode.date = i11;
                            tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                            int i12 = boost.expires - i11;
                            tL_payments_checkedGiftCode.days = i12 / 86400;
                            tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                            if (boost.unclaimed) {
                                tL_payments_checkedGiftCode.to_id = -1L;
                                tL_payments_checkedGiftCode.flags = -1;
                            } else {
                                tL_payments_checkedGiftCode.boost = boost;
                            }
                            new tg.c0(ta1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(ta1Var.getParentActivity(), ta1Var.getResourceProvider());
                            zbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            zbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            zbVar.b.setSingleLine(false);
                            zbVar.b.setMaxLines(2);
                            org.telegram.ui.Components.rc.g(ta1Var, zbVar, 2750).j();
                        } else if (!z12 && !z11) {
                            ta1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        yh.z7.k1(this.c, dcVar.b, j3, boost, d6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.m(ta1Var, d6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.m(ta1Var, d6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((cc) dcVar.x.get(i10)).a == 9) {
                    dcVar.c(Boolean.valueOf(dcVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.p70.K((org.telegram.ui.Components.p70) this.d, this.b, (org.telegram.ui.ActionBar.n2) this.e, (a0.i) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ xb(org.telegram.ui.Components.p70 p70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = p70Var;
        this.b = j3;
        this.e = n2Var;
        this.f = iVar;
        this.c = context;
    }
}
