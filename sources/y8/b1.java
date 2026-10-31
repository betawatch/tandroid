package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b1 extends o6.a {
    public static final Parcelable.Creator<b1> CREATOR = new l0(11);
    public final int a;
    public final List b;
    public final y0 c;

    public b1(int i10, ArrayList arrayList, y0 y0Var) {
        this.a = i10;
        this.b = arrayList;
        this.c = y0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.h0.p(parcel, 2, this.b);
        w7.h0.k(parcel, 3, this.c, i10);
        w7.h0.r(parcel, q6);
    }
}
