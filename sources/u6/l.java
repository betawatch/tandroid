package u6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import r5.c0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends c6.a {
    public static final Parcelable.Creator<l> CREATOR = new c0(27);
    public final PendingIntent a;

    public l(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q10 = f5.q(dest, 20293);
        f5.k(dest, 1, this.a, i10);
        f5.r(dest, q10);
    }
}
