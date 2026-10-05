package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(8);
    public final int a;
    public final boolean b;

    public c(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g0.r(parcel, q6);
    }
}
