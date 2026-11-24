// default package

import android.content.SharedPreferences;
import java.util.function.LongSupplier;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class wf6 extends fr2 {
    public final LongSupplier d;
    public final long e;
    public final long f;
    public final int g;
    public volatile boolean h;
    public volatile long i;

    public wf6(String str, LongSupplier longSupplier, long j, long j2, int i) {
        super(str);
        this.d = longSupplier;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // fr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (d != Math.rint(d) || d < -9.223372036854776E18d || d >= 9.223372036854776E18d) {
            return false;
        }
        long max = Math.max(this.e, Math.min(this.f, (long) d));
        if (max == f()) {
            return false;
        }
        this.i = max;
        this.h = true;
        editor.putLong(e(), max);
        return true;
    }

    @Override // fr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.g == 2 && this.h) {
            long j = this.i;
            this.h = false;
            editor.remove(e());
            if (j != f()) {
                return true;
            }
        }
        return false;
    }

    @Override // fr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            if (!sharedPreferences.contains(e())) {
                this.h = false;
                return;
            }
            this.i = Math.max(this.e, Math.min(this.f, sharedPreferences.getLong(e(), 0L)));
            this.h = true;
        } catch (ClassCastException e) {
            fa4.g(e, true);
            this.h = false;
        }
    }

    public final long f() {
        if (this.h) {
            return this.i;
        }
        return Math.max(this.e, Math.min(this.f, this.d.getAsLong()));
    }
}
