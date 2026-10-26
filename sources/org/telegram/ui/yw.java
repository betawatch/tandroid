package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yw implements w60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ cy b;

    public yw(cy cyVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.b = cyVar;
        this.a = e2Var;
    }

    @Override // org.telegram.ui.w60
    public final void a(x60 x60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.r2[] r2VarArr = {x60Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.ww
            public final /* synthetic */ yw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        cy cyVar = this.b.b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.u0 = new e5(runnable, 12);
                            cyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        yw ywVar = this.b;
                        cy cyVar2 = ywVar.b;
                        cyVar2.Y4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.c71(25, ywVar, r2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.ww
            public final /* synthetic */ yw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        cy cyVar = this.b.b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.u0 = new e5(runnable, 12);
                            cyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        yw ywVar = this.b;
                        cy cyVar2 = ywVar.b;
                        cyVar2.Y4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.c71(25, ywVar, r2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new bi.c2(this, e2Var, j10, 2), new Utilities.Callback(this) { // from class: org.telegram.ui.xw
            public final /* synthetic */ yw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.b.b;
                        if (cyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, bool == null || !bool.booleanValue(), true, null, runnable, new ff(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.b.b;
                        if (cyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), gq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new ff(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.xw
            public final /* synthetic */ yw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.b.b;
                        if (cyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, bool == null || !bool.booleanValue(), true, null, runnable, new ff(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.b.b;
                        if (cyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), gq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new ff(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.t2(this, e2Var, j10, r2VarArr, 5));
    }
}
