package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.a);
        yb.k(parcel, 2, this.b, i7);
        yb.k(parcel, 3, this.c, i7);
        yb.k(parcel, 4, this.d, i7);
        yb.l(parcel, 5, this.e);
        yb.b(parcel, 6, this.f);
        yb.l(parcel, 7, this.h);
        yb.b(parcel, 8, this.n);
        yb.s(parcel, r10);
    }
}
