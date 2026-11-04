package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uv implements x40 {
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 a;
    public final /* synthetic */ uw b;

    public uv(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var) {
        this.b = uwVar;
        this.a = s1Var;
    }

    @Override // org.telegram.ui.x40
    public final void d(y40 y40Var, final long j10) {
        final int i3 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.d2[] d2VarArr = {y40Var, null};
        final int i11 = 0;
        org.telegram.messenger.u10 u10Var = new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.sv
            public final /* synthetic */ uv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        uw uwVar = this.b.b;
                        Boolean bool = uwVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", uwVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new c5(runnable, 12);
                            uwVar.presentFragment(adVar);
                            d2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        uv uvVar = this.b;
                        uw uwVar2 = uvVar.b;
                        uwVar2.c5(uwVar2.getMessagesController().M0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p11(21, uvVar, d2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        org.telegram.messenger.u10 u10Var2 = new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.sv
            public final /* synthetic */ uv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        uw uwVar = this.b.b;
                        Boolean bool = uwVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", uwVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new c5(runnable, 12);
                            uwVar.presentFragment(adVar);
                            d2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        uv uvVar = this.b;
                        uw uwVar2 = uvVar.b;
                        uwVar2.c5(uwVar2.getMessagesController().M0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p11(21, uvVar, d2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.s1 s1Var = this.a;
        Utilities.u(0, u10Var, u10Var2, new ci.u1(this, s1Var, j10, 2), new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.tv
            public final /* synthetic */ uv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uw uwVar = this.b.b;
                        if (uwVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = uwVar.getMessagesController().a2(Long.valueOf(uwVar.I));
                            org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uwVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j10, a22, tL_chatAdminRights, null, false, uwVar, bool == null || !bool.booleanValue(), true, null, runnable, new se(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uw uwVar2 = this.b.b;
                        if (uwVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.hp messagesController2 = uwVar2.getMessagesController();
                            long j11 = j10;
                            uwVar2.getMessagesController().P4(j11, org.telegram.messenger.h10.i(uwVar2.getAccountInstance().a).f(), ip.x0(messagesController2.M0(Long.valueOf(j11)).admin_rights, uwVar2.H.user_admin_rights), null, false, uwVar2, false, true, null, runnable2, new se(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.tv
            public final /* synthetic */ uv b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        uw uwVar = this.b.b;
                        if (uwVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = uwVar.getMessagesController().a2(Long.valueOf(uwVar.I));
                            org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = uwVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j10, a22, tL_chatAdminRights, null, false, uwVar, bool == null || !bool.booleanValue(), true, null, runnable, new se(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        uw uwVar2 = this.b.b;
                        if (uwVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.hp messagesController2 = uwVar2.getMessagesController();
                            long j11 = j10;
                            uwVar2.getMessagesController().P4(j11, org.telegram.messenger.h10.i(uwVar2.getAccountInstance().a).f(), ip.x0(messagesController2.M0(Long.valueOf(j11)).admin_rights, uwVar2.H.user_admin_rights), null, false, uwVar2, false, true, null, runnable2, new se(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.m1(this, s1Var, j10, d2VarArr, 6));
    }
}
