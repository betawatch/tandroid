package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
