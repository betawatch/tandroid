package w7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new i(1);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.k(parcel, 3, this.b, i9);
        p8.k(parcel, 4, this.c, i9);
        long j10 = this.d;
        p8.s(parcel, 5, 8);
        parcel.writeLong(j10);
        p8.c(parcel, 6, this.e);
        p8.r(parcel, q10);
        this.c = null;
    }
}
