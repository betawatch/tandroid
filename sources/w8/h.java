package w8;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(13);
    public PendingIntent a;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.a, i10);
        df.r(parcel, q5);
    }
}
