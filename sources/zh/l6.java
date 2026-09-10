package zh;

import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import j$.util.Objects;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.n90;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h2 h2Var;
        k2.v vVar;
        switch (this.a) {
            case 0:
                n6 n6Var = (n6) this.b;
                n90 n90Var = (n90) this.c;
                n90 n90Var2 = n6Var.a;
                if (n90Var == n90Var2 && n90Var2 != null) {
                    CharacterStyle characterStyle = n90Var2.i;
                    if (characterStyle instanceof URLSpan) {
                        o6 o6Var = n6Var.v;
                        j90 j90Var = n6Var.c;
                        Objects.requireNonNull(j90Var);
                        o6Var.J.H((URLSpan) characterStyle, o6Var, new k5(j90Var, 4));
                        n6Var.a = null;
                        break;
                    }
                }
                break;
            case 1:
                y6 y6Var = (y6) this.b;
                bi.x4 x4Var = (bi.x4) this.c;
                y6Var.d.removeView(x4Var);
                if (x4Var == y6Var.c) {
                    y6Var.b = null;
                    y6Var.invalidate();
                    y6Var.b(false);
                    break;
                }
                break;
            default:
                l7 l7Var = (l7) this.b;
                t7 t7Var = (t7) this.c;
                u7 u7Var = l7Var.d;
                a3 currentPeerView = u7Var.n0.getCurrentPeerView();
                if (currentPeerView != null && (h2Var = currentPeerView.c1) != null && (vVar = u7Var.G0) != null && ((t7) vVar.c) == t7Var) {
                    h2Var.invalidate();
                    break;
                }
                break;
        }
    }
}
