package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new n(3);
    public final boolean a;
    public final int b;

    public a(int i10, boolean z10) {
        this.a = z10;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        h0.r(parcel, q6);
    }
}
