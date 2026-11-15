package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.gj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final gj d;
    public final String e;
    public boolean f;
    public boolean g;

    public a(int i7, gj gjVar, TLRPC.Document document, String str) {
        this.a = i7;
        this.d = gjVar;
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
