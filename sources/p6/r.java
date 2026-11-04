package p6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r extends q6.a {
    public static final Parcelable.Creator<r> CREATOR = new n8.g(18);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public r(int i3, int i10, long j10, String str, boolean z10) {
        this.a = i3;
        this.b = str;
        this.c = j10;
        this.d = i10;
        this.e = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.m(parcel, 2, this.b);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
