package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;
import q6.w;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int a;
    public final w b;

    public g(int i7, w wVar) {
        this.a = i7;
        this.b = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.k(parcel, 2, this.b, i7);
        xb.s(parcel, r10);
    }
}
