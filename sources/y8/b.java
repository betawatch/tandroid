package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.a);
        cc.l(parcel, 2, this.b);
        cc.l(parcel, 3, this.c);
        int i10 = this.d;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.k(parcel, 5, this.e, i7);
        cc.s(parcel, r10);
    }
}
