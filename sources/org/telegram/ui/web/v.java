package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sj0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ a1 c;
    public final /* synthetic */ String d;

    public /* synthetic */ v(c1 c1Var, a1 a1Var, String str, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = a1Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        sj0 sj0Var;
        int i11 = this.a;
        String str = this.d;
        a1 a1Var = this.c;
        c1 c1Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c1 c1Var2 = this.b;
                f6 f6Var = c1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) yf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                a1 a1Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new wc(c1Var2, f6Var).c0("UNKNOWN_BUTTON", false);
                        c1Var2.z(a1Var2, "requested_chat_failed", c1.B(str2, "req_id"));
                        break;
                    } else {
                        new wc(c1Var2, f6Var).d0(tL_error, false);
                        c1Var2.z(a1Var2, "requested_chat_failed", c1.B(str2, "req_id"));
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
                            c0 c0Var = new c0(c1Var2, zArr, str2, tL_buttonTypeRequestPeer, a1Var2);
                            sj0 sj0Var2 = sj0.u0;
                            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                            if (R == null) {
                                sj0Var = null;
                            } else {
                                sj0Var = sj0.u0;
                                if (sj0Var == null) {
                                    sj0 sj0Var3 = new sj0(R, i10, bool, bool2, c0Var);
                                    sj0Var3.show();
                                    sj0.u0 = sj0Var3;
                                    sj0Var = sj0Var3;
                                }
                            }
                            if (sj0Var != null) {
                                sj0Var.setOnDismissListener(new d0(c1Var2, zArr, a1Var2, str2));
                                break;
                            }
                        } else {
                            Bundle e = org.telegram.messenger.a2.e(15, "onlySelect", "dialogsType", true);
                            e.putLong("requestPeerBotId", c1Var2.U.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            boolean[] zArr2 = new boolean[1];
                            g0 g0Var = new g0(c1Var2, e, zArr2, a1Var2);
                            g0Var.C2 = new c0(c1Var2, zArr2, str2, tL_buttonTypeRequestPeer, a1Var2);
                            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                            if (U != null) {
                                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                                n2Var.a = true;
                                U.showAsSheet(g0Var, n2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = c1Var2.getContext();
                        int i12 = c1Var2.M;
                        TLRPC.User user = c1Var2.U;
                        gg.u1 u1Var = new gg.u1(c1Var2, a1Var2, str2, tL_buttonTypeRequestPeer, 11);
                        f6 f6Var2 = c1Var2.e;
                        ir.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, u1Var, f6Var2, new wc(c1Var2, f6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                f6 f6Var3 = c1Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new wc(c1Var, f6Var3).c0("UNKNOWN_BUTTON", false);
                        c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    } else {
                        new wc(c1Var, f6Var3).d0(tL_error2, false);
                        c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates, false);
                    c1Var.z(a1Var, "requested_chat_sent", c1.B(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = c1Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new wc(c1Var, f6Var4).c0("UNKNOWN_BUTTON", false);
                        c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    } else {
                        new wc(c1Var, f6Var4).d0(tL_error3, false);
                        c1Var.z(a1Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(c1Var.M).processUpdates(updates2, false);
                    c1Var.z(a1Var, "requested_chat_sent", c1.B(str, "req_id"));
                    break;
                }
        }
    }
}
