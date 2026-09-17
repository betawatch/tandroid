package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int a;
    public final long b;
    public final List c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.a = i10;
        this.b = j3;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        w7.e0.p(parcel, 4, this.c);
        w7.e0.r(parcel, q6);
    }
}
