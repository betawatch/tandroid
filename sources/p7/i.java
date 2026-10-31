package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new m8.i(27);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.a, i10);
        h0.p(parcel, 2, this.b);
        h0.m(parcel, 3, this.c);
        h0.r(parcel, q6);
    }
}
