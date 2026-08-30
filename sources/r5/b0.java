package r5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import q6.r0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(29);
    public final int a;

    public b0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        f5.r(parcel, q10);
    }
}
