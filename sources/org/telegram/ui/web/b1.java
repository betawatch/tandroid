package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class b1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new a1(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        c1 c1Var = (c1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(c1Var == null ? null : c1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        c1 c1Var2 = (c1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(c1Var2 != null ? c1Var2.a : null) ? new d1(bufferedInputStream, 0) : bufferedInputStream;
    }
}
