package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bi.u;
import c8.na;
import c8.sa;
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
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.si;
import org.telegram.ui.Wallet.j9;
import org.telegram.ui.af;
import org.telegram.ui.bn;
import org.telegram.ui.gh0;
import org.telegram.ui.ig0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, c6 {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final te.a I;
    public final te.a J;
    public final u a;
    public final u2 b;
    public final si c;
    public final bn d;
    public final FrameLayout.LayoutParams e;
    public final n5 f;
    public c h;
    public r1 n;
    public int r;
    public af s;
    public final gh0 w;
    public final gh0 x;
    public final int y;

    public b(Activity activity, i6 i6Var, bn bnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        int i7 = 26;
        org.telegram.tgnet.g gVar = new org.telegram.tgnet.g(this, i7);
        kr krVar = kr.h;
        this.I = new te.a(0, gVar, krVar, 380L, false);
        this.J = new te.a(0, new org.telegram.tgnet.g(this, i7), krVar, 380L, false);
        this.d = bnVar;
        this.y = ((j0) bnVar.getMessagesController().A7.N.b).c;
        u uVar = new u(this, activity, i6Var, 3);
        this.a = uVar;
        uVar.setAllowTextEntitiesIntersection(true);
        u6.U(uVar, n6.G6, i6Var);
        u6.G(uVar, n6.Xc, i6Var);
        u6.D(uVar, n6.H6, i6Var);
        uVar.setHint(gd.N0(2131746989, null));
        uVar.setTextSize(1, 15.0f);
        uVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        uVar.setBackground(null);
        uVar.setImeOptions(268435462);
        uVar.setInputType(uVar.getInputType() | TLObject.FLAG_14);
        uVar.addTextChangedListener(new j9(this, 5));
        u2 u2Var = new u2(activity, 6);
        this.b = u2Var;
        int i10 = n6.Mi;
        y h02 = n6.h0(n6.w0(i10, i6Var), 1, -1);
        q6 M = u6.M(i10);
        u2Var.setBackground(h02);
        u6.j(u2Var, h02, null, M, i6Var);
        sa.a(u2Var);
        si siVar = new si(getContext(), 36);
        this.c = siVar;
        y h03 = n6.h0(n6.w0(i10, i6Var), 1, -1);
        q6 M2 = u6.M(i10);
        siVar.setBackground(h03);
        u6.j(siVar, h03, null, M2, i6Var);
        siVar.setOnClickListener(new ig0(i7, this, bnVar));
        sa.a(siVar);
        n5 n5Var = new n5(getContext());
        this.f = n5Var;
        n5Var.setTextSize(13);
        n5Var.setGravity(17);
        n5Var.setTranslationY(g0.L(44.0f));
        n5Var.setVisibility(8);
        gh0 gh0Var = new gh0(activity, 18);
        this.x = gh0Var;
        addView(gh0Var, layoutParams);
        gh0 gh0Var2 = new gh0(activity, 17);
        this.w = gh0Var2;
        gh0Var.addView(gh0Var2, na.c(-2.0f, -1));
        gh0Var2.addView(n5Var, na.e(54, 24, 53));
        gh0Var2.addView(u2Var, na.e(44, 44, 51));
        gh0Var2.addView(siVar, na.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        gh0Var2.addView(uVar, na.d(-1, -2.0f, ks.E1, 39.0f, 0.0f, 47.0f, 0.0f));
        uVar.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(b bVar) {
        n5 n5Var = bVar.f;
        a10.d(n5Var, bVar.I.e);
        int i7 = n6.A6;
        bn bnVar = bVar.d;
        n5Var.setTextColor(i0.a.f(bVar.J.e, n6.w0(i7, bnVar.getResourceProvider()), n6.w0(n6.p7, bnVar.getResourceProvider())));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.A6));
        hashSet.add(Integer.valueOf(n6.p7));
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
        x1 x1Var;
        uh.a aVar;
        r1 r1Var = this.n;
        if (r1Var != null) {
            int e12 = r1Var.getMessageObject().e1();
            if (this.n.isAttachedToWindow() && this.r == e12 && (x1Var = this.n.x2) != null && (aVar = x1Var.l) != null && x1Var.s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                r1 r1Var2 = this.n;
                int[] iArr = this.E;
                r1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i11 = layoutParams.width;
                gh0 gh0Var = this.x;
                if (i11 != width) {
                    layoutParams.width = width;
                    gh0Var.setLayoutParams(layoutParams);
                }
                gh0Var.setTranslationX(rect.left);
                gh0Var.setTranslationY(g0.L(0.66f) + rect.top);
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

    public void setCellToWatch(r1 r1Var) {
        this.n = r1Var;
        this.r = r1Var.getMessageObject().e1();
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
