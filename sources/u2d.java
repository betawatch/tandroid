// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u2d extends b4 implements ua9 {
    public static final Parcelable.Creator<u2d> CREATOR = new b1d((byte) 10);
    public final ArrayList a;
    public final String b;

    public u2d(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // ua9
    public final Status a() {
        return this.b != null ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.n(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
