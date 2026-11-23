package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        int i10 = this.a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.b);
        cc.l(parcel, 4, this.c);
        int i11 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(i11);
        cc.o(parcel, 6, this.e, i7);
        cc.k(parcel, 7, this.f, i7);
        cc.k(parcel, 8, this.h, i7);
        cc.k(parcel, 9, this.n, i7);
        cc.k(parcel, 10, this.r, i7);
        cc.k(parcel, 11, this.s, i7);
        cc.k(parcel, 12, this.w, i7);
        cc.k(parcel, 13, this.x, i7);
        cc.k(parcel, 14, this.y, i7);
        cc.k(parcel, 15, this.E, i7);
        cc.c(parcel, 16, this.F);
        boolean z10 = this.G;
        cc.q(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.s(parcel, r10);
    }
}
