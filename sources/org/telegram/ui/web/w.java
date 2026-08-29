package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w(z0 z0Var, String str, int i10) {
        this.a = i10;
        this.b = z0Var;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        zi0 zi0Var;
        int i11 = this.a;
        String str = this.c;
        z0 z0Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c6 c6Var = z0Var.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) kf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new tc(z0Var, c6Var).c0("UNKNOWN_BUTTON", false);
                        z0Var.v("requested_chat_failed", z0.x(str, "req_id"));
                        break;
                    } else {
                        new tc(z0Var, c6Var).d0(tL_error, false);
                        z0Var.v("requested_chat_failed", z0.x(str, "req_id"));
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
                            z zVar = new z(z0Var, zArr, str, tL_buttonTypeRequestPeer);
                            zi0 zi0Var2 = zi0.q0;
                            o2 R = LaunchActivity.R();
                            if (R == null) {
                                zi0Var = null;
                            } else {
                                zi0 zi0Var3 = zi0.q0;
                                if (zi0Var3 != null) {
                                    zi0Var = zi0Var3;
                                } else {
                                    zi0 zi0Var4 = new zi0(R, i10, bool, bool2, zVar);
                                    zi0Var4.show();
                                    zi0.q0 = zi0Var4;
                                    zi0Var = zi0Var4;
                                }
                            }
                            if (zi0Var != null) {
                                zi0Var.setOnDismissListener(new ih.j(z0Var, zArr, str, 4));
                                break;
                            }
                        } else {
                            Bundle e10 = x3.e(15, "onlySelect", "dialogsType", true);
                            e10.putLong("requestPeerBotId", z0Var.Q.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e10.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            boolean[] zArr2 = new boolean[1];
                            e0 e0Var = new e0(z0Var, e10, zArr2);
                            e0Var.y2 = new z(z0Var, zArr2, str, tL_buttonTypeRequestPeer);
                            o2 U = LaunchActivity.U();
                            if (U != null) {
                                m2 m2Var = new m2();
                                m2Var.a = true;
                                U.showAsSheet(e0Var, m2Var);
                                break;
                            }
                        }
                    } else {
                        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType;
                        Context context = z0Var.getContext();
                        int i12 = z0Var.I;
                        TLRPC.User user = z0Var.Q;
                        ih.i iVar = new ih.i(z0Var, str, tL_buttonTypeRequestPeer, 11);
                        c6 c6Var2 = z0Var.e;
                        wq.a(context, i12, user, tL_requestPeerTypeCreateBot, false, iVar, c6Var2, new tc(z0Var, c6Var2));
                        break;
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c6 c6Var3 = z0Var.e;
                if (updates == null) {
                    if (tL_error2 == null) {
                        new tc(z0Var, c6Var3).c0("UNKNOWN_BUTTON", false);
                        z0Var.v("requested_chat_failed", z0.x(str, "req_id"));
                        break;
                    } else {
                        new tc(z0Var, c6Var3).d0(tL_error2, false);
                        z0Var.v("requested_chat_failed", z0.x(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(z0Var.I).processUpdates(updates, false);
                    z0Var.v("requested_chat_sent", z0.x(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c6 c6Var4 = z0Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new tc(z0Var, c6Var4).c0("UNKNOWN_BUTTON", false);
                        z0Var.v("requested_chat_failed", z0.x(str, "req_id"));
                        break;
                    } else {
                        new tc(z0Var, c6Var4).d0(tL_error3, false);
                        z0Var.v("requested_chat_failed", z0.x(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(z0Var.I).processUpdates(updates2, false);
                    z0Var.v("requested_chat_sent", z0.x(str, "req_id"));
                    break;
                }
        }
    }
}
