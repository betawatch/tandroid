package qh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ci.i2;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.y10;
import org.telegram.ui.bo;
import org.telegram.ui.t41;
import org.telegram.ui.wg;
import org.telegram.ui.xy0;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
    public final bo d;
    public final FrameLayout.LayoutParams e;
    public final k5 f;
    public e h;
    public t1 n;
    public int r;
    public wg s;
    public final t41 v;
    public final t41 w;
    public final int x;
    public final int[] y;

    public c(Activity activity, f6 f6Var, bo boVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.y = new int[2];
        this.E = new Rect();
        int i10 = 27;
        v vVar = new v(this, i10);
        qr qrVar = qr.h;
        this.H = new le.b(0, vVar, qrVar, 380L, false);
        this.I = new le.b(0, new v(this, i10), qrVar, 380L, false);
        this.d = boVar;
        this.x = boVar.getMessagesController().config.pollAnswerLengthMax.get();
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
        dVar.setOnClickListener(new xy0(15, this, boVar));
        z5.a(dVar);
        k5 k5Var = new k5(getContext());
        this.f = k5Var;
        k5Var.setTextSize(13);
        k5Var.setGravity(17);
        k5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        k5Var.setVisibility(8);
        t41 t41Var = new t41(activity, 10);
        this.w = t41Var;
        addView(t41Var, layoutParams);
        t41 t41Var2 = new t41(activity, 9);
        this.v = t41Var2;
        t41Var.addView(t41Var2, x5.c(-2.0f, -1));
        t41Var2.addView(k5Var, x5.e(54, 24, 53));
        t41Var2.addView(bVar, x5.e(44, 44, 51));
        t41Var2.addView(dVar, x5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        t41Var2.addView(b6Var, x5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        b6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        k5 k5Var = cVar.f;
        y10.d(k5Var, cVar.H.e);
        int i10 = j6.A6;
        bo boVar = cVar.d;
        k5Var.setTextColor(i0.a.d(cVar.I.e, j6.v0(i10, boVar.getResourceProvider()), j6.v0(j6.p7, boVar.getResourceProvider())));
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
        sh.a aVar;
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
                t41 t41Var = this.w;
                if (i12 != width) {
                    layoutParams.width = width;
                    t41Var.setLayoutParams(layoutParams);
                }
                t41Var.setTranslationX(rect.left);
                t41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            wg wgVar = this.s;
            if (wgVar != null) {
                wgVar.run();
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
