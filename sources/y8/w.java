package y8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(18);
    public final int a;
    public final ConnectionConfiguration b;

    public w(int i10, ConnectionConfiguration connectionConfiguration) {
        this.a = i10;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.f0.k(parcel, 3, this.b, i10);
        w7.f0.r(parcel, q6);
    }
}
