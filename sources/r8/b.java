package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.n(8);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        h0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        h0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f;
        h0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        h0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.l(parcel, 9, this.n);
        h0.r(parcel, q6);
    }
}
