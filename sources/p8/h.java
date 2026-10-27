package p8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
import o6.v;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(23);
    public final int a;
    public final l6.a b;
    public final v c;

    public h(int i10, l6.a aVar, v vVar) {
        this.a = i10;
        this.b = aVar;
        this.c = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.k(parcel, 2, this.b, i10);
        df.k(parcel, 3, this.c, i10);
        df.r(parcel, q5);
    }
}
