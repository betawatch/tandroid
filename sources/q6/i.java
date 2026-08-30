package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(18);
    public final b7.w0 a;
    public final b7.w0 b;
    public final b7.w0 c;
    public final b7.w0 d;
    public final b7.w0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        b6.m.h(bArr);
        b7.w0 t6 = b7.w0.t(bArr.length, bArr);
        b6.m.h(bArr2);
        b7.w0 t9 = b7.w0.t(bArr2.length, bArr2);
        b6.m.h(bArr3);
        b7.w0 t10 = b7.w0.t(bArr3.length, bArr3);
        b6.m.h(bArr4);
        b7.w0 t11 = b7.w0.t(bArr4.length, bArr4);
        b7.w0 t12 = bArr5 == null ? null : b7.w0.t(bArr5.length, bArr5);
        this.a = t6;
        this.b = t9;
        this.c = t10;
        this.d = t11;
        this.e = t12;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", i6.b.c(this.b.u()));
            jSONObject.put("authenticatorData", i6.b.c(this.c.u()));
            jSONObject.put("signature", i6.b.c(this.d.u()));
            b7.w0 w0Var = this.e;
            if (w0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", i6.b.c(w0Var == null ? null : w0Var.u()));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return b6.m.l(this.a, iVar.a) && b6.m.l(this.b, iVar.b) && b6.m.l(this.c, iVar.c) && b6.m.l(this.d, iVar.d) && b6.m.l(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        androidx.biometric.e eVar = new androidx.biometric.e(getClass().getSimpleName(), 7);
        b7.o0 o0Var = b7.q0.d;
        byte[] u10 = this.a.u();
        eVar.D(o0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        eVar.D(o0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        eVar.D(o0Var.c(u12.length, u12), "authenticatorData");
        byte[] u13 = this.d.u();
        eVar.D(o0Var.c(u13.length, u13), "signature");
        b7.w0 w0Var = this.e;
        byte[] u14 = w0Var == null ? null : w0Var.u();
        if (u14 != null) {
            eVar.D(o0Var.c(u14.length, u14), "userHandle");
        }
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.c(parcel, 2, this.a.u());
        f5.c(parcel, 3, this.b.u());
        f5.c(parcel, 4, this.c.u());
        f5.c(parcel, 5, this.d.u());
        b7.w0 w0Var = this.e;
        f5.c(parcel, 6, w0Var == null ? null : w0Var.u());
        f5.r(parcel, q10);
    }
}
