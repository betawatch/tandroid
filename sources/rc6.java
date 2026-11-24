// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class rc6 extends oh0 {
    public final Context x;
    public final ylb y;

    public rc6(ylb ylbVar, Context context, boolean z, boolean z2) {
        super(z, z2);
        this.x = context;
        this.y = ylbVar;
        new tk4(context, null).setIsSingleCell(true);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
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

    @Override // y59
    public final int b() {
        ArrayList arrayList = this.f;
        return arrayList.isEmpty() ? this.w ? 3 : 0 : arrayList.size() + 1;
    }

    @Override // y59
    public final int d(int i) {
        return (i != 0 || this.f.isEmpty()) ? 0 : 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            TLRPC.TL_messageMediaVenue H = H(i);
            ((tc6) view).a(H, H != null ? 2 : i, i != b() - 1, false);
        } else if (i2 == 1) {
            ((l55) view).setText(jb6.M0(2131748509, null));
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar = this.y;
        Context context = this.x;
        return new b59(i == 0 ? new tc6(context, ylbVar) : new l55(context, ylbVar));
    }
}
