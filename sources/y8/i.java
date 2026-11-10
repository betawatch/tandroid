package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String a;
    public b b;
    public UserAddress c;
    public k d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.a);
        xb.k(parcel, 2, this.b, i7);
        xb.k(parcel, 3, this.c, i7);
        xb.k(parcel, 4, this.d, i7);
        xb.l(parcel, 5, this.e);
        xb.b(parcel, 6, this.f);
        xb.l(parcel, 7, this.h);
        xb.b(parcel, 8, this.n);
        xb.s(parcel, r10);
    }
}
