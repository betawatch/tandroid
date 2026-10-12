package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class n6 extends o6.a {
    public static final Parcelable.Creator<n6> CREATOR = new n5(1);
    public final int a;
    public final float b;
    public final int c;

    public n6(int i10, int i11, float f7, int i12) {
        if (i10 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i11;
        this.b = f7;
        this.c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(1);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.a);
        w7.g0.s(parcel, 4, 4);
        parcel.writeFloat(this.b);
        w7.g0.s(parcel, 5, 4);
        parcel.writeInt(this.c);
        w7.g0.r(parcel, q6);
    }
}
