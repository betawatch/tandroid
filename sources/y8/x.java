package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int a;
    public final k b;

    public x(int i10, k kVar) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.h0.k(parcel, 3, this.b, i10);
        w7.h0.r(parcel, q6);
    }
}
