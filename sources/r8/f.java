package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import java.util.List;
import q4.x;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.n(parcel, 1, this.a);
        yb.l(parcel, 2, this.b);
        yb.s(parcel, r10);
    }
}
