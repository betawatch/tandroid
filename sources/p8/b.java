package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(23);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.k(parcel, 3, this.b, i7);
        xb.k(parcel, 4, this.c, i7);
        long j3 = this.d;
        xb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        xb.c(parcel, 6, this.e);
        xb.s(parcel, r10);
        this.c = null;
    }
}
