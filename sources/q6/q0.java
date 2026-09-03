package q6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j7.f5;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q0 extends c6.a {
    public static final Parcelable.Creator<q0> CREATOR = new l4.j(26);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public q0(byte[][] bArr) {
        b6.m.b(bArr != null);
        b6.m.b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            b6.m.b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            b6.m.b(bArr[i11] != null);
            int length = bArr[i11].length;
            b6.m.b(length == 32 || length == 64);
            i10 += 2;
        }
        this.a = bArr;
    }

    public static q0 e(JSONObject jSONObject, boolean z4) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z4) {
                    arrayList.add(h(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(j(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(i6.b.b(next));
                    if (z4) {
                        arrayList.add(h(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(j(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new q0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject f(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] g(byte[] bArr) {
        b7.l0 l0Var;
        b7.h0 h0Var;
        int i10 = b7.k0.a;
        b7.m0 m0Var = b7.j0.a;
        int i11 = m0Var.f;
        MessageDigest messageDigest = m0Var.e;
        try {
            if (m0Var.h) {
                try {
                    l0Var = new b7.l0((MessageDigest) messageDigest.clone(), i11);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) l0Var.c;
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!l0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (l0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr, 0, length2);
                if (l0Var.a) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                l0Var.a = true;
                int i12 = l0Var.b;
                if (i12 == messageDigest2.getDigestLength()) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = b7.i0.a;
                    h0Var = new b7.h0(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i12);
                    char[] cArr2 = b7.i0.a;
                    h0Var = new b7.h0(copyOf);
                }
                return (byte[]) h0Var.b.clone();
            }
            l0Var = new b7.l0(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
            MessageDigest messageDigest22 = (MessageDigest) l0Var.c;
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!l0Var.a) {
            }
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] h(JSONObject jSONObject) {
        byte[] b10 = i6.b.b(jSONObject.getString("first"));
        if (b10.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return b10;
        }
        byte[] b11 = i6.b.b(jSONObject.getString("second"));
        if (b11.length == 32) {
            return b7.b.j(b10, b11);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] j(JSONObject jSONObject) {
        byte[] g10 = g(i6.b.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? g10 : b7.b.j(g10, g(i6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.a, ((q0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i10 ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i10;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", f(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(i6.b.c(bArr[i10]), f(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return android.support.v4.media.a.o("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.d(parcel, 1, this.a);
        f5.r(parcel, q10);
    }
}
