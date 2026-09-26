package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new p7.j(20);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.l(parcel, 3, this.b);
        int i11 = this.c;
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.r(parcel, q6);
    }
}
