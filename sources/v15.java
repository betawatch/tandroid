// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v15 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v15(w25 w25Var, x15 x15Var, y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.a = (byte) 3;
        this.b = w25Var;
        this.d = x15Var;
        this.e = y05Var;
        this.f = tonconnectsession;
        this.c = str;
        this.g = bArr;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        int i = 0;
        switch (this.a) {
            case 0:
                w25 w25Var = (w25) this.b;
                u36 u36Var = (u36) this.d;
                String str = (String) this.c;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w25Var.getClass();
                if (tL_error != null || tonconnectsession2 == null) {
                    u36Var.a(null, w25.z(tL_error, "createSession"));
                    break;
                } else {
                    ArrayList arrayList = w25Var.d;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.id == tonconnectsession2.id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            w25Var.p(tonconnectsession);
                            u36Var.a(new r25(tonconnectsession, str, str2, str3, str4), null);
                            break;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    w25Var.p(tonconnectsession);
                    u36Var.a(new r25(tonconnectsession, str, str2, str3, str4), null);
                }
                break;
            case 1:
                w25 w25Var2 = (w25) this.b;
                pz1 pz1Var = (pz1) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.e;
                String str5 = (String) this.c;
                byte[] bArr = (byte[]) this.f;
                r25 r25Var = (r25) this.g;
                y05 y05Var = (y05) obj;
                String str6 = (String) obj2;
                w25Var2.getClass();
                if (str6 == null) {
                    if (y05Var != null) {
                        y05 b = y05Var.b();
                        Utilities.e.c(new i87((Object) w25Var2, (Object) b, (Object) tonconnectsession4, (Object) str5, (Object) bArr, (Object) r25Var, (Object) new x15(b, pz1Var, (byte) 3), (byte) 8));
                        break;
                    } else {
                        str6 = "Recovery phrase is unavailable";
                    }
                }
                pz1Var.a(str6);
                break;
            case 2:
                w25 w25Var3 = (w25) this.b;
                ae2 ae2Var = (ae2) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str7 = (String) this.c;
                byte[] bArr2 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c cVar = w25Var3.b;
                if (tL_error2 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.id != tL_urlAuthResultRequest.tc_session_id || !tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) || tonconnectsession5.closed || tonconnectsession5.closing || tonconnectsession5.nonce == null || !TextUtils.equals(str7, cVar.x()) || !Arrays.equals(bArr2, cVar.D())) {
                        ae2Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        break;
                    } else {
                        cVar.E(true, false, false, new t15(w25Var3, ae2Var, tonconnectsession5, str7, bArr2, jSONArray, tL_urlAuthResultRequest));
                        break;
                    }
                } else {
                    ae2Var.a(null, w25.z(tL_error2, "createSession"));
                    break;
                }
                break;
            case 3:
                w25 w25Var4 = (w25) this.b;
                x15 x15Var = (x15) this.d;
                y05 y05Var2 = (y05) this.e;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.f;
                String str8 = (String) this.c;
                byte[] bArr3 = (byte[]) this.g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                w25Var4.getClass();
                if (tL_error3 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new i87((Object) w25Var4, (Object) y05Var2, (Object) tonconnectsession6, (Object) str8, (Object) bArr3, (Object) tonconnectnexteventid, (Object) x15Var, (byte) 10));
                    break;
                } else {
                    x15Var.a(w25.z(tL_error3, "getNextEventId"));
                    break;
                }
            case 4:
                j35 j35Var = (j35) this.b;
                int[] iArr = (int[]) this.d;
                c cVar2 = (c) this.c;
                TextView textView = (TextView) this.e;
                v25 v25Var = (v25) this.f;
                hn1 hn1Var = (hn1) this.g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!j35Var.e && !j35Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder r = c.r(wallettransaction.fee, true);
                        CharSequence q = cVar2.q(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(q) ? k96.V(null, null, 2131742876, r) : k96.V(null, null, 2131742875, r, q));
                    } else if (cVar2.z() < v25Var.c) {
                        iArr[0] = 2;
                        textView.setText(k96.M0(2131742822, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(k96.M0(2131742723, null));
                        if (str9 != null) {
                            w25.m("widget preview", str9);
                        }
                    }
                    hn1Var.run();
                    break;
                }
                break;
            default:
                vqa vqaVar = (vqa) this.b;
                boolean[] zArr = (boolean[]) this.d;
                TextView textView2 = (TextView) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                long[] jArr = (long[]) this.g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (!zArr[0]) {
                    if (stargiftdepositpayload != null) {
                        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                        if (c.C(vqaVar.a).z() >= stargiftdepositpayload.amount) {
                            runnableArr[0] = c.C(vqaVar.a).j(stargiftdepositpayload, new w77(textView2, jArr, (byte) 10));
                            break;
                        } else {
                            textView2.setVisibility(8);
                            break;
                        }
                    } else {
                        textView2.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v15(w25 w25Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, byte b) {
        this.a = b;
        this.b = w25Var;
        this.d = obj;
        this.e = tLObject;
        this.c = str;
        this.f = bArr;
        this.g = obj2;
    }

    public /* synthetic */ v15(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
