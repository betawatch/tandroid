// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ot7 extends a69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // a69
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pt7) obj).f();
                break;
            case 1:
                r59 r59Var = (r59) obj;
                r59Var.L0(true);
                if (r59Var.r2) {
                    r59Var.r1 = -1;
                    if (r59Var.U1 == null) {
                        r59Var.F1.setEmpty();
                    }
                }
                r59Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.v0.f = true;
                boolean z = e21.a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.o0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // a69
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                ((pt7) this.b).l(i + 1, i2);
                break;
        }
    }

    @Override // a69
    public final void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i2 >= 1) {
                    boolean z = e21.a;
                    StringBuilder o = ts2.o("onItemRangeChanged(", i, ", ", i2, ", ");
                    o.append(obj);
                    o.append(")");
                    haVar.h(o.toString());
                    arrayList.add(haVar.i(obj, 4, i, i2));
                    haVar.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // a69
    public final void d(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pt7) obj).p(i + 1, i2);
                break;
            case 1:
                r59 r59Var = (r59) obj;
                r59Var.L0(true);
                View view = r59Var.q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    r59Var.r1 = -1;
                    r59Var.h1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i2 >= 1) {
                    boolean z = e21.a;
                    haVar.h("onItemRangeInserted(" + i + ", " + i2 + ")");
                    arrayList.add(haVar.i(null, 1, i, i2));
                    haVar.b = haVar.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // a69
    public final void e(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pt7) obj).l(i + 1, i2 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i != i2) {
                    boolean z = e21.a;
                    haVar.h("onItemRangeMoved(" + i + ", " + i2 + ", 1)");
                    arrayList.add(haVar.i(null, 8, i, i2));
                    haVar.b = haVar.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // a69
    public final void f(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pt7) obj).q(i + 1, i2);
                break;
            case 1:
                ((r59) obj).L0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ha haVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) haVar.d;
                if (i2 >= 1) {
                    boolean z = e21.a;
                    haVar.h("onItemRangeRemoved(" + i + ", " + i2 + ")");
                    arrayList.add(haVar.i(null, 2, i, i2));
                    haVar.b = haVar.b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    public final void g() {
        int[] iArr = RecyclerView.R0;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.I || !recyclerView.H) {
            recyclerView.requestLayout();
            return;
        }
        w59 w59Var = recyclerView.n;
        WeakHashMap weakHashMap = kfc.a;
        recyclerView.postOnAnimation(w59Var);
    }
}
