package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class oa extends o6.a {
    public static final Parcelable.Creator<oa> CREATOR = new n5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public oa(float f7, int i10, String str, String str2) {
        this.a = str;
        this.b = f7;
        this.c = str2;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 1, this.a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        w7.h0.l(parcel, 3, this.c);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
