package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new p7.j(11);
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
        int q6 = g0.q(parcel, 20293);
        int i11 = this.a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.l(parcel, 9, this.n);
        g0.r(parcel, q6);
    }
}
