package q6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s0 extends c6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(5);
    public final String a;

    public s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return b6.m.l(this.a, ((s0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.a);
        g5.r(parcel, q10);
    }
}
