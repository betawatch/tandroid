package th;

import ai.z;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import b8.mf;
import b8.pf;
import ei.e3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.j0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.ma;
import org.telegram.ui.tf;
import org.telegram.ui.wm;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, z5 {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final qe.a I;
    public final qe.a J;
    public final z a;
    public final e3 b;
    public final ai c;
    public final wm d;
    public final FrameLayout.LayoutParams e;
    public final k5 f;
    public c h;
    public q1 n;
    public int r;
    public tf s;
    public final yg0 w;
    public final yg0 x;
    public final int y;

    public b(Activity activity, e6 e6Var, wm wmVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        int i3 = 2;
        this.E = new int[2];
        this.F = new Rect();
        int i10 = 17;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(this, i10);
        xq xqVar = xq.h;
        this.I = new qe.a(0, e3Var, xqVar, 380L, false);
        this.J = new qe.a(0, new org.telegram.ui.ActionBar.e3(this, i10), xqVar, 380L, false);
        this.d = wmVar;
        this.y = ((j0) wmVar.getMessagesController().x7.I.b).c;
        z zVar = new z(this, activity, e6Var, 3);
        this.a = zVar;
        zVar.setAllowTextEntitiesIntersection(true);
        r6.V(zVar, k6.G6, e6Var);
        r6.H(zVar, k6.Uc, e6Var);
        r6.E(zVar, k6.H6, e6Var);
        zVar.setHint(bd.M0(2131747191, null));
        zVar.setTextSize(1, 15.0f);
        zVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        zVar.setBackground(null);
        zVar.setImeOptions(268435462);
        zVar.setInputType(zVar.getInputType() | TLObject.FLAG_14);
        zVar.addTextChangedListener(new ma(this, i3));
        e3 e3Var2 = new e3(activity, 7);
        this.b = e3Var2;
        int i11 = k6.Ji;
        y h02 = k6.h0(k6.w0(i11, e6Var), 1, -1);
        n6 N = r6.N(i11);
        e3Var2.setBackground(h02);
        r6.k(e3Var2, h02, null, N, e6Var);
        pf.a(e3Var2);
        ai aiVar = new ai(getContext(), 36);
        this.c = aiVar;
        y h03 = k6.h0(k6.w0(i11, e6Var), 1, -1);
        n6 N2 = r6.N(i11);
        aiVar.setBackground(h03);
        r6.k(aiVar, h03, null, N2, e6Var);
        aiVar.setOnClickListener(new org.telegram.ui.web.d(i3, this, wmVar));
        pf.a(aiVar);
        k5 k5Var = new k5(getContext());
        this.f = k5Var;
        k5Var.setTextSize(13);
        k5Var.setGravity(17);
        k5Var.setTranslationY(g0.L(44.0f));
        k5Var.setVisibility(8);
        yg0 yg0Var = new yg0(activity, 18);
        this.x = yg0Var;
        addView(yg0Var, layoutParams);
        yg0 yg0Var2 = new yg0(activity, 17);
        this.w = yg0Var2;
        yg0Var.addView(yg0Var2, mf.c(-2.0f, -1));
        yg0Var2.addView(k5Var, mf.e(54, 24, 53));
        yg0Var2.addView(e3Var2, mf.e(44, 44, 51));
        yg0Var2.addView(aiVar, mf.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        yg0Var2.addView(zVar, mf.d(-1, -2.0f, hs.E1, 39.0f, 0.0f, 47.0f, 0.0f));
        zVar.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(b bVar) {
        k5 k5Var = bVar.f;
        l00.d(k5Var, bVar.I.e);
        int i3 = k6.A6;
        wm wmVar = bVar.d;
        k5Var.setTextColor(i0.a.f(bVar.J.e, k6.w0(i3, wmVar.getResourceProvider()), k6.w0(k6.p7, wmVar.getResourceProvider())));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.A6));
        hashSet.add(Integer.valueOf(k6.p7));
    }

    public c getAttachedMedia() {
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
        vh.a aVar;
        q1 q1Var = this.n;
        if (q1Var != null) {
            int f12 = q1Var.getMessageObject().f1();
            if (this.n.isAttachedToWindow() && this.r == f12 && (w1Var = this.n.w2) != null && (aVar = w1Var.l) != null && w1Var.s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                q1 q1Var2 = this.n;
                int[] iArr = this.E;
                q1Var2.getLocationInWindow(iArr);
                int i3 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i3 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i11 = layoutParams.width;
                yg0 yg0Var = this.x;
                if (i11 != width) {
                    layoutParams.width = width;
                    yg0Var.setLayoutParams(layoutParams);
                }
                yg0Var.setTranslationX(rect.left);
                yg0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            tf tfVar = this.s;
            if (tfVar != null) {
                tfVar.run();
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
        this.r = q1Var.getMessageObject().f1();
    }

    public void setColor(int i3) {
        if (this.H != i3) {
            this.H = i3;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
            e3 e3Var = this.b;
            ((Drawable) e3Var.c).setColorFilter(porterDuffColorFilter);
            ((Drawable) e3Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.c.c).setColorFilter(porterDuffColorFilter);
            z zVar = this.a;
            zVar.setCursorColor(i3);
            zVar.setHandlesColor(i3);
            zVar.setHintTextColor(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        wm wmVar;
        try {
            k5 k5Var = this.f;
            if (k5Var == null || (wmVar = this.d) == null) {
                return;
            }
            k5Var.setTextColor(i0.a.f(this.J.e, k6.w0(k6.A6, wmVar.getResourceProvider()), k6.w0(k6.p7, wmVar.getResourceProvider())));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
