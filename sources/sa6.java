// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class sa6 extends ng0 {
    public final Context x;
    public final wjb y;

    public sa6(wjb wjbVar, Context context, boolean z, boolean z2) {
        super(z, z2);
        this.x = context;
        this.y = wjbVar;
        new pi4(context, null).setIsSingleCell(true);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final TLRPC.TL_messageMediaVenue H(int i) {
        int i2;
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty() || i - 1 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_messageMediaVenue) arrayList.get(i2);
    }

    @Override // w39
    public final int b() {
        ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.w ? 3 : 0 : arrayList.size() + 1;
    }

    @Override // w39
    public final int d(int i) {
        return (i != 0 || this.f.isEmpty()) ? 0 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i);
            ((ua6) view).a(H, H != null ? 2 : i, i != b() - 1, false);
        } else if (i2 == 1) {
            ((l35) view).setText(k96.M0(2131748560, null));
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar = this.y;
        Context context = this.x;
        return new y29(i == 0 ? new ua6(context, wjbVar) : new l35(context, wjbVar));
    }
}
