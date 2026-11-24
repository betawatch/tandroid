// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tcd extends b4 {
    public static final Parcelable.Creator<tcd> CREATOR = new j9d((byte) 24);
    public final oed a;
    public final int b;
    public final int c;
    public final int d;

    public tcd(oed oedVar, int i, int i2, int i3) {
        this.a = oedVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void b(fg1 fg1Var) {
        oed oedVar = this.a;
        int i = this.b;
        if (i == 1) {
            fg1Var.a(oedVar);
            return;
        }
        if (i == 2) {
            fg1Var.b(oedVar);
            return;
        }
        if (i == 3) {
            fg1Var.c(oedVar);
        } else {
            if (i == 4) {
                fg1Var.d(oedVar);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        StringBuilder l = yjb.l("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        l.append(num2);
        l.append(", appErrorCode=");
        l.append(this.d);
        l.append("]");
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
