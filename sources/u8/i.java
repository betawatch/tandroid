package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(10);
    public int a;
    public String b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.b);
        yb.s(parcel, r10);
    }
}
