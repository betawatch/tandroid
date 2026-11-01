package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.qw;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.v11;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c1 extends uk0 {
    public wj0 e3;
    public boolean f3;
    public float g3;
    public float h3;
    public boolean i3;
    public final SparseArray j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final ArrayList n3;
    public final PorterDuffColorFilter o3;

    public c1(Context context) {
        super(context, null);
        this.i3 = false;
        this.j3 = new SparseArray();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.o3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(c1 c1Var, int i10, int i11) {
        if (c1Var.e3 == null || !(c1Var.getLayoutManager() instanceof s4.r)) {
            return;
        }
        s4.r rVar = (s4.r) c1Var.getLayoutManager();
        View m10 = rVar.m(i10);
        int L0 = rVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > rVar.J * 9.0f) || !uz.c()) {
            c1Var.e3.b = rVar.L0() < i10 ? 0 : 1;
            c1Var.e3.d(i10, i11, false, false);
        } else {
            qw qwVar = new qw(c1Var, c1Var.getContext(), 5);
            qwVar.a = i10;
            qwVar.p = i11;
            rVar.w0(qwVar);
        }
    }

    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        a1 a1Var;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.g3, getWidth(), this.h3);
        if (!this.f3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.E1;
        if (!rect.isEmpty()) {
            this.B1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.m2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.B1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.j3;
            int size = sparseArray.size();
            arrayList = this.k3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof b1) {
                b1 b1Var = (b1) childAt;
                if (b1Var.getY() < this.h3 && b1Var.getY() + b1Var.getHeight() > this.g3) {
                    int y3 = this.i3 ? (int) b1Var.getY() : b1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y3);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) i0.a.v(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList4);
                    }
                    arrayList4.add(b1Var);
                }
            }
        }
        ArrayList arrayList5 = this.n3;
        arrayList5.clear();
        ArrayList arrayList6 = this.m3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.l3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            b1 b1Var2 = (b1) arrayList7.get(i10);
            int R = RecyclerView.R(b1Var2);
            while (true) {
                if (i10 >= arrayList5.size()) {
                    a1Var = null;
                    break;
                } else {
                    if (((a1) arrayList5.get(i10)).M == R) {
                        a1Var = (a1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (a1Var == null) {
                if (arrayList2.isEmpty()) {
                    a1Var = new a1(this);
                    a1Var.l(7);
                } else {
                    a1Var = (a1) i0.a.v(1, arrayList2);
                }
                a1Var.M = R;
                a1Var.e();
            }
            arrayList6.add(a1Var);
            a1Var.O = arrayList7;
            canvas.save();
            canvas.translate(b1Var2.getLeft(), b1Var2.getY());
            a1Var.N = b1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (b1Var2.getLeft() * 2);
            int measuredHeight = b1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                a1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((a1) arrayList5.get(i14));
                ((a1) arrayList5.get(i14)).O = null;
                ((a1) arrayList5.get(i14)).k();
            } else {
                ((a1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2 != null && !(childAt2 instanceof b1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
                canvas.save();
                canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setLayoutManager(s4.n0 n0Var) {
        super.setLayoutManager(n0Var);
        this.e3 = null;
        if (n0Var instanceof s4.a0) {
            wj0 wj0Var = new wj0(this, (s4.a0) n0Var);
            this.e3 = wj0Var;
            wj0Var.i = new v11(this, 2);
            wj0Var.h = new rh.d0(this, 24);
        }
    }
}
