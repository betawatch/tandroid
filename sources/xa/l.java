package xa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final Bundle a;
    public a0.f b;

    public l(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.b(parcel, 2, this.a);
        h0.r(parcel, q6);
    }
}
