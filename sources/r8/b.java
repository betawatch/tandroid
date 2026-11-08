package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import q4.x;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends r6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new x(12);
    public final int a;
    public final int b;
    public final Intent c;

    public b(int i7, int i10, Intent intent) {
        this.a = i7;
        this.b = i10;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        xb.k(parcel, 3, this.c, i7);
        xb.s(parcel, r10);
    }
}
