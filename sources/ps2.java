// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ps2 extends qs2 {
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final int h;
    public volatile double i;

    public ps2(String str, double d, double d2, double d3, double d4, int i) {
        super(str);
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = i;
        this.i = d;
    }

    @Override // qs2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return false;
        }
        double max = Math.max(this.e, Math.min(this.f, d));
        if (max == this.i || Math.abs(max - this.i) < this.g) {
            return false;
        }
        this.i = max;
        editor.putLong(e(), Double.doubleToRawLongBits(max));
        return true;
    }

    @Override // qs2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.h != 2) {
            return false;
        }
        double d = this.i;
        double d2 = this.d;
        if (d == d2) {
            return false;
        }
        this.i = d2;
        editor.remove(e());
        return true;
    }

    @Override // qs2
    public final void d(SharedPreferences sharedPreferences) {
        if (!sharedPreferences.contains(e())) {
            this.i = this.d;
            return;
        }
        try {
            try {
                this.i = Math.max(this.e, Math.min(this.f, Double.longBitsToDouble(sharedPreferences.getLong(e(), 0L))));
            } catch (ClassCastException e) {
                fc4.g(e, true);
                this.i = this.d;
            }
        } catch (ClassCastException unused) {
            this.i = Math.max(this.e, Math.min(this.f, sharedPreferences.getFloat(e(), (float) this.d)));
        }
    }

    public final String toString() {
        return this.a + "=" + this.i;
    }
}
