// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xfe extends b4 {
    public static final Parcelable.Creator<xfe> CREATOR = new t0e((byte) 28);
    public final int a;
    public final long b;
    public final ArrayList c;

    public xfe(int i, long j, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        mve.p(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
