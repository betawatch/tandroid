package s6;

import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new w0(25);
    public final boolean a;

    public c(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.s(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
