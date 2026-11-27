// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tu7 extends l79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tu7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // l79
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).f();
                break;
            case 1:
                d79 d79Var = (d79) obj;
                d79Var.M0(true);
                if (d79Var.r2) {
                    d79Var.r1 = -1;
                    if (d79Var.U1 == null) {
                        d79Var.F1.setEmpty();
                    }
                }
                d79Var.invalidate();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.v0.f = true;
                boolean z = f11.a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.p0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // l79
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                ((uu7) this.b).l(i + 1, i2);
                break;
        }
    }

    @Override // l79
    public final void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i2 >= 1) {
                    boolean z = f11.a;
                    StringBuilder p = bs2.p("onItemRangeChanged(", i, ", ", i2, ", ");
                    p.append(obj);
                    p.append(")");
                    iaVar.h(p.toString());
                    arrayList.add(iaVar.i(obj, 4, i, i2));
                    iaVar.b |= 4;
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

    @Override // l79
    public final void d(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).p(i + 1, i2);
                break;
            case 1:
                d79 d79Var = (d79) obj;
                d79Var.M0(true);
                View view = d79Var.q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    d79Var.r1 = -1;
                    d79Var.i1();
                    break;
                }
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i2 >= 1) {
                    boolean z = f11.a;
                    iaVar.h("onItemRangeInserted(" + i + ", " + i2 + ")");
                    arrayList.add(iaVar.i(null, 1, i, i2));
                    iaVar.b = iaVar.b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // l79
    public final void e(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).l(i + 1, i2 + 2);
                break;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i != i2) {
                    boolean z = f11.a;
                    iaVar.h("onItemRangeMoved(" + i + ", " + i2 + ", 1)");
                    arrayList.add(iaVar.i(null, 8, i, i2));
                    iaVar.b = iaVar.b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // l79
    public final void f(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).q(i + 1, i2);
                break;
            case 1:
                ((d79) obj).M0(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i2 >= 1) {
                    boolean z = f11.a;
                    iaVar.h("onItemRangeRemoved(" + i + ", " + i2 + ")");
                    arrayList.add(iaVar.i(null, 2, i, i2));
                    iaVar.b = iaVar.b | 2;
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
        i79 i79Var = recyclerView.n;
        WeakHashMap weakHashMap = ihc.a;
        recyclerView.postOnAnimation(i79Var);
    }
}
