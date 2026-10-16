package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.n9;
import bi.u3;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gl0;
import org.telegram.ui.wj0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ n9 c;
    public final /* synthetic */ String d;

    public /* synthetic */ u(c1 c1Var, n9 n9Var, String str, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = n9Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        wj0 wj0Var;
        int i11 = this.a;
        String str = this.d;
        n9 n9Var = this.c;
        c1 c1Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c1 c1Var2 = this.b;
                c6 c6Var = c1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ag.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                n9 n9Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new zc(c1Var2, c6Var).e0("UNKNOWN_BUTTON", false);
                        c1Var2.x(n9Var2, "requested_chat_failed", c1.A(str2, "req_id"));
                        break;
                    } else {
                        new zc(c1Var2, c6Var).f0(tL_error, false);
                        c1Var2.x(n9Var2, "requested_chat_failed", c1.A(str2, "req_id"));
                        break;
                    }
                } else {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            boolean[] zArr = new boolean[1];
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            c0 c0Var = new c0(c1Var2, zArr, str2, tL_buttonTypeRequestPeer, n9Var2);
                            wj0 wj0Var2 = wj0.u0;
                            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                            if (R == null) {
                                wj0Var = null;
                            } else {
                                wj0Var = wj0.u0;
                                if (wj0Var == null) {
                                    wj0 wj0Var3 = new wj0(R, i10, bool, bool2, c0Var);
                                    wj0Var3.show();
                                    wj0.u0 = wj0Var3;
                                    wj0Var = wj0Var3;
                                }
                            }
                            if (wj0Var != null) {
                                wj0Var.setOnDismissListener(new gl0(c1Var2, zArr, n9Var2, str2));
                                break;
                            }
                        } else {
                            Bundle d = sk.d(15, "onlySelect", "dialogsType", true);
                            d.putLong("requestPeerBotId", c1Var2.U.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                d.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            boolean[] zArr2 = new boolean[1];
                            g0 g0Var = new g0(c1Var2, d, zArr2, n9Var2);
                            g0Var.C2 = new c0(c1Var2, zArr2, str2, tL_buttonTypeRequestPeer, n9Var2);
                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                            if (U != null) {
                                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                                k2Var.a = true;
                                U.showAsSheet(g0Var, k2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = c1Var2.getContext();
                        int i12 = c1Var2.M;
                        TLRPC.User user = c1Var2.U;
                        u3 u3Var = new u3(c1Var2, n9Var2, str2, tL_buttonTypeRequestPeer, 14);
                        c6 c6Var2 = c1Var2.e;
                        qr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, u3Var, c6Var2, new zc(c1Var2, c6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c6 c6Var3 = c1Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new zc(c1Var, c6Var3).e0("UNKNOWN_BUTTON", false);
                        c1Var.x(n9Var, "requested_chat_failed", c1.A(str, "req_id"));
                        break;
                    } else {
                        new zc(c1Var, c6Var3).f0(tL_error2, false);
                        c1Var.x(n9Var, "requested_chat_failed", c1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(c1Var.M).lambda$processUpdates$377(updates, false);
                    c1Var.x(n9Var, "requested_chat_sent", c1.A(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c6 c6Var4 = c1Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new zc(c1Var, c6Var4).e0("UNKNOWN_BUTTON", false);
                        c1Var.x(n9Var, "requested_chat_failed", c1.A(str, "req_id"));
                        break;
                    } else {
                        new zc(c1Var, c6Var4).f0(tL_error3, false);
                        c1Var.x(n9Var, "requested_chat_failed", c1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(c1Var.M).lambda$processUpdates$377(updates2, false);
                    c1Var.x(n9Var, "requested_chat_sent", c1.A(str, "req_id"));
                    break;
                }
        }
    }
}
