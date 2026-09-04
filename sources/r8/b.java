package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        int q6 = e0.q(parcel, 20293);
        int i11 = this.a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        e0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f;
        e0.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        e0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 9, this.n);
        e0.r(parcel, q6);
    }
}
