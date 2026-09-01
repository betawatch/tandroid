package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class r91 extends FrameLayout {
    public final Window a;
    public final wf.g b;
    public final wf.g c;
    public final yf.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final c51 h;
    public final ArrayList n;
    public t91 r;
    public final int s;

    public r91(Context context, int i10, wf.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i10;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        this.h = new c51(context, 2);
        yf.c cVar = new yf.c(getContext(), g6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.el0());
        final int i11 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n91
            public final /* synthetic */ r91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.h(true);
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.c.c(false);
                        break;
                }
            }
        });
        if (i10 == 1) {
            this.b = new wf.k(getContext(), g6Var);
            wf.k kVar = new wf.k(getContext(), g6Var);
            this.c = kVar;
            kVar.q0.y = true;
        } else if (i10 == 2) {
            this.b = new wf.p(getContext(), g6Var);
            wf.p pVar = new wf.p(getContext(), g6Var);
            this.c = pVar;
            pVar.q0.y = true;
        } else if (i10 == 3) {
            wf.a aVar = new wf.a(getContext(), null);
            aVar.t0 = true;
            aVar.u0 = true;
            this.b = aVar;
            wf.m mVar = new wf.m(getContext(), null);
            this.c = mVar;
            mVar.q0.y = true;
        } else if (i10 == 4) {
            wf.q qVar = new wf.q(getContext());
            this.b = qVar;
            qVar.q0.B = true;
            wf.n nVar = new wf.n(getContext());
            nVar.J1 = -1;
            nVar.K1 = new RectF();
            nVar.M1 = AndroidUtilities.dp(9.0f);
            nVar.N1 = AndroidUtilities.dp(13.0f);
            nVar.O1 = new String[101];
            nVar.Q1 = 1.0f;
            nVar.R1 = 0;
            nVar.S1 = -1;
            nVar.T1 = -1;
            for (int i12 = 1; i12 <= 100; i12++) {
                nVar.O1[i12] = android.support.v4.media.a.l(i12, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.L1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.e1 = true;
            this.c = nVar;
        } else if (i10 != 5) {
            this.b = new wf.m(getContext(), null);
            wf.m mVar2 = new wf.m(getContext(), null);
            this.c = mVar2;
            mVar2.q0.y = true;
        } else {
            this.b = new wf.l(getContext(), null);
            wf.l lVar = new wf.l(getContext(), null);
            this.c = lVar;
            lVar.q0.y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = fVar;
        this.c.a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.q0, -2, -2);
        frameLayout.addView(this.c);
        frameLayout.addView(this.c.q0, -2, -2);
        frameLayout.addView(radialProgressView, k7.c6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s5, g6Var));
        this.b.setDateSelectionListener(new kl0(this, 19));
        this.b.q0.d(false, false);
        this.b.q0.setOnTouchListener(new org.telegram.ui.Components.el0());
        final int i13 = 1;
        this.b.q0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n91
            public final /* synthetic */ r91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.h(true);
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.c.c(false);
                        break;
                }
            }
        });
        final int i14 = 2;
        this.c.q0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.n91
            public final /* synthetic */ r91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.h(true);
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.c.c(false);
                        break;
                }
            }
        });
        this.b.setVisibility(0);
        this.c.setVisibility(4);
        this.b.setHeader(this.d);
        f10.addView(this.d, k7.c6.c(52.0f, -1));
        f10.addView(frameLayout, k7.c6.c(-2.0f, -1));
        f10.addView(this.h, k7.c6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z4) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        wf.g gVar = this.b;
        gVar.G = false;
        wf.g gVar2 = this.c;
        gVar2.G = false;
        gVar.v0 = 2;
        gVar2.v0 = 1;
        final yf.j jVar = new yf.j();
        wf.j jVar2 = gVar.d0;
        jVar.b = jVar2.l;
        jVar.a = jVar2.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j10);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        jVar.c = this.r.d.b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.w0 = jVar;
        gVar.w0 = jVar;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
            if (((xf.a) this.r.d.d.get(i10)).a[binarySearch] > j11) {
                j11 = ((xf.a) this.r.d.d.get(i10)).a[binarySearch];
            }
            if (((xf.a) this.r.d.d.get(i10)).a[binarySearch] < j12) {
                j12 = ((xf.a) this.r.d.d.get(i10)).a[binarySearch];
            }
        }
        float f10 = j12 + (j11 - j12);
        float f11 = gVar.w;
        final float f12 = (f10 - f11) / (gVar.v - f11);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.o91
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                r91 r91Var = r91.this;
                wf.g gVar3 = r91Var.b;
                float f13 = gVar3.C0;
                wf.j jVar3 = gVar3.d0;
                float f14 = jVar3.l;
                float f15 = jVar3.k;
                float f16 = ((f13 / (f14 - f15)) * f15) - wf.g.h1;
                RectF rectF = gVar3.E0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                yf.j jVar4 = jVar;
                jVar4.e = height;
                jVar4.d = (gVar3.D0 * jVar4.c) - f16;
                jVar4.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf.g gVar4 = r91Var.c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(t91 t91Var);

    public abstract void c();

    public final void d() {
        xf.b bVar;
        ArrayList arrayList;
        wf.g gVar = this.b;
        gVar.G();
        gVar.invalidate();
        wf.g gVar2 = this.c;
        gVar2.G();
        gVar2.invalidate();
        yf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        t91 t91Var = this.r;
        if (t91Var != null && (bVar = t91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
                int w02 = (((xf.a) this.r.d.d.get(i10)).g < 0 || !org.telegram.ui.ActionBar.k6.c1(((xf.a) this.r.d.d.get(i10)).g)) ? i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false)) < 0.5d ? ((xf.a) this.r.d.d.get(i10)).i : ((xf.a) this.r.d.d.get(i10)).h : org.telegram.ui.ActionBar.k6.w0(null, ((xf.a) this.r.d.d.get(i10)).g, false);
                ArrayList arrayList2 = this.n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.t00 t00Var = ((q91) arrayList2.get(i10)).a;
                    t00Var.getClass();
                    t00Var.r = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false);
                    t00Var.v = -1;
                    t00Var.s = w02;
                    t00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.s5, false));
    }

    public final void e(t91 t91Var, boolean z4) {
        if (t91Var == null) {
            return;
        }
        String str = t91Var.j;
        yf.c cVar = this.d;
        cVar.setTitle(str);
        boolean z10 = getContext().getResources().getConfiguration().orientation == 2;
        wf.g gVar = this.b;
        gVar.setLandscape(z10);
        ArrayList arrayList = gVar.d;
        wf.j jVar = gVar.d0;
        wf.g gVar2 = this.c;
        gVar2.setLandscape(z10);
        this.r = t91Var;
        boolean z11 = t91Var.l;
        ArrayList arrayList2 = this.n;
        c51 c51Var = this.h;
        RadialProgressView radialProgressView = this.e;
        TextView textView = this.f;
        if (z11 || t91Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = t91Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            c51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        yf.e eVar = gVar.q0;
        boolean z12 = t91Var.n;
        eVar.a = z12;
        cVar.c(!z12);
        if (t91Var.d == null && t91Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(t91Var);
            gVar.D(null);
            return;
        }
        if (!z4) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(t91Var.d) && t91Var.h) {
            jVar.k = 0.0f;
            jVar.l = 1.0f;
            jVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(t91Var.o);
        gVar.q0.setUseWeek(t91Var.o);
        yf.e eVar2 = gVar.q0;
        eVar2.C = this.r.g != null || this.s == 4;
        gVar2.q0.C = false;
        eVar2.setEnabled(eVar2.C);
        yf.e eVar3 = gVar2.q0;
        eVar3.setEnabled(eVar3.C);
        int size = arrayList.size();
        c51Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i10 = 0; i10 < size; i10++) {
                yf.f fVar = (yf.f) arrayList.get(i10);
                q91 q91Var = new q91(this, i10);
                q91Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.t00 t00Var = q91Var.a;
                t00Var.setText(str3);
                t00Var.a(fVar.n, false);
                t00Var.setOnTouchListener(new org.telegram.ui.Components.el0());
                t00Var.setOnClickListener(new hb0(22, q91Var, fVar));
                t00Var.setOnLongClickListener(new oh.g2(6, q91Var, fVar));
            }
        }
        long j10 = this.r.c;
        if (j10 > 0) {
            gVar.p0 = Arrays.binarySearch(gVar.e0.a, j10);
            gVar.r0 = true;
            gVar.q0.setVisibility(0);
            gVar.s0 = 1.0f;
            gVar.x((gVar.D0 * jVar.k) - wf.g.h1);
            try {
                gVar.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            g(true);
        } else {
            h(false);
            gVar.invalidate();
        }
        d();
        if (z4) {
            gVar.v0 = 3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            yf.j jVar2 = new yf.j();
            gVar.w0 = jVar2;
            jVar2.f = 0.0f;
            ofFloat.addUpdateListener(new j11(this, 12));
            ofFloat.addListener(new p91(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z4) {
        ArrayList arrayList;
        boolean z10;
        wf.g gVar = this.b;
        long selectedDate = gVar.getSelectedDate();
        xf.b bVar = this.r.e;
        wf.g gVar2 = this.c;
        if (!z4 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.r.d.d.size();
                arrayList = this.n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= bVar.d.size()) {
                        z10 = false;
                        break;
                    }
                    if (((xf.a) bVar.d.get(i12)).c.equals(((xf.a) this.r.d.d.get(i10)).c)) {
                        boolean z11 = ((q91) arrayList.get(i10)).a.b;
                        ((yf.f) arrayList2.get(i12)).n = z11;
                        ((yf.f) arrayList2.get(i12)).o = z11 ? 1.0f : 0.0f;
                        ((q91) arrayList.get(i10)).a.c = true;
                        ((q91) arrayList.get(i10)).a.animate().alpha(1.0f).start();
                        if (z11) {
                            i11++;
                        }
                        z10 = true;
                    } else {
                        i12++;
                    }
                }
                if (!z10) {
                    ((q91) arrayList.get(i10)).a.c = false;
                    ((q91) arrayList.get(i10)).a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.r.d.d.size(); i13++) {
                    ((q91) arrayList.get(i13)).a.c = true;
                    ((q91) arrayList.get(i13)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        gVar.q0.setAlpha(0.0f);
        gVar.s0 = 0.0f;
        gVar.r0 = false;
        gVar.f1 = false;
        gVar2.G();
        yf.c cVar = this.d;
        if (!z4) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z4) {
            ValueAnimator a2 = a(selectedDate, true);
            a2.addListener(new p91(this, 0));
            a2.start();
            return;
        }
        gVar.setVisibility(4);
        gVar2.setVisibility(0);
        gVar.v0 = 0;
        gVar2.v0 = 0;
        gVar.G = false;
        gVar2.G = true;
        cVar.d(selectedDate, false);
    }

    public final void h(boolean z4) {
        xf.b bVar;
        t91 t91Var = this.r;
        if (t91Var == null || (bVar = t91Var.d) == null || bVar.a == null) {
            return;
        }
        yf.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        wf.g gVar = this.b;
        cVar.b(gVar.getStartDate(), gVar.getEndDate());
        if (z4) {
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.3f);
            textView2.setScaleY(0.3f);
            textView2.setPivotX(0.0f);
            textView2.setPivotY(0.0f);
            textView2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
            textView.setAlpha(1.0f);
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            textView.setScaleX(1.0f);
            textView.setScaleY(1.0f);
            textView.setPivotY(AndroidUtilities.dp(40.0f));
            textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
        } else {
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView.setAlpha(0.0f);
        }
        gVar.q0.f.setAlpha(1.0f);
        wf.g gVar2 = this.c;
        gVar2.setHeader(null);
        long selectedDate = gVar.getSelectedDate();
        this.r.c = 0L;
        int i10 = 0;
        gVar.setVisibility(0);
        gVar2.d();
        gVar2.setHeader(null);
        gVar.setHeader(cVar);
        ArrayList arrayList = this.n;
        if (z4) {
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new p91(this, 1));
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                q91 q91Var = (q91) obj;
                q91Var.a.animate().alpha(1.0f).start();
                q91Var.a.c = true;
            }
            a2.start();
            return;
        }
        gVar2.setVisibility(4);
        gVar.G = true;
        gVar2.G = false;
        gVar.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            q91 q91Var2 = (q91) obj2;
            q91Var2.a.setAlpha(1.0f);
            q91Var2.a.c = true;
        }
    }
}
