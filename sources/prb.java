// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
