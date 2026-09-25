package v8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(15);
    public PendingIntent a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.a, i10);
        f0.r(parcel, q6);
    }
}
