package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xx implements o70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 a;
    public final /* synthetic */ yy b;

    public xx(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.b = yyVar;
        this.a = a2Var;
    }

    @Override // org.telegram.ui.o70
    public final void a(p70 p70Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.m2[] m2VarArr = {p70Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.vx
            public final /* synthetic */ xx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        yy yyVar = this.b.b;
                        Boolean bool = yyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", yyVar.G.has_username.booleanValue());
                            sd sdVar = new sd(bundle);
                            sdVar.t0 = new f5(runnable, 12);
                            yyVar.presentFragment(sdVar);
                            m2VarArr[1] = sdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        xx xxVar = this.b;
                        yy yyVar2 = xxVar.b;
                        yyVar2.O4(yyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.n51(22, xxVar, m2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.vx
            public final /* synthetic */ xx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        yy yyVar = this.b.b;
                        Boolean bool = yyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", yyVar.G.has_username.booleanValue());
                            sd sdVar = new sd(bundle);
                            sdVar.t0 = new f5(runnable, 12);
                            yyVar.presentFragment(sdVar);
                            m2VarArr[1] = sdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        xx xxVar = this.b;
                        yy yyVar2 = xxVar.b;
                        yyVar2.O4(yyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.n51(22, xxVar, m2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.a2 a2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new pu(this, a2Var, j10, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.wx
            public final /* synthetic */ xx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yy yyVar = this.b.b;
                        if (yyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = yyVar.getMessagesController().getUser(Long.valueOf(yyVar.H));
                            MessagesController messagesController = yyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = yyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, yyVar, bool == null || !bool.booleanValue(), true, null, runnable, new tf(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yy yyVar2 = this.b.b;
                        if (yyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = yyVar2.getMessagesController();
                            long j11 = j10;
                            yyVar2.getMessagesController().setUserAdminRole(j11, yyVar2.getAccountInstance().getUserConfig().getCurrentUser(), tq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, yyVar2.G.user_admin_rights), null, false, yyVar2, false, true, null, runnable2, new tf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.wx
            public final /* synthetic */ xx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yy yyVar = this.b.b;
                        if (yyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = yyVar.getMessagesController().getUser(Long.valueOf(yyVar.H));
                            MessagesController messagesController = yyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = yyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, yyVar, bool == null || !bool.booleanValue(), true, null, runnable, new tf(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yy yyVar2 = this.b.b;
                        if (yyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = yyVar2.getMessagesController();
                            long j11 = j10;
                            yyVar2.getMessagesController().setUserAdminRole(j11, yyVar2.getAccountInstance().getUserConfig().getCurrentUser(), tq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, yyVar2.G.user_admin_rights), null, false, yyVar2, false, true, null, runnable2, new tf(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.i(this, a2Var, j10, m2VarArr, 4));
    }
}
