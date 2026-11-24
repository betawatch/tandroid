// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y2b extends q59 {
    public final Activity c;
    public final /* synthetic */ z2b d;

    public y2b(z2b z2bVar, Activity activity) {
        this.d = z2bVar;
        this.c = activity;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        return this.d.c.size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        et etVar = (et) u69Var.a;
        ArrayList arrayList = this.d.c;
        etVar.b((TLRPC.StickerSetCovered) arrayList.get(i), i != arrayList.size() - 1);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        et etVar = new et(this.c, false);
        etVar.setLayoutParams(new g69(-1, gm.L(82.0f)));
        return new b59(etVar);
    }
}
