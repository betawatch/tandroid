package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int a;
    public final ParcelFileDescriptor b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i10;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.g0.k(parcel, 3, this.b, i10);
        w7.g0.r(parcel, q6);
    }
}
