package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new d1(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        f1 f1Var = (f1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(f1Var == null ? null : f1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        f1 f1Var2 = (f1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(f1Var2 != null ? f1Var2.a : null) ? new lc.z(bufferedInputStream, 1) : bufferedInputStream;
    }
}
