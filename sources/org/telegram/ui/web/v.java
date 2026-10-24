package org.telegram.ui.web;

import ai.w7;
import android.content.Context;
import android.os.Bundle;
import ci.y2;
import ci.y7;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fj0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ y7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ v(b1 b1Var, y7 y7Var, String str, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = y7Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        fj0 fj0Var;
        int i11 = this.a;
        String str = this.d;
        y7 y7Var = this.c;
        b1 b1Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                b1 b1Var2 = this.b;
                g6 g6Var = b1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ag.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                y7 y7Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new xc(b1Var2, g6Var).e0("UNKNOWN_BUTTON", false);
                        b1Var2.x(y7Var2, "requested_chat_failed", b1.A(str2, "req_id"));
                        break;
                    } else {
                        new xc(b1Var2, g6Var).f0(tL_error, false);
                        b1Var2.x(y7Var2, "requested_chat_failed", b1.A(str2, "req_id"));
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
                            c0 c0Var = new c0(b1Var2, zArr, str2, tL_buttonTypeRequestPeer, y7Var2);
                            fj0 fj0Var2 = fj0.u0;
                            o2 R = LaunchActivity.R();
                            if (R == null) {
                                fj0Var = null;
                            } else {
                                fj0Var = fj0.u0;
                                if (fj0Var == null) {
                                    fj0 fj0Var3 = new fj0(R, i10, bool, bool2, c0Var);
                                    fj0Var3.show();
                                    fj0.u0 = fj0Var3;
                                    fj0Var = fj0Var3;
                                }
                            }
                            if (fj0Var != null) {
                                fj0Var.setOnDismissListener(new w7(b1Var2, zArr, y7Var2, str2));
                                break;
                            }
                        } else {
                            Bundle e = org.telegram.messenger.v0.e(15, "onlySelect", "dialogsType", true);
                            e.putLong("requestPeerBotId", b1Var2.U.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            boolean[] zArr2 = new boolean[1];
                            g0 g0Var = new g0(b1Var2, e, zArr2, y7Var2);
                            g0Var.C2 = new c0(b1Var2, zArr2, str2, tL_buttonTypeRequestPeer, y7Var2);
                            o2 U = LaunchActivity.U();
                            if (U != null) {
                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                m2Var.a = true;
                                U.showAsSheet(g0Var, m2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = b1Var2.getContext();
                        int i12 = b1Var2.M;
                        TLRPC.User user = b1Var2.U;
                        y2 y2Var = new y2(b1Var2, y7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        g6 g6Var2 = b1Var2.e;
                        nr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, y2Var, g6Var2, new xc(b1Var2, g6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                g6 g6Var3 = b1Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new xc(b1Var, g6Var3).e0("UNKNOWN_BUTTON", false);
                        b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                        break;
                    } else {
                        new xc(b1Var, g6Var3).f0(tL_error2, false);
                        b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(y7Var, "requested_chat_sent", b1.A(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                g6 g6Var4 = b1Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new xc(b1Var, g6Var4).e0("UNKNOWN_BUTTON", false);
                        b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                        break;
                    } else {
                        new xc(b1Var, g6Var4).f0(tL_error3, false);
                        b1Var.x(y7Var, "requested_chat_failed", b1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates2, false);
                    b1Var.x(y7Var, "requested_chat_sent", b1.A(str, "req_id"));
                    break;
                }
        }
    }
}
