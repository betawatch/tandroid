package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import u8.o;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        bc.q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        bc.s(parcel, r10);
    }
}
