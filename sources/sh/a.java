package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
