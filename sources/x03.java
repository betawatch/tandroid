// default package

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x03 extends c4 {
    public static final Parcelable.Creator<x03> CREATOR = new g31((byte) 10);
    public final PendingIntent a;
    public final c13 b;

    public x03(PendingIntent pendingIntent, c13 c13Var) {
        this.a = pendingIntent;
        this.b = c13Var;
        if (pendingIntent == null && c13Var == null) {
            lq5.j("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.k(parcel, 2, this.b, i);
        bye.s(parcel, r);
    }
}
