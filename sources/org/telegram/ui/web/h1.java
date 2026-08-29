package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h1 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new g1(this.b, this.c, this.d));
        HashMap hashMap = this.a;
        i1 i1Var = (i1) hashMap.get("content-transfer-encoding");
        if ("base64".equals(i1Var == null ? null : i1Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        i1 i1Var2 = (i1) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(i1Var2 != null ? i1Var2.a : null) ? new j1(bufferedInputStream) : bufferedInputStream;
    }
}
