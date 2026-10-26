package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(20);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        long j10 = this.a;
        df.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        df.s(parcel, 3, 8);
        parcel.writeLong(j11);
        df.r(parcel, q5);
    }
}
