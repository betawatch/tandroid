// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y6f extends b4 implements uc9 {
    public static final Parcelable.Creator<y6f> CREATOR = new e2f(12);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override // uc9
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.p(parcel, 2, this.b);
        mve.m(parcel, 3, this.c);
        mve.s(parcel, r);
    }
}
