package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wf(Object obj, int i3, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = tLObject;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i3 = this.a;
        int i10 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.p1((wm) obj4, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 12));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ly lyVar = (ly) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.E1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.hp.s1(launchActivity.P).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new ly(15, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new ai.p1(launchActivity, lyVar, tL_error, updates, this.b, 21));
                break;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.fc.a0(passkeysActivity).f0(tL_error2, false);
                        arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                        passkeysActivity.a.g3.O(true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.fc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.b8 b8Var = (org.telegram.ui.Wallet.b8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                b8Var.g1 = 0;
                if (cardVar2 == null) {
                    if (cardVar != null) {
                        org.telegram.ui.Wallet.b8.e0(i10, cardVar);
                    }
                    if (!b8Var.b1) {
                        if (tL_error3 != null) {
                            org.telegram.ui.Components.fc.a0(b8Var.a).f0(tL_error3, false);
                        }
                        b8Var.e1 = false;
                        TL_wallet.card cardVar3 = b8Var.c1;
                        if (cardVar3 != null) {
                            b8Var.d(cardVar3);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.b8.e0(i10, cardVar2);
                    if (!b8Var.b1) {
                        if (!b8Var.e1) {
                            b8Var.d(cardVar2);
                            break;
                        } else {
                            b8Var.c1 = cardVar2;
                            b8Var.d1 = org.telegram.ui.Wallet.b8.T(cardVar2);
                            b8Var.Q();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ wf(LaunchActivity launchActivity, ly lyVar, int i3) {
        this.a = 1;
        this.c = launchActivity;
        this.d = lyVar;
        this.b = i3;
    }
}
