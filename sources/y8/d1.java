package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d1 extends o6.a {
    public static final Parcelable.Creator<d1> CREATOR = new n0(11);
    public final int a;
    public final List b;
    public final a1 c;

    public d1(int i10, ArrayList arrayList, a1 a1Var) {
        this.a = i10;
        this.b = arrayList;
        this.c = a1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.e0.p(parcel, 2, this.b);
        w7.e0.k(parcel, 3, this.c, i10);
        w7.e0.r(parcel, q6);
    }
}
