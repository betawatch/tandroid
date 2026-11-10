package yb;

import a8.ab;
import a8.y6;
import android.content.Context;
import bi.b1;
import h2.p0;
import java.util.Locale;
import pb.g;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d extends b1 {
    public final g b;

    public d(g gVar) {
        super(4);
        this.b = gVar;
    }

    @Override // bi.b1
    public final Object Q0(Object obj) {
        a aVar;
        xb.a aVar2 = (xb.a) obj;
        Context b10 = this.b.b();
        n6.e.b.getClass();
        if (n6.e.a(b10) >= 204700000) {
            aVar = new p0(b10, aVar2);
        } else {
            b bVar = new b();
            bVar.b = b10;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            bVar.c = new y6(1, -1, aVar2.a, 1);
            n6.e.b.getClass();
            bVar.d = n6.e.a(b10) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
            aVar = bVar;
        }
        return new e(aVar2, aVar, ab.d());
    }
}
