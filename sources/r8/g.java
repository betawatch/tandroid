package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;
import q6.w;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int a;
    public final w b;

    public g(int i7, w wVar) {
        this.a = i7;
        this.b = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 2, this.b, i7);
        bc.s(parcel, r10);
    }
}
