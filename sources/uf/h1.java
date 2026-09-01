package uf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t41;
import org.telegram.ui.li1;
import vf.s1;
import wh.a3;
import wh.f3;
import wh.i5;
import wh.q5;
import wh.r3;
import wh.s5;
import wh.u5;
import wh.v5;
import wh.x5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = (k1) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.d;
                k1Var.q = arrayList;
                k1Var.r = hashMap;
                k1Var.s = true;
                k1Var.a.V(arrayList);
                break;
            case 1:
                l1 l1Var = (l1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str = tL_messages_searchStickerSets.q;
                m1 m1Var = l1Var.a;
                String str2 = m1Var.O;
                t41 t41Var = m1Var.e;
                if (str.equals(str2)) {
                    l1Var.a();
                    t41Var.b.h.getProgressDrawable().e = false;
                    m1Var.K = 0;
                    t41Var.b(true);
                    m1Var.B.addAll(tL_messages_foundStickerSets.sets);
                    m1Var.l();
                    break;
                }
                break;
            case 2:
                vf.c cVar = (vf.c) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    cVar.a.a(0.0f);
                    qc.b0(tL_error);
                    break;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    cVar.a.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(cVar), null);
                    break;
                } else {
                    cVar.finishFragment();
                    break;
                }
            case 3:
                vf.k kVar = (vf.k) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error2 != null) {
                    kVar.e.a(0.0f);
                    qc.b0(tL_error2);
                    break;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    kVar.e.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(kVar), null);
                    break;
                } else {
                    if (kVar.B != null) {
                        kVar.getMessagesController().loadFullUser(kVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    kVar.finishFragment();
                    break;
                }
            case 4:
                vf.t tVar = (vf.t) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList2 = tVar.b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList2.contains(tL_businessChatLink)) {
                        arrayList2.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(tVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    tVar.f();
                    break;
                } else {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    break;
                }
            case 5:
                vf.t tVar2 = (vf.t) this.b;
                String str3 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str3;
                ConnectionsManager.getInstance(tVar2.a).sendRequest(deletebusinesschatlink, new li1(9, tVar2, tL_businessChatLink2));
                break;
            case 6:
                vf.f0.P((vf.f0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d);
                break;
            case 7:
                vf.n0 n0Var = (vf.n0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error3 != null) {
                    n0Var.a.a(0.0f);
                    qc.b0(tL_error3);
                    break;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    n0Var.a.a(0.0f);
                    y3.s(R.string.UnknownError, qc.a0(n0Var), null);
                    break;
                } else {
                    n0Var.finishFragment();
                    break;
                }
            case 8:
                vf.x0.U((vf.x0) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                break;
            case 9:
                s1 s1Var = (s1) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList3 = s1Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(s1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                s1Var.c = true;
                s1Var.b = false;
                break;
            case 10:
                r3 r3Var = (r3) this.b;
                q70 q70Var = (q70) this.c;
                i5 i5Var = (i5) this.d;
                if (r3Var.g4 == q70Var) {
                    r3Var.g4 = null;
                    if (r3Var.z3 && r3Var.f4 == i5Var && !i5Var.E.isEmpty()) {
                        r3Var.M2();
                        break;
                    }
                }
                break;
            case 11:
                r3 r3Var2 = (r3) this.b;
                wh.a aVar = (wh.a) this.c;
                wh.a aVar2 = (wh.a) this.d;
                ArrayList arrayList4 = r3Var2.m4;
                f3 f3Var = r3Var2.k3;
                if (f3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList4.indexOf(aVar);
                    int indexOf2 = arrayList4.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                            wh.a aVar3 = (wh.a) arrayList4.get(i10);
                            long j10 = aVar3.t;
                            if (j10 != 0) {
                                f3Var.Y(i10, x5.l((TL_iv.RichText) r3Var2.j3.get(Long.valueOf(j10))));
                            } else {
                                f3Var.Y(i10, v5.z(aVar3.b));
                            }
                        }
                        f3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        break;
                    }
                }
                break;
            case 12:
                ((r3) this.b).Z4((String) this.d, (wh.a) this.c);
                break;
            case 13:
                q5 q5Var = (q5) this.b;
                wh.a aVar4 = (wh.a) this.c;
                u5 u5Var = (u5) this.d;
                s5 s5Var = q5Var.a.y;
                if (s5Var != null) {
                    ((a3) s5Var).d(aVar4, u5Var.a, u5Var.b, u5Var.c, u5Var.d, u5Var.e);
                    break;
                }
                break;
            case 14:
                xh.n nVar = (xh.n) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                nVar.getClass();
                for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                    ((View) arrayList5.get(i11)).setVisibility(0);
                }
                if (nVar.A.removeAll(arrayList6)) {
                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                        nVar.d((f2.m1) arrayList6.get(i12));
                    }
                    nVar.G();
                }
                nVar.K.removeAll(arrayList5);
                break;
            default:
                xh.n nVar2 = (xh.n) this.b;
                View view = (View) this.c;
                f2.m1 m1Var2 = (f2.m1) this.d;
                nVar2.getClass();
                view.setVisibility(0);
                if (nVar2.A.remove(m1Var2)) {
                    nVar2.d(m1Var2);
                    nVar2.G();
                }
                nVar2.K.remove(view);
                break;
        }
    }
}
