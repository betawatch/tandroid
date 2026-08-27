package p7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new w0(11);
    public final byte[] a;

    public e(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.c(parcel, 2, this.a);
        r8.r(parcel, q6);
    }
}
