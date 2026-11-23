package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.a);
        bc.k(parcel, 2, this.b, i7);
        bc.k(parcel, 3, this.c, i7);
        bc.k(parcel, 4, this.d, i7);
        bc.l(parcel, 5, this.e);
        bc.b(parcel, 6, this.f);
        bc.l(parcel, 7, this.h);
        bc.b(parcel, 8, this.n);
        bc.s(parcel, r10);
    }
}
