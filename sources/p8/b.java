package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.k(parcel, 3, this.b, i7);
        wb.k(parcel, 4, this.c, i7);
        long j3 = this.d;
        wb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        wb.c(parcel, 6, this.e);
        wb.s(parcel, r10);
        this.c = null;
    }
}
