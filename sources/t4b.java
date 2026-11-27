// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class t4b extends c79 {
    public final Activity c;
    public final /* synthetic */ u4b d;

    public t4b(u4b u4bVar, Activity activity) {
        this.d = u4bVar;
        this.c = activity;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        return this.d.c.size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        fs fsVar = (fs) f89Var.a;
        ArrayList arrayList = this.d.c;
        fsVar.b((TLRPC.StickerSetCovered) arrayList.get(i), i != arrayList.size() - 1);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        fs fsVar = new fs(this.c, false);
        fsVar.setLayoutParams(new r79(-1, hl.L(82.0f)));
        return new n69(fsVar);
    }
}
