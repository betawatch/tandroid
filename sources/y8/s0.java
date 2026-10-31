package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new l0(7);
    public final int a;
    public final long b;
    public final List c;

    public s0(int i10, long j10, ArrayList arrayList) {
        this.a = i10;
        this.b = j10;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.h0.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        w7.h0.p(parcel, 4, this.c);
        w7.h0.r(parcel, q6);
    }
}
