// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vx8 extends c4 {
    public static final Parcelable.Creator<vx8> CREATOR = new m9d((byte) 23);
    public final yx8 a;
    public final by8 b;
    public final byte[] c;
    public final ArrayList d;
    public final Double e;
    public final ArrayList f;
    public final f50 h;
    public final Integer n;
    public final aub r;
    public final ey s;
    public final y40 w;
    public final String x;
    public final ResultReceiver y;

    public vx8(yx8 yx8Var, by8 by8Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, f50 f50Var, Integer num, aub aubVar, String str, y40 y40Var, String str2, ResultReceiver resultReceiver) {
        this.y = resultReceiver;
        if (str2 != null) {
            try {
                vx8 b = b(new JSONObject(str2));
                this.a = b.a;
                this.b = b.b;
                this.c = b.c;
                this.d = b.d;
                this.e = b.e;
                this.f = b.f;
                this.h = b.h;
                this.n = b.n;
                this.r = b.r;
                this.s = b.s;
                this.w = b.w;
                this.x = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        xve.h(yx8Var);
        this.a = yx8Var;
        xve.h(by8Var);
        this.b = by8Var;
        xve.h(bArr);
        this.c = bArr;
        xve.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.h = f50Var;
        this.n = num;
        this.r = aubVar;
        if (str != null) {
            try {
                this.s = ey.a(str);
            } catch (dy e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.s = null;
        }
        this.w = y40Var;
        this.x = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vx8 b(JSONObject jSONObject) {
        ArrayList arrayList;
        f50 f50Var;
        y40 y40Var;
        ey eyVar;
        int i;
        pcd pcdVar;
        pcd b;
        ohf ohfVar;
        xjf xjfVar;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        iid iidVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        yx8 yx8Var = new yx8(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        by8 by8Var = new by8(jSONObject3.getString("name"), lsd.a(jSONObject3.getString("id")), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] a = lsd.a(jSONObject.getString("challenge"));
        xve.h(a);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
            try {
                iidVar = new qid(new xx8(jSONObject4.getString(TeXSymbolParser.TYPE_ATTR), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                iidVar = qfd.a;
            }
            if (iidVar.b()) {
                arrayList3.add(iidVar.a());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i3 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList4 = new ArrayList();
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                Parcelable.Creator<wx8> creator = wx8.CREATOR;
                String string = jSONObject5.getString(TeXSymbolParser.TYPE_ATTR);
                byte[] decode = Base64.decode(jSONObject5.getString(str3), i3);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    jSONArray = jSONArray4;
                    str = str3;
                    arrayList2 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    jSONArray = jSONArray4;
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i5);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (b5c unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i5++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new wx8(string, decode, arrayList2));
                i4++;
                jSONArray4 = jSONArray;
                str3 = str;
                i3 = 11;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            f50Var = new f50(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            f50Var = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            ra4 ra4Var = jSONObject7.has("fidoAppIdExtension") ? new ra4(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                ra4Var = new ra4(jSONObject7.getString("appid"));
            }
            ra4 ra4Var2 = ra4Var;
            if (!jSONObject7.has("prf")) {
                i = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    b = pcd.b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    pcdVar = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        ohfVar = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i);
                            arrayList5.add(new cef(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i++;
                        }
                        ohfVar = new ohf(arrayList5);
                    }
                    tbc tbcVar = !jSONObject7.has("userVerificationMethodExtension") ? new tbc(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    mmf mmfVar = !jSONObject7.has("google_multiAssertionExtension") ? new mmf(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    gad gadVar = !jSONObject7.has("google_sessionIdExtension") ? new gad(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    sad sadVar = !jSONObject7.has("google_silentVerificationExtension") ? new sad(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        xjfVar = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        xjfVar = new xjf();
                    }
                    y40Var = new y40(ra4Var2, ohfVar, tbcVar, mmfVar, gadVar, sadVar, xjfVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new lbd(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new h15(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, pcdVar, !jSONObject7.has("txAuthSimple") ? new afd(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i = 0;
                b = pcd.b(jSONObject7.getJSONObject("prf"), false);
            }
            pcdVar = b;
            if (jSONObject7.has("cableAuthenticationExtension")) {
            }
            if (!jSONObject7.has("userVerificationMethodExtension")) {
            }
            if (!jSONObject7.has("google_multiAssertionExtension")) {
            }
            if (!jSONObject7.has("google_sessionIdExtension")) {
            }
            if (!jSONObject7.has("google_silentVerificationExtension")) {
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
            }
            y40Var = new y40(ra4Var2, ohfVar, tbcVar, mmfVar, gadVar, sadVar, xjfVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new lbd(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new h15(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, pcdVar, !jSONObject7.has("txAuthSimple") ? new afd(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            y40Var = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                eyVar = ey.a(jSONObject.getString("attestation"));
            } catch (dy e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                eyVar = ey.b;
            }
        } else {
            eyVar = null;
        }
        return new vx8(yx8Var, by8Var, a, arrayList3, valueOf, arrayList, f50Var, null, null, eyVar == null ? null : eyVar.a, y40Var, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vx8)) {
            return false;
        }
        vx8 vx8Var = (vx8) obj;
        ArrayList arrayList = vx8Var.f;
        ArrayList arrayList2 = vx8Var.d;
        if (!vue.a(this.a, vx8Var.a) || !vue.a(this.b, vx8Var.b) || !Arrays.equals(this.c, vx8Var.c) || !vue.a(this.e, vx8Var.e)) {
            return false;
        }
        ArrayList arrayList3 = this.d;
        if (!arrayList3.containsAll(arrayList2) || !arrayList2.containsAll(arrayList3)) {
            return false;
        }
        ArrayList arrayList4 = this.f;
        if (arrayList4 == null) {
            if (arrayList != null) {
                return false;
            }
        } else if (arrayList == null || !arrayList4.containsAll(arrayList) || !arrayList.containsAll(arrayList4)) {
            return false;
        }
        return vue.a(this.h, vx8Var.h) && vue.a(this.n, vx8Var.n) && vue.a(this.r, vx8Var.r) && vue.a(this.s, vx8Var.s) && vue.a(this.w, vx8Var.w) && vue.a(this.x, vx8Var.x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String b = lsd.b(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.r);
        String valueOf7 = String.valueOf(this.s);
        String valueOf8 = String.valueOf(this.w);
        StringBuilder l = xnb.l("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        qu6.u(l, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        l.append(this.e);
        l.append(", \n excludeList=");
        l.append(valueOf4);
        l.append(", \n authenticatorSelection=");
        l.append(valueOf5);
        l.append(", \n requestId=");
        l.append(this.n);
        l.append(", \n tokenBinding=");
        l.append(valueOf6);
        l.append(", \n attestationConveyancePreference=");
        l.append(valueOf7);
        l.append(", \n authenticationExtensions=");
        l.append(valueOf8);
        l.append("}");
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.k(parcel, 3, this.b, i);
        bye.c(parcel, 4, this.c);
        bye.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            bye.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        bye.p(parcel, 7, this.f);
        bye.k(parcel, 8, this.h, i);
        bye.i(parcel, 9, this.n);
        bye.k(parcel, 10, this.r, i);
        ey eyVar = this.s;
        bye.l(parcel, 11, eyVar == null ? null : eyVar.a);
        bye.k(parcel, 12, this.w, i);
        bye.l(parcel, 13, this.x);
        bye.k(parcel, 14, this.y, i);
        bye.s(parcel, r);
    }

    public vx8(String str) {
        try {
            vx8 b = b(new JSONObject(str));
            this.a = b.a;
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.h = b.h;
            this.n = b.n;
            this.r = b.r;
            this.s = b.s;
            this.w = b.w;
            this.x = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
