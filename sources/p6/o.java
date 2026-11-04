package p6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends q6.a {
    public static final Parcelable.Creator<o> CREATOR = new n8.g(22);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public o(int i3, int i10, int i11, boolean z10, boolean z11) {
        this.a = i3;
        this.b = z10;
        this.c = z11;
        this.d = i10;
        this.e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.e);
        j8.a.t(parcel, s6);
    }
}
