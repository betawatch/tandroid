package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.a);
        bc.l(parcel, 2, this.b);
        bc.l(parcel, 3, this.c);
        int i10 = this.d;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.k(parcel, 5, this.e, i7);
        bc.s(parcel, r10);
    }
}
