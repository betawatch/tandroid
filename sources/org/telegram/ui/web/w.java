package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ij0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w(a1 a1Var, String str, int i10) {
        this.a = i10;
        this.b = a1Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        ij0 ij0Var;
        int i11 = this.a;
        String str = this.c;
        a1 a1Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g6 g6Var = a1Var.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) mf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new qc(a1Var, g6Var).c0("UNKNOWN_BUTTON", false);
                        a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                        break;
                    } else {
                        new qc(a1Var, g6Var).d0(tL_error, false);
                        a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
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
                            y yVar = new y(a1Var, zArr, str, tL_buttonTypeRequestPeer);
                            ij0 ij0Var2 = ij0.r0;
                            p2 R = LaunchActivity.R();
                            if (R == null) {
                                ij0Var = null;
                            } else {
                                ij0 ij0Var3 = ij0.r0;
                                if (ij0Var3 != null) {
                                    ij0Var = ij0Var3;
                                } else {
                                    ij0 ij0Var4 = new ij0(R, i10, bool, bool2, yVar);
                                    ij0Var4.show();
                                    ij0.r0 = ij0Var4;
                                    ij0Var = ij0Var4;
                                }
                            }
                            if (ij0Var != null) {
                                ij0Var.setOnDismissListener(new lh.i(a1Var, zArr, str, 4));
                                break;
                            }
                        } else {
                            Bundle e6 = y3.e(15, "onlySelect", "dialogsType", true);
                            e6.putLong("requestPeerBotId", a1Var.R.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e6.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            boolean[] zArr2 = new boolean[1];
                            d0 d0Var = new d0(a1Var, e6, zArr2);
                            d0Var.z2 = new y(a1Var, zArr2, str, tL_buttonTypeRequestPeer);
                            p2 U = LaunchActivity.U();
                            if (U != null) {
                                n2 n2Var = new n2();
                                n2Var.a = true;
                                U.showAsSheet(d0Var, n2Var);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType;
                        Context context = a1Var.getContext();
                        int i12 = a1Var.J;
                        TLRPC.User user = a1Var.R;
                        lh.h hVar = new lh.h(a1Var, str, tL_buttonTypeRequestPeer, 11);
                        g6 g6Var2 = a1Var.e;
                        cr.a(context, i12, user, tL_requestPeerTypeCreateBot, false, hVar, g6Var2, new qc(a1Var, g6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                g6 g6Var3 = a1Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new qc(a1Var, g6Var3).c0("UNKNOWN_BUTTON", false);
                        a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                        break;
                    } else {
                        new qc(a1Var, g6Var3).d0(tL_error2, false);
                        a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.J).processUpdates(updates, false);
                    a1Var.v("requested_chat_sent", a1.x(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                g6 g6Var4 = a1Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new qc(a1Var, g6Var4).c0("UNKNOWN_BUTTON", false);
                        a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                        break;
                    } else {
                        new qc(a1Var, g6Var4).d0(tL_error3, false);
                        a1Var.v("requested_chat_failed", a1.x(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.J).processUpdates(updates2, false);
                    a1Var.v("requested_chat_sent", a1.x(str, "req_id"));
                    break;
                }
        }
    }
}
