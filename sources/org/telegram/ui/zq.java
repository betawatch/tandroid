package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ zq(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        this.b = i10;
        this.d = arrayList;
        this.c = j3;
        this.e = activity;
        this.f = f6Var;
        this.g = callback;
        this.h = hashMap;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ur urVar = (ur) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.g;
                String str = (String) this.h;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                boolean z10 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                long j3 = urVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = urVar.E;
                long j10 = this.c;
                cr crVar = new cr(urVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                crVar.X0 = new dr(urVar, intValue, j10, this.b, z10, zArr);
                urVar.presentFragment(crVar);
                break;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.e;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
                final Utilities.Callback callback = (Utilities.Callback) this.g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i10 = this.b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i10).getMainSettings().edit();
                    int i11 = 0;
                    for (int size = arrayList.size(); i11 < size; size = size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        Long l4 = (Long) obj2;
                        long longValue = l4.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
                        }
                        edit.putLong(org.telegram.ui.Cells.p6.h(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        yh.v5.y(i10, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j11 = this.c;
                Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i10;
                        long j12 = yh.v5.y(i12, false).p().amount;
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
                        new yh.n7(activity2, f6Var, j13, 13, DialogObject.getShortName(i12, longValue2), new a2(callback2, hashMap2, 0), longValue2).show();
                    }
                };
                if (yh.v5.y(i10, false).e) {
                    runnable.run();
                    break;
                } else {
                    yh.v5 y3 = yh.v5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, runnable);
                    y3.e = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zq(ur urVar, long j3, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = urVar;
        this.c = j3;
        this.b = i10;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.g = tL_chatBannedRights;
        this.h = str;
    }
}
