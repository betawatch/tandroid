package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends y5.a {
    public static final Parcelable.Creator<n> CREATOR = new w7.i(7);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public n(int i9, int i10, int i11, boolean z10, boolean z11) {
        this.a = i9;
        this.b = z10;
        this.c = z11;
        this.d = i10;
        this.e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        p8.r(parcel, q10);
    }
}
