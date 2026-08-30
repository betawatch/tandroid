package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new h1(this.b, this.c, this.d));
        HashMap hashMap = this.a;
        j1 j1Var = (j1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(j1Var == null ? null : j1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        j1 j1Var2 = (j1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(j1Var2 != null ? j1Var2.a : null) ? new k1(bufferedInputStream) : bufferedInputStream;
    }
}
