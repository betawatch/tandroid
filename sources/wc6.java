// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class wc6 extends og0 {
    public final Context x;
    public final vnb y;

    public wc6(vnb vnbVar, Context context, boolean z, boolean z2) {
        super(z, z2);
        this.x = context;
        this.y = vnbVar;
        new tk4(context, null).setIsSingleCell(true);
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
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

    @Override // j79
    public final int b() {
        ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.w ? 3 : 0 : arrayList.size() + 1;
    }

    @Override // j79
    public final int d(int i) {
        return (i != 0 || this.f.isEmpty()) ? 0 : 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i);
            ((yc6) view).a(H, H != null ? 2 : i, i != b() - 1, false);
        } else if (i2 == 1) {
            ((p55) view).setText(ob6.M0(2131748506, null));
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar = this.y;
        Context context = this.x;
        return new n69(i == 0 ? new yc6(context, vnbVar) : new p55(context, vnbVar));
    }
}
