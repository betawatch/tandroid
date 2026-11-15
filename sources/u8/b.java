package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f;
        yb.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z10 = this.h;
        yb.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.l(parcel, 9, this.n);
        yb.s(parcel, r10);
    }
}
