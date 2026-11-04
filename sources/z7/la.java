package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class la extends q6.a {
    public static final Parcelable.Creator<la> CREATOR = new n5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public la(float f10, int i3, String str, String str2) {
        this.a = str;
        this.b = f10;
        this.c = str2;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeFloat(this.b);
        j8.a.m(parcel, 3, this.c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
