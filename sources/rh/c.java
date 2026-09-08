package rh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import di.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.y10;
import org.telegram.ui.co;
import org.telegram.ui.ug;
import org.telegram.ui.v51;
import org.telegram.ui.wy0;
import rg.p2;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.b H;
    public final le.b I;
    public final b6 a;
    public final b b;
    public final d c;
    public final co d;
    public final FrameLayout.LayoutParams e;
    public final j5 f;
    public e h;
    public t1 n;
    public int r;
    public ug s;
    public final v51 v;
    public final v51 w;
    public final int x;
    public final int[] y;

    public c(Activity activity, f6 f6Var, co coVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.y = new int[2];
        this.E = new Rect();
        int i10 = 1;
        p2 p2Var = new p2(this, i10);
        pr prVar = pr.h;
        this.H = new le.b(0, p2Var, prVar, 380L, false);
        this.I = new le.b(0, new p2(this, i10), prVar, 380L, false);
        this.d = coVar;
        this.x = coVar.getMessagesController().config.pollAnswerLengthMax.get();
        b6 b6Var = new b6(this, activity, f6Var, 2);
        this.a = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(j6.v0(j6.G6, f6Var));
        b6Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        b6Var.setHintTextColor(j6.v0(j6.H6, f6Var));
        b6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        b6Var.setTextSize(1, 15.0f);
        b6Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        b6Var.setBackground(null);
        b6Var.setImeOptions(268435462);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.addTextChangedListener(new i2(this, 16));
        b bVar = new b(activity);
        this.b = bVar;
        int i11 = j6.Vh;
        bVar.setBackground(j6.f0(j6.v0(i11, f6Var), 1, -1));
        z5.a(bVar);
        d dVar = new d(getContext(), 36);
        this.c = dVar;
        dVar.setBackground(j6.f0(j6.v0(i11, f6Var), 1, -1));
        dVar.setOnClickListener(new wy0(15, this, coVar));
        z5.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        v51 v51Var = new v51(activity, 9);
        this.w = v51Var;
        addView(v51Var, layoutParams);
        v51 v51Var2 = new v51(activity, 8);
        this.v = v51Var2;
        v51Var.addView(v51Var2, x5.c(-2.0f, -1));
        v51Var2.addView(j5Var, x5.e(54, 24, 53));
        v51Var2.addView(bVar, x5.e(44, 44, 51));
        v51Var2.addView(dVar, x5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        v51Var2.addView(b6Var, x5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        b6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f;
        y10.d(j5Var, cVar.H.e);
        int i10 = j6.A6;
        co coVar = cVar.d;
        j5Var.setTextColor(i0.a.d(cVar.I.e, j6.v0(i10, coVar.getResourceProvider()), j6.v0(j6.p7, coVar.getResourceProvider())));
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
        t1 t1Var;
        th.a aVar;
        t1 t1Var2 = this.n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.n.isAttachedToWindow() && this.r == id2 && (aVar = (t1Var = this.n).a6) != null && t1Var.n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.n;
                int[] iArr = this.y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                v51 v51Var = this.w;
                if (i12 != width) {
                    layoutParams.width = width;
                    v51Var.setLayoutParams(layoutParams);
                }
                v51Var.setTranslationX(rect.left);
                v51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ug ugVar = this.s;
            if (ugVar != null) {
                ugVar.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.n = t1Var;
        this.r = t1Var.getMessageObject().getId();
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
