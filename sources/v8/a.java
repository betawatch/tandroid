package v8;

import a8.df;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import q7.m;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new m(22);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i10) {
        this.a = pointFArr;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.o(parcel, 2, this.a, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        df.r(parcel, q5);
    }
}
