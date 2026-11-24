// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ubd extends b4 {
    public static final Parcelable.Creator<ubd> CREATOR = new lbd((byte) 4);
    public String a;
    public Bundle b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.b(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
