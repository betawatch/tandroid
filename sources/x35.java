// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class x35 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ x35(as1 as1Var, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, a5c a5cVar, n8 n8Var, ArrayList arrayList2) {
        this.a = (byte) 4;
        this.b = as1Var;
        this.h = zArr;
        this.c = str;
        this.e = linearLayout;
        this.d = arrayList;
        this.n = str2;
        this.r = a5cVar;
        this.s = n8Var;
        this.f = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String F0;
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.n;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.h;
        Object obj9 = this.b;
        switch (b) {
            case 0:
                a55 a55Var = (a55) obj9;
                c35 c35Var = (c35) obj8;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj6;
                String str2 = (String) obj7;
                byte[] bArr = (byte[]) obj5;
                JSONArray jSONArray = (JSONArray) obj4;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj3;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj2;
                qe2 qe2Var = (qe2) obj;
                a55Var.getClass();
                try {
                    hl.c3(new z87((Object) a55Var, str2, (Object) bArr, (Object) a55.s(c35Var, tonconnectsession, str2, bArr, jSONArray, tL_urlAuthResultRequest.domain, null, tonconnectchallenge, a55Var.f.getCurrentTime()), (Object) qe2Var, (Object) tonconnectsession, (byte) 12));
                    break;
                } catch (Exception e) {
                    qe2Var.a(null, a55.h("prepare OAuth connect", e));
                    return;
                }
            case 1:
                final a55 a55Var2 = (a55) obj9;
                final String str3 = (String) obj7;
                final byte[] bArr2 = (byte[]) obj5;
                final TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj6;
                String str4 = ((x45) obj2).a;
                final qe2 qe2Var2 = (qe2) obj;
                final c35 c35Var2 = (c35) obj8;
                final JSONArray jSONArray2 = (JSONArray) obj4;
                final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) obj3;
                c cVar = a55Var2.b;
                if (!TextUtils.equals(str3, cVar.x()) || !Arrays.equals(bArr2, cVar.D()) || ((str = tonconnectsession2.client_id) != null && !str4.equalsIgnoreCase(str))) {
                    qe2Var2.a(null, "Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession2.id;
                    tonconnectregisterkey.client_id = str4;
                    a55Var2.f.sendRequestTyped(tonconnectregisterkey, new ic((byte) 0), new icc() { // from class: w35
                        @Override // icc
                        public final void a(Object obj10, Object obj11) {
                            a55 a55Var3 = a55.this;
                            qe2 qe2Var3 = qe2Var2;
                            c35 c35Var3 = c35Var2;
                            TL_wallet.tonConnectSession tonconnectsession3 = tonconnectsession2;
                            String str5 = str3;
                            byte[] bArr3 = bArr2;
                            JSONArray jSONArray3 = jSONArray2;
                            TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                            TL_wallet.tonConnectChallenge tonconnectchallenge2 = (TL_wallet.tonConnectChallenge) obj10;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj11;
                            a55Var3.getClass();
                            if (tL_error != null || tonconnectchallenge2 == null) {
                                qe2Var3.a(null, a55.z(tL_error, "registerKey"));
                            } else {
                                Utilities.e.c(new x35(a55Var3, c35Var3, tonconnectsession3, str5, bArr3, jSONArray3, tL_urlAuthResultRequest3, tonconnectchallenge2, qe2Var3, (byte) 0));
                            }
                        }
                    });
                    break;
                }
                break;
            case 2:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj9;
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                notificationsCustomSettingsActivity.getMessagesController().j4((ArrayList) obj8, true);
                notificationsCustomSettingsActivity.getMessagesController().c4((ArrayList) obj6, true);
                notificationsCustomSettingsActivity.getMessagesController().g4((ArrayList) obj7);
                int i = notificationsCustomSettingsActivity.s;
                if (i == 1) {
                    notificationsCustomSettingsActivity.x = arrayList;
                } else if (i == 0) {
                    notificationsCustomSettingsActivity.x = arrayList2;
                } else if (i == 3) {
                    notificationsCustomSettingsActivity.x = arrayList3;
                    notificationsCustomSettingsActivity.w = arrayList4;
                } else {
                    notificationsCustomSettingsActivity.x = arrayList5;
                }
                notificationsCustomSettingsActivity.p0(true);
                break;
            case 3:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = (TLRPC.TL_urlAuthResultRequest) obj3;
                nx0 nx0Var = (nx0) obj9;
                nx0[] nx0VarArr = (nx0[]) obj8;
                Context context = (Context) obj6;
                int[] iArr = (int[]) obj7;
                vnb vnbVar = (vnb) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj2;
                te teVar = (te) obj;
                if (!tL_urlAuthResultRequest3.request_wallet) {
                    uq7.a = nx0Var;
                    nx0Var.show();
                    break;
                } else {
                    jl7 D = a55.D(context, iArr[0], null, tL_urlAuthResultRequest3, vnbVar, new o45(nx0VarArr, zArr, inputtonconnectoauthsessionArr, tL_urlAuthResultRequest3, nx0Var, teVar, (byte) 4), new pl7(nx0VarArr, zArr, (byte) 9));
                    nx0VarArr[0] = D;
                    uq7.a = D;
                    break;
                }
            default:
                final as1 as1Var = (as1) obj9;
                boolean[] zArr2 = (boolean[]) obj8;
                String str5 = (String) obj7;
                LinearLayout linearLayout = (LinearLayout) obj6;
                ArrayList arrayList6 = (ArrayList) obj5;
                String str6 = (String) obj4;
                final a5c a5cVar = (a5c) obj3;
                final n8 n8Var = (n8) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                if (!zArr2[0]) {
                    if (str5 != null && (F0 = r3c.F0(r3c.K0(str5, null, null))) != null) {
                        b8 b8Var = new b8(2, as1Var.d, as1Var.getContext(), false, false);
                        b8Var.setChecked(true);
                        b8Var.setText(F0);
                        linearLayout.addView(b8Var);
                    }
                    int size = arrayList6.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj10 = arrayList6.get(i2);
                        i2++;
                        t4c t4cVar = (t4c) obj10;
                        final String str7 = t4cVar.a;
                        if (!TextUtils.equals(str7, str6)) {
                            b8 b8Var2 = new b8(2, as1Var.d, as1Var.getContext(), false, false);
                            boolean z = str5 != null && str5.equals(str7);
                            b8Var2.setChecked(z);
                            b8Var2.setText(t4cVar.b);
                            if (!z) {
                                final byte b2 = 0;
                                b8Var2.setOnClickListener(new View.OnClickListener() { // from class: c4c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b3 = b2;
                                        n8 n8Var2 = n8Var;
                                        String str8 = str7;
                                        a5c a5cVar2 = a5cVar;
                                        as1 as1Var2 = as1Var;
                                        switch (b3) {
                                            case 0:
                                                a5cVar2.I(as1Var2.b, str8);
                                                n8Var2.d(true);
                                                as1Var2.b();
                                                break;
                                            default:
                                                a5cVar2.I(as1Var2.b, str8);
                                                n8Var2.d(true);
                                                as1Var2.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(b8Var2);
                        }
                    }
                    linearLayout.addView(new k8(as1Var.getContext(), as1Var.d), tre.o(-1, 8));
                    int size2 = arrayList7.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj11 = arrayList7.get(i3);
                        i3++;
                        t4c t4cVar2 = (t4c) obj11;
                        final String str8 = t4cVar2.a;
                        if (!TextUtils.equals(str8, str6)) {
                            boolean z2 = str5 != null && str5.equals(str8);
                            b8 b8Var3 = new b8(2, as1Var.d, as1Var.getContext(), false, false);
                            b8Var3.setChecked(z2);
                            b8Var3.setText(t4cVar2.b);
                            if (!z2) {
                                final byte b3 = 1;
                                b8Var3.setOnClickListener(new View.OnClickListener() { // from class: c4c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        byte b32 = b3;
                                        n8 n8Var2 = n8Var;
                                        String str82 = str8;
                                        a5c a5cVar2 = a5cVar;
                                        as1 as1Var2 = as1Var;
                                        switch (b32) {
                                            case 0:
                                                a5cVar2.I(as1Var2.b, str82);
                                                n8Var2.d(true);
                                                as1Var2.b();
                                                break;
                                            default:
                                                a5cVar2.I(as1Var2.b, str82);
                                                n8Var2.d(true);
                                                as1Var2.b();
                                                break;
                                        }
                                    }
                                });
                            }
                            linearLayout.addView(b8Var3);
                        }
                    }
                    zArr2[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x35(a55 a55Var, String str, byte[] bArr, TL_wallet.tonConnectSession tonconnectsession, x45 x45Var, qe2 qe2Var, c35 c35Var, JSONArray jSONArray, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        this.a = (byte) 1;
        this.b = a55Var;
        this.c = str;
        this.d = bArr;
        this.e = tonconnectsession;
        this.s = x45Var;
        this.f = qe2Var;
        this.h = c35Var;
        this.n = jSONArray;
        this.r = tL_urlAuthResultRequest;
    }

    public /* synthetic */ x35(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.h = obj2;
        this.e = obj3;
        this.c = serializable;
        this.d = obj4;
        this.n = obj5;
        this.r = obj6;
        this.s = obj7;
        this.f = obj8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x35(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, nx0 nx0Var, nx0[] nx0VarArr, Context context, int[] iArr, vnb vnbVar, boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, te teVar) {
        this.a = (byte) 3;
        this.r = tL_urlAuthResultRequest;
        this.b = nx0Var;
        this.h = nx0VarArr;
        this.e = context;
        this.c = iArr;
        this.d = vnbVar;
        this.n = zArr;
        this.s = inputtonconnectoauthsessionArr;
        this.f = teVar;
    }
}
