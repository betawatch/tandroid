package x8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import w8.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
