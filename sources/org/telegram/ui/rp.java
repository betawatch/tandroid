package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ rp(int i3, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.b = i3;
        this.d = arrayList;
        this.c = j10;
        this.e = activity;
        this.f = e6Var;
        this.g = u10Var;
        this.h = hashMap;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Serializable serializable = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                nq nqVar = (nq) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                boolean z10 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                long j10 = nqVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = nqVar.E;
                long j11 = this.c;
                up upVar = new up(nqVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                upVar.Y0 = new vp(nqVar, intValue, j11, this.b, z10, zArr);
                nqVar.presentFragment(upVar);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i10).e7.edit();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj6;
                        long longValue = l10.longValue();
                        long N1 = org.telegram.messenger.hp.s1(i10).N1(longValue);
                        if (N1 <= 0 && longValue > 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(i10).J2(longValue));
                        }
                        edit.putLong(t4.c.e(longValue, "ask_paid_message_", "_price"), N1);
                        ci.e9.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.ib ibVar = new org.telegram.messenger.ib(i10, this.c, activity, arrayList, hashMap, u10Var, e6Var);
                if (!ci.e9.y(i10, false).e) {
                    ci.e9 y9 = ci.e9.y(i10, false);
                    y9.e = false;
                    y9.q(ibVar, false, true);
                    y9.e = true;
                    break;
                } else {
                    ibVar.run();
                    break;
                }
                break;
            default:
                String str2 = LaunchActivity.E1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.hp.s1(i12).o1(this.c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.gx((LaunchActivity) obj5, i12, (uw) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                break;
        }
    }

    public /* synthetic */ rp(nq nqVar, long j10, int i3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = nqVar;
        this.c = j10;
        this.b = i3;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }

    public /* synthetic */ rp(LaunchActivity launchActivity, int i3, long j10, uw uwVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.b = i3;
        this.c = j10;
        this.e = uwVar;
        this.f = d2Var;
        this.g = user;
        this.h = str;
    }
}
