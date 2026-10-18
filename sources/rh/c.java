package rh;

import ai.u;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h20;
import org.telegram.ui.l41;
import org.telegram.ui.mg;
import org.telegram.ui.sn;
import qg.g0;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final ne.b H;
    public final ne.b I;
    public final b6 a;
    public final b b;
    public final d c;
    public final sn d;
    public final FrameLayout.LayoutParams e;
    public final j5 f;
    public e h;
    public u1 n;
    public int r;
    public mg s;
    public final l41 v;
    public final l41 w;
    public final int x;
    public final int[] y;

    public c(Activity activity, d6 d6Var, sn snVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.y = new int[2];
        this.E = new Rect();
        int i10 = 15;
        g0 g0Var = new g0(this, i10);
        bs bsVar = bs.h;
        this.H = new ne.b(0, g0Var, bsVar, 380L, false);
        this.I = new ne.b(0, new g0(this, i10), bsVar, 380L, false);
        this.d = snVar;
        this.x = snVar.getMessagesController().config.pollAnswerLengthMax.get();
        b6 b6Var = new b6(this, activity, d6Var, 2);
        this.a = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(h6.w0(h6.G6, d6Var));
        b6Var.setLinkTextColor(h6.w0(h6.gc, d6Var));
        b6Var.setHintTextColor(h6.w0(h6.H6, d6Var));
        b6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        b6Var.setTextSize(1, 15.0f);
        b6Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        b6Var.setBackground(null);
        b6Var.setImeOptions(268435462);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.addTextChangedListener(new u(this, 20));
        b bVar = new b(activity);
        this.b = bVar;
        int i11 = h6.Vh;
        bVar.setBackground(h6.g0(h6.w0(i11, d6Var), 1, -1));
        w7.b6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.c = dVar;
        dVar.setBackground(h6.g0(h6.w0(i11, d6Var), 1, -1));
        dVar.setOnClickListener(new qg.n(2, this, snVar));
        w7.b6.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        l41 l41Var = new l41(activity, 9);
        this.w = l41Var;
        addView(l41Var, layoutParams);
        l41 l41Var2 = new l41(activity, 8);
        this.v = l41Var2;
        l41Var.addView(l41Var2, z5.d(-2.0f, -1));
        l41Var2.addView(j5Var, z5.e(54, 24, 53));
        l41Var2.addView(bVar, z5.e(44, 44, 51));
        l41Var2.addView(dVar, z5.a(44.0f, 0.0f, 0.0f, 5.0f, 0.0f, 44, 53));
        l41Var2.addView(b6Var, z5.a(-2.0f, 39.0f, 0.0f, 47.0f, 0.0f, -1, 119));
        b6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f;
        h20.d(j5Var, cVar.H.e);
        int i10 = h6.A6;
        sn snVar = cVar.d;
        j5Var.setTextColor(i0.a.f(cVar.I.e, h6.w0(i10, snVar.getResourceProvider()), h6.w0(h6.p7, snVar.getResourceProvider())));
    }

    public e getAttachedMedia() {
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
        u1 u1Var;
        th.a aVar;
        u1 u1Var2 = this.n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.n.isAttachedToWindow() && this.r == id2 && (aVar = (u1Var = this.n).a6) != null && u1Var.n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.n;
                int[] iArr = this.y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                l41 l41Var = this.w;
                if (i12 != width) {
                    layoutParams.width = width;
                    l41Var.setLayoutParams(layoutParams);
                }
                l41Var.setTranslationX(rect.left);
                l41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            mg mgVar = this.s;
            if (mgVar != null) {
                mgVar.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.n = u1Var;
        this.r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.b;
            bVar.b.setColorFilter(porterDuffColorFilter);
            bVar.c.setColorFilter(porterDuffColorFilter);
            this.c.a.setColorFilter(porterDuffColorFilter);
            b6 b6Var = this.a;
            b6Var.setCursorColor(i10);
            b6Var.setHandlesColor(i10);
            b6Var.setHintTextColor(i10);
        }
    }
}
