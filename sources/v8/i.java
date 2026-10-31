package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.n(25);
    public String a;
    public b b;
    public UserAddress c;
    public k d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.a);
        h0.k(parcel, 2, this.b, i10);
        h0.k(parcel, 3, this.c, i10);
        h0.k(parcel, 4, this.d, i10);
        h0.l(parcel, 5, this.e);
        h0.b(parcel, 6, this.f);
        h0.l(parcel, 7, this.h);
        h0.b(parcel, 8, this.n);
        h0.r(parcel, q6);
    }
}
