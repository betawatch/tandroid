package r5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import q6.r0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a0 extends c6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(28);
    public final boolean a;

    public a0(boolean z4) {
        this.a = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        g5.r(parcel, q10);
    }
}
