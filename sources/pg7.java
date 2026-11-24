// default package

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pg7 extends b4 {
    public static final Parcelable.Creator<pg7> CREATOR = new d3d((byte) 1);
    public final PendingIntent a;

    public pg7(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
