package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m4 extends o6.a {
    public static final Parcelable.Creator<m4> CREATOR = new n5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public m4(float f7, int i10, String str, String str2) {
        this.b = str2;
        this.c = f7;
        this.a = str;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        w7.h0.l(parcel, 4, this.a);
        w7.h0.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
