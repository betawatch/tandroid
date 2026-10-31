package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new s(4);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.a);
        h0.l(parcel, 2, this.b);
        h0.l(parcel, 3, this.c);
        int i11 = this.d;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.k(parcel, 5, this.e, i10);
        h0.r(parcel, q6);
    }
}
