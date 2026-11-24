// default package

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p13 extends b4 {
    public static final Parcelable.Creator<p13> CREATOR = new f41((byte) 10);
    public final PendingIntent a;
    public final v13 b;

    public p13(PendingIntent pendingIntent, v13 v13Var) {
        this.a = pendingIntent;
        this.b = v13Var;
        if (pendingIntent == null && v13Var == null) {
            u36.j("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.k(parcel, 2, this.b, i);
        mve.s(parcel, r);
    }
}
