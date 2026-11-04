package q8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends q6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new n8.g(27);
    public final int a;
    public final int b;
    public final Intent c;

    public b(int i3, int i10, Intent intent) {
        this.a = i3;
        this.b = i10;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.l(parcel, 3, this.c, i3);
        j8.a.t(parcel, s6);
    }
}
