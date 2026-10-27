package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
