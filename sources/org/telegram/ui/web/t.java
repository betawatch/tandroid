package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import ci.t6;
import ei.p7;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;
    public final /* synthetic */ p7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ t(w0 w0Var, p7 p7Var, String str, int i3) {
        this.a = i3;
        this.b = w0Var;
        this.c = p7Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3;
        kg0 kg0Var;
        int i10 = this.a;
        String str = this.d;
        p7 p7Var = this.c;
        w0 w0Var = this.b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w0 w0Var2 = this.b;
                e6 e6Var = w0Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) dg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                p7 p7Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new fc(w0Var2, e6Var).e0("UNKNOWN_BUTTON", false);
                        w0Var2.x(p7Var2, "requested_chat_failed", w0.A(str2, "req_id"));
                        break;
                    } else {
                        new fc(w0Var2, e6Var).f0(tL_error, false);
                        w0Var2.x(p7Var2, "requested_chat_failed", w0.A(str2, "req_id"));
                        break;
                    }
                } else {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i3 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            boolean[] zArr = new boolean[1];
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            z zVar = new z(w0Var2, zArr, str2, tL_buttonTypeRequestPeer, p7Var2);
                            kg0 kg0Var2 = kg0.n2;
                            d2 Q = LaunchActivity.Q();
                            if (Q == null) {
                                kg0Var = null;
                            } else {
                                kg0Var = kg0.n2;
                                if (kg0Var == null) {
                                    kg0 kg0Var3 = new kg0(Q, i3, bool, bool2, zVar);
                                    kg0Var3.show();
                                    kg0.n2 = kg0Var3;
                                    kg0Var = kg0Var3;
                                }
                            }
                            if (kg0Var != null) {
                                kg0Var.setOnDismissListener(new t6(w0Var2, zArr, p7Var2, str2));
                                break;
                            }
                        } else {
                            Bundle l10 = org.telegram.ui.Cells.f1.l(15, "onlySelect", "dialogsType", true);
                            l10.putLong("requestPeerBotId", w0Var2.V.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                l10.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                            boolean[] zArr2 = new boolean[1];
                            c0 c0Var = new c0(w0Var2, l10, zArr2, p7Var2);
                            c0Var.D2 = new z(w0Var2, zArr2, str2, tL_buttonTypeRequestPeer, p7Var2);
                            d2 T = LaunchActivity.T();
                            if (T != null) {
                                b2 b2Var = new b2();
                                b2Var.a = true;
                                T.showAsSheet(c0Var, b2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = w0Var2.getContext();
                        int i11 = w0Var2.N;
                        TLRPC.User user = w0Var2.V;
                        ai.v1 v1Var = new ai.v1(w0Var2, p7Var2, str2, tL_buttonTypeRequestPeer, 15);
                        e6 e6Var2 = w0Var2.e;
                        lq.e(context, i11, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, v1Var, e6Var2, new fc(w0Var2, e6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                e6 e6Var3 = w0Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new fc(w0Var, e6Var3).e0("UNKNOWN_BUTTON", false);
                        w0Var.x(p7Var, "requested_chat_failed", w0.A(str, "req_id"));
                        break;
                    } else {
                        new fc(w0Var, e6Var3).f0(tL_error2, false);
                        w0Var.x(p7Var, "requested_chat_failed", w0.A(str, "req_id"));
                        break;
                    }
                } else {
                    hp.s1(w0Var.N).O3(updates, false);
                    w0Var.x(p7Var, "requested_chat_sent", w0.A(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                e6 e6Var4 = w0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new fc(w0Var, e6Var4).e0("UNKNOWN_BUTTON", false);
                        w0Var.x(p7Var, "requested_chat_failed", w0.A(str, "req_id"));
                        break;
                    } else {
                        new fc(w0Var, e6Var4).f0(tL_error3, false);
                        w0Var.x(p7Var, "requested_chat_failed", w0.A(str, "req_id"));
                        break;
                    }
                } else {
                    hp.s1(w0Var.N).O3(updates2, false);
                    w0Var.x(p7Var, "requested_chat_sent", w0.A(str, "req_id"));
                    break;
                }
        }
    }
}
