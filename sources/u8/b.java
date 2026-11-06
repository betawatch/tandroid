package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z9 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 9, this.n);
        xb.s(parcel, r10);
    }
}
