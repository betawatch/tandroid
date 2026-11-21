package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public r(int i7, int i10, long j3, String str, boolean z10) {
        this.a = i7;
        this.b = str;
        this.c = j3;
        this.d = i10;
        this.e = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.l(parcel, 2, this.b);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bc.s(parcel, r10);
    }
}
