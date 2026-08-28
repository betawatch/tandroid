package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new w7.i(10);
    public final n a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i9, int[] iArr2) {
        this.a = nVar;
        this.b = z10;
        this.c = z11;
        this.d = iArr;
        this.e = i9;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.a, i9);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.g(parcel, 4, this.d);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        p8.g(parcel, 6, this.f);
        p8.r(parcel, q10);
    }
}
