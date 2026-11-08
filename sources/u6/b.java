package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(28);
    public final PendingIntent a;

    public b(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.a, i7);
        xb.s(parcel, r10);
    }
}
