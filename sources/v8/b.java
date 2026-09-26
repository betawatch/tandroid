package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new r(7);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.a);
        f0.l(parcel, 2, this.b);
        f0.l(parcel, 3, this.c);
        int i11 = this.d;
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.k(parcel, 5, this.e, i10);
        f0.r(parcel, q6);
    }
}
