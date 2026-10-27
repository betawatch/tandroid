package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t0 extends p6.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int a;
    public final int b;
    public final byte[] c;

    public t0(int i10, int i11, byte[] bArr) {
        this.a = i10;
        this.b = i11;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.c(parcel, 3, this.c);
        df.r(parcel, q5);
    }
}
