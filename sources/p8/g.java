package p8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
import o6.u;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(22);
    public final int a;
    public final u b;

    public g(int i10, u uVar) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.k(parcel, 2, this.b, i10);
        df.r(parcel, q5);
    }
}
