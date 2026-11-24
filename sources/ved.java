// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ved extends b4 {
    public static final Parcelable.Creator<ved> CREATOR = new lbd((byte) 24);
    public final pgd a;
    public final int b;
    public final int c;
    public final int d;

    public ved(pgd pgdVar, int i, int i2, int i3) {
        this.a = pgdVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void b(nh1 nh1Var) {
        pgd pgdVar = this.a;
        int i = this.b;
        if (i == 1) {
            nh1Var.a(pgdVar);
            return;
        }
        if (i == 2) {
            nh1Var.b(pgdVar);
            return;
        }
        if (i == 3) {
            nh1Var.c(pgdVar);
        } else {
            if (i == 4) {
                nh1Var.d(pgdVar);
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
        StringBuilder m = mlb.m("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        m.append(num2);
        m.append(", appErrorCode=");
        m.append(this.d);
        m.append("]");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
