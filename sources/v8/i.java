package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
