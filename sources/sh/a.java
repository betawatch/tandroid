package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final ij d;
    public final String e;
    public boolean f;
    public boolean g;

    public a(int i7, ij ijVar, TLRPC.Document document, String str) {
        this.a = i7;
        this.d = ijVar;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z9 = false;
        String str = this.c;
        boolean B = str != null ? p0.B(str) : false;
        int i7 = this.a;
        if (!B) {
            w7.G(i7);
            B = w7.I(this.b).exists();
        }
        this.f = B;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z9 = true;
        }
        this.g = z9;
    }
}
