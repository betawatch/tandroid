package t8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new q8.i(15);
    public e E;
    public byte[] F;
    public boolean G;
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        int i11 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(i11);
        j8.a.p(parcel, 6, this.e, i3);
        j8.a.l(parcel, 7, this.f, i3);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.l(parcel, 9, this.n, i3);
        j8.a.l(parcel, 10, this.r, i3);
        j8.a.l(parcel, 11, this.s, i3);
        j8.a.l(parcel, 12, this.w, i3);
        j8.a.l(parcel, 13, this.x, i3);
        j8.a.l(parcel, 14, this.y, i3);
        j8.a.l(parcel, 15, this.E, i3);
        j8.a.d(parcel, 16, this.F);
        boolean z10 = this.G;
        j8.a.r(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
