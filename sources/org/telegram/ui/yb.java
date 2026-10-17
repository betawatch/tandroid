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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yb implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yb(ec ecVar, Context context, long j10, org.telegram.ui.ActionBar.d6 d6Var, r91 r91Var) {
        this.d = ecVar;
        this.c = context;
        this.b = j10;
        this.e = d6Var;
        this.f = r91Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                ec ecVar = (ec) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                r91 r91Var = (r91) this.f;
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
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-ecVar.J.id);
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
                            new ug.a0(r91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(r91Var.getParentActivity(), r91Var.getResourceProvider());
                            ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            ybVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            org.telegram.ui.Components.qc.g(r91Var, ybVar, 2750).j();
                        } else if (!z12 && !z11) {
                            r91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        ai.ld.f1(this.c, ecVar.b, j10, boost, d6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ug.l.n(r91Var, d6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.l.n(r91Var, d6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((dc) ecVar.x.get(i10)).a == 9) {
                    ecVar.c(Boolean.valueOf(ecVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.v70.N((org.telegram.ui.Components.v70) this.d, this.b, (org.telegram.ui.ActionBar.n2) this.e, (a0.h) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ yb(org.telegram.ui.Components.v70 v70Var, long j10, org.telegram.ui.ActionBar.n2 n2Var, a0.h hVar, Context context) {
        this.d = v70Var;
        this.b = j10;
        this.e = n2Var;
        this.f = hVar;
        this.c = context;
    }
}
