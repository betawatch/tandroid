// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zt3 extends d {
    public vt3 E;
    public wt3 a;
    public o39 b;
    public is5 c;
    public ImageView d;
    public final ArrayList e;
    public yt3 f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final int x;
    public final int y;

    public zt3(int i, int i2) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.x = i;
        this.y = i2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().n0(i2, i, arrayList, arrayList2, arrayList3, true);
        getMessagesController().b4(arrayList2, true);
        getMessagesController().V3(arrayList3, true);
        d0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        gl.d3(new li3(this, (byte) 14), 1000L);
    }

    public final void c0(Context context, int i) {
        ir5 ir5Var;
        int i2;
        if (i == this.h) {
            jr5 jr5Var = new jr5(context, this.currentAccount, null, 0L, this, null);
            jr5Var.g2 = new vu2(this, (byte) 28);
            kk7.f(jr5Var.a).b(jr5Var, kk7.r);
            jr5Var.h2 = new ArrayList(na7.q1(jr5Var.a).F);
            jr5Var.O0();
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                ir5Var = jr5Var.O1;
                if (i3 >= size) {
                    break;
                }
                Long l = (Long) arrayList.get(i3);
                long longValue = l.longValue();
                boolean y = cf3.y(longValue);
                int i4 = jr5Var.a;
                ya5 ya5Var = new ya5(ir5Var.getContext(), y ? na7.q1(i4).K0(Long.valueOf(-longValue)) : na7.q1(i4).V1(l));
                ir5Var.a(ya5Var, false);
                ya5Var.setOnClickListener(jr5Var.l2);
                i3++;
            }
            jr5Var.N0(false);
            int childCount = ir5Var.getChildCount();
            Point point = gl.q;
            boolean z = point.x < point.y;
            if (gl.O1() || z) {
                jr5Var.m2 = gl.L(144.0f);
            } else {
                jr5Var.m2 = gl.L(56.0f);
            }
            boolean O1 = gl.O1();
            int i5 = point.x;
            if (O1) {
                i2 = (int) (Math.min(i5, point.y) * 0.8f);
            } else {
                if (!z) {
                    i5 = (int) Math.max(i5 * 0.8f, Math.min(gl.L(480.0f), point.x));
                }
                i2 = i5;
            }
            int L = i2 - gl.L(26.0f);
            int L2 = gl.L(10.0f);
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = ir5Var.getChildAt(i7);
                if (childAt instanceof ya5) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), TLObject.FLAG_30));
                    if (childAt.getMeasuredWidth() + i6 > L) {
                        L2 = de9.w(8.0f, childAt.getMeasuredHeight(), L2);
                        i6 = 0;
                    }
                    i6 = de9.w(9.0f, childAt.getMeasuredWidth(), i6);
                }
            }
            int L3 = gl.L(42.0f) + L2;
            int min = jr5Var.g2 != null ? jr5Var.a2 ? Math.min(jr5Var.m2, L3) : 0 : b00.c(52.0f, Math.min(jr5Var.m2, L3), 0);
            int i8 = jr5Var.o2;
            int L4 = jr5Var.Z1.m() > 0 ? gl.L(56.0f) : 0;
            jr5Var.o2 = L4;
            if (min != jr5Var.i2 || i8 != L4) {
                jr5Var.i2 = min;
            }
            showDialog(jr5Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        a aVar = this.actionBar;
        if (this.x == 0) {
            aVar.setTitle(k96.M0(2131742614, null));
        } else {
            aVar.setTitle(k96.M0(2131742605, null));
        }
        this.actionBar.t().e(1, k96.M0(2131751342, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 13));
        this.a = new wt3(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        zkb.h(bkb.Z6, null, frameLayout);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.setLayoutManager(new t26(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        ((gb3) this.b.getItemAnimator()).C = false;
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        is5 is5Var = new is5(new xt3(this));
        this.c = is5Var;
        is5Var.h(this.b);
        this.b.setOnItemClickListener(new k0(this, context, (byte) 12));
        this.b.setOnItemLongClickListener(new lv6(this));
        return this.fragmentView;
    }

    public final void d0() {
        this.w = 2;
        this.h = true;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i = this.w;
            this.n = i;
            int size = arrayList.size() + i;
            this.w = size;
            this.r = size;
        }
        int i2 = this.w;
        this.w = i2 + 1;
        this.s = i2;
        wt3 wt3Var = this.a;
        if (wt3Var != null) {
            wt3Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F8));
        arrayList.add(new blb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E8));
        int i = bkb.p6;
        arrayList.add(new blb(this.b, 0, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.b, 0, new Class[]{wgb.class}, new String[]{"imageView"}, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.E != null) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        b0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        cj3.t4(j5.a(this.currentAccount));
        getMediaDataController().O0(true);
        return super.onFragmentCreate();
    }
}
