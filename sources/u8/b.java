package u8;

import android.os.Parcel;
import android.os.Parcelable;
import p7.n;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new n(23);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.a;
        h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        h0.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        h0.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f7 = this.f;
        h0.s(parcel, 7, 4);
        parcel.writeFloat(f7);
        h0.r(parcel, q6);
    }
}
