package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(22);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        long j3 = this.a;
        g0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        g0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        g0.r(parcel, q6);
    }
}
