package yb;

import a8.bb;
import a8.y6;
import android.content.Context;
import bi.s7;
import com.google.android.gms.common.api.q;
import h2.o0;
import java.util.Locale;
import pb.g;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c extends q {
    public final g b;

    public c(g gVar) {
        super(4);
        this.b = gVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final Object h(Object obj) {
        a aVar;
        xb.a aVar2 = (xb.a) obj;
        Context b10 = this.b.b();
        n6.e.b.getClass();
        if (n6.e.a(b10) >= 204700000) {
            aVar = new o0(b10, aVar2);
        } else {
            s7 s7Var = new s7();
            s7Var.b = b10;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            s7Var.c = new y6(1, -1, aVar2.a, 1);
            n6.e.b.getClass();
            s7Var.d = n6.e.a(b10) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
            aVar = s7Var;
        }
        return new d(aVar2, aVar, bb.c());
    }
}
