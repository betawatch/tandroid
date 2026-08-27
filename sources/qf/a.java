package qf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rc1;
import rh.d3;
import rh.g5;
import rh.o5;
import rh.p3;
import rh.q5;
import rh.s5;
import rh.t5;
import rh.v5;
import rh.y2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tL_error != null) {
                    eVar.a.a(0.0f);
                    mc.b0(tL_error);
                    break;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    eVar.a.a(0.0f);
                    y1.r(R.string.UnknownError, mc.a0(eVar), null);
                    break;
                } else {
                    eVar.finishFragment();
                    break;
                }
            case 1:
                m mVar = (m) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tL_error2 != null) {
                    mVar.e.a(0.0f);
                    mc.b0(tL_error2);
                    break;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    mVar.e.a(0.0f);
                    y1.r(R.string.UnknownError, mc.a0(mVar), null);
                    break;
                } else {
                    if (mVar.A != null) {
                        mVar.getMessagesController().loadFullUser(mVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    mVar.finishFragment();
                    break;
                }
            case 2:
                v vVar = (v) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                ArrayList arrayList = vVar.b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList.contains(tL_businessChatLink)) {
                        arrayList.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(vVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    vVar.f();
                    break;
                } else {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    break;
                }
            case 3:
                v vVar2 = (v) this.d;
                String str = (String) this.b;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.c;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str;
                ConnectionsManager.getInstance(vVar2.a).sendRequest(deletebusinesschatlink, new rc1(8, vVar2, tL_businessChatLink2));
                break;
            case 4:
                g0.P((g0) this.d, (TL_account.TL_connectedBot) this.b, (TL_account.TL_businessBotRecipients) this.c);
                break;
            case 5:
                o0 o0Var = (o0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tL_error3 != null) {
                    o0Var.a.a(0.0f);
                    mc.b0(tL_error3);
                    break;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    o0Var.a.a(0.0f);
                    y1.r(R.string.UnknownError, mc.a0(o0Var), null);
                    break;
                } else {
                    o0Var.finishFragment();
                    break;
                }
            case 6:
                y0.U((y0) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                break;
            case 7:
                t1 t1Var = (t1) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                ArrayList arrayList2 = t1Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(t1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                t1Var.c = true;
                t1Var.b = false;
                break;
            case 8:
                p3 p3Var = (p3) this.d;
                b70 b70Var = (b70) this.b;
                g5 g5Var = (g5) this.c;
                if (p3Var.f4 == b70Var) {
                    p3Var.f4 = null;
                    if (p3Var.y3 && p3Var.e4 == g5Var && !g5Var.D.isEmpty()) {
                        p3Var.M2();
                        break;
                    }
                }
                break;
            case 9:
                p3 p3Var2 = (p3) this.d;
                rh.a aVar = (rh.a) this.b;
                rh.a aVar2 = (rh.a) this.c;
                ArrayList arrayList3 = p3Var2.l4;
                d3 d3Var = p3Var2.j3;
                if (d3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            rh.a aVar3 = (rh.a) arrayList3.get(i10);
                            long j10 = aVar3.t;
                            if (j10 != 0) {
                                d3Var.Y(i10, v5.l((TL_iv.RichText) p3Var2.i3.get(Long.valueOf(j10))));
                            } else {
                                d3Var.Y(i10, t5.z(aVar3.b));
                            }
                        }
                        d3Var.j0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                        break;
                    }
                }
                break;
            case 10:
                ((p3) this.d).Z4((String) this.c, (rh.a) this.b);
                break;
            case 11:
                o5 o5Var = (o5) this.d;
                rh.a aVar4 = (rh.a) this.b;
                s5 s5Var = (s5) this.c;
                q5 q5Var = o5Var.a.y;
                if (q5Var != null) {
                    ((y2) q5Var).d(aVar4, s5Var.a, s5Var.b, s5Var.c, s5Var.d, s5Var.e);
                    break;
                }
                break;
            case 12:
                sh.m mVar2 = (sh.m) this.d;
                ArrayList arrayList4 = (ArrayList) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                mVar2.getClass();
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((View) arrayList4.get(i11)).setVisibility(0);
                }
                if (mVar2.A.removeAll(arrayList5)) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        mVar2.d((f2.o1) arrayList5.get(i12));
                    }
                    mVar2.G();
                }
                mVar2.K.removeAll(arrayList4);
                break;
            default:
                sh.m mVar3 = (sh.m) this.d;
                View view = (View) this.b;
                f2.o1 o1Var = (f2.o1) this.c;
                mVar3.getClass();
                view.setVisibility(0);
                if (mVar3.A.remove(o1Var)) {
                    mVar3.d(o1Var);
                    mVar3.G();
                }
                mVar3.K.remove(view);
                break;
        }
    }

    public /* synthetic */ a(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = tLObject;
        this.b = obj2;
    }
}
