package yb;

import a8.bb;
import a8.y6;
import android.content.Context;
import bi.m7;
import com.google.android.gms.common.api.q;
import h2.o0;
import java.util.Locale;
import pb.g;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c extends q {
    public final g b;

    public c(g gVar) {
        super(4);
        this.b = gVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final Object Q0(Object obj) {
        a aVar;
        xb.a aVar2 = (xb.a) obj;
        Context b10 = this.b.b();
        n6.e.b.getClass();
        if (n6.e.a(b10) >= 204700000) {
            aVar = new o0(b10, aVar2);
        } else {
            m7 m7Var = new m7();
            m7Var.b = b10;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            m7Var.c = new y6(1, -1, aVar2.a, 1);
            n6.e.b.getClass();
            m7Var.d = n6.e.a(b10) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
            aVar = m7Var;
        }
        return new d(aVar2, aVar, bb.c());
    }
}
