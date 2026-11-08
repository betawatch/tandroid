package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.a);
        xb.l(parcel, 2, this.b);
        xb.l(parcel, 3, this.c);
        int i10 = this.d;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.k(parcel, 5, this.e, i7);
        xb.s(parcel, r10);
    }
}
