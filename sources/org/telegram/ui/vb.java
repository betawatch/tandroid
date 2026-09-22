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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vb(cc ccVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, za1 za1Var) {
        this.d = ccVar;
        this.c = context;
        this.b = j3;
        this.e = e6Var;
        this.f = za1Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                za1 za1Var = (za1) this.f;
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
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ccVar.J.id);
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
                            new tg.d0(za1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(za1Var.getParentActivity(), za1Var.getResourceProvider());
                            wbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            wbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            wbVar.b.setSingleLine(false);
                            wbVar.b.setMaxLines(2);
                            org.telegram.ui.Components.oc.g(za1Var, wbVar, 2750).j();
                        } else if (!z12 && !z11) {
                            za1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        yh.x7.e1(this.c, ccVar.b, j3, boost, e6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.o.m(za1Var, e6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.o.m(za1Var, e6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.x.get(i10)).a == 9) {
                    ccVar.c(Boolean.valueOf(ccVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.b70.M((org.telegram.ui.Components.b70) this.d, this.b, (org.telegram.ui.ActionBar.n2) this.e, (a0.i) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ vb(org.telegram.ui.Components.b70 b70Var, long j3, org.telegram.ui.ActionBar.n2 n2Var, a0.i iVar, Context context) {
        this.d = b70Var;
        this.b = j3;
        this.e = n2Var;
        this.f = iVar;
        this.c = context;
    }
}
