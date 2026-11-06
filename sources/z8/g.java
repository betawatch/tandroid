package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(14);
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
