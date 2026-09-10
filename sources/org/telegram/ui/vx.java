package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vx implements j70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ wy b;

    public vx(wy wyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = wyVar;
        this.a = d2Var;
    }

    @Override // org.telegram.ui.j70
    public final void a(k70 k70Var, final long j3) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {k70Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.tx
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        wy wyVar = this.b.b;
                        Boolean bool = wyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.t0 = new b5(runnable, 12);
                            wyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        vx vxVar = this.b;
                        wy wyVar2 = vxVar.b;
                        wyVar2.Q4(wyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new uv(8, vxVar, p2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.tx
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        wy wyVar = this.b.b;
                        Boolean bool = wyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.t0 = new b5(runnable, 12);
                            wyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        vx vxVar = this.b;
                        wy wyVar2 = vxVar.b;
                        wyVar2.Q4(wyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new uv(8, vxVar, p2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new lu(this, d2Var, j3, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.ux
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        wy wyVar = this.b.b;
                        if (wyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H));
                            MessagesController messagesController = wyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, wyVar, bool == null || !bool.booleanValue(), true, null, runnable, new nf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        wy wyVar2 = this.b.b;
                        if (wyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = wyVar2.getMessagesController();
                            long j10 = j3;
                            wyVar2.getMessagesController().setUserAdminRole(j10, wyVar2.getAccountInstance().getUserConfig().getCurrentUser(), rq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, wyVar2.G.user_admin_rights), null, false, wyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.ux
            public final /* synthetic */ vx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        wy wyVar = this.b.b;
                        if (wyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H));
                            MessagesController messagesController = wyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, wyVar, bool == null || !bool.booleanValue(), true, null, runnable, new nf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        wy wyVar2 = this.b.b;
                        if (wyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = wyVar2.getMessagesController();
                            long j10 = j3;
                            wyVar2.getMessagesController().setUserAdminRole(j10, wyVar2.getAccountInstance().getUserConfig().getCurrentUser(), rq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, wyVar2.G.user_admin_rights), null, false, wyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.j2(this, d2Var, j3, p2VarArr, 3));
    }
}
