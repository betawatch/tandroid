package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xf(Object obj, int i7, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = tLObject;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i7 = this.a;
        int i10 = this.b;
        int i11 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.g1((bn) obj4, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 12));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                o60 o60Var = (o60) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.C1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.mp.u1(launchActivity.P).V3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new o60(i11, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.g3(new ai.g1(launchActivity, o60Var, tL_error, updates, this.b, 21));
                break;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.lc.b0(passkeysActivity).g0(tL_error2, false);
                        arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                        passkeysActivity.a.g3.O(true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.lc.b0(passkeysActivity).f0("FALSE", false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                r8Var.g1 = 0;
                if (cardVar2 == null) {
                    if (cardVar != null) {
                        org.telegram.ui.Wallet.r8.e0(i10, cardVar);
                    }
                    if (!r8Var.b1) {
                        if (tL_error3 != null) {
                            org.telegram.ui.Components.lc.b0(r8Var.a).g0(tL_error3, false);
                        }
                        if (tL_error3 != null && "WALLET_NFT_NOT_OWNED".equals(tL_error3.text)) {
                            r8Var.E1 = true;
                            org.telegram.ui.Wallet.u0.D(i10).B().e();
                        }
                        r8Var.e1 = false;
                        TL_wallet.card cardVar3 = r8Var.c1;
                        if (cardVar3 != null) {
                            r8Var.d(cardVar3);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.r8.e0(i10, cardVar2);
                    if (!r8Var.b1) {
                        if (!r8Var.e1) {
                            r8Var.d(cardVar2);
                            break;
                        } else {
                            r8Var.c1 = cardVar2;
                            r8Var.d1 = org.telegram.ui.Wallet.r8.T(cardVar2);
                            r8Var.Q();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ xf(LaunchActivity launchActivity, o60 o60Var, int i7) {
        this.a = 1;
        this.c = launchActivity;
        this.d = o60Var;
        this.b = i7;
    }
}
