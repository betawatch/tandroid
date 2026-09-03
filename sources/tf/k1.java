package tf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
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
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s41;
import org.telegram.ui.qi1;
import uf.s1;
import vh.b3;
import vh.g3;
import vh.j5;
import vh.r5;
import vh.s3;
import vh.t5;
import vh.v5;
import vh.w5;
import vh.y5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l1 l1Var = (l1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str = tL_messages_searchStickerSets.q;
                m1 m1Var = l1Var.a;
                String str2 = m1Var.O;
                s41 s41Var = m1Var.e;
                if (str.equals(str2)) {
                    l1Var.a();
                    s41Var.b.h.getProgressDrawable().e = false;
                    m1Var.K = 0;
                    s41Var.b(true);
                    m1Var.B.addAll(tL_messages_foundStickerSets.sets);
                    m1Var.l();
                    break;
                }
                break;
            case 1:
                uf.c cVar = (uf.c) this.b;
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
            case 2:
                uf.k kVar = (uf.k) this.b;
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
            case 3:
                uf.t tVar = (uf.t) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList = tVar.b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList.contains(tL_businessChatLink)) {
                        arrayList.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(tVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    tVar.f();
                    break;
                } else {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    break;
                }
            case 4:
                uf.t tVar2 = (uf.t) this.b;
                String str3 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str3;
                ConnectionsManager.getInstance(tVar2.a).sendRequest(deletebusinesschatlink, new qi1(9, tVar2, tL_businessChatLink2));
                break;
            case 5:
                uf.f0.P((uf.f0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d);
                break;
            case 6:
                uf.n0 n0Var = (uf.n0) this.b;
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
            case 7:
                uf.x0.U((uf.x0) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                break;
            case 8:
                s1 s1Var = (s1) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList2 = s1Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(s1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                s1Var.c = true;
                s1Var.b = false;
                break;
            case 9:
                s3 s3Var = (s3) this.b;
                p70 p70Var = (p70) this.c;
                j5 j5Var = (j5) this.d;
                if (s3Var.g4 == p70Var) {
                    s3Var.g4 = null;
                    if (s3Var.z3 && s3Var.f4 == j5Var && !j5Var.E.isEmpty()) {
                        s3Var.L2();
                        break;
                    }
                }
                break;
            case 10:
                s3 s3Var2 = (s3) this.b;
                vh.a aVar = (vh.a) this.c;
                vh.a aVar2 = (vh.a) this.d;
                ArrayList arrayList3 = s3Var2.m4;
                g3 g3Var = s3Var2.k3;
                if (g3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            vh.a aVar3 = (vh.a) arrayList3.get(i10);
                            long j10 = aVar3.t;
                            if (j10 != 0) {
                                g3Var.Y(i10, y5.l((TL_iv.RichText) s3Var2.j3.get(Long.valueOf(j10))));
                            } else {
                                g3Var.Y(i10, w5.z(aVar3.b));
                            }
                        }
                        g3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        break;
                    }
                }
                break;
            case 11:
                ((s3) this.b).Y4((String) this.d, (vh.a) this.c);
                break;
            case 12:
                r5 r5Var = (r5) this.b;
                vh.a aVar4 = (vh.a) this.c;
                v5 v5Var = (v5) this.d;
                t5 t5Var = r5Var.a.y;
                if (t5Var != null) {
                    ((b3) t5Var).d(aVar4, v5Var.a, v5Var.b, v5Var.c, v5Var.d, v5Var.e);
                    break;
                }
                break;
            case 13:
                wh.n nVar = (wh.n) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                nVar.getClass();
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((View) arrayList4.get(i11)).setVisibility(0);
                }
                if (nVar.A.removeAll(arrayList5)) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        nVar.d((f2.l1) arrayList5.get(i12));
                    }
                    nVar.G();
                }
                nVar.K.removeAll(arrayList4);
                break;
            default:
                wh.n nVar2 = (wh.n) this.b;
                View view = (View) this.c;
                f2.l1 l1Var2 = (f2.l1) this.d;
                nVar2.getClass();
                view.setVisibility(0);
                if (nVar2.A.remove(l1Var2)) {
                    nVar2.d(l1Var2);
                    nVar2.G();
                }
                nVar2.K.remove(view);
                break;
        }
    }
}
