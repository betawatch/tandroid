// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y9d extends b4 {
    public static final Parcelable.Creator<y9d> CREATOR = new v6d((byte) 21);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public y9d(byte[][] bArr) {
        ite.b(bArr != null);
        ite.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            ite.b(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            ite.b(bArr[i2] != null);
            int length = bArr[i2].length;
            ite.b(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public static y9d b(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(f(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(xpd.a(next));
                    if (z) {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new y9d((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject c(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] d(byte[] bArr) {
        dbc dbcVar;
        int i = e7e.a;
        j8e j8eVar = d7e.a;
        int i2 = j8eVar.b;
        MessageDigest messageDigest = j8eVar.a;
        try {
            if (j8eVar.c) {
                try {
                    dbcVar = new dbc((MessageDigest) messageDigest.clone(), i2);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) dbcVar.c;
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!dbcVar.a) {
                    dq9.m("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (dbcVar.a) {
                    dq9.m("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                messageDigest2.update(bArr, 0, length2);
                if (dbcVar.a) {
                    dq9.m("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                dbcVar.a = true;
                int i3 = dbcVar.b;
                return (byte[]) (i3 == messageDigest2.getDigestLength() ? new e6e(messageDigest2.digest()) : new e6e(Arrays.copyOf(messageDigest2.digest(), i3))).b.clone();
            }
            dbcVar = new dbc(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
            MessageDigest messageDigest22 = (MessageDigest) dbcVar.c;
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!dbcVar.a) {
            }
        } catch (NoSuchAlgorithmException e) {
            bh7.j(e);
            return null;
        }
    }

    public static byte[] e(JSONObject jSONObject) {
        byte[] a = xpd.a(jSONObject.getString("first"));
        if (a.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return a;
        }
        byte[] a2 = xpd.a(jSONObject.getString("second"));
        if (a2.length == 32) {
            return e4f.a(a, a2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] d = d(xpd.a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? d : e4f.a(d, d(xpd.a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y9d) {
            return Arrays.deepEquals(this.a, ((y9d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", c(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(xpd.b(bArr[i]), c(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return kt6.o("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.d(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
