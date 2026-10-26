package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new q7.m(10);
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
        int q5 = df.q(parcel, 20293);
        int i11 = this.a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        df.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i13);
        int i14 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(i14);
        int i15 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeInt(i15);
        int i16 = this.f;
        df.s(parcel, 7, 4);
        parcel.writeInt(i16);
        boolean z10 = this.h;
        df.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.l(parcel, 9, this.n);
        df.r(parcel, q5);
    }
}
