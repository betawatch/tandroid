// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q08 extends b4 {
    public static final Parcelable.Creator<q08> CREATOR = new v6d(4);
    public String a;
    public be1 b;
    public UserAddress c;
    public y18 d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.k(parcel, 2, this.b, i);
        mve.k(parcel, 3, this.c, i);
        mve.k(parcel, 4, this.d, i);
        mve.l(parcel, 5, this.e);
        mve.b(parcel, 6, this.f);
        mve.l(parcel, 7, this.h);
        mve.b(parcel, 8, this.n);
        mve.s(parcel, r);
    }
}
