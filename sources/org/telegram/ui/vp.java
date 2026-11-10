package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ vp(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.c20 c20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.b = i7;
        this.d = arrayList;
        this.c = j3;
        this.e = activity;
        this.f = h6Var;
        this.g = c20Var;
        this.h = hashMap;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        Serializable serializable = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                rq rqVar = (rq) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                boolean z9 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                long j3 = rqVar.M;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rqVar.D;
                long j10 = this.c;
                yp ypVar = new yp(rqVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                ypVar.X0 = new zp(rqVar, intValue, j10, this.b, z9, zArr);
                rqVar.presentFragment(ypVar);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i10).e7.edit();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj6;
                        long longValue = l10.longValue();
                        long N1 = org.telegram.messenger.qp.s1(i10).N1(longValue);
                        if (N1 <= 0 && longValue > 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(i10).J2(longValue));
                        }
                        edit.putLong(rf.b.h(longValue, "ask_paid_message_", "_price"), N1);
                        bi.ea.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.pb pbVar = new org.telegram.messenger.pb(i10, this.c, activity, arrayList, hashMap, c20Var, h6Var);
                if (!bi.ea.y(i10, false).e) {
                    bi.ea y10 = bi.ea.y(i10, false);
                    y10.e = false;
                    y10.q(pbVar, false, true);
                    y10.e = true;
                    break;
                } else {
                    pbVar.run();
                    break;
                }
                break;
            default:
                String str2 = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(i12).o1(this.c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.nx((LaunchActivity) obj5, i12, (zw) obj4, (org.telegram.ui.ActionBar.f2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                break;
        }
    }

    public /* synthetic */ vp(rq rqVar, long j3, int i7, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.d = rqVar;
        this.c = j3;
        this.b = i7;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }

    public /* synthetic */ vp(LaunchActivity launchActivity, int i7, long j3, zw zwVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.b = i7;
        this.c = j3;
        this.e = zwVar;
        this.f = f2Var;
        this.g = user;
        this.h = str;
    }
}
