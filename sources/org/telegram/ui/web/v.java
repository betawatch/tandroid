package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import bi.s7;
import di.x7;
import di.y2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ej0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ x7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ v(a1 a1Var, x7 x7Var, String str, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = x7Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        ej0 ej0Var;
        int i11 = this.a;
        String str = this.d;
        x7 x7Var = this.c;
        a1 a1Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a1 a1Var2 = this.b;
                u6 u6Var = a1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) bg.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                x7 x7Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new wc(a1Var2, u6Var).f0("UNKNOWN_BUTTON", false);
                        a1Var2.x(x7Var2, "requested_chat_failed", a1.A(str2, "req_id"));
                        break;
                    } else {
                        new wc(a1Var2, u6Var).g0(tL_error, false);
                        a1Var2.x(x7Var2, "requested_chat_failed", a1.A(str2, "req_id"));
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
                            c0 c0Var = new c0(a1Var2, zArr, str2, tL_buttonTypeRequestPeer, x7Var2);
                            ej0 ej0Var2 = ej0.u0;
                            r2 R = LaunchActivity.R();
                            if (R == null) {
                                ej0Var = null;
                            } else {
                                ej0Var = ej0.u0;
                                if (ej0Var == null) {
                                    ej0 ej0Var3 = new ej0(R, i10, bool, bool2, c0Var);
                                    ej0Var3.show();
                                    ej0.u0 = ej0Var3;
                                    ej0Var = ej0Var3;
                                }
                            }
                            if (ej0Var != null) {
                                ej0Var.setOnDismissListener(new s7(a1Var2, zArr, x7Var2, str2));
                                break;
                            }
                        } else {
                            Bundle c10 = wh.c(15, "onlySelect", "dialogsType", true);
                            c10.putLong("requestPeerBotId", a1Var2.U.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                c10.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            boolean[] zArr2 = new boolean[1];
                            f0 f0Var = new f0(a1Var2, c10, zArr2, x7Var2);
                            f0Var.C2 = new c0(a1Var2, zArr2, str2, tL_buttonTypeRequestPeer, x7Var2);
                            r2 U = LaunchActivity.U();
                            if (U != null) {
                                p2 p2Var = new p2();
                                p2Var.a = true;
                                U.showAsSheet(f0Var, p2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = a1Var2.getContext();
                        int i12 = a1Var2.M;
                        TLRPC.User user = a1Var2.U;
                        y2 y2Var = new y2(a1Var2, x7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        u6 u6Var2 = a1Var2.e;
                        pr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, y2Var, u6Var2, new wc(a1Var2, u6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                u6 u6Var3 = a1Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new wc(a1Var, u6Var3).f0("UNKNOWN_BUTTON", false);
                        a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    } else {
                        new wc(a1Var, u6Var3).g0(tL_error2, false);
                        a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$379(updates, false);
                    a1Var.x(x7Var, "requested_chat_sent", a1.A(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u6 u6Var4 = a1Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new wc(a1Var, u6Var4).f0("UNKNOWN_BUTTON", false);
                        a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    } else {
                        new wc(a1Var, u6Var4).g0(tL_error3, false);
                        a1Var.x(x7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$379(updates2, false);
                    a1Var.x(x7Var, "requested_chat_sent", a1.A(str, "req_id"));
                    break;
                }
        }
    }
}
