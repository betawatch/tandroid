package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import di.k6;
import fi.i7;
import org.telegram.messenger.a8;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.sq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ i7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ s(v0 v0Var, i7 i7Var, String str, int i7) {
        this.a = i7;
        this.b = v0Var;
        this.c = i7Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7;
        qg0 qg0Var;
        int i10 = this.a;
        String str = this.d;
        i7 i7Var = this.c;
        v0 v0Var = this.b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v0 v0Var2 = this.b;
                e6 e6Var = v0Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                i7 i7Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new cc(v0Var2, e6Var).e0("UNKNOWN_BUTTON", false);
                        v0Var2.x(i7Var2, "requested_chat_failed", v0.A(str2, "req_id"));
                        break;
                    } else {
                        new cc(v0Var2, e6Var).f0(tL_error, false);
                        v0Var2.x(i7Var2, "requested_chat_failed", v0.A(str2, "req_id"));
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
                            y yVar = new y(v0Var2, zArr, str2, tL_buttonTypeRequestPeer, i7Var2);
                            qg0 qg0Var2 = qg0.q2;
                            e2 Q = LaunchActivity.Q();
                            if (Q == null) {
                                qg0Var = null;
                            } else {
                                qg0Var = qg0.q2;
                                if (qg0Var == null) {
                                    qg0 qg0Var3 = new qg0(Q, i7, bool, bool2, yVar);
                                    qg0Var3.show();
                                    qg0.q2 = qg0Var3;
                                    qg0Var = qg0Var3;
                                }
                            }
                            if (qg0Var != null) {
                                qg0Var.setOnDismissListener(new k6(v0Var2, zArr, i7Var2, str2));
                                break;
                            }
                        } else {
                            Bundle j3 = org.telegram.ui.Cells.y0.j(15, "onlySelect", "dialogsType", true);
                            j3.putLong("requestPeerBotId", v0Var2.V.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                j3.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            boolean[] zArr2 = new boolean[1];
                            b0 b0Var = new b0(v0Var2, j3, zArr2, i7Var2);
                            b0Var.E2 = new y(v0Var2, zArr2, str2, tL_buttonTypeRequestPeer, i7Var2);
                            e2 T = LaunchActivity.T();
                            if (T != null) {
                                c2 c2Var = new c2();
                                c2Var.a = true;
                                T.showAsSheet(b0Var, c2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = v0Var2.getContext();
                        int i11 = v0Var2.N;
                        TLRPC.User user = v0Var2.V;
                        bi.o1 o1Var = new bi.o1(v0Var2, i7Var2, str2, tL_buttonTypeRequestPeer, 15);
                        e6 e6Var2 = v0Var2.e;
                        sq.e(context, i11, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, o1Var, e6Var2, new cc(v0Var2, e6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e6 e6Var3 = v0Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new cc(v0Var, e6Var3).e0("UNKNOWN_BUTTON", false);
                        v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                        break;
                    } else {
                        new cc(v0Var, e6Var3).f0(tL_error2, false);
                        v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                        break;
                    }
                } else {
                    np.s1(v0Var.N).O3(updates, false);
                    v0Var.x(i7Var, "requested_chat_sent", v0.A(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e6 e6Var4 = v0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new cc(v0Var, e6Var4).e0("UNKNOWN_BUTTON", false);
                        v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                        break;
                    } else {
                        new cc(v0Var, e6Var4).f0(tL_error3, false);
                        v0Var.x(i7Var, "requested_chat_failed", v0.A(str, "req_id"));
                        break;
                    }
                } else {
                    np.s1(v0Var.N).O3(updates2, false);
                    v0Var.x(i7Var, "requested_chat_sent", v0.A(str, "req_id"));
                    break;
                }
        }
    }
}
