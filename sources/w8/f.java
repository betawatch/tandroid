package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(22);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        long j3 = this.a;
        e0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        e0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        e0.r(parcel, q6);
    }
}
