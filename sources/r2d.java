// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class r2d extends u1d {
    @Override // u1d
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) z1d.a(parcel);
        z1d.b(parcel);
        b(bundle);
        return true;
    }

    public abstract void b(Bundle bundle);
}
