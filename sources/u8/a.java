package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(24);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i10) {
        this.a = pointFArr;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.o(parcel, 2, this.a, i10);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        g0.r(parcel, q6);
    }
}
