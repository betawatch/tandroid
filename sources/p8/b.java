package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.k(parcel, 3, this.b, i7);
        yb.k(parcel, 4, this.c, i7);
        long j3 = this.d;
        yb.q(parcel, 5, 8);
        parcel.writeLong(j3);
        yb.c(parcel, 6, this.e);
        yb.s(parcel, r10);
        this.c = null;
    }
}
