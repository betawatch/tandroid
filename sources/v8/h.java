package v8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(12);
    public PendingIntent a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.a, i10);
        h0.r(parcel, q6);
    }
}
