package y7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class la extends p6.a {
    public static final Parcelable.Creator<la> CREATOR = new m5(3);
    public final float a;
    public final int b;

    public la(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.r(parcel, q5);
    }
}
