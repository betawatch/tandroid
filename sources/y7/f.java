package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
import w7.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends y5.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new i(15);
    public final List a;
    public final String b;

    public f(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.b != null ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.n(parcel, 1, this.a);
        p8.l(parcel, 2, this.b);
        p8.r(parcel, q10);
    }
}
