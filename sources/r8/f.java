package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import java.util.List;
import q4.x;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class f extends r6.a implements r {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List a;
    public final String b;

    public f(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status a() {
        return this.b != null ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.n(parcel, 1, this.a);
        bc.l(parcel, 2, this.b);
        bc.s(parcel, r10);
    }
}
