package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sx implements i70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 a;
    public final /* synthetic */ ty b;

    public sx(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = tyVar;
        this.a = b2Var;
    }

    @Override // org.telegram.ui.i70
    public final void a(j70 j70Var, final long j3) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {j70Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.qx
            public final /* synthetic */ sx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        ty tyVar = this.b.b;
                        Boolean bool = tyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", tyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.t0 = new b5(runnable, 12);
                            tyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        sx sxVar = this.b;
                        ty tyVar2 = sxVar.b;
                        tyVar2.N4(tyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.ea1(16, sxVar, n2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.qx
            public final /* synthetic */ sx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        ty tyVar = this.b.b;
                        Boolean bool = tyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", tyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.t0 = new b5(runnable, 12);
                            tyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        sx sxVar = this.b;
                        ty tyVar2 = sxVar.b;
                        tyVar2.N4(tyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.ea1(16, sxVar, n2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new ju(this, b2Var, j3, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.rx
            public final /* synthetic */ sx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ty tyVar = this.b.b;
                        if (tyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H));
                            MessagesController messagesController = tyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = tyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, tyVar, bool == null || !bool.booleanValue(), true, null, runnable, new of(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ty tyVar2 = this.b.b;
                        if (tyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = tyVar2.getMessagesController();
                            long j10 = j3;
                            tyVar2.getMessagesController().setUserAdminRole(j10, tyVar2.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, tyVar2.G.user_admin_rights), null, false, tyVar2, false, true, null, runnable2, new of(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.rx
            public final /* synthetic */ sx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ty tyVar = this.b.b;
                        if (tyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H));
                            MessagesController messagesController = tyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = tyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, tyVar, bool == null || !bool.booleanValue(), true, null, runnable, new of(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ty tyVar2 = this.b.b;
                        if (tyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = tyVar2.getMessagesController();
                            long j10 = j3;
                            tyVar2.getMessagesController().setUserAdminRole(j10, tyVar2.getAccountInstance().getUserConfig().getCurrentUser(), nq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, tyVar2.G.user_admin_rights), null, false, tyVar2, false, true, null, runnable2, new of(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.l(this, b2Var, j3, n2VarArr, 7));
    }
}
