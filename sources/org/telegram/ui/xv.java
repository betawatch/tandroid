package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class xv implements c50 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ ww b;

    public xv(ww wwVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.b = wwVar;
        this.a = u1Var;
    }

    @Override // org.telegram.ui.c50
    public final void e(d50 d50Var, final long j3) {
        final int i7 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.f2[] f2VarArr = {d50Var, null};
        final int i11 = 0;
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.vv
            public final /* synthetic */ xv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        ww wwVar = this.b.b;
                        Boolean bool = wwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.u0 = new a5(runnable, 12);
                            wwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        xv xvVar = this.b;
                        ww wwVar2 = xvVar.b;
                        wwVar2.c5(wwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.g51(16, xvVar, f2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        org.telegram.messenger.c20 c20Var2 = new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.vv
            public final /* synthetic */ xv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        ww wwVar = this.b.b;
                        Boolean bool = wwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", wwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.u0 = new a5(runnable, 12);
                            wwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        xv xvVar = this.b;
                        ww wwVar2 = xvVar.b;
                        wwVar2.c5(wwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.g51(16, xvVar, f2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var = this.a;
        Utilities.u(0, c20Var, c20Var2, new bi.b2(this, u1Var, j3, 2), new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.wv
            public final /* synthetic */ xv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ww wwVar = this.b.b;
                        if (wwVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = wwVar.getMessagesController().a2(Long.valueOf(wwVar.H));
                            org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, wwVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ww wwVar2 = this.b.b;
                        if (wwVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.qp messagesController2 = wwVar2.getMessagesController();
                            long j10 = j3;
                            wwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(wwVar2.getAccountInstance().a).f(), kp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, wwVar2.G.user_admin_rights), null, false, wwVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.wv
            public final /* synthetic */ xv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ww wwVar = this.b.b;
                        if (wwVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = wwVar.getMessagesController().a2(Long.valueOf(wwVar.H));
                            org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = wwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, wwVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ww wwVar2 = this.b.b;
                        if (wwVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.qp messagesController2 = wwVar2.getMessagesController();
                            long j10 = j3;
                            wwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(wwVar2.getAccountInstance().a).f(), kp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, wwVar2.G.user_admin_rights), null, false, wwVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.r2(this, u1Var, j3, f2VarArr, 5));
    }
}
