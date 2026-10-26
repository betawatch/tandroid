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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements org.telegram.ui.Components.zl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xb(dc dcVar, Context context, long j10, org.telegram.ui.ActionBar.u6 u6Var, w91 w91Var) {
        this.d = dcVar;
        this.c = context;
        this.b = j10;
        this.e = u6Var;
        this.f = w91Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                dc dcVar = (dc) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                w91 w91Var = (w91) this.f;
                boolean z10 = view instanceof ah.b;
                long j10 = this.b;
                if (z10) {
                    ah.b bVar = (ah.b) view;
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
                            new vg.c0(w91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(w91Var.getParentActivity(), w91Var.getResourceProvider());
                            ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            ybVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            org.telegram.ui.Components.qc.g(w91Var, ybVar, 2750).j();
                        } else if (!z12 && !z11) {
                            w91Var.presentFragment(ProfileActivity.t4(bVar.getDialogId()));
                        }
                    } else {
                        bi.dd.d1(this.c, dcVar.b, j10, boost, u6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.v8) {
                    vg.n.m(w91Var, u6Var, j10, null);
                }
                if (view instanceof ah.c) {
                    vg.n.m(w91Var, u6Var, j10, ((ah.c) view).getPrepaidGiveaway());
                }
                if (((cc) dcVar.x.get(i10)).a == 9) {
                    dcVar.c(Boolean.valueOf(dcVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.y70.M((org.telegram.ui.Components.y70) this.d, this.b, (org.telegram.ui.ActionBar.r2) this.e, (a0.h) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ xb(org.telegram.ui.Components.y70 y70Var, long j10, org.telegram.ui.ActionBar.r2 r2Var, a0.h hVar, Context context) {
        this.d = y70Var;
        this.b = j10;
        this.e = r2Var;
        this.f = hVar;
        this.c = context;
    }
}
