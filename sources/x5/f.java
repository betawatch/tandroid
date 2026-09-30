package x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import n6.l;
import v8.r;
import w7.f0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(26);
    public final PendingIntent a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.a, i10);
        f0.r(parcel, q6);
    }
}
