// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xbe extends b4 {
    public static final Parcelable.Creator<xbe> CREATOR = new t0e((byte) 15);
    public final String a;
    public final String b;
    public final long c;

    public xbe(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        mve.s(parcel, r);
    }
}
