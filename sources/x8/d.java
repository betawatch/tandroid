package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(17);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.b);
        double d = this.c;
        df.s(parcel, 4, 8);
        parcel.writeDouble(d);
        df.l(parcel, 5, this.d);
        long j10 = this.e;
        df.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f;
        df.s(parcel, 7, 4);
        parcel.writeInt(i12);
        df.r(parcel, q5);
    }
}
