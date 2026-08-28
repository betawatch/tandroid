package y7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import g7.p8;
import w7.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends y5.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new i(14);
    public final int a;
    public final int b;
    public final Intent c;

    public b(int i9, int i10, Intent intent) {
        this.a = i9;
        this.b = i10;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.k(parcel, 3, this.c, i9);
        p8.r(parcel, q10);
    }
}
