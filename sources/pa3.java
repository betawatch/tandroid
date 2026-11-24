// default package

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pa3 implements dfc {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public boolean a;
    public byte b;
    public Object c;

    public static void d(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (d[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    @Override // dfc
    public final void a() {
        this.a = true;
    }

    @Override // dfc
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // dfc
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }

    public final fm4 e(fm4 fm4Var) {
        if (!this.a || !((eef) this.c).h(fm4Var)) {
            return fm4Var;
        }
        em4 a = fm4Var.a();
        String str = fm4Var.l;
        a.s = ud7.n("application/x-media3-cues");
        a.T = ((eef) this.c).y(fm4Var);
        StringBuilder sb = new StringBuilder();
        sb.append(fm4Var.t);
        sb.append(str != null ? " ".concat(str) : "");
        a.k = sb.toString();
        a.x = Long.MAX_VALUE;
        return new fm4(a);
    }
}
