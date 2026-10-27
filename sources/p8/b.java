package p8;

import a8.df;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import n4.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends p6.a implements q {
    public static final Parcelable.Creator<b> CREATOR = new x(20);
    public final int a;
    public final int b;
    public final Intent c;

    public b(int i10, int i11, Intent intent) {
        this.a = i10;
        this.b = i11;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status h() {
        return this.b == 0 ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.k(parcel, 3, this.c, i10);
        df.r(parcel, q5);
    }
}
