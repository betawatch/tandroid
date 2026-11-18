package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bi.u;
import c8.ma;
import c8.ra;
import fi.u2;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j0;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Wallet.i9;
import org.telegram.ui.af;
import org.telegram.ui.bd0;
import org.telegram.ui.bn;
import org.telegram.ui.hh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, c6 {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final te.a I;
    public final te.a J;
    public final u a;
    public final u2 b;
    public final ri c;
    public final bn d;
    public final FrameLayout.LayoutParams e;
    public final n5 f;
    public d h;
    public q1 n;
    public int r;
    public af s;
    public final hh0 w;
    public final hh0 x;
    public final int y;

    public c(Activity activity, i6 i6Var, bn bnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        int i7 = 23;
        org.telegram.ui.ActionBar.p pVar = new org.telegram.ui.ActionBar.p(this, i7);
        lr lrVar = lr.h;
        this.I = new te.a(0, pVar, lrVar, 380L, false);
        this.J = new te.a(0, new org.telegram.ui.ActionBar.p(this, i7), lrVar, 380L, false);
        this.d = bnVar;
        this.y = ((j0) bnVar.getMessagesController().A7.N.b).c;
        u uVar = new u(this, activity, i6Var, 3);
        this.a = uVar;
        uVar.setAllowTextEntitiesIntersection(true);
        u6.U(uVar, n6.G6, i6Var);
        u6.G(uVar, n6.Xc, i6Var);
        u6.D(uVar, n6.H6, i6Var);
        uVar.setHint(gd.M0(2131746990, null));
        uVar.setTextSize(1, 15.0f);
        uVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        uVar.setBackground(null);
        uVar.setImeOptions(268435462);
        uVar.setInputType(uVar.getInputType() | TLObject.FLAG_14);
        uVar.addTextChangedListener(new i9(this, 5));
        u2 u2Var = new u2(activity, 6);
        this.b = u2Var;
        int i10 = n6.Mi;
        y h02 = n6.h0(n6.w0(i10, i6Var), 1, -1);
        q6 M = u6.M(i10);
        u2Var.setBackground(h02);
        u6.j(u2Var, h02, null, M, i6Var);
        ra.a(u2Var);
        ri riVar = new ri(getContext(), 36);
        this.c = riVar;
        y h03 = n6.h0(n6.w0(i10, i6Var), 1, -1);
        q6 M2 = u6.M(i10);
        riVar.setBackground(h03);
        u6.j(riVar, h03, null, M2, i6Var);
        riVar.setOnClickListener(new bd0(28, this, bnVar));
        ra.a(riVar);
        n5 n5Var = new n5(getContext());
        this.f = n5Var;
        n5Var.setTextSize(13);
        n5Var.setGravity(17);
        n5Var.setTranslationY(g0.L(44.0f));
        n5Var.setVisibility(8);
        hh0 hh0Var = new hh0(activity, 18);
        this.x = hh0Var;
        addView(hh0Var, layoutParams);
        hh0 hh0Var2 = new hh0(activity, 17);
        this.w = hh0Var2;
        hh0Var.addView(hh0Var2, ma.c(-2.0f, -1));
        hh0Var2.addView(n5Var, ma.e(54, 24, 53));
        hh0Var2.addView(u2Var, ma.e(44, 44, 51));
        hh0Var2.addView(riVar, ma.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        hh0Var2.addView(uVar, ma.d(-1, -2.0f, ks.E1, 39.0f, 0.0f, 47.0f, 0.0f));
        uVar.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(c cVar) {
        n5 n5Var = cVar.f;
        a10.d(n5Var, cVar.I.e);
        int i7 = n6.A6;
        bn bnVar = cVar.d;
        n5Var.setTextColor(i0.a.f(cVar.J.e, n6.w0(i7, bnVar.getResourceProvider()), n6.w0(n6.p7, bnVar.getResourceProvider())));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.A6));
        hashSet.add(Integer.valueOf(n6.p7));
    }

    public d getAttachedMedia() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.G = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.G;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.G.removeOnPreDrawListener(this);
        }
        this.G = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        w1 w1Var;
        uh.a aVar;
        q1 q1Var = this.n;
        if (q1Var != null) {
            int e12 = q1Var.getMessageObject().e1();
            if (this.n.isAttachedToWindow() && this.r == e12 && (w1Var = this.n.x2) != null && (aVar = w1Var.l) != null && w1Var.s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                q1 q1Var2 = this.n;
                int[] iArr = this.E;
                q1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i11 = layoutParams.width;
                hh0 hh0Var = this.x;
                if (i11 != width) {
                    layoutParams.width = width;
                    hh0Var.setLayoutParams(layoutParams);
                }
                hh0Var.setTranslationX(rect.left);
                hh0Var.setTranslationY(g0.L(0.66f) + rect.top);
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
        if (this.H != i7) {
            this.H = i7;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            u2 u2Var = this.b;
            ((Drawable) u2Var.c).setColorFilter(porterDuffColorFilter);
            ((Drawable) u2Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.c.c).setColorFilter(porterDuffColorFilter);
            u uVar = this.a;
            uVar.setCursorColor(i7);
            uVar.setHandlesColor(i7);
            uVar.setHintTextColor(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        bn bnVar;
        try {
            n5 n5Var = this.f;
            if (n5Var == null || (bnVar = this.d) == null) {
                return;
            }
            n5Var.setTextColor(i0.a.f(this.J.e, n6.w0(n6.A6, bnVar.getResourceProvider()), n6.w0(n6.p7, bnVar.getResourceProvider())));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
