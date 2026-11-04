package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n6 extends q6.a {
    public static final Parcelable.Creator<n6> CREATOR = new n5(1);
    public final int a;
    public final float b;
    public final int c;

    public n6(int i3, int i10, float f10, int i11) {
        if (i3 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i10;
        this.b = f10;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(1);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 4, 4);
        parcel.writeFloat(this.b);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.c);
        j8.a.t(parcel, s6);
    }
}
