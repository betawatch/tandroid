package p8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.k(parcel, 3, this.b, i7);
        cc.k(parcel, 4, this.c, i7);
        long j3 = this.d;
        cc.q(parcel, 5, 8);
        parcel.writeLong(j3);
        cc.c(parcel, 6, this.e);
        cc.s(parcel, r10);
        this.c = null;
    }
}
