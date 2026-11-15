package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.b);
        yb.l(parcel, 4, this.c);
        int i11 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        yb.o(parcel, 6, this.e, i7);
        yb.k(parcel, 7, this.f, i7);
        yb.k(parcel, 8, this.h, i7);
        yb.k(parcel, 9, this.n, i7);
        yb.k(parcel, 10, this.r, i7);
        yb.k(parcel, 11, this.s, i7);
        yb.k(parcel, 12, this.w, i7);
        yb.k(parcel, 13, this.x, i7);
        yb.k(parcel, 14, this.y, i7);
        yb.k(parcel, 15, this.E, i7);
        yb.c(parcel, 16, this.F);
        boolean z10 = this.G;
        yb.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.s(parcel, r10);
    }
}
