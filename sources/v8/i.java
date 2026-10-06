package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.g0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.a);
        g0.k(parcel, 2, this.b, i10);
        g0.k(parcel, 3, this.c, i10);
        g0.k(parcel, 4, this.d, i10);
        g0.l(parcel, 5, this.e);
        g0.b(parcel, 6, this.f);
        g0.l(parcel, 7, this.h);
        g0.b(parcel, 8, this.n);
        g0.r(parcel, q6);
    }
}
