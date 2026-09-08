package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v0 extends o6.a implements x8.l {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte a;
    public final byte b;
    public final String c;

    public v0(byte b10, byte b11, String str) {
        this.a = b10;
        this.b = b11;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && this.b == v0Var.b && this.c.equals(v0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    public final String toString() {
        return a4.a.s(e2.k("AmsEntityUpdateParcelable{, mEntityId=", this.a, ", mAttributeId=", this.b, ", mValue='"), this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        w7.e0.l(parcel, 4, this.c);
        w7.e0.r(parcel, q6);
    }
}
