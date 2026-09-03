package r5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import q6.r0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 extends c6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(28);
    public final boolean a;

    public a0(boolean z4) {
        this.a = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
