package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.k(parcel, 3, this.b, i7);
        bc.k(parcel, 4, this.c, i7);
        long j3 = this.d;
        bc.q(parcel, 5, 8);
        parcel.writeLong(j3);
        bc.c(parcel, 6, this.e);
        bc.s(parcel, r10);
        this.c = null;
    }
}
