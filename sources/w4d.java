// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w4d extends b4 implements uc9 {
    public static final Parcelable.Creator<w4d> CREATOR = new d3d((byte) 10);
    public final ArrayList a;
    public final String b;

    public w4d(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // uc9
    public final Status a() {
        return this.b != null ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.n(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
