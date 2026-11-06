package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean a;
    public final int b;

    public a(int i7, boolean z9) {
        this.a = z9;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        xb.s(parcel, r10);
    }
}
