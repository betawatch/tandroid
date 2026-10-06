package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class rx implements j70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 a;
    public final /* synthetic */ uy b;

    public rx(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = uyVar;
        this.a = b2Var;
    }

    @Override // org.telegram.ui.j70
    public final void a(k70 k70Var, final long j3) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {k70Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.px
            public final /* synthetic */ rx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        uy uyVar = this.b.b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.t0 = new c5(runnable, 12);
                            uyVar.presentFragment(ndVar);
                            n2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        rx rxVar = this.b;
                        uy uyVar2 = rxVar.b;
                        uyVar2.Z4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new cu(6, rxVar, n2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.px
            public final /* synthetic */ rx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        uy uyVar = this.b.b;
                        Boolean bool = uyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", uyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.t0 = new c5(runnable, 12);
                            uyVar.presentFragment(ndVar);
                            n2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        rx rxVar = this.b;
                        uy uyVar2 = rxVar.b;
                        uyVar2.Z4(uyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new cu(6, rxVar, n2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new ku(this, b2Var, j3, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.qx
            public final /* synthetic */ rx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.b.b;
                        if (uyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H));
                            MessagesController messagesController = uyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, uyVar, bool == null || !bool.booleanValue(), true, null, runnable, new nf(8, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uy uyVar2 = this.b.b;
                        if (uyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), mq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.qx
            public final /* synthetic */ rx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uy uyVar = this.b.b;
                        if (uyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H));
                            MessagesController messagesController = uyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, uyVar, bool == null || !bool.booleanValue(), true, null, runnable, new nf(8, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uy uyVar2 = this.b.b;
                        if (uyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = uyVar2.getMessagesController();
                            long j10 = j3;
                            uyVar2.getMessagesController().setUserAdminRole(j10, uyVar2.getAccountInstance().getUserConfig().getCurrentUser(), mq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, uyVar2.G.user_admin_rights), null, false, uyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.l(this, b2Var, j3, n2VarArr, 7));
    }
}
