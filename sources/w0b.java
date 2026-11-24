// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class w0b extends n39 {
    public final Activity c;
    public final /* synthetic */ x0b d;

    public w0b(x0b x0bVar, Activity activity) {
        this.d = x0bVar;
        this.c = activity;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        return this.d.c.size();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        es esVar = (es) s49Var.a;
        ArrayList arrayList = this.d.c;
        esVar.b((TLRPC.StickerSetCovered) arrayList.get(i), i != arrayList.size() - 1);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        es esVar = new es(this.c, false);
        esVar.setLayoutParams(new e49(-1, gl.L(82.0f)));
        return new y29(esVar);
    }
}
