// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xud extends b4 {
    public static final Parcelable.Creator<xud> CREATOR = new urd((byte) 11);
    public final int a;
    public final boolean b;
    public final boolean c;

    public xud(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.s(parcel, r);
    }
}
