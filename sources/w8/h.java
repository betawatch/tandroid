package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(21);
    public String a;
    public String b;
    public f c;
    public g d;
    public g e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.k(parcel, 4, this.c, i10);
        h0.k(parcel, 5, this.d, i10);
        h0.k(parcel, 6, this.e, i10);
        h0.r(parcel, q6);
    }
}
