package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
