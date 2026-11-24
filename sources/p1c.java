// default package

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p1c extends FrameLayout {
    public final ImageView a;
    public final ey0 b;
    public final qmb c;
    public final TextView d;
    public final n1c e;
    public final View f;
    public final View h;
    public final /* synthetic */ s1c n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1c(s1c s1cVar, Context context) {
        super(context);
        this.n = s1cVar;
        View view = new View(context);
        this.f = view;
        int i = cmb.g5;
        ylb ylbVar = s1cVar.J0;
        String str = s1cVar.t1;
        anb.h(i, ylbVar, view);
        addView(view, qoe.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_back);
        int i2 = cmb.i5;
        ylb ylbVar2 = s1cVar.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView, i2, ylbVar2, mode);
        int i3 = cmb.h6;
        final byte b = 1;
        fg0 f0 = cmb.f0(cmb.v0(i3, s1cVar.J0), 1, -1);
        wmb M = anb.M(i3);
        ylb ylbVar3 = s1cVar.J0;
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar3);
        imageView.setAlpha(0.0f);
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: m1c
            public final /* synthetic */ p1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                byte b3 = b2;
                p1c p1cVar = this.b;
                switch (b3) {
                    case 0:
                        p1cVar.n.dismiss();
                        break;
                    default:
                        n1c n1cVar = p1cVar.e;
                        o1c o1cVar = new o1c(p1cVar.getContext(), null);
                        Drawable mutate = p1cVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i4 = cmb.F8;
                        s1c s1cVar2 = p1cVar.n;
                        anb.x(p1cVar, mutate, i4, s1cVar2.J0, PorterDuff.Mode.MULTIPLY);
                        o1cVar.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b3c.N;
                        ArrayList arrayList = new ArrayList(jb6.D0().N.values());
                        int i5 = 0;
                        while (i5 < arrayList.size()) {
                            hb6 hb6Var = (hb6) arrayList.get(i5);
                            if (hb6Var == null || (((str2 = hb6Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(hb6Var.d))) {
                                arrayList.remove(i5);
                                i5--;
                            }
                            i5++;
                        }
                        Collections.sort(arrayList, new fz5(jb6.D0().B, (byte) 1));
                        boolean z = true;
                        int i6 = 0;
                        while (i6 < arrayList.size()) {
                            hb6 hb6Var2 = (hb6) arrayList.get(i6);
                            if (!hb6Var2.f.equals(s1cVar2.t1) && "remote".equals(hb6Var2.d)) {
                                TextUtils.equals(s1cVar2.u1, hb6Var2.f);
                                a8 a8Var = new a8(2, s1cVar2.J0, p1cVar.getContext(), z, i6 == arrayList.size() - 1);
                                a8Var.setText(s1c.E0(s1c.J0(hb6Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(s1cVar2.u1, hb6Var2.f));
                                a8Var.setOnClickListener(new jw4(p1cVar, runnableArr, hb6Var2, (byte) 23));
                                o1cVar.addView(a8Var);
                                z = false;
                            }
                            i6++;
                        }
                        m8 m8Var = new m8(o1cVar, -2, -2);
                        runnableArr[0] = new hp1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        n1cVar.getLocationInWindow(iArr);
                        Point point = gm.q;
                        o1cVar.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = o1cVar.getMeasuredHeight();
                        int i7 = iArr[1];
                        m8Var.showAtLocation(s1cVar2.b, 51, iArr[0] - gm.L(8.0f), ((float) i7) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? gm.L(8.0f) + (i7 - measuredHeight) : (n1cVar.getMeasuredHeight() + i7) - gm.L(8.0f));
                        break;
                }
            }
        });
        addView(imageView, qoe.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        ey0 ey0Var = new ey0((byte) 7, context, this);
        this.b = ey0Var;
        anb.X(ey0Var, i2, s1cVar.J0);
        ey0Var.setTextSize(1, 20.0f);
        ey0Var.setTypeface(gm.o());
        ey0Var.setText(jb6.M0(2131753731, null));
        ey0Var.setPivotX(0.0f);
        ey0Var.setPivotY(0.0f);
        addView(ey0Var, qoe.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        qmb qmbVar = new qmb((byte) 21, context, this);
        this.c = qmbVar;
        if (jb6.a0) {
            qmbVar.setGravity(5);
        }
        qmbVar.setPivotX(0.0f);
        qmbVar.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            anb.X(textView, cmb.Fj, s1cVar.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(s1c.E0(s1c.J0(str, null, null)));
            textView.setPadding(0, gm.L(2.0f), 0, gm.L(2.0f));
        }
        ImageView k = td4.k(context, R.drawable.search_arrow);
        int i4 = cmb.Fj;
        anb.s(k, i4, s1cVar.J0, mode);
        if (jb6.a0) {
            k.setScaleX(-1.0f);
        }
        n1c n1cVar = new n1c(this, context);
        this.e = n1cVar;
        if (jb6.a0) {
            n1cVar.setGravity(5);
        }
        n1cVar.b(0.25f, 350L, d53.h);
        anb.U(n1cVar, i4, s1cVar.J0);
        n1cVar.setTextSize(gm.L(14.0f));
        n1cVar.setText(s1c.E0(s1c.J0(s1cVar.u1, null, null)));
        n1cVar.setPadding(gm.L(4.0f), gm.L(2.0f), gm.L(4.0f), gm.L(2.0f));
        n1cVar.setOnClickListener(new View.OnClickListener(this) { // from class: m1c
            public final /* synthetic */ p1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2;
                byte b3 = b;
                p1c p1cVar = this.b;
                switch (b3) {
                    case 0:
                        p1cVar.n.dismiss();
                        break;
                    default:
                        n1c n1cVar2 = p1cVar.e;
                        o1c o1cVar = new o1c(p1cVar.getContext(), null);
                        Drawable mutate = p1cVar.getContext().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        int i42 = cmb.F8;
                        s1c s1cVar2 = p1cVar.n;
                        anb.x(p1cVar, mutate, i42, s1cVar2.J0, PorterDuff.Mode.MULTIPLY);
                        o1cVar.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = b3c.N;
                        ArrayList arrayList = new ArrayList(jb6.D0().N.values());
                        int i5 = 0;
                        while (i5 < arrayList.size()) {
                            hb6 hb6Var = (hb6) arrayList.get(i5);
                            if (hb6Var == null || (((str2 = hb6Var.c) != null && str2.endsWith("_raw")) || !"remote".equals(hb6Var.d))) {
                                arrayList.remove(i5);
                                i5--;
                            }
                            i5++;
                        }
                        Collections.sort(arrayList, new fz5(jb6.D0().B, (byte) 1));
                        boolean z = true;
                        int i6 = 0;
                        while (i6 < arrayList.size()) {
                            hb6 hb6Var2 = (hb6) arrayList.get(i6);
                            if (!hb6Var2.f.equals(s1cVar2.t1) && "remote".equals(hb6Var2.d)) {
                                TextUtils.equals(s1cVar2.u1, hb6Var2.f);
                                a8 a8Var = new a8(2, s1cVar2.J0, p1cVar.getContext(), z, i6 == arrayList.size() - 1);
                                a8Var.setText(s1c.E0(s1c.J0(hb6Var2.f, null, null)));
                                a8Var.setChecked(TextUtils.equals(s1cVar2.u1, hb6Var2.f));
                                a8Var.setOnClickListener(new jw4(p1cVar, runnableArr, hb6Var2, (byte) 23));
                                o1cVar.addView(a8Var);
                                z = false;
                            }
                            i6++;
                        }
                        m8 m8Var = new m8(o1cVar, -2, -2);
                        runnableArr[0] = new hp1(m8Var, (byte) 1);
                        m8Var.e = true;
                        m8Var.c = (short) 220;
                        m8Var.setOutsideTouchable(true);
                        m8Var.setClippingEnabled(true);
                        m8Var.setAnimationStyle(R.style.PopupContextAnimation);
                        m8Var.setFocusable(true);
                        int[] iArr = new int[2];
                        n1cVar2.getLocationInWindow(iArr);
                        Point point = gm.q;
                        o1cVar.measure(View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
                        int measuredHeight = o1cVar.getMeasuredHeight();
                        int i7 = iArr[1];
                        m8Var.showAtLocation(s1cVar2.b, 51, iArr[0] - gm.L(8.0f), ((float) i7) > (((float) point.y) * 0.9f) - ((float) measuredHeight) ? gm.L(8.0f) + (i7 - measuredHeight) : (n1cVar2.getMeasuredHeight() + i7) - gm.L(8.0f));
                        break;
                }
            }
        });
        boolean z = jb6.a0;
        TextView textView2 = this.d;
        if (z) {
            qmbVar.addView(n1cVar, qoe.t(-2, -2, 16, 0, 0, textView2 != null ? 3 : 0, 0));
            if (this.d != null) {
                qmbVar.addView(k, qoe.t(-2, -2, 16, 0, 1, 0, 0));
                qmbVar.addView(this.d, qoe.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            if (textView2 != null) {
                qmbVar.addView(textView2, qoe.t(-2, -2, 16, 0, 0, 4, 0));
                qmbVar.addView(k, qoe.t(-2, -2, 16, 0, 1, 0, 0));
            }
            qmbVar.addView(n1cVar, qoe.t(-2, -2, 16, this.d != null ? 3 : 0, 0, 0, 0));
        }
        addView(qmbVar, qoe.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        anb.h(cmb.U5, s1cVar.J0, view2);
        view2.setAlpha(0.0f);
        addView(view2, qoe.d(-1, gm.e1() / gm.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(78.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        float a = pqe.a((f - gm.m) / gm.L(64.0f), 0.0f, 1.0f);
        if (!this.n.I0()) {
            a = 1.0f;
        }
        float interpolation = d53.g.getInterpolation(a);
        float R1 = gm.R1(0.85f, 1.0f, interpolation);
        ey0 ey0Var = this.b;
        ey0Var.setScaleX(R1);
        ey0Var.setScaleY(gm.R1(0.85f, 1.0f, interpolation));
        ey0Var.setTranslationY(gm.R1(gm.N(-12.0f), 0.0f, interpolation));
        boolean z = jb6.a0;
        qmb qmbVar = this.c;
        if (!z) {
            ey0Var.setTranslationX(gm.R1(gm.N(50.0f), 0.0f, interpolation));
            qmbVar.setTranslationX(gm.R1(gm.N(50.0f), 0.0f, interpolation));
        }
        qmbVar.setTranslationY(gm.R1(gm.N(-22.0f), 0.0f, interpolation));
        float R12 = gm.R1(0.0f, gm.N(-25.0f), interpolation);
        ImageView imageView = this.a;
        imageView.setTranslationX(R12);
        float f2 = 1.0f - interpolation;
        imageView.setAlpha(f2);
        float R13 = gm.R1(0.0f, gm.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(R13);
        view.setAlpha(f2);
    }
}
