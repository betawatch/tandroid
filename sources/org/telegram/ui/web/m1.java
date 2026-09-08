package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
