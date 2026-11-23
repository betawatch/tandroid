package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.a);
        cc.k(parcel, 2, this.b, i7);
        cc.k(parcel, 3, this.c, i7);
        cc.k(parcel, 4, this.d, i7);
        cc.l(parcel, 5, this.e);
        cc.b(parcel, 6, this.f);
        cc.l(parcel, 7, this.h);
        cc.b(parcel, 8, this.n);
        cc.s(parcel, r10);
    }
}
