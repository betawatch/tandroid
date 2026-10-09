package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new p7.j(28);
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
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.a);
        d0.k(parcel, 2, this.b, i10);
        d0.k(parcel, 3, this.c, i10);
        d0.k(parcel, 4, this.d, i10);
        d0.l(parcel, 5, this.e);
        d0.b(parcel, 6, this.f);
        d0.l(parcel, 7, this.h);
        d0.b(parcel, 8, this.n);
        d0.r(parcel, q6);
    }
}
