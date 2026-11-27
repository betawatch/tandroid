// default package

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class yx0 extends FrameLayout {
    public static final HashMap L = new HashMap();
    public static final HashMap M = new HashMap();
    public static TextPaint N;
    public boolean E;
    public final RectF F;
    public ValueAnimator G;
    public float H;
    public int I;
    public final HashSet J;
    public final HashSet K;
    public final Paint a;
    public boolean b;
    public boolean c;
    public final ActionBarLayout d;
    public final wx0 e;
    public int f;
    public final ll h;
    public int n;
    public final ll r;
    public boolean s;
    public final mm w;
    public int x;
    public boolean y;

    public yx0(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        k43 k43Var = k43.h;
        this.h = new ll(this, 200L, k43Var, 0);
        this.r = new ll(this, 200L, k43Var, 0);
        this.w = new mm(this, 0L, 200L, k43Var);
        this.x = yac.t0;
        this.F = new RectF();
        this.J = new HashSet();
        this.K = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(aob.w0(null, aob.a7, false));
        wx0 wx0Var = new wx0(this, this);
        this.e = wx0Var;
        ihc.l(this, wx0Var);
        n();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextPaint getTextPaint() {
        if (N == null) {
            TextPaint textPaint = new TextPaint(1);
            N = textPaint;
            textPaint.setTypeface(hl.o());
            N.setTextSize(hl.L(17.0f));
        }
        return N;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        return indexOf >= 0 ? str.substring(0, indexOf + 1) : str;
    }

    public final void b() {
        ValueAnimator valueAnimator;
        ArrayList<xx0> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        xx0 xx0Var = (xx0) c00.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.H1;
        gy0 gy0Var = launchActivity == null ? null : launchActivity.x0;
        if (gy0Var != null && (valueAnimator = gy0Var.d) != null) {
            valueAnimator.cancel();
            gy0Var.d = null;
        }
        if (size == 1 || gy0Var == null) {
            e(xx0Var);
        } else {
            gy0Var.f();
        }
    }

    public final vx0 c(xx0 xx0Var) {
        ArrayList<vx0> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabDrawables.size(); i++) {
            if (tabDrawables.get(i).a == xx0Var) {
                return tabDrawables.get(i);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f) {
        rectF.set(hl.L(4.0f), (getHeight() - hl.L(4.0f)) - hl.L(50.0f), getWidth() - hl.L(4.0f), getHeight() - hl.L(4.0f));
        rectF.offset(0.0f, (-hl.L(8.0f)) * f);
        float R1 = hl.R1(1.0f, 0.95f, Math.abs(f));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f2 = (width / 2.0f) * R1;
        rectF.left = centerX - f2;
        rectF.right = centerX + f2;
        float f3 = (height / 2.0f) * R1;
        rectF.top = centerY - f3;
        rectF.bottom = centerY + f3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        getTabs();
        ArrayList<vx0> tabDrawables = getTabDrawables();
        if (this.H > 0.0f) {
            this.a.setColor(this.h.a(this.f, false));
            super.dispatchDraw(canvas);
            int a = this.r.a(this.n, false);
            float d = this.w.d(this.s);
            if (this.b) {
                int i = 0;
                while (i < tabDrawables.size()) {
                    vx0 vx0Var = tabDrawables.get(i);
                    float c = vx0Var.c();
                    float b = vx0Var.b();
                    if (b <= 0.0f || c > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.F;
                        d(rectF, c);
                        vx0Var.w = 0.0f;
                        boolean z = d > 0.5f;
                        vx0Var.m = a;
                        vx0Var.o = z;
                        canvas2 = canvas;
                        vx0Var.a(canvas2, rectF, hl.L(18.0f), b, 1.0f);
                    }
                    i++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        wx0 wx0Var;
        if (!this.b || getTabs().isEmpty() || (wx0Var = this.e) == null || !wx0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(xx0 xx0Var) {
        zu1 zu1Var;
        nr1 nr1Var;
        e Q = LaunchActivity.Q();
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        boolean z = Q instanceof zu1;
        if (z && (nr1Var = (zu1Var = (zu1) Q).a0) != null) {
            nr1Var.U();
            zu1Var.a0.O0(true, false, true);
        }
        if (xx0Var.J == null) {
            new y0(this, xx0Var, (byte) 8).a(Q);
            if (xx0Var.C) {
                if (z && ((zu1) Q).a() == xx0Var.a.c) {
                    return;
                }
                this.c = true;
                hl.d3(new tu0(this, Q, zu1.ha(xx0Var.a.c), (byte) 3), 220L);
                return;
            }
            return;
        }
        e sheetFragment = this.d.getSheetFragment();
        o oVar = xx0Var.J;
        tw twVar = oVar.L;
        tx0.a(twVar);
        sheetFragment.addSheet(twVar);
        sw swVar = twVar.c;
        twVar.h = false;
        twVar.n = false;
        ValueAnimator valueAnimator = twVar.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = twVar.F;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        twVar.y = 0.0f;
        twVar.x = 0.0f;
        twVar.r();
        twVar.A();
        swVar.invalidate();
        swVar.requestLayout();
        oVar.W(sheetFragment.getParentActivity(), sheetFragment);
        twVar.q(sheetFragment);
        twVar.o();
        h(this.x, xx0Var, false);
    }

    public final void f() {
        ArrayList<xx0> tabs = getTabs();
        ArrayList<vx0> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabs.size(); i++) {
            tabs.get(i).a();
        }
        tabs.clear();
        for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
            tabDrawables.get(i2).d = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(xx0 xx0Var, pcc pccVar) {
        String str;
        if (xx0Var == null) {
            pccVar.a(Boolean.TRUE);
            return;
        }
        if (!xx0Var.y) {
            h(this.x, xx0Var, true);
            pccVar.a(Boolean.TRUE);
            return;
        }
        TLRPC.User X1 = uc7.s1(xx0Var.a.a).X1(Long.valueOf(xx0Var.a.c));
        if (X1 != null) {
            str = lv2.m(0, X1.first_name, X1.last_name);
        } else {
            gzc gzcVar = xx0Var.a;
            str = gzcVar.g == 6 ? gzcVar.e : null;
        }
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = ob6.M0(2131752898, null);
        alertDialog$Builder.j(ob6.M0(2131752897, null), new xg(this, zArr, xx0Var, pccVar, r9));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new ie(zArr, (Object) pccVar, (Object) r9, (byte) 8));
        id[] idVarArr = {idVar};
        idVar.setOnDismissListener(new ux0(zArr, pccVar));
        idVarArr[0].show();
        yob.X((TextView) idVarArr[0].c(-1), aob.q7, null);
    }

    public Paint getBackgroundPaint() {
        return this.a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        return size == 1 ? hl.L(60.0f) : hl.L(68.0f);
    }

    public ArrayList<vx0> getTabDrawables() {
        int i = this.x;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = M;
        ArrayList<vx0> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i);
        ArrayList<vx0> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<xx0> getTabs() {
        int i = this.x;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = L;
        ArrayList<xx0> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i);
        ArrayList<xx0> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i, xx0 xx0Var, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i);
        HashMap hashMap2 = M;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(xx0Var);
        if (z) {
            xx0Var.a();
        }
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            vx0 vx0Var = (vx0) arrayList3.get(i2);
            int indexOf = arrayList.indexOf(vx0Var.a);
            vx0Var.d = indexOf;
            if (indexOf >= 0) {
                vx0Var.c = indexOf;
            }
        }
        n();
        hl.d3(new tu0(this, arrayList3, xx0Var, (byte) 4), 320L);
        o(true);
        invalidate();
        wx0 wx0Var = this.e;
        if (wx0Var != null) {
            wx0Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i, boolean z) {
        if (i != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.R || actionBarLayout.U) {
                z = false;
            }
            this.f = i;
            int v = aob.v(i, aob.p1((hl.B(i) > 0.721f ? 1 : (hl.B(i) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
            this.n = v;
            this.s = hl.B(v) < 0.721f;
            if (!z) {
                this.h.a(this.f, true);
                this.r.a(this.n, true);
                this.w.f(this.s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f, float f2, int i) {
        ArrayList<xx0> tabs = getTabs();
        ArrayList<vx0> tabDrawables = getTabDrawables();
        if (this.b) {
            xx0 xx0Var = tabs.isEmpty() ? null : tabs.get(0);
            vx0 c = c(xx0Var);
            if (c != null) {
                hf0 hf0Var = c.l;
                float c2 = c.c();
                RectF rectF = this.F;
                d(rectF, c2);
                byte b = 2;
                if (i == 0 || i == 2) {
                    boolean contains = hf0Var.getBounds().contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()));
                    this.y = contains;
                    this.E = !contains && rectF.contains(f, f2);
                    hf0Var.setState(this.y ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
                } else if (i == 1 || i == 3) {
                    if (this.E && i == 1) {
                        b();
                    } else if (this.y && i == 1) {
                        g(xx0Var, new bm0(b));
                    }
                    this.y = false;
                    this.E = false;
                    hf0Var.setState(new int[0]);
                }
                for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
                    if (tabDrawables.get(i2) != c) {
                        tabDrawables.get(i2).l.setState(new int[0]);
                    }
                }
            } else {
                this.E = false;
                this.y = false;
            }
        } else {
            this.E = false;
            this.y = false;
        }
        return this.E || this.y;
    }

    public final xx0 k(r47 r47Var) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (r47Var == null || (message = r47Var.k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final xx0 l(gzc gzcVar) {
        Integer valueOf = Integer.valueOf(this.x);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            xx0 xx0Var = (xx0) arrayList.get(i);
            if (gzcVar.equals(xx0Var.a)) {
                e(xx0Var);
                return xx0Var;
            }
        }
        return null;
    }

    public final xx0 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<xx0> tabs = getTabs();
        for (int i = 0; i < tabs.size(); i++) {
            xx0 xx0Var = tabs.get(i);
            o oVar = xx0Var.J;
            if (oVar != null && !oVar.e0.isEmpty()) {
                Object g = c00.g(1, xx0Var.J.e0);
                if ((g instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g).id == webPage.id) {
                    e(xx0Var);
                    return xx0Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m;
        ArrayList<xx0> tabs = getTabs();
        ArrayList<vx0> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i = 0; i < tabDrawables.size(); i++) {
            vx0 vx0Var = tabDrawables.get(i);
            if (tabs.size() <= 1 || vx0Var.c != 0) {
                m = pv3.m(vx0Var.a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                vx0Var.v = null;
            } else {
                m = pv3.m(ob6.G(tabs.size() - 1, "BotMoreTabs", vx0Var.a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m == null) {
                    vx0Var.v = null;
                } else {
                    vx0Var.v = new pkb(m, 17.0f, hl.o());
                }
            }
            charSequence = m;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(ob6.a0(null, null, 2131754744, ""));
        } else {
            setImportantForAccessibility(1);
            if (charSequence == null) {
                charSequence = "";
            }
            setContentDescription(ob6.a0(null, null, 2131754744, charSequence));
        }
    }

    public final void o(boolean z) {
        if (this.I != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                this.G = null;
                valueAnimator.cancel();
            }
            this.I = getExpandedHeight();
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, this.I);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new g0(this, (byte) 20));
                this.G.addListener(new h0(this, (byte) 26));
                this.G.setDuration(250L);
                this.G.setInterpolator(hb.w);
                this.G.start();
            } else {
                this.H = this.I;
                invalidate();
            }
            Object parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = ihc.a;
                ygc.c((View) parent);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) || super.onTouchEvent(motionEvent);
    }

    public void setCurrentAccount(int i) {
        if (this.x != i) {
            this.x = i;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i) {
        i(i, true);
    }

    public void setupTab(vx0 vx0Var) {
        int a = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        vx0Var.w = 0.0f;
        boolean z = d > 0.5f;
        vx0Var.m = a;
        vx0Var.o = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
