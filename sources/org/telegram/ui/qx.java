package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qx implements h70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 a;
    public final /* synthetic */ ry b;

    public qx(ry ryVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = ryVar;
        this.a = b2Var;
    }

    @Override // org.telegram.ui.h70
    public final void a(i70 i70Var, final long j3) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {i70Var, null};
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
                        ry ryVar = this.b.b;
                        Boolean bool = ryVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ryVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.t0 = new c5(runnable, 12);
                            ryVar.presentFragment(ldVar);
                            n2VarArr[1] = ldVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        qx qxVar = this.b;
                        ry ryVar2 = qxVar.b;
                        ryVar2.Q4(ryVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new hw(5, qxVar, n2VarArr));
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
                        ry ryVar = this.b.b;
                        Boolean bool = ryVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ryVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.t0 = new c5(runnable, 12);
                            ryVar.presentFragment(ldVar);
                            n2VarArr[1] = ldVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        qx qxVar = this.b;
                        ry ryVar2 = qxVar.b;
                        ryVar2.Q4(ryVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new hw(5, qxVar, n2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new hu(this, b2Var, j3, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.px
            public final /* synthetic */ qx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ry ryVar = this.b.b;
                        if (ryVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = ryVar.getMessagesController().getUser(Long.valueOf(ryVar.H));
                            MessagesController messagesController = ryVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ryVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, ryVar, bool == null || !bool.booleanValue(), true, null, runnable, new lf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ry ryVar2 = this.b.b;
                        if (ryVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = ryVar2.getMessagesController();
                            long j10 = j3;
                            ryVar2.getMessagesController().setUserAdminRole(j10, ryVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, ryVar2.G.user_admin_rights), null, false, ryVar2, false, true, null, runnable2, new lf(7, runnable2));
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
                        ry ryVar = this.b.b;
                        if (ryVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = ryVar.getMessagesController().getUser(Long.valueOf(ryVar.H));
                            MessagesController messagesController = ryVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ryVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, ryVar, bool == null || !bool.booleanValue(), true, null, runnable, new lf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ry ryVar2 = this.b.b;
                        if (ryVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = ryVar2.getMessagesController();
                            long j10 = j3;
                            ryVar2.getMessagesController().setUserAdminRole(j10, ryVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, ryVar2.G.user_admin_rights), null, false, ryVar2, false, true, null, runnable2, new lf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.l(this, b2Var, j3, n2VarArr, 7));
    }
}
