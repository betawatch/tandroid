package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k extends p6.a {
    public static final Parcelable.Creator<k> CREATOR = new d(6);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public k(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = i10;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.r(parcel, q5);
    }
}
