package yb;

import a8.bb;
import a8.y6;
import android.content.Context;
import bi.p7;
import com.google.android.gms.common.api.q;
import h2.o0;
import java.util.Locale;
import pb.g;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
            p7 p7Var = new p7();
            p7Var.b = b10;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            p7Var.c = new y6(1, -1, aVar2.a, 1);
            n6.e.b.getClass();
            p7Var.d = n6.e.a(b10) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
            aVar = p7Var;
        }
        return new d(aVar2, aVar, bb.c());
    }
}
