package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class k1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new j1(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        l1 l1Var = (l1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(l1Var == null ? null : l1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        l1 l1Var2 = (l1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(l1Var2 != null ? l1Var2.a : null) ? new m1(bufferedInputStream, 0) : bufferedInputStream;
    }
}
