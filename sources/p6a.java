// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p6a extends b4 {
    public static final Parcelable.Creator<p6a> CREATOR = new rpd((byte) 4);
    public final gr6 a;
    public String b;
    public final JSONObject c;

    public p6a(gr6 gr6Var, JSONObject jSONObject) {
        this.a = gr6Var;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6a)) {
            return false;
        }
        p6a p6aVar = (p6a) obj;
        if (vu5.a(this.c, p6aVar.c)) {
            return cqe.a(this.a, p6aVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.c;
        this.b = jSONObject == null ? null : jSONObject.toString();
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
