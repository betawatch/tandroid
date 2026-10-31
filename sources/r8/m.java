package r8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new p7.n(7);
    public e D;
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
    public g w;
    public c x;
    public d y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.c);
        int i12 = this.d;
        h0.s(parcel, 5, 4);
        parcel.writeInt(i12);
        h0.o(parcel, 6, this.e, i10);
        h0.k(parcel, 7, this.f, i10);
        h0.k(parcel, 8, this.h, i10);
        h0.k(parcel, 9, this.n, i10);
        h0.k(parcel, 10, this.r, i10);
        h0.k(parcel, 11, this.s, i10);
        h0.k(parcel, 12, this.w, i10);
        h0.k(parcel, 13, this.x, i10);
        h0.k(parcel, 14, this.y, i10);
        h0.k(parcel, 15, this.D, i10);
        h0.c(parcel, 16, this.E);
        boolean z10 = this.F;
        h0.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.r(parcel, q6);
    }
}
