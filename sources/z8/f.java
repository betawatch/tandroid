package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        long j3 = this.a;
        xb.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        xb.q(parcel, 3, 8);
        parcel.writeLong(j10);
        xb.s(parcel, r10);
    }
}
