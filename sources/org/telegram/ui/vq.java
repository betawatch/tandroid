package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ vq(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.b = i10;
        this.d = arrayList;
        this.c = j3;
        this.e = activity;
        this.f = d6Var;
        this.g = callback;
        this.h = hashMap;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        Serializable serializable = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                qr qrVar = (qr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                boolean z10 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                long j3 = qrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = qrVar.E;
                long j10 = this.c;
                yq yqVar = new yq(qrVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                yqVar.X0 = new zq(qrVar, intValue, j10, this.b, z10, zArr);
                qrVar.presentFragment(yqVar);
                break;
            case 1:
                final ArrayList arrayList = (ArrayList) obj5;
                final Activity activity = (Activity) obj4;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                final Utilities.Callback callback = (Utilities.Callback) obj2;
                final HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i11 = this.b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i11).getMainSettings().edit();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj6 = arrayList.get(i12);
                        i12++;
                        Long l4 = (Long) obj6;
                        long longValue = l4.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i11).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i11).isUserContactBlocked(longValue));
                        }
                        edit.putLong(org.telegram.ui.Cells.q3.h(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        yh.t5.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j11 = this.c;
                Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = i11;
                        long j12 = yh.t5.y(i13, false).p().amount;
                        long j13 = j11;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j12 >= j13) {
                            callback2.run(hashMap2);
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 == null) {
                            return;
                        }
                        long longValue2 = ((Long) arrayList.get(0)).longValue();
                        new yh.l7(activity2, d6Var, j13, 13, DialogObject.getShortName(i13, longValue2), new b2(callback2, hashMap2, 0), longValue2).show();
                    }
                };
                if (!yh.t5.y(i11, false).e) {
                    yh.t5 y3 = yh.t5.y(i11, false);
                    y3.e = false;
                    y3.q(false, true, runnable);
                    y3.e = true;
                    break;
                } else {
                    runnable.run();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.hi((LaunchActivity) obj5, i13, (ry) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                break;
        }
    }

    public /* synthetic */ vq(qr qrVar, long j3, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = qrVar;
        this.c = j3;
        this.b = i10;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }

    public /* synthetic */ vq(LaunchActivity launchActivity, int i10, long j3, ry ryVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.b = i10;
        this.c = j3;
        this.e = ryVar;
        this.f = n2Var;
        this.g = user;
        this.h = str;
    }
}
