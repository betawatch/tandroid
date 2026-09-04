package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class m1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new l1(this.b, this.c, this.d));
        HashMap hashMap = this.a;
        n1 n1Var = (n1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(n1Var == null ? null : n1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        n1 n1Var2 = (n1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(n1Var2 != null ? n1Var2.a : null) ? new o1(bufferedInputStream) : bufferedInputStream;
    }
}
