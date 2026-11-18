package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
