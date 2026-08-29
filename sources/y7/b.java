package y7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.cast.o;
import w5.k;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new k(13);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.a);
        o.k(parcel, 3, this.b, i10);
        o.k(parcel, 4, this.c, i10);
        long j10 = this.d;
        o.s(parcel, 5, 8);
        parcel.writeLong(j10);
        o.c(parcel, 6, this.e);
        o.r(parcel, q6);
        this.c = null;
    }
}
