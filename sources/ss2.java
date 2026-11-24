// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ss2 extends qs2 {
    public final float d;
    public final int e;
    public volatile float f;

    public ss2(String str, int i, float f) {
        super(str);
        this.d = f;
        this.e = i;
        this.f = f;
    }

    @Override // qs2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        float f = (float) ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return false;
        }
        float max = Math.max(-3.4028235E38f, Math.min(Float.MAX_VALUE, f));
        if (max == this.f) {
            return false;
        }
        this.f = max;
        editor.putFloat(e(), max);
        return true;
    }

    @Override // qs2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e != 2) {
            return false;
        }
        float f = this.f;
        float f2 = this.d;
        if (f == f2) {
            return false;
        }
        this.f = f2;
        editor.remove(e());
        return true;
    }

    @Override // qs2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = Math.max(-3.4028235E38f, Math.min(Float.MAX_VALUE, sharedPreferences.getFloat(e(), this.d)));
        } catch (ClassCastException e) {
            fc4.g(e, true);
            this.f = this.d;
        }
    }

    public final float f() {
        return this.f;
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
