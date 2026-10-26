package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new s(2);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.a;
        df.s(parcel, 1, 4);
        parcel.writeInt(i11);
        df.l(parcel, 2, this.b);
        df.l(parcel, 3, this.c);
        df.r(parcel, q5);
    }
}
