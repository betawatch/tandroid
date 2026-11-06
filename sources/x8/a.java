package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import u8.o;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i7) {
        this.a = pointFArr;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.o(parcel, 2, this.a, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        xb.s(parcel, r10);
    }
}
