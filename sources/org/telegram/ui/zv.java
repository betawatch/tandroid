package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zv implements e50 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ yw b;

    public zv(yw ywVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.b = ywVar;
        this.a = u1Var;
    }

    @Override // org.telegram.ui.e50
    public final void e(f50 f50Var, final long j3) {
        final int i7 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.f2[] f2VarArr = {f50Var, null};
        final int i11 = 0;
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.xv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        yw ywVar = this.b.b;
                        Boolean bool = ywVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.u0 = new a5(runnable, 12);
                            ywVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        zv zvVar = this.b;
                        yw ywVar2 = zvVar.b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.m51(16, zvVar, f2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        org.telegram.messenger.c20 c20Var2 = new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.xv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        yw ywVar = this.b.b;
                        Boolean bool = ywVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.u0 = new a5(runnable, 12);
                            ywVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        zv zvVar = this.b;
                        yw ywVar2 = zvVar.b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.m51(16, zvVar, f2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var = this.a;
        Utilities.u(0, c20Var, c20Var2, new bi.b2(this, u1Var, j3, 2), new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.yv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.b.b;
                        if (ywVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.H));
                            org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, ywVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.b.b;
                        if (ywVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.qp messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(ywVar2.getAccountInstance().a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.G.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.yv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.b.b;
                        if (ywVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.H));
                            org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, ywVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.b.b;
                        if (ywVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.qp messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(ywVar2.getAccountInstance().a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.G.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.r2(this, u1Var, j3, f2VarArr, 5));
    }
}
