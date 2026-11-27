// default package

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vo1 implements hcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vo1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // hcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View view;
        byte b = this.a;
        int i = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((zu1) obj2).F8((Context) obj);
            case 1:
                w1b w1bVar = (w1b) obj2;
                i1b i1bVar = (i1b) obj;
                int childCount = w1bVar.T.getChildCount();
                while (true) {
                    w0b w0bVar = w1bVar.T;
                    if (i >= childCount) {
                        w0bVar.setItemAnimator(null);
                        w1bVar.C0.e();
                        return null;
                    }
                    View childAt = w0bVar.getChildAt(i);
                    if (childAt instanceof h1b) {
                        h1b h1bVar = (h1b) childAt;
                        if (h1bVar.r == i1bVar) {
                            return h1bVar;
                        }
                    }
                    i++;
                }
            default:
                l9c l9cVar = (l9c) obj2;
                Object obj3 = ((b8c) obj).H;
                d79 d79Var = l9cVar.d;
                int i2 = 0;
                while (true) {
                    if (i2 < l9cVar.E.size()) {
                        b8c G = l9cVar.G(i2);
                        if (G == null || G.H != obj3) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    while (i < d79Var.getChildCount()) {
                        view = d79Var.getChildAt(i);
                        int S = RecyclerView.S(view);
                        if (S != -1 && S == i2) {
                            if (view instanceof u1b) {
                                return null;
                            }
                            return (u1b) view;
                        }
                        i++;
                    }
                }
                view = null;
                if (view instanceof u1b) {
                }
                break;
        }
    }
}
