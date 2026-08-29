package s7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends a6.a implements q {
    public static final Parcelable.Creator<g> CREATOR = new s6.i(11);
    public final Status a;
    public final h b;

    public g(Status status, h hVar) {
        this.a = status;
        this.b = hVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
