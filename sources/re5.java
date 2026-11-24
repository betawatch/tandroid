// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class re5 extends d implements jm7 {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String a;
    public final String b;
    public final String c;
    public final u3b d;
    public a6 e;
    public is1 f;
    public FrameLayout h;
    public oe5 n;
    public rc7 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public re5(String str, ylb ylbVar) {
        super(null);
        setResourceProvider(ylbVar);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            String substring = trim.substring(0, indexOf);
            this.b = substring;
            this.c = trim.substring(indexOf + 1);
            trim = substring;
        } else {
            this.b = trim;
            this.c = null;
        }
        if (!TextUtils.isEmpty(this.c)) {
            str2 = "@" + this.c;
        }
        this.a = trim.concat(str2);
        this.d = new u3b(this.currentAccount, this.c, trim);
    }

    public final int Z() {
        return a.getCurrentActionBarHeight() + (this.simpleActionBar.getOccupyStatusBar() ? gm.m : 0);
    }

    public final void a0(boolean z, boolean z2) {
        fw1 fw1Var;
        fv fvVar;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            if (this.E == z) {
                return;
            }
            this.E = z;
            this.h.setVisibility(0);
            byte b = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new pe5(this, b));
            this.G.addListener(new qe5(this, z, b));
            this.G.setDuration(320L);
            this.G.setInterpolator(d53.h);
            this.G.start();
            return;
        }
        this.E = z;
        this.F = z ? 1.0f : 0.0f;
        this.n.setScaleX(z ? 1.0f : 0.95f);
        this.n.setScaleY(z ? 1.0f : 0.95f);
        this.h.setAlpha(z ? 1.0f : 0.0f);
        this.h.setVisibility(z ? 0 : 8);
        is1 is1Var = this.f;
        if (is1Var == null || (fw1Var = is1Var.a) == null || (fvVar = fw1Var.a4) == null) {
            return;
        }
        fvVar.setScaleX(gm.R1(1.0f, 0.95f, this.F));
        this.f.a.a4.setScaleY(gm.R1(1.0f, 0.95f, this.F));
    }

    public final void b0(boolean z, boolean z2) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rc7 rc7Var = this.r;
        byte b = 0;
        if (!z2) {
            rc7Var.setVisibility(z ? 0 : 8);
            this.r.setTranslationY(z ? 0.0f : -gm.L(48.0f));
            this.e.setTranslationY(z ? gm.L(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z ? gm.L(48.0f) : 0);
            return;
        }
        rc7Var.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z ? 0.0f : -gm.L(48.0f)).withEndAction(new y8c((byte) 22, this, z)).setDuration(320L);
        d53 d53Var = d53.h;
        duration.setInterpolator(d53Var).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new pe5(this, b));
        this.y.addListener(new qe5(this, z, b));
        this.y.setDuration(320L);
        this.y.setInterpolator(d53Var);
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        rja rjaVar = this.simpleActionBar;
        String str = this.a;
        rjaVar.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = cmb.c6;
        anb.h(i, getResourceProvider(), frameLayout);
        frameLayout.setClipChildren(false);
        a6 a6Var = new a6(context, (byte) 16);
        this.e = a6Var;
        a6Var.setClipChildren(false);
        frameLayout.addView(this.e, qoe.e(-1, -1, nm7.D1));
        gm.v3(this.e, 0, Z(), 0, 0);
        af5.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        is1 is1Var = new is1(context, getParentLayout(), bundle, (byte) 1);
        is1Var.h = false;
        this.f = is1Var;
        this.e.addView(is1Var, qoe.e(-1, -1, nm7.D1));
        oe5 oe5Var = new oe5(this, context, new fha(null), this, new ne5(), this.resourceProvider);
        this.n = oe5Var;
        if (oe5Var.getSearchOptionsItem() != null) {
            anb.s(this.n.getSearchOptionsItem(), cmb.F6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.u0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        oe5 oe5Var2 = this.n;
        u3b u3bVar = this.d;
        oe5Var2.X1 = u3bVar;
        xfa xfaVar = oe5Var2.f0;
        xfaVar.s = u3bVar;
        xfaVar.f();
        kha khaVar = oe5Var2.g0;
        khaVar.s = u3bVar;
        khaVar.f();
        this.n.i1(0, eh0.c(gm.m) + gm.L(48.0f) + Z(), gm.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        anb.h(i, getResourceProvider(), frameLayout3);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(gm.o());
        this.w.setTextSize(1, 15.0f);
        anb.X(this.w, cmb.pf, getResourceProvider());
        this.w.setText(jb6.G(u3bVar.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, qoe.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        anb.h(cmb.c7, this.resourceProvider, view);
        this.s.addView(view, qoe.a(-1.0f, 1.0f / gm.p, 55));
        this.h.addView(this.s, qoe.e(-1, 49, 87));
        this.e.addView(this.h, qoe.e(-1, -1, nm7.D1));
        rc7 rc7Var = new rc7(context, this.resourceProvider);
        this.r = rc7Var;
        int themedColor = getThemedColor(i);
        int i2 = cmb.h6;
        fg0 g0 = cmb.g0(themedColor, getThemedColor(i2));
        wmb M = anb.M(i);
        wmb M2 = anb.M(i2);
        ylb resourceProvider = getResourceProvider();
        rc7Var.setBackground(g0);
        anb.j(rc7Var, g0, M, M2, resourceProvider);
        this.r.setOnClickListener(new ca5(this, (byte) 10));
        b0(this.r.a(u3bVar), false);
        this.r.b(af5.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, qoe.e(-1, 48, 55));
        gm.v3(this.r, 0, Z(), 0, 0);
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.g(frameLayout, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new dh0(this, frameLayout, (byte) 5);
        this.n.setPagesGlassEngine(this.glassEngine);
        rja rjaVar2 = this.simpleActionBar;
        rjaVar2.setBackground(baseSimpleGlass.a(rjaVar2));
        a0(false, false);
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        is1 is1Var;
        if (i != nm7.B5) {
            if (i != nm7.I0 || (is1Var = this.f) == null || is1Var.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            rc7 rc7Var = this.r;
            if (rc7Var != null) {
                rc7Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        u3b u3bVar = this.d;
        if (obj == u3bVar) {
            rc7 rc7Var2 = this.r;
            if (rc7Var2 != null) {
                b0(rc7Var2.a(u3bVar), true);
            }
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(jb6.G(u3bVar.J, "FoundStories", new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().N1().I;
        u3b u3bVar = this.d;
        arrayList.add(u3bVar);
        nm7.f(this.currentAccount).b(this, nm7.B5);
        nm7.f(this.currentAccount).b(this, nm7.I0);
        u3bVar.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getMessagesController().N1().I.remove(this.d);
        nm7.f(this.currentAccount).n(this, nm7.B5);
        nm7.f(this.currentAccount).n(this, nm7.I0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
