package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new l0(1);
    public final String a;
    public final String b;
    public final long c;

    public m0(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.a);
        w7.h0.l(parcel, 3, this.b);
        w7.h0.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        w7.h0.r(parcel, q6);
    }
}
