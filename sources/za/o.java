package za;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends q6.a {
    public static final Parcelable.Creator<o> CREATOR = new y8.i(9);
    public final Bundle a;
    public a0.f b;

    public o(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.c(parcel, 2, this.a);
        j8.a.t(parcel, s6);
    }
}
