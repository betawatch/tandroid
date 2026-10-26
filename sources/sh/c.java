package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bi.u;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.voip.j1;
import org.telegram.ui.jg;
import org.telegram.ui.o41;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, p6 {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final oe.b H;
    public final oe.b I;
    public final g6 a;
    public final b b;
    public final d c;
    public final un d;
    public final FrameLayout.LayoutParams e;
    public final b6 f;
    public e h;
    public s1 n;
    public int r;
    public jg s;
    public final o41 v;
    public final o41 w;
    public final int x;
    public final int[] y;

    public c(Activity activity, u6 u6Var, un unVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.y = new int[2];
        this.E = new Rect();
        int i10 = 19;
        j1 j1Var = new j1(this, i10);
        ds dsVar = ds.h;
        this.H = new oe.b(0, j1Var, dsVar, 380L, false);
        this.I = new oe.b(0, new j1(this, i10), dsVar, 380L, false);
        this.d = unVar;
        this.x = unVar.getMessagesController().config.pollAnswerLengthMax.get();
        g6 g6Var = new g6(this, activity, u6Var, 2);
        this.a = g6Var;
        g6Var.setAllowTextEntitiesIntersection(true);
        f7.V(g6Var, y6.G6, u6Var);
        f7.H(g6Var, y6.gc, u6Var);
        f7.E(g6Var, y6.H6, u6Var);
        g6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        g6Var.setTextSize(1, 15.0f);
        g6Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        g6Var.setBackground(null);
        g6Var.setImeOptions(268435462);
        g6Var.setInputType(g6Var.getInputType() | 16384);
        g6Var.addTextChangedListener(new u(this, 20));
        b bVar = new b(activity);
        this.b = bVar;
        int i11 = y6.Vh;
        y g02 = y6.g0(y6.w0(i11, u6Var), 1, -1);
        b7 N = f7.N(i11);
        bVar.setBackground(g02);
        f7.k(bVar, g02, null, N, u6Var);
        gb1.b(bVar);
        d dVar = new d(getContext(), 36);
        this.c = dVar;
        y g03 = y6.g0(y6.w0(i11, u6Var), 1, -1);
        b7 N2 = f7.N(i11);
        dVar.setBackground(g03);
        f7.k(dVar, g03, null, N2, u6Var);
        dVar.setOnClickListener(new org.telegram.ui.web.c(3, this, unVar));
        gb1.b(dVar);
        b6 b6Var = new b6(getContext());
        this.f = b6Var;
        b6Var.setTextSize(13);
        b6Var.setGravity(17);
        b6Var.setTranslationY(AndroidUtilities.dp(44.0f));
        b6Var.setVisibility(8);
        o41 o41Var = new o41(activity, 9);
        this.w = o41Var;
        addView(o41Var, layoutParams);
        o41 o41Var2 = new o41(activity, 8);
        this.v = o41Var2;
        o41Var.addView(o41Var2, gb1.g(-2.0f, -1));
        o41Var2.addView(b6Var, gb1.i(54, 24, 53));
        o41Var2.addView(bVar, gb1.i(44, 44, 51));
        o41Var2.addView(dVar, gb1.h(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        o41Var2.addView(g6Var, gb1.h(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        g6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        b6 b6Var = cVar.f;
        j20.d(b6Var, cVar.H.e);
        int i10 = y6.A6;
        un unVar = cVar.d;
        b6Var.setTextColor(i0.a.f(cVar.I.e, y6.w0(i10, unVar.getResourceProvider()), y6.w0(y6.p7, unVar.getResourceProvider())));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.A6));
        hashSet.add(Integer.valueOf(y6.p7));
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
        s1 s1Var;
        uh.a aVar;
        s1 s1Var2 = this.n;
        if (s1Var2 != null) {
            int id2 = s1Var2.getMessageObject().getId();
            if (this.n.isAttachedToWindow() && this.r == id2 && (aVar = (s1Var = this.n).a6) != null && s1Var.n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                s1 s1Var3 = this.n;
                int[] iArr = this.y;
                s1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                o41 o41Var = this.w;
                if (i12 != width) {
                    layoutParams.width = width;
                    o41Var.setLayoutParams(layoutParams);
                }
                o41Var.setTranslationX(rect.left);
                o41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
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

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(s1 s1Var) {
        this.n = s1Var;
        this.r = s1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.b;
            bVar.b.setColorFilter(porterDuffColorFilter);
            bVar.c.setColorFilter(porterDuffColorFilter);
            this.c.a.setColorFilter(porterDuffColorFilter);
            g6 g6Var = this.a;
            g6Var.setCursorColor(i10);
            g6Var.setHandlesColor(i10);
            g6Var.setHintTextColor(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        un unVar;
        try {
            b6 b6Var = this.f;
            if (b6Var == null || (unVar = this.d) == null) {
                return;
            }
            b6Var.setTextColor(i0.a.f(this.I.e, y6.w0(y6.A6, unVar.getResourceProvider()), y6.w0(y6.p7, unVar.getResourceProvider())));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
