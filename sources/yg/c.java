package yg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import fh.s;
import g7.e6;
import g7.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j10;
import org.telegram.ui.b81;
import org.telegram.ui.jg;
import org.telegram.ui.qn;
import pf.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect A;
    public ViewTreeObserver B;
    public int C;
    public final td.a D;
    public final td.a E;
    public final s a;
    public final b b;
    public final d c;
    public final qn d;
    public final FrameLayout.LayoutParams e;
    public final h5 f;
    public e h;
    public t1 n;
    public int r;
    public jg s;
    public final b81 v;
    public final b81 w;
    public final int x;
    public final int[] y;

    public c(Activity activity, b6 b6Var, qn qnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.y = new int[2];
        this.A = new Rect();
        int i9 = 16;
        t0.c cVar = new t0.c(this, i9);
        gr grVar = gr.h;
        this.D = new td.a(0, cVar, grVar, 380L, false);
        this.E = new td.a(0, new t0.c(this, i9), grVar, 380L, false);
        this.d = qnVar;
        this.x = qnVar.getMessagesController().config.pollAnswerLengthMax.get();
        s sVar = new s(this, activity, b6Var, 3);
        this.a = sVar;
        sVar.setAllowTextEntitiesIntersection(true);
        sVar.setTextColor(f6.v0(f6.G6, b6Var));
        sVar.setLinkTextColor(f6.v0(f6.gc, b6Var));
        sVar.setHintTextColor(f6.v0(f6.H6, b6Var));
        sVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        sVar.setTextSize(1, 15.0f);
        sVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        sVar.setBackground(null);
        sVar.setImeOptions(268435462);
        sVar.setInputType(sVar.getInputType() | 16384);
        sVar.addTextChangedListener(new bh.f(this, 19));
        b bVar = new b(activity);
        this.b = bVar;
        int i10 = f6.Vh;
        bVar.setBackground(f6.f0(f6.v0(i10, b6Var), 1, -1));
        g6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.c = dVar;
        dVar.setBackground(f6.f0(f6.v0(i10, b6Var), 1, -1));
        dVar.setOnClickListener(new v(6, this, qnVar));
        g6.a(dVar);
        h5 h5Var = new h5(getContext());
        this.f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        b81 b81Var = new b81(activity, 10);
        this.w = b81Var;
        addView(b81Var, layoutParams);
        b81 b81Var2 = new b81(activity, 9);
        this.v = b81Var2;
        b81Var.addView(b81Var2, e6.c(-2.0f, -1));
        b81Var2.addView(h5Var, e6.e(54, 24, 53));
        b81Var2.addView(bVar, e6.e(44, 44, 51));
        b81Var2.addView(dVar, e6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        b81Var2.addView(sVar, e6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        sVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        h5 h5Var = cVar.f;
        j10.d(h5Var, cVar.D.e);
        int i9 = f6.A6;
        qn qnVar = cVar.d;
        h5Var.setTextColor(i0.a.d(cVar.E.e, f6.v0(i9, qnVar.getResourceProvider()), f6.v0(f6.p7, qnVar.getResourceProvider())));
    }

    public e getAttachedMedia() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.B = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.B.removeOnPreDrawListener(this);
        }
        this.B = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        t1 t1Var;
        ah.a aVar;
        t1 t1Var2 = this.n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.n.isAttachedToWindow() && this.r == id2 && (aVar = (t1Var = this.n).W5) != null && t1Var.j6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.A;
                rect.set(bounds);
                t1 t1Var3 = this.n;
                int[] iArr = this.y;
                t1Var3.getLocationInWindow(iArr);
                int i9 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i9 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i11 = layoutParams.width;
                b81 b81Var = this.w;
                if (i11 != width) {
                    layoutParams.width = width;
                    b81Var.setLayoutParams(layoutParams);
                }
                b81Var.setTranslationX(rect.left);
                b81Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            jg jgVar = this.s;
            if (jgVar != null) {
                jgVar.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.v.setAlpha(f10);
    }

    public void setCellToWatch(t1 t1Var) {
        this.n = t1Var;
        this.r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i9) {
        if (this.C != i9) {
            this.C = i9;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
            b bVar = this.b;
            bVar.b.setColorFilter(porterDuffColorFilter);
            bVar.c.setColorFilter(porterDuffColorFilter);
            this.c.a.setColorFilter(porterDuffColorFilter);
            s sVar = this.a;
            sVar.setCursorColor(i9);
            sVar.setHandlesColor(i9);
            sVar.setHintTextColor(i9);
        }
    }
}
