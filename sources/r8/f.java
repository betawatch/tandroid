package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import q4.x;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class f extends r6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List a;
    public final String b;

    public f(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this.b != null ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.n(parcel, 1, this.a);
        xb.l(parcel, 2, this.b);
        xb.s(parcel, r10);
    }
}
