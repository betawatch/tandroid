package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import q4.x;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int a;
    public final n6.a b;
    public final q6.x c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.a = i7;
        this.b = aVar;
        this.c = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.k(parcel, 2, this.b, i7);
        xb.k(parcel, 3, this.c, i7);
        xb.s(parcel, r10);
    }
}
