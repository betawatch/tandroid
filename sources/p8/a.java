package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.c(parcel, 3, this.b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        yb.s(parcel, r10);
    }
}
