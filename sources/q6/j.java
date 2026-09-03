package q6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import b7.b1;
import b7.c1;
import b7.d1;
import b7.e1;
import b7.f1;
import b7.g1;
import b7.h1;
import b7.j1;
import j7.f5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(19);
    public final b7.w0 a;
    public final b7.w0 b;
    public final b7.w0 c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        b6.m.h(bArr);
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(bArr2);
        b7.w0 t9 = b7.w0.t(bArr2.length, bArr2);
        b6.m.h(bArr3);
        b7.w0 t10 = b7.w0.t(bArr3.length, bArr3);
        this.a = t6;
        this.b = t9;
        this.c = t10;
        b6.m.h(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0223 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0061, B:24:0x006b, B:26:0x007c, B:27:0x0084, B:29:0x0092, B:31:0x00a4, B:33:0x00c2, B:35:0x00d1, B:36:0x00da, B:40:0x00e7, B:41:0x00ea, B:42:0x00f0, B:47:0x0112, B:53:0x020c, B:55:0x0223, B:59:0x0136, B:61:0x0147, B:66:0x0160, B:69:0x017c, B:71:0x0191, B:73:0x0196, B:74:0x01b6, B:75:0x01bb, B:76:0x01bc, B:77:0x01c3, B:82:0x01d0, B:84:0x01dd, B:86:0x01ea, B:87:0x0200, B:88:0x0205, B:89:0x0206, B:90:0x020b, B:92:0x0232, B:93:0x0237, B:96:0x0238, B:97:0x023f, B:98:0x0240, B:99:0x0246, B:105:0x0248, B:106:0x024b, B:109:0x00d4, B:111:0x024f, B:112:0x0256, B:114:0x0259, B:115:0x0260, B:117:0x0261, B:118:0x0268, B:119:0x026b, B:120:0x0272, B:122:0x0273, B:123:0x027a, B:127:0x027e, B:128:0x0285), top: B:2:0x000a, inners: #0, #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject e() {
        long j10;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            b7.w0 w0Var = this.b;
            if (w0Var != null) {
                jSONObject.put("clientDataJSON", i6.b.c(w0Var.u()));
            }
            b7.w0 w0Var2 = this.c;
            if (w0Var2 != null) {
                jSONObject.put("attestationObject", i6.b.c(w0Var2.u()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("cable")) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, strArr[i10]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    h1 h1Var = (h1) ((e1) h1.d(w0Var2.u()).b(e1.class)).b.get(new f1("authData"));
                    if (h1Var == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    b7.w0 w0Var3 = ((b1) h1Var.b(b1.class)).a;
                    byte[] bArr = w0Var3.b;
                    ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, w0Var3.p()).asReadOnlyBuffer();
                    try {
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                        if ((asReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                        asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                        try {
                            try {
                                int position = asReadOnlyBuffer.position();
                                int s6 = b7.w0.s(position, bArr.length, w0Var3.p());
                                j1 j1Var = new j1((s6 == 0 ? b7.w0.c : new b7.v0(bArr, position, s6)).r());
                                try {
                                    b7.u uVar = ((e1) b7.b.k(j1Var).b(e1.class)).b;
                                    h1 h1Var2 = (h1) uVar.get(new d1(3L));
                                    h1 h1Var3 = (h1) uVar.get(new d1(1L));
                                    if (h1Var2 == null || h1Var3 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j11 = ((d1) h1Var2.b(d1.class)).a;
                                        long j12 = ((d1) h1Var3.b(d1.class)).a;
                                        byte[] bArr2 = null;
                                        if (j12 != 1) {
                                            if (j12 != 2) {
                                                j10 = j11;
                                                jSONObject.put("authenticatorData", i6.b.c(w0Var3.u()));
                                                jSONObject.put("publicKeyAlgorithm", j10);
                                                if (bArr2 != null) {
                                                    jSONObject.put("publicKey", Base64.encodeToString(bArr2, 11));
                                                }
                                                return jSONObject;
                                            }
                                            j12 = 2;
                                        }
                                        h1 h1Var4 = (h1) uVar.get(new d1(-1L));
                                        if (h1Var4 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j13 = ((d1) h1Var4.b(d1.class)).a;
                                        j10 = j11;
                                        if (j12 == 2 && j13 == 1) {
                                            h1 h1Var5 = (h1) uVar.get(new d1(-2L));
                                            h1 h1Var6 = (h1) uVar.get(new d1(-3L));
                                            if (h1Var5 == null || h1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            b7.w0 w0Var4 = ((b1) h1Var5.b(b1.class)).a;
                                            b7.w0 w0Var5 = ((b1) h1Var6.b(b1.class)).a;
                                            if (w0Var4.b.length != 32 || w0Var5.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr2 = b7.b.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), w0Var4.u(), w0Var5.u());
                                        } else if (j12 == 1 && j13 == 6) {
                                            h1 h1Var7 = (h1) uVar.get(new d1(-2L));
                                            if (h1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            b7.w0 w0Var6 = ((b1) h1Var7.b(b1.class)).a;
                                            if (w0Var6.b.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArr2 = b7.b.j(Base64.decode("MCowBQYDK2VwAyEA", 0), w0Var6.u());
                                        }
                                        jSONObject.put("authenticatorData", i6.b.c(w0Var3.u()));
                                        jSONObject.put("publicKeyAlgorithm", j10);
                                        if (bArr2 != null) {
                                        }
                                        return jSONObject;
                                    } catch (g1 e) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                    }
                                } finally {
                                    try {
                                        j1Var.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (g1 e6) {
                                e = e6;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (c1 e10) {
                            e = e10;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e11) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e11);
                    }
                } catch (g1 e12) {
                    throw new IllegalArgumentException("authData value has wrong type", e12);
                }
            } catch (c1 e13) {
                e = e13;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (g1 e14) {
                e = e14;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e15) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e15);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return b6.m.l(this.a, jVar.a) && b6.m.l(this.b, jVar.b) && b6.m.l(this.c, jVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        af.d dVar = new af.d(getClass().getSimpleName(), 8);
        b7.o0 o0Var = b7.q0.d;
        byte[] u10 = this.a.u();
        dVar.D(o0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        dVar.D(o0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        dVar.D(o0Var.c(u12.length, u12), "attestationObject");
        dVar.D(Arrays.toString(this.d), "transports");
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 2, this.a.u());
        f5.c(parcel, 3, this.b.u());
        f5.c(parcel, 4, this.c.u());
        f5.m(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
