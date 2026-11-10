package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public f(o oVar, boolean z9, boolean z10, int[] iArr, int i7, int[] iArr2) {
        this.a = oVar;
        this.b = z9;
        this.c = z10;
        this.d = iArr;
        this.e = i7;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.a, i7);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.g(parcel, 4, this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        xb.g(parcel, 6, this.f);
        xb.s(parcel, r10);
    }
}
