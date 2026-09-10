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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xb(ec ecVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, fb1 fb1Var) {
        this.d = ecVar;
        this.c = context;
        this.b = j3;
        this.e = f6Var;
        this.f = fb1Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                ec ecVar = (ec) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                fb1 fb1Var = (fb1) this.f;
                boolean z10 = view instanceof xg.b;
                long j3 = this.b;
                if (z10) {
                    xg.b bVar = (xg.b) view;
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
                            new sg.c0(fb1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(fb1Var.getParentActivity(), fb1Var.getResourceProvider());
                            xbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            xbVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            xbVar.b.setSingleLine(false);
                            xbVar.b.setMaxLines(2);
                            org.telegram.ui.Components.pc.g(fb1Var, xbVar, 2750).j();
                        } else if (!z12 && !z11) {
                            fb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        xh.z7.e1(this.c, ecVar.b, j3, boost, f6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.s8) {
                    sg.m.m(fb1Var, f6Var, j3, null);
                }
                if (view instanceof xg.c) {
                    sg.m.m(fb1Var, f6Var, j3, ((xg.c) view).getPrepaidGiveaway());
                }
                if (((dc) ecVar.x.get(i10)).a == 9) {
                    ecVar.c(Boolean.valueOf(ecVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.k70.M((org.telegram.ui.Components.k70) this.d, this.b, (org.telegram.ui.ActionBar.p2) this.e, (a0.i) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ xb(org.telegram.ui.Components.k70 k70Var, long j3, org.telegram.ui.ActionBar.p2 p2Var, a0.i iVar, Context context) {
        this.d = k70Var;
        this.b = j3;
        this.e = p2Var;
        this.f = iVar;
        this.c = context;
    }
}
