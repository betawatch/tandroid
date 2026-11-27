// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class q9c extends d79 {
    public x46 f3;
    public final l9c g3;
    public lu5 h3;
    public boolean i3;
    public boolean j3;
    public boolean k3;
    public f89 l3;
    public boolean m3;

    public q9c(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar, int i3, int i4) {
        super(context, vnbVar);
        byte b = 1;
        this.m3 = true;
        byte b2 = 0;
        if (i3 == -1) {
            of2 of2Var = new of2(this, i4);
            this.f3 = of2Var;
            setLayoutManager(of2Var);
        } else {
            o9c o9cVar = new o9c(this, i3, b2);
            o9cVar.O = new zga(this, o9cVar, b);
            this.f3 = o9cVar;
            setLayoutManager(o9cVar);
        }
        l9c l9cVar = new l9c(this, context, i, i2, z, iccVar, vnbVar);
        this.g3 = l9cVar;
        setAdapter(l9cVar);
        if (nccVar != null) {
            setOnItemClickListener(new yw9(this, nccVar, (byte) 18));
        }
        if (occVar != null) {
            setOnItemLongClickListener(new yw9(this, occVar, (byte) 19));
        }
        p9c p9cVar = new p9c(this);
        p9cVar.m = false;
        p9cVar.C = false;
        p9cVar.o(k43.h);
        p9cVar.n(350L);
        setItemAnimator(p9cVar);
    }

    public final void A1(boolean z) {
        if (this.k3 == z) {
            return;
        }
        this.k3 = z;
        this.g3.O = z;
        hl.d0(this, new sh9(this, (byte) 23));
    }

    public final int B1(int i) {
        int i2 = 0;
        while (true) {
            l9c l9cVar = this.g3;
            if (i2 >= l9cVar.E.size()) {
                return -1;
            }
            b8c G = l9cVar.G(i2);
            if (G != null && G.d == i) {
                return i2;
            }
            i2++;
        }
    }

    public final View C1(int i) {
        int i2 = 0;
        while (true) {
            l9c l9cVar = this.g3;
            if (i2 >= l9cVar.E.size()) {
                i2 = -1;
                break;
            }
            b8c G = l9cVar.G(i2);
            if (G != null && G.d == i) {
                break;
            }
            i2++;
        }
        return V0(i2);
    }

    public final View D1(Object obj) {
        int i = 0;
        while (true) {
            l9c l9cVar = this.g3;
            if (i >= l9cVar.E.size()) {
                i = -1;
                break;
            }
            b8c G = l9cVar.G(i);
            if (G != null && G.H == obj) {
                break;
            }
            i++;
        }
        return V0(i);
    }

    public boolean E1() {
        return false;
    }

    public final void F1(icc iccVar, boolean z) {
        this.j3 = z;
        lu5 lu5Var = new lu5(new s10(this, (byte) 8));
        this.h3 = lu5Var;
        lu5Var.h(this);
        this.g3.N = iccVar;
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!d1()) {
            l9c l9cVar = this.g3;
            ArrayList arrayList = l9cVar.H;
            for (int i = 0; i < arrayList.size(); i++) {
                i9c i9cVar = (i9c) arrayList.get(i);
                int i2 = i9cVar.b;
                if (i2 >= 0) {
                    int i3 = i9cVar.a;
                    int v0 = aob.v0(l9cVar.n ? aob.h5 : aob.d6, l9cVar.x);
                    if (i2 >= i3 && i3 >= 0 && i2 >= 0) {
                        int i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i5 = TLObject.FLAG_31;
                        for (int i6 = 0; i6 < getChildCount(); i6++) {
                            View childAt = getChildAt(i6);
                            if (childAt != null) {
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= i3 && S <= i2) {
                                    i4 = Math.min(top, i4);
                                    i5 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i5);
                                }
                            }
                        }
                        if (i4 < i5) {
                            Paint paint = this.t2;
                            if (paint == null) {
                                paint = new Paint(1);
                                this.t2 = paint;
                            }
                            paint.setColor(v0);
                            canvas.drawRect(0.0f, i4, getWidth(), i5, this.t2);
                        }
                    }
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public int getSpanCount() {
        x46 x46Var = this.f3;
        if (x46Var instanceof q74) {
            return ((q74) x46Var).J;
        }
        return -1;
    }

    public void setReorderLongPressEnabled(boolean z) {
        this.m3 = z;
    }

    public void setSpanCount(int i) {
        x46 x46Var = this.f3;
        if (x46Var instanceof q74) {
            ((q74) x46Var).x1(i);
            return;
        }
        if (x46Var == null || i == -1) {
            return;
        }
        getContext();
        o9c o9cVar = new o9c(this, i, (byte) 1);
        o9cVar.O = new zga(this, o9cVar, (byte) 2);
        this.f3 = o9cVar;
        setLayoutManager(o9cVar);
    }

    @Override // d79
    public final void t1(int i, float f, boolean z) {
        u1(new p12(this, (byte) 11), new sb((byte) 13), i, f, z);
    }

    public void G1() {
    }

    public void H1() {
    }

    public void L1() {
    }

    public void I1(f89 f89Var) {
    }

    public void J1(f89 f89Var) {
    }

    public void K1(f89 f89Var) {
    }

    public q9c(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar) {
        this(context, i, i2, z, iccVar, nccVar, occVar, vnbVar, -1, 1);
    }

    public q9c(e eVar, icc iccVar, ncc nccVar, occ occVar) {
        this(eVar.getContext(), eVar.getCurrentAccount(), eVar.getClassGuid(), false, iccVar, nccVar, occVar, eVar.getResourceProvider());
    }
}
