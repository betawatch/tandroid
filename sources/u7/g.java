package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends c6.a implements q {
    public static final Parcelable.Creator<g> CREATOR = new u6.p(3);
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
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.a, i10);
        f5.k(parcel, 2, this.b, i10);
        f5.r(parcel, q10);
    }
}
