package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import q4.x;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b extends r6.a implements r {
    public static final Parcelable.Creator<b> CREATOR = new x(12);
    public final int a;
    public final int b;
    public final Intent c;

    public b(int i7, int i10, Intent intent) {
        this.a = i7;
        this.b = i10;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status a() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.k(parcel, 3, this.c, i7);
        yb.s(parcel, r10);
    }
}
