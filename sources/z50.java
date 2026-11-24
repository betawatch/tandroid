// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z50 extends c60 {
    public static final Parcelable.Creator<z50> CREATOR = new sje((byte) 12);
    public final rce a;
    public final rce b;
    public final rce c;
    public final rce d;
    public final rce e;

    public z50(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ite.h(bArr);
        rce o = rce.o(bArr.length, bArr);
        ite.h(bArr2);
        rce o2 = rce.o(bArr2.length, bArr2);
        ite.h(bArr3);
        rce o3 = rce.o(bArr3.length, bArr3);
        ite.h(bArr4);
        rce o4 = rce.o(bArr4.length, bArr4);
        rce o5 = bArr5 == null ? null : rce.o(bArr5.length, bArr5);
        this.a = o;
        this.b = o2;
        this.c = o3;
        this.d = o4;
        this.e = o5;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", xpd.b(this.b.p()));
            jSONObject.put("authenticatorData", xpd.b(this.c.p()));
            jSONObject.put("signature", xpd.b(this.d.p()));
            rce rceVar = this.e;
            if (rceVar != null) {
                jSONObject.put("userHandle", xpd.b(rceVar == null ? null : rceVar.p()));
            }
            return jSONObject;
        } catch (JSONException e) {
            rjb.k("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z50)) {
            return false;
        }
        z50 z50Var = (z50) obj;
        return fse.a(this.a, z50Var.a) && fse.a(this.b, z50Var.b) && fse.a(this.c, z50Var.c) && fse.a(this.d, z50Var.d) && fse.a(this.e, z50Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        wm9 wm9Var = new wm9(getClass().getSimpleName(), (byte) 25);
        w8e w8eVar = n9e.d;
        byte[] p = this.a.p();
        wm9Var.B(w8eVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        wm9Var.B(w8eVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        wm9Var.B(w8eVar.c(p3.length, p3), "authenticatorData");
        byte[] p4 = this.d.p();
        wm9Var.B(w8eVar.c(p4.length, p4), "signature");
        rce rceVar = this.e;
        byte[] p5 = rceVar == null ? null : rceVar.p();
        if (p5 != null) {
            wm9Var.B(w8eVar.c(p5.length, p5), "userHandle");
        }
        return wm9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a.p());
        mve.c(parcel, 3, this.b.p());
        mve.c(parcel, 4, this.c.p());
        mve.c(parcel, 5, this.d.p());
        rce rceVar = this.e;
        mve.c(parcel, 6, rceVar == null ? null : rceVar.p());
        mve.s(parcel, r);
    }
}
