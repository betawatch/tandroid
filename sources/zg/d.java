package zg;

import android.graphics.Rect;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import xf.g0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d {
    public final c b;
    public final c c;
    public long e;
    public final RenderNode a = ah.b.k();
    public final Rect d = new Rect();

    public d(e eVar) {
        if (eVar.a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.c = cVar;
            cVar.e = 4;
            cVar.f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), g0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.b = cVar2;
            cVar2.e = 8;
            cVar2.f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!eVar.c) {
            c cVar3 = new c(eVar, "blur", 1, false);
            this.b = cVar3;
            cVar3.e = 8;
            cVar3.f = 8;
            cVar3.c(AndroidUtilities.dpf2(40.0f));
            cVar3.e(g0.b());
            this.c = null;
            return;
        }
        c cVar4 = new c(eVar, "blur", 0, false);
        this.b = cVar4;
        boolean z10 = eVar.b;
        int i10 = z10 ? 16 : 8;
        int i11 = z10 ? 16 : 8;
        cVar4.e = i10;
        cVar4.f = i11;
        cVar4.d(AndroidUtilities.dpf2(40.0f), g0.b());
        this.c = null;
    }
}
