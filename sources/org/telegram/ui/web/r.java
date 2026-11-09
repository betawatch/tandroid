package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.s7;
import di.p7;
import di.s2;
import org.telegram.messenger.a8;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sg0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ p7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ r(x0 x0Var, p7 p7Var, String str, int i7) {
        this.a = i7;
        this.b = x0Var;
        this.c = p7Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7;
        sg0 sg0Var;
        int i10 = this.a;
        String str = this.d;
        p7 p7Var = this.c;
        x0 x0Var = this.b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x0 x0Var2 = this.b;
                g6 g6Var = x0Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                p7 p7Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new hc(x0Var2, g6Var).e0("UNKNOWN_BUTTON", false);
                        x0Var2.x(p7Var2, "requested_chat_failed", x0.A(str2, "req_id"));
                        break;
                    } else {
                        new hc(x0Var2, g6Var).f0(tL_error, false);
                        x0Var2.x(p7Var2, "requested_chat_failed", x0.A(str2, "req_id"));
                        break;
                    }
                } else {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            boolean[] zArr = new boolean[1];
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            y yVar = new y(x0Var2, zArr, str2, tL_buttonTypeRequestPeer, p7Var2);
                            sg0 sg0Var2 = sg0.m2;
                            f2 Q = LaunchActivity.Q();
                            if (Q == null) {
                                sg0Var = null;
                            } else {
                                sg0Var = sg0.m2;
                                if (sg0Var == null) {
                                    sg0 sg0Var3 = new sg0(Q, i7, bool, bool2, yVar);
                                    sg0Var3.show();
                                    sg0.m2 = sg0Var3;
                                    sg0Var = sg0Var3;
                                }
                            }
                            if (sg0Var != null) {
                                sg0Var.setOnDismissListener(new s7(x0Var2, zArr, p7Var2, str2));
                                break;
                            }
                        } else {
                            Bundle h = org.telegram.ui.Cells.f1.h(15, "onlySelect", "dialogsType", true);
                            h.putLong("requestPeerBotId", x0Var2.U.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                h.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            boolean[] zArr2 = new boolean[1];
                            c0 c0Var = new c0(x0Var2, h, zArr2, p7Var2);
                            c0Var.D2 = new y(x0Var2, zArr2, str2, tL_buttonTypeRequestPeer, p7Var2);
                            f2 T = LaunchActivity.T();
                            if (T != null) {
                                d2 d2Var = new d2();
                                d2Var.a = true;
                                T.showAsSheet(c0Var, d2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = x0Var2.getContext();
                        int i11 = x0Var2.M;
                        TLRPC.User user = x0Var2.U;
                        s2 s2Var = new s2(x0Var2, p7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        g6 g6Var2 = x0Var2.e;
                        lq.e(context, i11, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, s2Var, g6Var2, new hc(x0Var2, g6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                g6 g6Var3 = x0Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new hc(x0Var, g6Var3).e0("UNKNOWN_BUTTON", false);
                        x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                        break;
                    } else {
                        new hc(x0Var, g6Var3).f0(tL_error2, false);
                        x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                        break;
                    }
                } else {
                    qp.s1(x0Var.M).O3(updates, false);
                    x0Var.x(p7Var, "requested_chat_sent", x0.A(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                g6 g6Var4 = x0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new hc(x0Var, g6Var4).e0("UNKNOWN_BUTTON", false);
                        x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                        break;
                    } else {
                        new hc(x0Var, g6Var4).f0(tL_error3, false);
                        x0Var.x(p7Var, "requested_chat_failed", x0.A(str, "req_id"));
                        break;
                    }
                } else {
                    qp.s1(x0Var.M).O3(updates2, false);
                    x0Var.x(p7Var, "requested_chat_sent", x0.A(str, "req_id"));
                    break;
                }
        }
    }
}
