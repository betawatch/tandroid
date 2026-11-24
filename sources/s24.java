// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class s24 extends FrameLayout implements vlb, g94 {
    public ValueAnimator E;
    public a14 F;
    public boolean G;
    public final /* synthetic */ e34 H;
    public final fn0 a;
    public final byte b;
    public final mu9 c;
    public final q24 d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final r24 r;
    public final su s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s24(e34 e34Var, Context context, int i) {
        super(context);
        q24 q24Var;
        ImageView.ScaleType scaleType;
        int i2;
        float f;
        this.H = e34Var;
        this.a = new fn0(0, this, d53.g, 200L, false);
        final byte b = 0;
        this.y = false;
        zmb zmbVar = anb.a;
        this.b = i;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i3 = cmb.Bf;
        ylb ylbVar = e34Var.a2;
        boolean z = e34Var.j2;
        anb.h(i3, ylbVar, view);
        addView(view, new FrameLayout.LayoutParams(-1, gm.e1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (e34Var.v0) {
            anb.h(cmb.yf, ylbVar, view2);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, e34Var.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(cmb.b0(gm.L(18.0f), z ? e34Var.t(0.06f) : e34Var.x(cmb.zf)));
        frameLayout.setClipToOutline(true);
        float L = gm.L(18.0f);
        xj xjVar = agc.a;
        frameLayout.setOutlineProvider(new yfc(0, L));
        if (i == 2) {
            addView(frameLayout, qoe.d(-1, 36.0f, nm7.D1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, qoe.d(-1, 36.0f, nm7.D1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        su suVar = new su((byte) 14, context, (Object) this);
        this.s = suVar;
        frameLayout.addView(suVar, qoe.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        mu9 mu9Var = new mu9();
        this.c = mu9Var;
        mu9Var.c(0, false, false);
        mu9Var.a(z ? e34Var.t(0.4f) : e34Var.x(cmb.Af));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(mu9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: o24
            public final /* synthetic */ s24 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                byte b2 = b;
                s24 s24Var = this.b;
                switch (b2) {
                    case 0:
                        r24 r24Var = s24Var.r;
                        q24 q24Var2 = s24Var.d;
                        if (s24Var.c.k == 1) {
                            q24Var2.setText("");
                            s24Var.b(null, false);
                            if (r24Var != null) {
                                r24Var.G1();
                                r24Var.I1(null);
                                r24Var.J1(true, true);
                            }
                            s24Var.f(false);
                            q24Var2.clearAnimation();
                            q24Var2.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            s24Var.c(false);
                            break;
                        }
                        break;
                    default:
                        q24 q24Var3 = s24Var.d;
                        q24Var3.setText("");
                        s24Var.b(null, false);
                        r24 r24Var2 = s24Var.r;
                        if (r24Var2 != null) {
                            r24Var2.G1();
                            r24Var2.I1(null);
                            r24Var2.J1(true, true);
                        }
                        s24Var.f(false);
                        q24Var3.clearAnimation();
                        q24Var3.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        s24Var.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, qoe.e(36, 36, 51));
        q24 q24Var2 = new q24(this, context, i);
        this.d = q24Var2;
        q24Var2.setTextSize(1, 16.0f);
        q24Var2.setHintTextColor(z ? e34Var.t(0.45f) : e34Var.x(cmb.Af));
        q24Var2.setTextColor(z ? e34Var.t(0.8f) : e34Var.x(cmb.F6));
        q24Var2.setBackgroundDrawable(null);
        q24Var2.setPadding(0, 0, 0, 0);
        q24Var2.setMaxLines(1);
        q24Var2.setLines(1);
        q24Var2.setSingleLine(true);
        q24Var2.setImeOptions(268435459);
        q24Var2.setHint(jb6.M0(2131745570, null));
        anb.l(q24Var2, 30, cmb.Ci, ylbVar);
        q24Var2.setCursorSize(gm.L(20.0f));
        q24Var2.setCursorWidth(1.5f);
        q24Var2.setTranslationY(gm.L(-2.0f));
        suVar.addView(q24Var2, qoe.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        q24Var2.addTextChangedListener(new b7(this, (byte) 22));
        if (e34Var.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable d = b10.d(context, R.drawable.gradient_right);
            wmb p = anb.p(cmb.yf, cmb.zf);
            q24Var = q24Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
            anb.k(this, d, p.a, p.b, 4, 0.0f, ylbVar, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(d);
            view3.setAlpha(0.0f);
            suVar.addView(view3, qoe.e(18, -1, 3));
        } else {
            q24Var = q24Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d7(this));
        int i4 = cmb.h6;
        final byte b2 = 1;
        fg0 f0 = cmb.f0(cmb.v0(i4, ylbVar), 1, gm.L(15.0f));
        wmb M = anb.M(i4);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M, ylbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: o24
            public final /* synthetic */ s24 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                byte b22 = b2;
                s24 s24Var = this.b;
                switch (b22) {
                    case 0:
                        r24 r24Var = s24Var.r;
                        q24 q24Var22 = s24Var.d;
                        if (s24Var.c.k == 1) {
                            q24Var22.setText("");
                            s24Var.b(null, false);
                            if (r24Var != null) {
                                r24Var.G1();
                                r24Var.I1(null);
                                r24Var.J1(true, true);
                            }
                            s24Var.f(false);
                            q24Var22.clearAnimation();
                            q24Var22.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            s24Var.c(false);
                            break;
                        }
                        break;
                    default:
                        q24 q24Var3 = s24Var.d;
                        q24Var3.setText("");
                        s24Var.b(null, false);
                        r24 r24Var2 = s24Var.r;
                        if (r24Var2 != null) {
                            r24Var2.G1();
                            r24Var2.I1(null);
                            r24Var2.J1(true, true);
                        }
                        s24Var.f(false);
                        q24Var3.clearAnimation();
                        q24Var3.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        s24Var.c(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, qoe.e(36, 36, 53));
        if (i != 1 || (e34Var.d2 && z8c.h(z8c.t0).p())) {
            r24 r24Var = new r24(this, context, i == 0 ? i2 : 0, e34Var.a2, i);
            this.r = r24Var;
            r24Var.E3 = z;
            r24Var.setDontOccupyWidth(gm.L(f) + ((int) q24Var.getPaint().measureText(((Object) q24Var.getHint()) + "")));
            if (e34Var.v0) {
                anb.i(r24Var, anb.p(cmb.yf, cmb.zf), ylbVar);
            }
            final byte b3 = 0;
            r24Var.setOnScrollIntoOccupiedWidth(new qac(this) { // from class: p24
                public final /* synthetic */ s24 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b4 = b3;
                    s24 s24Var = this.b;
                    switch (b4) {
                        case 0:
                            Integer num = (Integer) obj;
                            s24Var.d.setTranslationX(-Math.max(0, num.intValue()));
                            s24Var.c(num.intValue() > 0);
                            s24Var.g(false);
                            break;
                        default:
                            r0b r0bVar = (r0b) obj;
                            e34 e34Var2 = s24Var.H;
                            r24 r24Var2 = s24Var.r;
                            if (r0bVar != null) {
                                if (r24Var2.getSelectedCategory() != r0bVar) {
                                    s24Var.b(r0bVar.a, false);
                                    r24Var2.I1(r0bVar);
                                    break;
                                } else {
                                    s24Var.b(null, false);
                                    r24Var2.I1(null);
                                    break;
                                }
                            } else {
                                s24Var.c(false);
                                r24Var2.I1(null);
                                e34Var2.p0.d.setText("");
                                e34Var2.j0.g1(0, 0);
                                break;
                            }
                    }
                }
            });
            final byte b4 = 1;
            r24Var.setOnTouchListener(new a24(this, b4));
            r24Var.setOnCategoryClick(new qac(this) { // from class: p24
                public final /* synthetic */ s24 b;

                {
                    this.b = this;
                }

                @Override // qac
                public final void a(Object obj) {
                    byte b42 = b4;
                    s24 s24Var = this.b;
                    switch (b42) {
                        case 0:
                            Integer num = (Integer) obj;
                            s24Var.d.setTranslationX(-Math.max(0, num.intValue()));
                            s24Var.c(num.intValue() > 0);
                            s24Var.g(false);
                            break;
                        default:
                            r0b r0bVar = (r0b) obj;
                            e34 e34Var2 = s24Var.H;
                            r24 r24Var2 = s24Var.r;
                            if (r0bVar != null) {
                                if (r24Var2.getSelectedCategory() != r0bVar) {
                                    s24Var.b(r0bVar.a, false);
                                    r24Var2.I1(r0bVar);
                                    break;
                                } else {
                                    s24Var.b(null, false);
                                    r24Var2.I1(null);
                                    break;
                                }
                            } else {
                                s24Var.c(false);
                                r24Var2.I1(null);
                                e34Var2.p0.d.setText("");
                                e34Var2.j0.g1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(r24Var, qoe.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            View view = this.e;
            view.setAlpha(f);
            view.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    public final void a() {
        gm.t1(this.d);
    }

    public final void b(String str, boolean z) {
        e34 e34Var = this.H;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                e34Var.T.E(str, z);
                return;
            } else {
                if (b == 2) {
                    e34Var.k0.G(str, z);
                    return;
                }
                return;
            }
        }
        z24 z24Var = e34Var.A0;
        y24 y24Var = z24Var.P;
        e34 e34Var2 = z24Var.R;
        p04 p04Var = e34Var2.H0;
        l04 l04Var = e34Var2.E0;
        if (z24Var.M != 0) {
            ConnectionsManager.getInstance(e34Var2.d1).cancelRequest(z24Var.M, true);
            z24Var.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            z24Var.O = null;
            z24Var.F.clear();
            z24Var.I.clear();
            z24Var.L = new ArrayList();
            y59 adapter = l04Var.getAdapter();
            w24 w24Var = e34Var2.z0;
            if (adapter != w24Var) {
                l04Var.setAdapter(w24Var);
            }
            z24Var.d = 0L;
            e34Var2.a.a(false, true);
            z24Var.f();
            p04Var.d(false);
        } else {
            z24Var.O = str.toLowerCase();
            p04Var.d(true);
        }
        gm.r(y24Var);
        gm.d3(y24Var, 300L);
    }

    public final void c(boolean z) {
        if (z == this.y) {
            return;
        }
        this.y = z;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new et1(this, (byte) 26));
        this.E.setDuration(120L);
        this.E.setInterpolator(d53.h);
        this.E.start();
    }

    public final void d(boolean z) {
        this.G = z;
        if (z) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void e(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void f(boolean z) {
        a14 a14Var = this.F;
        if (!z) {
            if (a14Var != null) {
                gm.r(a14Var);
                this.F = null;
            }
            gm.P3(this.h, false, true);
            return;
        }
        if (a14Var == null) {
            a14 a14Var2 = new a14((Object) this, (byte) 3);
            this.F = a14Var2;
            gm.d3(a14Var2, 340L);
        }
    }

    public final void g(boolean z) {
        boolean z2 = this.G;
        q24 q24Var = this.d;
        r24 r24Var = this.r;
        if (!z2 || ((q24Var.length() == 0 && (r24Var == null || r24Var.getSelectedCategory() == null)) || z)) {
            this.c.b((q24Var.length() > 0 || (r24Var != null && r24Var.w3 > 0.5f && (r24Var.r3 || r24Var.getSelectedCategory() != null))) ? 1 : 0);
            this.G = false;
        }
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.x(cmb.Ci));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
