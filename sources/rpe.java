// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class rpe {
    public static xq2 a(String str, String str2) {
        ya0 ya0Var = new ya0(str, str2);
        wq2 b = xq2.b(ya0.class);
        b.e = true;
        b.f = new vq2(ya0Var, (byte) 1);
        return b.b();
    }

    public static xq2 b(String str, h64 h64Var) {
        wq2 b = xq2.b(ya0.class);
        b.e = true;
        b.a(if3.b(Context.class));
        b.f = new nv4(str, h64Var);
        return b.b();
    }
}
