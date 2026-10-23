package org.telegram.ui.web;

import ai.w7;
import android.content.Context;
import android.os.Bundle;
import ci.z2;
import ci.z7;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.nk;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ z7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ v(a1 a1Var, z7 z7Var, String str, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = z7Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        bj0 bj0Var;
        int i11 = this.a;
        String str = this.d;
        z7 z7Var = this.c;
        a1 a1Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a1 a1Var2 = this.b;
                d6 d6Var = a1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ag.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                z7 z7Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new xc(a1Var2, d6Var).e0("UNKNOWN_BUTTON", false);
                        a1Var2.x(z7Var2, "requested_chat_failed", a1.A(str2, "req_id"));
                        break;
                    } else {
                        new xc(a1Var2, d6Var).f0(tL_error, false);
                        a1Var2.x(z7Var2, "requested_chat_failed", a1.A(str2, "req_id"));
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
                            c0 c0Var = new c0(a1Var2, zArr, str2, tL_buttonTypeRequestPeer, z7Var2);
                            bj0 bj0Var2 = bj0.u0;
                            n2 R = LaunchActivity.R();
                            if (R == null) {
                                bj0Var = null;
                            } else {
                                bj0Var = bj0.u0;
                                if (bj0Var == null) {
                                    bj0 bj0Var3 = new bj0(R, i10, bool, bool2, c0Var);
                                    bj0Var3.show();
                                    bj0.u0 = bj0Var3;
                                    bj0Var = bj0Var3;
                                }
                            }
                            if (bj0Var != null) {
                                bj0Var.setOnDismissListener(new w7(a1Var2, zArr, z7Var2, str2));
                                break;
                            }
                        } else {
                            Bundle d = nk.d(15, "onlySelect", "dialogsType", true);
                            d.putLong("requestPeerBotId", a1Var2.U.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                d.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            boolean[] zArr2 = new boolean[1];
                            f0 f0Var = new f0(a1Var2, d, zArr2, z7Var2);
                            f0Var.C2 = new c0(a1Var2, zArr2, str2, tL_buttonTypeRequestPeer, z7Var2);
                            n2 U = LaunchActivity.U();
                            if (U != null) {
                                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                                l2Var.a = true;
                                U.showAsSheet(f0Var, l2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = a1Var2.getContext();
                        int i12 = a1Var2.M;
                        TLRPC.User user = a1Var2.U;
                        z2 z2Var = new z2(a1Var2, z7Var2, str2, tL_buttonTypeRequestPeer, 14);
                        d6 d6Var2 = a1Var2.e;
                        nr.e(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, z2Var, d6Var2, new xc(a1Var2, d6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d6 d6Var3 = a1Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new xc(a1Var, d6Var3).e0("UNKNOWN_BUTTON", false);
                        a1Var.x(z7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    } else {
                        new xc(a1Var, d6Var3).f0(tL_error2, false);
                        a1Var.x(z7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$377(updates, false);
                    a1Var.x(z7Var, "requested_chat_sent", a1.A(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                d6 d6Var4 = a1Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new xc(a1Var, d6Var4).e0("UNKNOWN_BUTTON", false);
                        a1Var.x(z7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    } else {
                        new xc(a1Var, d6Var4).f0(tL_error3, false);
                        a1Var.x(z7Var, "requested_chat_failed", a1.A(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$377(updates2, false);
                    a1Var.x(z7Var, "requested_chat_sent", a1.A(str, "req_id"));
                    break;
                }
        }
    }
}
