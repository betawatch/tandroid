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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tb(ac acVar, Context context, long j10, org.telegram.ui.ActionBar.g6 g6Var, ha1 ha1Var) {
        this.d = acVar;
        this.c = context;
        this.b = j10;
        this.e = g6Var;
        this.f = ha1Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        switch (this.a) {
            case 0:
                ac acVar = (ac) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                ha1 ha1Var = (ha1) this.f;
                boolean z4 = view instanceof mg.b;
                long j10 = this.b;
                if (z4) {
                    mg.b bVar = (mg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z10 = boost.giveaway;
                    if (!z10 || boost.stars <= 0) {
                        boolean z11 = boost.gift;
                        if (((z11 || z10) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-acVar.G.id);
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
                            new hg.e1(ha1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z10 && boost.user_id == -1) {
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(ha1Var.getParentActivity(), ha1Var.getResourceProvider());
                            qbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            qbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            qbVar.b.setSingleLine(false);
                            qbVar.b.setMaxLines(2);
                            org.telegram.ui.Components.ic.g(ha1Var, qbVar, 2750).j();
                        } else if (!z11 && !z10) {
                            ha1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        mh.ja.e1(this.c, acVar.b, j10, boost, g6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.o8) {
                    hg.x.m(ha1Var, g6Var, j10, null);
                }
                if (view instanceof mg.c) {
                    hg.x.m(ha1Var, g6Var, j10, ((mg.c) view).getPrepaidGiveaway());
                }
                if (((zb) acVar.x.get(i10)).a == 9) {
                    acVar.c(Boolean.valueOf(acVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.e70.M((org.telegram.ui.Components.e70) this.d, this.b, (org.telegram.ui.ActionBar.p2) this.e, (a0.h) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ tb(org.telegram.ui.Components.e70 e70Var, long j10, org.telegram.ui.ActionBar.p2 p2Var, a0.h hVar, Context context) {
        this.d = e70Var;
        this.b = j10;
        this.e = p2Var;
        this.f = hVar;
        this.c = context;
    }
}
