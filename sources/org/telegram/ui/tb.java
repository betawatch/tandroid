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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tb(bc bcVar, Context context, long j10, org.telegram.ui.ActionBar.f6 f6Var, ga1 ga1Var) {
        this.d = bcVar;
        this.c = context;
        this.b = j10;
        this.e = f6Var;
        this.f = ga1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                bc bcVar = (bc) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                ga1 ga1Var = (ga1) this.f;
                boolean z4 = view instanceof lg.b;
                long j10 = this.b;
                if (z4) {
                    lg.b bVar = (lg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z10 = boost.giveaway;
                    if (!z10 || boost.stars <= 0) {
                        boolean z11 = boost.gift;
                        if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-bcVar.G.id);
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
                            new gg.e1(ga1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z10 && boost.user_id == -1) {
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(ga1Var.getParentActivity(), ga1Var.getResourceProvider());
                            qbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            qbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            qbVar.b.setSingleLine(false);
                            qbVar.b.setMaxLines(2);
                            org.telegram.ui.Components.ic.g(ga1Var, qbVar, 2750).j();
                        } else if (!z11 && !z10) {
                            ga1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        lh.ja.e1(this.c, bcVar.b, j10, boost, f6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.o8) {
                    gg.x.m(ga1Var, f6Var, j10, null);
                }
                if (view instanceof lg.c) {
                    gg.x.m(ga1Var, f6Var, j10, ((lg.c) view).getPrepaidGiveaway());
                }
                if (((ac) bcVar.x.get(i10)).a == 9) {
                    bcVar.c(Boolean.valueOf(bcVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.c70.M((org.telegram.ui.Components.c70) this.d, this.b, (org.telegram.ui.ActionBar.p2) this.e, (a0.h) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ tb(org.telegram.ui.Components.c70 c70Var, long j10, org.telegram.ui.ActionBar.p2 p2Var, a0.h hVar, Context context) {
        this.d = c70Var;
        this.b = j10;
        this.e = p2Var;
        this.f = hVar;
        this.c = context;
    }
}
