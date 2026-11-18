package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final fj d;
    public final String e;
    public boolean f;
    public boolean g;

    public a(int i7, fj fjVar, TLRPC.Document document, String str) {
        this.a = i7;
        this.d = fjVar;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10 = false;
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
            z10 = true;
        }
        this.g = z10;
    }
}
