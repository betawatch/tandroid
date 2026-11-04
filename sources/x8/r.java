package x8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r extends q6.a {
    public static final Parcelable.Creator<r> CREATOR = new w8.b(8);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public r(int i3, int i10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i3;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
