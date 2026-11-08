package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(12);
    public String a;
    public String b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.s(parcel, r10);
    }
}
