package y5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new w7.f(15);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public n(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.a = i10;
        this.b = z10;
        this.c = z11;
        this.d = i11;
        this.e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        r8.r(parcel, q6);
    }
}
