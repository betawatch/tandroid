// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r8a extends b4 {
    public static final Parcelable.Creator<r8a> CREATOR = new urd((byte) 4);
    public final gt6 a;
    public String b;
    public final JSONObject c;

    public r8a(gt6 gt6Var, JSONObject jSONObject) {
        this.a = gt6Var;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8a)) {
            return false;
        }
        r8a r8aVar = (r8a) obj;
        if (vw5.a(this.c, r8aVar.c)) {
            return fse.a(this.a, r8aVar.a);
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
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
