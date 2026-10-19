package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(20);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        long j10 = this.a;
        f0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        f0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        f0.r(parcel, q6);
    }
}
