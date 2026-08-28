package pf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.o71;
import qh.c3;
import qh.f5;
import qh.n5;
import qh.o3;
import qh.p5;
import qh.r5;
import qh.s5;
import qh.u5;
import qh.x2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d dVar = (d) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tL_error != null) {
                    dVar.a.a(0.0f);
                    oc.b0(tL_error);
                    break;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    dVar.a.a(0.0f);
                    ll.p(R.string.UnknownError, oc.a0(dVar), null);
                    break;
                } else {
                    dVar.finishFragment();
                    break;
                }
            case 1:
                l lVar = (l) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tL_error2 != null) {
                    lVar.e.a(0.0f);
                    oc.b0(tL_error2);
                    break;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    lVar.e.a(0.0f);
                    ll.p(R.string.UnknownError, oc.a0(lVar), null);
                    break;
                } else {
                    if (lVar.A != null) {
                        lVar.getMessagesController().loadFullUser(lVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    lVar.finishFragment();
                    break;
                }
            case 2:
                u uVar = (u) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                ArrayList arrayList = uVar.b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList.contains(tL_businessChatLink)) {
                        arrayList.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(uVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    uVar.f();
                    break;
                } else {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    break;
                }
            case 3:
                u uVar2 = (u) this.d;
                String str = (String) this.b;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.c;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str;
                ConnectionsManager.getInstance(uVar2.a).sendRequest(deletebusinesschatlink, new o71(8, uVar2, tL_businessChatLink2));
                break;
            case 4:
                g0.O((g0) this.d, (TL_account.TL_connectedBot) this.b, (TL_account.TL_businessBotRecipients) this.c);
                break;
            case 5:
                o0 o0Var = (o0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tL_error3 != null) {
                    o0Var.a.a(0.0f);
                    oc.b0(tL_error3);
                    break;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    o0Var.a.a(0.0f);
                    ll.p(R.string.UnknownError, oc.a0(o0Var), null);
                    break;
                } else {
                    o0Var.finishFragment();
                    break;
                }
            case 6:
                y0.T((y0) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                break;
            case 7:
                u1 u1Var = (u1) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                ArrayList arrayList2 = u1Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(u1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                u1Var.c = true;
                u1Var.b = false;
                break;
            case 8:
                o3 o3Var = (o3) this.d;
                x60 x60Var = (x60) this.b;
                f5 f5Var = (f5) this.c;
                if (o3Var.f4 == x60Var) {
                    o3Var.f4 = null;
                    if (o3Var.y3 && o3Var.e4 == f5Var && !f5Var.D.isEmpty()) {
                        o3Var.M2();
                        break;
                    }
                }
                break;
            case 9:
                o3 o3Var2 = (o3) this.d;
                qh.a aVar = (qh.a) this.b;
                qh.a aVar2 = (qh.a) this.c;
                ArrayList arrayList3 = o3Var2.l4;
                c3 c3Var = o3Var2.j3;
                if (c3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                            qh.a aVar3 = (qh.a) arrayList3.get(i9);
                            long j10 = aVar3.t;
                            if (j10 != 0) {
                                c3Var.Y(i9, u5.l((TL_iv.RichText) o3Var2.i3.get(Long.valueOf(j10))));
                            } else {
                                c3Var.Y(i9, s5.z(aVar3.b));
                            }
                        }
                        c3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        break;
                    }
                }
                break;
            case 10:
                ((o3) this.d).Z4((String) this.c, (qh.a) this.b);
                break;
            case 11:
                n5 n5Var = (n5) this.d;
                qh.a aVar4 = (qh.a) this.b;
                r5 r5Var = (r5) this.c;
                p5 p5Var = n5Var.a.y;
                if (p5Var != null) {
                    ((x2) p5Var).d(aVar4, r5Var.a, r5Var.b, r5Var.c, r5Var.d, r5Var.e);
                    break;
                }
                break;
            case 12:
                rh.m mVar = (rh.m) this.d;
                ArrayList arrayList4 = (ArrayList) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                mVar.getClass();
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    ((View) arrayList4.get(i10)).setVisibility(0);
                }
                if (mVar.A.removeAll(arrayList5)) {
                    for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                        mVar.d((f2.q1) arrayList5.get(i11));
                    }
                    mVar.G();
                }
                mVar.K.removeAll(arrayList4);
                break;
            default:
                rh.m mVar2 = (rh.m) this.d;
                View view = (View) this.b;
                f2.q1 q1Var = (f2.q1) this.c;
                mVar2.getClass();
                view.setVisibility(0);
                if (mVar2.A.remove(q1Var)) {
                    mVar2.d(q1Var);
                    mVar2.G();
                }
                mVar2.K.remove(view);
                break;
        }
    }

    public /* synthetic */ a(Object obj, TLObject tLObject, Object obj2, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = tLObject;
        this.b = obj2;
    }
}
