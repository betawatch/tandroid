package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new q7.m(11);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.a, i10);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        df.o(parcel, 5, this.d, i10);
        df.o(parcel, 6, this.e, i10);
        df.m(parcel, 7, this.f);
        df.o(parcel, 8, this.h, i10);
        df.r(parcel, q5);
    }
}
