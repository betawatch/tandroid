package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(17);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.k(parcel, 3, this.b, i10);
        h0.k(parcel, 5, this.c, i10);
        h0.r(parcel, q6);
    }
}
