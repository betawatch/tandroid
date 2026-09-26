package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class ag extends o6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public ag(int i10, int i11, int i12, long j3, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.f0.r(parcel, q6);
    }
}
