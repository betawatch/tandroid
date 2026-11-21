package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new q4.x(2);
    public final int a;
    public List b;

    public p(int i7, List list) {
        this.a = i7;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.p(parcel, 2, this.b);
        bc.s(parcel, r10);
    }
}
