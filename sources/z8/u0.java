package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u0 extends p6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int a;
    public final int b;

    public u0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        df.r(parcel, q5);
    }
}
