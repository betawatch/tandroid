package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.j(10);
    public byte[] E;
    public boolean F;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public f f;
    public i h;
    public j n;
    public l r;
    public k s;
    public g v;
    public c w;
    public d x;
    public e y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.a;
        e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        e0.l(parcel, 3, this.b);
        e0.l(parcel, 4, this.c);
        int i12 = this.d;
        e0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        e0.o(parcel, 6, this.e, i10);
        e0.k(parcel, 7, this.f, i10);
        e0.k(parcel, 8, this.h, i10);
        e0.k(parcel, 9, this.n, i10);
        e0.k(parcel, 10, this.r, i10);
        e0.k(parcel, 11, this.s, i10);
        e0.k(parcel, 12, this.v, i10);
        e0.k(parcel, 13, this.w, i10);
        e0.k(parcel, 14, this.x, i10);
        e0.k(parcel, 15, this.y, i10);
        e0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        e0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.r(parcel, q6);
    }
}
