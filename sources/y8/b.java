package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.a);
        yb.l(parcel, 2, this.b);
        yb.l(parcel, 3, this.c);
        int i10 = this.d;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.k(parcel, 5, this.e, i7);
        yb.s(parcel, r10);
    }
}
