package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
