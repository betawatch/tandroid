package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import lh.p5;
import nh.j7;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jj0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ j7 c;
    public final /* synthetic */ String d;

    public /* synthetic */ v(c1 c1Var, j7 j7Var, String str, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j7Var;
        this.d = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10;
        jj0 jj0Var;
        int i11 = this.a;
        String str = this.d;
        j7 j7Var = this.c;
        c1 c1Var = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c1 c1Var2 = this.b;
                f6 f6Var = c1Var2.e;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) lf.c.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                j7 j7Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer == null) {
                    if (tL_error == null) {
                        new qc(c1Var2, f6Var).c0("UNKNOWN_BUTTON", false);
                        c1Var2.z(j7Var2, "requested_chat_failed", c1.B(str2, "req_id"));
                        break;
                    } else {
                        new qc(c1Var2, f6Var).d0(tL_error, false);
                        c1Var2.z(j7Var2, "requested_chat_failed", c1.B(str2, "req_id"));
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
                            c0 c0Var = new c0(c1Var2, zArr, str2, tL_buttonTypeRequestPeer, j7Var2);
                            jj0 jj0Var2 = jj0.r0;
                            p2 R = LaunchActivity.R();
                            if (R == null) {
                                jj0Var = null;
                            } else {
                                jj0Var = jj0.r0;
                                if (jj0Var == null) {
                                    jj0 jj0Var3 = new jj0(R, i10, bool, bool2, c0Var);
                                    jj0Var3.show();
                                    jj0.r0 = jj0Var3;
                                    jj0Var = jj0Var3;
                                }
                            }
                            if (jj0Var != null) {
                                jj0Var.setOnDismissListener(new p5(c1Var2, zArr, j7Var2, str2));
                                break;
                            }
                        } else {
                            Bundle e = y3.e(15, "onlySelect", "dialogsType", true);
                            e.putLong("requestPeerBotId", c1Var2.R.id);
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            boolean[] zArr2 = new boolean[1];
                            f0 f0Var = new f0(c1Var2, e, zArr2, j7Var2);
                            f0Var.z2 = new c0(c1Var2, zArr2, str2, tL_buttonTypeRequestPeer, j7Var2);
                            p2 U = LaunchActivity.U();
                            if (U != null) {
                                n2 n2Var = new n2();
                                n2Var.a = true;
                                U.showAsSheet(f0Var, n2Var);
                                break;
                            }
                        }
                    } else {
                        Context context = c1Var2.getContext();
                        int i12 = c1Var2.J;
                        TLRPC.User user = c1Var2.R;
                        gg.c1 c1Var3 = new gg.c1(c1Var2, j7Var2, str2, tL_buttonTypeRequestPeer, 15);
                        f6 f6Var2 = c1Var2.e;
                        zq.a(context, i12, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, c1Var3, f6Var2, new qc(c1Var2, f6Var2));
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
                        new qc(c1Var, f6Var3).c0("UNKNOWN_BUTTON", false);
                        c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    } else {
                        new qc(c1Var, f6Var3).d0(tL_error2, false);
                        c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(c1Var.J).processUpdates(updates, false);
                    c1Var.z(j7Var, "requested_chat_sent", c1.B(str, "req_id"));
                    break;
                }
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                f6 f6Var4 = c1Var.e;
                if (updates2 == null) {
                    if (tL_error3 == null) {
                        new qc(c1Var, f6Var4).c0("UNKNOWN_BUTTON", false);
                        c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    } else {
                        new qc(c1Var, f6Var4).d0(tL_error3, false);
                        c1Var.z(j7Var, "requested_chat_failed", c1.B(str, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(c1Var.J).processUpdates(updates2, false);
                    c1Var.z(j7Var, "requested_chat_sent", c1.B(str, "req_id"));
                    break;
                }
        }
    }
}
