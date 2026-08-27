package x7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new w7.f(9);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.k(parcel, 3, this.b, i10);
        r8.k(parcel, 4, this.c, i10);
        long j10 = this.d;
        r8.s(parcel, 5, 8);
        parcel.writeLong(j10);
        r8.c(parcel, 6, this.e);
        r8.r(parcel, q6);
        this.c = null;
    }
}
