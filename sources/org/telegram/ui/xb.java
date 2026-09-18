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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xb(ec ecVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, ab1 ab1Var) {
        this.d = ecVar;
        this.c = context;
        this.b = j3;
        this.e = f6Var;
        this.f = ab1Var;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                ec ecVar = (ec) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                ab1 ab1Var = (ab1) this.f;
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
                            new tg.d0(ab1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(ab1Var.getParentActivity(), ab1Var.getResourceProvider());
                            wbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            wbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            wbVar.b.setSingleLine(false);
                            wbVar.b.setMaxLines(2);
                            org.telegram.ui.Components.oc.g(ab1Var, wbVar, 2750).j();
                        } else if (!z12 && !z11) {
                            ab1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        yh.y7.e1(this.c, ecVar.b, j3, boost, f6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tg.o.m(ab1Var, f6Var, j3, null);
                }
                if (view instanceof yg.c) {
                    tg.o.m(ab1Var, f6Var, j3, ((yg.c) view).getPrepaidGiveaway());
                }
                if (((dc) ecVar.x.get(i10)).a == 9) {
                    ecVar.c(Boolean.valueOf(ecVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.b70.M((org.telegram.ui.Components.b70) this.d, this.b, (org.telegram.ui.ActionBar.o2) this.e, (a0.i) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ xb(org.telegram.ui.Components.b70 b70Var, long j3, org.telegram.ui.ActionBar.o2 o2Var, a0.i iVar, Context context) {
        this.d = b70Var;
        this.b = j3;
        this.e = o2Var;
        this.f = iVar;
        this.c = context;
    }
}
