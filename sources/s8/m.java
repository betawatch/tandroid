package s8;

import a8.df;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new q7.m(9);
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
        int q5 = df.q(parcel, 20293);
        int i11 = this.a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        int i12 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(i12);
        df.o(parcel, 6, this.e, i10);
        df.k(parcel, 7, this.f, i10);
        df.k(parcel, 8, this.h, i10);
        df.k(parcel, 9, this.n, i10);
        df.k(parcel, 10, this.r, i10);
        df.k(parcel, 11, this.s, i10);
        df.k(parcel, 12, this.v, i10);
        df.k(parcel, 13, this.w, i10);
        df.k(parcel, 14, this.x, i10);
        df.k(parcel, 15, this.y, i10);
        df.c(parcel, 16, this.E);
        boolean z10 = this.F;
        df.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.r(parcel, q5);
    }
}
