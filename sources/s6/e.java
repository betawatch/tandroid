package s6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new w0(27);
    public final PendingIntent a;
    public final g b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.a = pendingIntent;
        this.b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int q6 = com.google.android.gms.internal.cast.o.q(dest, 20293);
        com.google.android.gms.internal.cast.o.k(dest, 1, this.a, i10);
        com.google.android.gms.internal.cast.o.k(dest, 2, this.b, i10);
        com.google.android.gms.internal.cast.o.r(dest, q6);
    }
}
