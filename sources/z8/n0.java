package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n0 extends p6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int a;
    public final g b;

    public n0(int i10, g gVar) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        df.k(parcel, 3, this.b, i10);
        df.r(parcel, q5);
    }
}
