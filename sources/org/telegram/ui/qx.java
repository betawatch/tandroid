package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qx implements f70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ qy b;

    public qx(qy qyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = qyVar;
        this.a = d2Var;
    }

    @Override // org.telegram.ui.f70
    public final void a(g70 g70Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {g70Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.ox
            public final /* synthetic */ qx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        qy qyVar = this.b.b;
                        Boolean bool = qyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", qyVar.D.has_username.booleanValue());
                            pd pdVar = new pd(bundle);
                            pdVar.q0 = new f5(runnable, 12);
                            qyVar.presentFragment(pdVar);
                            p2VarArr[1] = pdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        qx qxVar = this.b;
                        qy qyVar2 = qxVar.b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(22, qxVar, p2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.ox
            public final /* synthetic */ qx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        qy qyVar = this.b.b;
                        Boolean bool = qyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", qyVar.D.has_username.booleanValue());
                            pd pdVar = new pd(bundle);
                            pdVar.q0 = new f5(runnable, 12);
                            qyVar.presentFragment(pdVar);
                            p2VarArr[1] = pdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        qx qxVar = this.b;
                        qy qyVar2 = qxVar.b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(22, qxVar, p2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new ku(this, d2Var, j10, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.px
            public final /* synthetic */ qx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.b.b;
                        if (qyVar.D.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.E));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, qyVar, bool == null || !bool.booleanValue(), true, null, runnable, new jf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.b.b;
                        if (qyVar2.D.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j11 = j10;
                            qyVar2.getMessagesController().setUserAdminRole(j11, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, qyVar2.D.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new jf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.px
            public final /* synthetic */ qx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.b.b;
                        if (qyVar.D.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.E));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, qyVar, bool == null || !bool.booleanValue(), true, null, runnable, new jf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.b.b;
                        if (qyVar2.D.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j11 = j10;
                            qyVar2.getMessagesController().setUserAdminRole(j11, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, qyVar2.D.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new jf(7, runnable2));
                            break;
                        }
                }
            }
        }, new kh.y0(this, d2Var, j10, p2VarArr, 4));
    }
}
