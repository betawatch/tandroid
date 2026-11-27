// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ur2 extends yr2 {
    public final boolean d;
    public final int e;
    public volatile boolean f;

    public ur2(int i, String str, boolean z) {
        super(str);
        this.d = z;
        this.e = i;
        this.f = z;
    }

    @Override // yr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z;
        if (!(jSONValue instanceof TLRPC.TL_jsonBool) || (z = ((TLRPC.TL_jsonBool) jSONValue).value) == this.f) {
            return false;
        }
        this.f = z;
        editor.putBoolean(e(), z);
        return true;
    }

    @Override // yr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e != 2) {
            return false;
        }
        boolean z = this.f;
        boolean z2 = this.d;
        if (z == z2) {
            return false;
        }
        this.f = z2;
        editor.remove(e());
        return true;
    }

    @Override // yr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = sharedPreferences.getBoolean(e(), this.d);
        } catch (ClassCastException e) {
            cc4.g(e, true);
            this.f = this.d;
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
