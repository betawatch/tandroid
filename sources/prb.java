// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class prb extends c4 {
    public static final Parcelable.Creator<prb> CREATOR = new ime(23);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        long j = this.a;
        bye.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.b;
        bye.q(parcel, 3, 8);
        parcel.writeLong(j2);
        bye.s(parcel, r);
    }
}
