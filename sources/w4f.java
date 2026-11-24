// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class w4f extends b4 implements ua9 {
    public static final Parcelable.Creator<w4f> CREATOR = new c0f(12);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override // ua9
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.p(parcel, 2, this.b);
        jte.m(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
