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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ue5 extends e implements fn7 {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String a;
    public final String b;
    public final String c;
    public final p5b d;
    public b6 e;
    public jr1 f;
    public FrameLayout h;
    public re5 n;
    public xc7 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public ue5(String str, vnb vnbVar) {
        super(null);
        setResourceProvider(vnbVar);
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
        this.d = new p5b(this.currentAccount, this.c, trim);
    }

    public final int Y() {
        return a.getCurrentActionBarHeight() + (this.simpleActionBar.getOccupyStatusBar() ? hl.m : 0);
    }

    public final void Z(boolean z, boolean z2) {
        gv1 gv1Var;
        gu guVar;
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
            ofFloat.addUpdateListener(new se5(this, b));
            this.G.addListener(new te5(this, z, b));
            this.G.setDuration(320L);
            this.G.setInterpolator(k43.h);
            this.G.start();
            return;
        }
        this.E = z;
        this.F = z ? 1.0f : 0.0f;
        this.n.setScaleX(z ? 1.0f : 0.95f);
        this.n.setScaleY(z ? 1.0f : 0.95f);
        this.h.setAlpha(z ? 1.0f : 0.0f);
        this.h.setVisibility(z ? 0 : 8);
        jr1 jr1Var = this.f;
        if (jr1Var == null || (gv1Var = jr1Var.a) == null || (guVar = gv1Var.a4) == null) {
            return;
        }
        guVar.setScaleX(hl.R1(1.0f, 0.95f, this.F));
        this.f.a.a4.setScaleY(hl.R1(1.0f, 0.95f, this.F));
    }

    public final void a0(boolean z, boolean z2) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        xc7 xc7Var = this.r;
        byte b = 0;
        if (!z2) {
            xc7Var.setVisibility(z ? 0 : 8);
            this.r.setTranslationY(z ? 0.0f : -hl.L(48.0f));
            this.e.setTranslationY(z ? hl.L(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z ? hl.L(48.0f) : 0);
            return;
        }
        xc7Var.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z ? 0.0f : -hl.L(48.0f)).withEndAction(new xac((byte) 22, this, z)).setDuration(320L);
        k43 k43Var = k43.h;
        duration.setInterpolator(k43Var).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new se5(this, b));
        this.y.addListener(new te5(this, z, b));
        this.y.setDuration(320L);
        this.y.setInterpolator(k43Var);
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        jla jlaVar = this.simpleActionBar;
        String str = this.a;
        jlaVar.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = aob.d6;
        yob.h(i, getResourceProvider(), frameLayout);
        frameLayout.setClipChildren(false);
        b6 b6Var = new b6(context, (byte) 17);
        this.e = b6Var;
        b6Var.setClipChildren(false);
        frameLayout.addView(this.e, tre.e(-1, -1, jn7.D1));
        hl.v3(this.e, 0, Y(), 0, 0);
        df5.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        jr1 jr1Var = new jr1(context, getParentLayout(), bundle, (byte) 1);
        jr1Var.h = false;
        this.f = jr1Var;
        this.e.addView(jr1Var, tre.e(-1, -1, jn7.D1));
        re5 re5Var = new re5(this, context, new wia(null), this, new qe5(), this.resourceProvider);
        this.n = re5Var;
        if (re5Var.getSearchOptionsItem() != null) {
            yob.s(this.n.getSearchOptionsItem(), aob.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.u0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        re5 re5Var2 = this.n;
        p5b p5bVar = this.d;
        re5Var2.X1 = p5bVar;
        oha ohaVar = re5Var2.f0;
        ohaVar.s = p5bVar;
        ohaVar.f();
        bja bjaVar = re5Var2.g0;
        bjaVar.s = p5bVar;
        bjaVar.f();
        this.n.i1(0, eg0.e(hl.m) + hl.L(48.0f) + Y(), hl.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        yob.h(i, getResourceProvider(), frameLayout3);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(hl.o());
        this.w.setTextSize(1, 15.0f);
        yob.X(this.w, aob.qf, getResourceProvider());
        this.w.setText(ob6.G(p5bVar.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, tre.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        yob.h(aob.d7, this.resourceProvider, view);
        this.s.addView(view, tre.a(-1.0f, 1.0f / hl.p, 55));
        this.h.addView(this.s, tre.e(-1, 49, 87));
        this.e.addView(this.h, tre.e(-1, -1, jn7.D1));
        xc7 xc7Var = new xc7(context, this.resourceProvider);
        this.r = xc7Var;
        int themedColor = getThemedColor(i);
        int i2 = aob.i6;
        hf0 g0 = aob.g0(themedColor, getThemedColor(i2));
        uob M = yob.M(i);
        uob M2 = yob.M(i2);
        vnb resourceProvider = getResourceProvider();
        xc7Var.setBackground(g0);
        yob.j(xc7Var, g0, M, M2, resourceProvider);
        this.r.setOnClickListener(new sa5(this, (byte) 8));
        a0(this.r.a(p5bVar), false);
        this.r.b(df5.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, tre.e(-1, 48, 55));
        hl.v3(this.r, 0, Y(), 0, 0);
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.i(frameLayout, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new dg0(this, frameLayout, (byte) 5);
        this.n.setPagesGlassEngine(this.glassEngine);
        jla jlaVar2 = this.simpleActionBar;
        jlaVar2.setBackground(baseSimpleGlass.a(jlaVar2));
        Z(false, false);
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jr1 jr1Var;
        if (i != jn7.A5) {
            if (i != jn7.I0 || (jr1Var = this.f) == null || jr1Var.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            xc7 xc7Var = this.r;
            if (xc7Var != null) {
                xc7Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        p5b p5bVar = this.d;
        if (obj == p5bVar) {
            xc7 xc7Var2 = this.r;
            if (xc7Var2 != null) {
                a0(xc7Var2.a(p5bVar), true);
            }
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(ob6.G(p5bVar.J, "FoundStories", new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().O1().I;
        p5b p5bVar = this.d;
        arrayList.add(p5bVar);
        jn7.f(this.currentAccount).b(this, jn7.A5);
        jn7.f(this.currentAccount).b(this, jn7.I0);
        p5bVar.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getMessagesController().O1().I.remove(this.d);
        jn7.f(this.currentAccount).n(this, jn7.A5);
        jn7.f(this.currentAccount).n(this, jn7.I0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
