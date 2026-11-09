package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import c8.ha;
import c8.ka;
import di.b3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.j0;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.la;
import org.telegram.ui.af;
import org.telegram.ui.cn;
import org.telegram.ui.hk0;
import org.telegram.ui.uq0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, b6 {
    public final int[] D;
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final te.a H;
    public final te.a I;
    public final z5 a;
    public final b3 b;
    public final ci c;
    public final cn d;
    public final FrameLayout.LayoutParams e;
    public final l5 f;
    public d h;
    public q1 n;
    public int r;
    public af s;
    public final uq0 w;
    public final uq0 x;
    public final int y;

    public c(Activity activity, g6 g6Var, cn cnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        int i7 = 2;
        this.D = new int[2];
        this.E = new Rect();
        int i10 = 17;
        m3 m3Var = new m3(this, i10);
        xq xqVar = xq.h;
        this.H = new te.a(0, m3Var, xqVar, 380L, false);
        this.I = new te.a(0, new m3(this, i10), xqVar, 380L, false);
        this.d = cnVar;
        this.y = ((j0) cnVar.getMessagesController().x7.I.b).c;
        z5 z5Var = new z5(this, activity, g6Var, i7);
        this.a = z5Var;
        z5Var.setAllowTextEntitiesIntersection(true);
        s6.U(z5Var, l6.G6, g6Var);
        s6.G(z5Var, l6.Uc, g6Var);
        s6.D(z5Var, l6.H6, g6Var);
        z5Var.setHint(id.M0(2131747183, null));
        z5Var.setTextSize(1, 15.0f);
        z5Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        z5Var.setBackground(null);
        z5Var.setImeOptions(268435462);
        z5Var.setInputType(z5Var.getInputType() | TLObject.FLAG_14);
        z5Var.addTextChangedListener(new la(this, i7));
        b3 b3Var = new b3(activity, 6);
        this.b = b3Var;
        int i11 = l6.Ji;
        y h02 = l6.h0(l6.w0(i11, g6Var), 1, -1);
        o6 M = s6.M(i11);
        b3Var.setBackground(h02);
        s6.j(b3Var, h02, null, M, g6Var);
        ka.a(b3Var);
        ci ciVar = new ci(getContext(), 36);
        this.c = ciVar;
        y h03 = l6.h0(l6.w0(i11, g6Var), 1, -1);
        o6 M2 = s6.M(i11);
        ciVar.setBackground(h03);
        s6.j(ciVar, h03, null, M2, g6Var);
        ciVar.setOnClickListener(new hk0(26, this, cnVar));
        ka.a(ciVar);
        l5 l5Var = new l5(getContext());
        this.f = l5Var;
        l5Var.setTextSize(13);
        l5Var.setGravity(17);
        l5Var.setTranslationY(g0.L(44.0f));
        l5Var.setVisibility(8);
        uq0 uq0Var = new uq0(activity, 16);
        this.x = uq0Var;
        addView(uq0Var, layoutParams);
        uq0 uq0Var2 = new uq0(activity, 15);
        this.w = uq0Var2;
        uq0Var.addView(uq0Var2, ha.c(-2.0f, -1));
        uq0Var2.addView(l5Var, ha.e(54, 24, 53));
        uq0Var2.addView(b3Var, ha.e(44, 44, 51));
        uq0Var2.addView(ciVar, ha.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        uq0Var2.addView(z5Var, ha.d(-1, -2.0f, qs.E1, 39.0f, 0.0f, 47.0f, 0.0f));
        z5Var.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(c cVar) {
        l5 l5Var = cVar.f;
        q00.d(l5Var, cVar.H.e);
        int i7 = l6.A6;
        cn cnVar = cVar.d;
        l5Var.setTextColor(i0.a.f(cVar.I.e, l6.w0(i7, cnVar.getResourceProvider()), l6.w0(l6.p7, cnVar.getResourceProvider())));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.A6));
        hashSet.add(Integer.valueOf(l6.p7));
    }

    public d getAttachedMedia() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.F.removeOnPreDrawListener(this);
        }
        this.F = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        w1 w1Var;
        uh.a aVar;
        q1 q1Var = this.n;
        if (q1Var != null) {
            int e12 = q1Var.getMessageObject().e1();
            if (this.n.isAttachedToWindow() && this.r == e12 && (w1Var = this.n.w2) != null && (aVar = w1Var.l) != null && w1Var.s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                q1 q1Var2 = this.n;
                int[] iArr = this.D;
                q1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i11 = layoutParams.width;
                uq0 uq0Var = this.x;
                if (i11 != width) {
                    layoutParams.width = width;
                    uq0Var.setLayoutParams(layoutParams);
                }
                uq0Var.setTranslationX(rect.left);
                uq0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            af afVar = this.s;
            if (afVar != null) {
                afVar.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.w.setAlpha(f10);
    }

    public void setCellToWatch(q1 q1Var) {
        this.n = q1Var;
        this.r = q1Var.getMessageObject().e1();
    }

    public void setColor(int i7) {
        if (this.G != i7) {
            this.G = i7;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            b3 b3Var = this.b;
            ((Drawable) b3Var.c).setColorFilter(porterDuffColorFilter);
            ((Drawable) b3Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.c.c).setColorFilter(porterDuffColorFilter);
            z5 z5Var = this.a;
            z5Var.setCursorColor(i7);
            z5Var.setHandlesColor(i7);
            z5Var.setHintTextColor(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        cn cnVar;
        try {
            l5 l5Var = this.f;
            if (l5Var == null || (cnVar = this.d) == null) {
                return;
            }
            l5Var.setTextColor(i0.a.f(this.I.e, l6.w0(l6.A6, cnVar.getResourceProvider()), l6.w0(l6.p7, cnVar.getResourceProvider())));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
