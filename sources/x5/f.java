package x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import n6.l;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(23);
    public final PendingIntent a;

    public f(PendingIntent pendingIntent) {
        l.g(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.a, i10);
        h0.r(parcel, q6);
    }
}
