package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zv implements b50 {
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 a;
    public final /* synthetic */ yw b;

    public zv(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var) {
        this.b = ywVar;
        this.a = t1Var;
    }

    @Override // org.telegram.ui.b50
    public final void c(c50 c50Var, final long j3) {
        final int i7 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.e2[] e2VarArr = {c50Var, null};
        final int i11 = 0;
        org.telegram.messenger.z10 z10Var = new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.xv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        yw ywVar = this.b.b;
                        Boolean bool = ywVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new a5(runnable, 12);
                            ywVar.presentFragment(adVar);
                            e2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        zv zvVar = this.b;
                        yw ywVar2 = zvVar.b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.u(12, zvVar, e2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        org.telegram.messenger.z10 z10Var2 = new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.xv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        yw ywVar = this.b.b;
                        Boolean bool = ywVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", ywVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new a5(runnable, 12);
                            ywVar.presentFragment(adVar);
                            e2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        zv zvVar = this.b;
                        yw ywVar2 = zvVar.b;
                        ywVar2.c5(ywVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.u(12, zvVar, e2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.t1 t1Var = this.a;
        Utilities.u(0, z10Var, z10Var2, new di.o1(this, t1Var, j3, 2), new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.yv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.b.b;
                        if (ywVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.I));
                            org.telegram.messenger.np messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.Q4(j3, a22, tL_chatAdminRights, null, false, ywVar, bool == null || !bool.booleanValue(), true, null, runnable, new te(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.b.b;
                        if (ywVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.np messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().Q4(j10, org.telegram.messenger.m10.i(ywVar2.getAccountInstance().a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.H.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new te(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.yv
            public final /* synthetic */ zv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.z10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        yw ywVar = this.b.b;
                        if (ywVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.I));
                            org.telegram.messenger.np messagesController = ywVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ywVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.Q4(j3, a22, tL_chatAdminRights, null, false, ywVar, bool == null || !bool.booleanValue(), true, null, runnable, new te(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        yw ywVar2 = this.b.b;
                        if (ywVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.np messagesController2 = ywVar2.getMessagesController();
                            long j10 = j3;
                            ywVar2.getMessagesController().Q4(j10, org.telegram.messenger.m10.i(ywVar2.getAccountInstance().a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, ywVar2.H.user_admin_rights), null, false, ywVar2, false, true, null, runnable2, new te(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.i1(this, t1Var, j3, e2VarArr, 6));
    }
}
