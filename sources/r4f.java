// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class r4f extends c4 {
    public static final Parcelable.Creator<r4f> CREATOR = new t4f((byte) 4);
    public final byte[] a;

    public r4f(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
