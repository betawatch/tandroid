// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class q5c extends o39 {
    public t26 f3;
    public final l5c g3;
    public is5 h3;
    public boolean i3;
    public boolean j3;
    public boolean k3;
    public s49 l3;
    public boolean m3;

    public q5c(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar, int i3, int i4) {
        super(context, wjbVar);
        byte b = 1;
        this.m3 = true;
        byte b2 = 0;
        if (i3 == -1) {
            xe2 xe2Var = new xe2(this, i4);
            this.f3 = xe2Var;
            setLayoutManager(xe2Var);
        } else {
            o5c o5cVar = new o5c(this, i3, b2);
            o5cVar.O = new ida(this, o5cVar, b);
            this.f3 = o5cVar;
            setLayoutManager(o5cVar);
        }
        l5c l5cVar = new l5c(this, context, i, i2, z, i8cVar, wjbVar);
        this.g3 = l5cVar;
        setAdapter(l5cVar);
        if (n8cVar != null) {
            setOnItemClickListener(new cwb(this, n8cVar, (byte) 2));
        }
        if (o8cVar != null) {
            setOnItemLongClickListener(new cwb(this, o8cVar, (byte) 3));
        }
        p5c p5cVar = new p5c(this);
        p5cVar.m = false;
        p5cVar.C = false;
        p5cVar.o(s33.h);
        p5cVar.n(350L);
        setItemAnimator(p5cVar);
    }

    public final int A1(int i) {
        int i2 = 0;
        while (true) {
            l5c l5cVar = this.g3;
            if (i2 >= l5cVar.E.size()) {
                return -1;
            }
            c4c G = l5cVar.G(i2);
            if (G != null && G.d == i) {
                return i2;
            }
            i2++;
        }
    }

    public final View B1(int i) {
        int i2 = 0;
        while (true) {
            l5c l5cVar = this.g3;
            if (i2 >= l5cVar.E.size()) {
                i2 = -1;
                break;
            }
            c4c G = l5cVar.G(i2);
            if (G != null && G.d == i) {
                break;
            }
            i2++;
        }
        return U0(i2);
    }

    public final View C1(Object obj) {
        int i = 0;
        while (true) {
            l5c l5cVar = this.g3;
            if (i >= l5cVar.E.size()) {
                i = -1;
                break;
            }
            c4c G = l5cVar.G(i);
            if (G != null && G.H == obj) {
                break;
            }
            i++;
        }
        return U0(i);
    }

    public boolean D1() {
        return false;
    }

    public final void E1(i8c i8cVar, boolean z) {
        this.j3 = z;
        is5 is5Var = new is5(new r10(this, (byte) 8));
        this.h3 = is5Var;
        is5Var.h(this);
        this.g3.N = i8cVar;
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!c1()) {
            l5c l5cVar = this.g3;
            ArrayList arrayList = l5cVar.H;
            for (int i = 0; i < arrayList.size(); i++) {
                i5c i5cVar = (i5c) arrayList.get(i);
                int i2 = i5cVar.b;
                if (i2 >= 0) {
                    int i3 = i5cVar.a;
                    int v0 = bkb.v0(l5cVar.n ? bkb.g5 : bkb.c6, l5cVar.x);
                    if (i2 >= i3 && i3 >= 0 && i2 >= 0) {
                        int i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        int i5 = TLObject.FLAG_31;
                        for (int i6 = 0; i6 < getChildCount(); i6++) {
                            View childAt = getChildAt(i6);
                            if (childAt != null) {
                                int R = RecyclerView.R(childAt);
                                int top = childAt.getTop();
                                if (R >= i3 && R <= i2) {
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
        t26 t26Var = this.f3;
        if (t26Var instanceof w64) {
            return ((w64) t26Var).J;
        }
        return -1;
    }

    @Override // o39
    public final void s1(int i, float f, boolean z) {
        t1(new z02(this, (byte) 11), new pb((byte) 13), i, f, z);
    }

    public void setReorderLongPressEnabled(boolean z) {
        this.m3 = z;
    }

    public void setSpanCount(int i) {
        t26 t26Var = this.f3;
        if (t26Var instanceof w64) {
            ((w64) t26Var).x1(i);
            return;
        }
        if (t26Var == null || i == -1) {
            return;
        }
        getContext();
        o5c o5cVar = new o5c(this, i, (byte) 1);
        o5cVar.O = new ida(this, o5cVar, (byte) 2);
        this.f3 = o5cVar;
        setLayoutManager(o5cVar);
    }

    public final void z1(boolean z) {
        if (this.k3 == z) {
            return;
        }
        this.k3 = z;
        this.g3.O = z;
        gl.d0(this, new ae9(this, (byte) 23));
    }

    public void F1() {
    }

    public void G1() {
    }

    public void K1() {
    }

    public void H1(s49 s49Var) {
    }

    public void I1(s49 s49Var) {
    }

    public void J1(s49 s49Var) {
    }

    public q5c(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar) {
        this(context, i, i2, z, i8cVar, n8cVar, o8cVar, wjbVar, -1, 1);
    }

    public q5c(d dVar, i8c i8cVar, n8c n8cVar, o8c o8cVar) {
        this(dVar.getContext(), dVar.getCurrentAccount(), dVar.getClassGuid(), false, i8cVar, n8cVar, o8cVar, dVar.getResourceProvider());
    }
}
