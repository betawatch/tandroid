package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e1 extends p6.a {
    public static final Parcelable.Creator<e1> CREATOR = new o0(11);
    public final int a;
    public final List b;
    public final b1 c;

    public e1(int i10, ArrayList arrayList, b1 b1Var) {
        this.a = i10;
        this.b = arrayList;
        this.c = b1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.p(parcel, 2, this.b);
        df.k(parcel, 3, this.c, i10);
        df.r(parcel, q5);
    }
}
