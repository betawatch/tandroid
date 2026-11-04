package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        return "quoted-printable".equalsIgnoreCase(c1Var2 != null ? c1Var2.a : null) ? new oc.y(bufferedInputStream, 1) : bufferedInputStream;
    }
}
