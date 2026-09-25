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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vb(bc bcVar, Context context, long j3, org.telegram.ui.ActionBar.d6 d6Var, sa1 sa1Var) {
        this.d = bcVar;
        this.c = context;
        this.b = j3;
        this.e = d6Var;
        this.f = sa1Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                bc bcVar = (bc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                sa1 sa1Var = (sa1) this.f;
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
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-bcVar.J.id);
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
                            new tg.c0(sa1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(sa1Var.getParentActivity(), sa1Var.getResourceProvider());
                            ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            ybVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            org.telegram.ui.Components.qc.g(sa1Var, ybVar, 2750).j();
                        } else if (!z12 && !z11) {
                            sa1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        yh.w7.e1(this.c, bcVar.b, j3, boost, d6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.m.m(sa1Var, d6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.m.m(sa1Var, d6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((ac) bcVar.x.get(i10)).a == 9) {
                    bcVar.c(Boolean.valueOf(bcVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.m70.M((org.telegram.ui.Components.m70) this.d, this.b, (org.telegram.ui.ActionBar.m2) this.e, (a0.i) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ vb(org.telegram.ui.Components.m70 m70Var, long j3, org.telegram.ui.ActionBar.m2 m2Var, a0.i iVar, Context context) {
        this.d = m70Var;
        this.b = j3;
        this.e = m2Var;
        this.f = iVar;
        this.c = context;
    }
}
