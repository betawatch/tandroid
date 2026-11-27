// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yc4 {
    public final int a;
    public final TLRPC.Document b;
    public final String c;
    public final r47 d;
    public final String e;
    public boolean f;
    public boolean g;

    public yc4(int i, r47 r47Var, TLRPC.Document document, String str) {
        this.a = i;
        this.d = r47Var;
        this.b = document;
        this.c = str;
        this.e = TextUtils.isEmpty(str) ? xb4.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z = false;
        String str = this.c;
        boolean t = str != null ? bp1.t(str) : false;
        int i = this.a;
        if (!t) {
            xb4.G(i);
            t = xb4.I(this.b).exists();
        }
        this.f = t;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && xb4.G(i).S(str2)) {
            z = true;
        }
        this.g = z;
    }
}
