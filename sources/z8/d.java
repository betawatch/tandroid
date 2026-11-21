package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.b);
        double d = this.c;
        bc.q(parcel, 4, 8);
        parcel.writeDouble(d);
        bc.l(parcel, 5, this.d);
        long j3 = this.e;
        bc.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        bc.s(parcel, r10);
    }
}
