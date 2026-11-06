package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(19);
    public final String a;
    public final byte[] b;
    public final int c;

    public a(int i7, String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.c(parcel, 3, this.b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        xb.s(parcel, r10);
    }
}
