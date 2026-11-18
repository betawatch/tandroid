package r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import q4.x;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bc.k(parcel, 3, this.c, i7);
        bc.s(parcel, r10);
    }
}
