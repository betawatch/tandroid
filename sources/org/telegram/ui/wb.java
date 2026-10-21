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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wb implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wb(cc ccVar, Context context, long j10, org.telegram.ui.ActionBar.d6 d6Var, p91 p91Var) {
        this.d = ccVar;
        this.c = context;
        this.b = j10;
        this.e = d6Var;
        this.f = p91Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                cc ccVar = (cc) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                p91 p91Var = (p91) this.f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.b;
                if (z10) {
                    zg.b bVar = (zg.b) view;
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
                            new ug.b0(p91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(p91Var.getParentActivity(), p91Var.getResourceProvider());
                            ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            ybVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            org.telegram.ui.Components.qc.g(p91Var, ybVar, 2750).j();
                        } else if (!z12 && !z11) {
                            p91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        ai.md.f1(this.c, ccVar.b, j10, boost, d6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ug.m.n(p91Var, d6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.m.n(p91Var, d6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((bc) ccVar.x.get(i10)).a == 9) {
                    ccVar.c(Boolean.valueOf(ccVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.v70.N((org.telegram.ui.Components.v70) this.d, this.b, (org.telegram.ui.ActionBar.n2) this.e, (a0.h) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ wb(org.telegram.ui.Components.v70 v70Var, long j10, org.telegram.ui.ActionBar.n2 n2Var, a0.h hVar, Context context) {
        this.d = v70Var;
        this.b = j10;
        this.e = n2Var;
        this.f = hVar;
        this.c = context;
    }
}
