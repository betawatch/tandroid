package sf;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.qe1;
import th.d3;
import th.g5;
import th.o5;
import th.p3;
import th.q5;
import th.s5;
import th.t5;
import th.v5;
import th.y2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                d dVar = (d) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tL_error != null) {
                    dVar.a.a(0.0f);
                    tc.b0(tL_error);
                    break;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    dVar.a.a(0.0f);
                    x3.s(R.string.UnknownError, tc.a0(dVar), null);
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
                    tc.b0(tL_error2);
                    break;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    lVar.e.a(0.0f);
                    x3.s(R.string.UnknownError, tc.a0(lVar), null);
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
                ConnectionsManager.getInstance(uVar2.a).sendRequest(deletebusinesschatlink, new qe1(9, uVar2, tL_businessChatLink2));
                break;
            case 4:
                f0.P((f0) this.d, (TL_account.TL_connectedBot) this.b, (TL_account.TL_businessBotRecipients) this.c);
                break;
            case 5:
                n0 n0Var = (n0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tL_error3 != null) {
                    n0Var.a.a(0.0f);
                    tc.b0(tL_error3);
                    break;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    n0Var.a.a(0.0f);
                    x3.s(R.string.UnknownError, tc.a0(n0Var), null);
                    break;
                } else {
                    n0Var.finishFragment();
                    break;
                }
            case 6:
                x0.U((x0) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                break;
            case 7:
                v1 v1Var = (v1) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                ArrayList arrayList2 = v1Var.d;
                if (tLObject5 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject5).timezones);
                    SerializedData serializedData = new SerializedData(tLObject5.getObjectSize());
                    tLObject5.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                    NotificationCenter.getInstance(v1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
                }
                v1Var.c = true;
                v1Var.b = false;
                break;
            case 8:
                p3 p3Var = (p3) this.d;
                j70 j70Var = (j70) this.b;
                g5 g5Var = (g5) this.c;
                if (p3Var.f4 == j70Var) {
                    p3Var.f4 = null;
                    if (p3Var.y3 && p3Var.e4 == g5Var && !g5Var.D.isEmpty()) {
                        p3Var.M2();
                        break;
                    }
                }
                break;
            case 9:
                p3 p3Var2 = (p3) this.d;
                th.a aVar = (th.a) this.b;
                th.a aVar2 = (th.a) this.c;
                ArrayList arrayList3 = p3Var2.l4;
                d3 d3Var = p3Var2.j3;
                if (d3Var != null && aVar != null && aVar2 != null) {
                    int indexOf = arrayList3.indexOf(aVar);
                    int indexOf2 = arrayList3.indexOf(aVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            th.a aVar3 = (th.a) arrayList3.get(i10);
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
                ((p3) this.d).Z4((String) this.c, (th.a) this.b);
                break;
            case 11:
                o5 o5Var = (o5) this.d;
                th.a aVar4 = (th.a) this.b;
                s5 s5Var = (s5) this.c;
                q5 q5Var = o5Var.a.y;
                if (q5Var != null) {
                    ((y2) q5Var).d(aVar4, s5Var.a, s5Var.b, s5Var.c, s5Var.d, s5Var.e);
                    break;
                }
                break;
            case 12:
                uh.m mVar = (uh.m) this.d;
                ArrayList arrayList4 = (ArrayList) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                mVar.getClass();
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((View) arrayList4.get(i11)).setVisibility(0);
                }
                if (mVar.A.removeAll(arrayList5)) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        mVar.d((f2.n1) arrayList5.get(i12));
                    }
                    mVar.G();
                }
                mVar.K.removeAll(arrayList4);
                break;
            default:
                uh.m mVar2 = (uh.m) this.d;
                View view = (View) this.b;
                f2.n1 n1Var = (f2.n1) this.c;
                mVar2.getClass();
                view.setVisibility(0);
                if (mVar2.A.remove(n1Var)) {
                    mVar2.d(n1Var);
                    mVar2.G();
                }
                mVar2.K.remove(view);
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
