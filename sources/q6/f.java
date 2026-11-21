package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.a = oVar;
        this.b = z10;
        this.c = z11;
        this.d = iArr;
        this.e = i7;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.a, i7);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bc.g(parcel, 4, this.d);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        bc.g(parcel, 6, this.f);
        bc.s(parcel, r10);
    }
}
