package th;

import android.text.TextUtils;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final zi d;
    public final String e;
    public boolean f;
    public boolean g;

    public a(int i3, zi ziVar, TLRPC.Document document, String str) {
        this.a = i3;
        this.d = ziVar;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10 = false;
        String str = this.c;
        boolean p10 = str != null ? t4.c.p(str) : false;
        int i3 = this.a;
        if (!p10) {
            w7.G(i3);
            p10 = w7.I(this.b).exists();
        }
        this.f = p10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && w7.G(i3).T(str2)) {
            z10 = true;
        }
        this.g = z10;
    }
}
