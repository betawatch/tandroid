package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new o(11);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        int i10 = this.c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.s(parcel, r10);
    }
}
