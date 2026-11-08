package ti;

import ab.d0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import bg.q0;
import bg.s0;
import bg.u0;
import c8.ha;
import di.b3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.w;
import sg.t0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class o {
    public final m a;
    public final l2.i b;
    public int c = 0;
    public int d = 0;
    public i e;
    public boolean f;
    public boolean g;

    public o(l2.i iVar, m mVar) {
        this.b = iVar;
        this.a = mVar;
    }

    public final void a(c20 c20Var) {
        i iVar;
        if (this.c != 1 || (iVar = this.e) == null) {
            return;
        }
        this.e = null;
        this.c = 0;
        iVar.K = true;
        iVar.d();
        g0.i3(new w(24, iVar, c20Var), 100L);
        this.b.f();
    }

    public final void b() {
        int i7 = this.c;
        if (i7 == 3) {
            return;
        }
        this.c = 3;
        i iVar = this.e;
        l2.i iVar2 = this.b;
        m mVar = this.a;
        if (iVar == null) {
            mVar.Q();
            iVar2.i(this, i7);
            return;
        }
        this.e = null;
        boolean z9 = i7 == 1;
        Objects.requireNonNull(mVar);
        t0 t0Var = new t0(mVar, 12);
        if (!iVar.K) {
            iVar.K = true;
            iVar.d();
            r1.g gVar = iVar.D;
            if (gVar != null) {
                gVar.d();
                iVar.E.d();
            }
            if (z9 && iVar.g) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(xq.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(iVar.h, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(iVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(iVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
                animatorSet.addListener(new v50(21, iVar, t0Var));
                animatorSet.start();
            } else {
                iVar.f(t0Var);
            }
        }
        iVar2.i(this, i7);
    }

    public final void c() {
        i iVar = this.e;
        if (iVar != null) {
            iVar.k();
        }
        this.b.f();
    }

    public final boolean d() {
        return this.c != 3;
    }

    public final boolean e() {
        if (this.e == null) {
            return false;
        }
        int i7 = this.c;
        return i7 == 1 || (i7 == 2 && this.d == 1);
    }

    public final void f() {
        int i7 = this.c;
        if (i7 == 3) {
            return;
        }
        if (i7 != 0) {
            b();
        } else {
            this.c = 3;
            this.b.i(this, 0);
        }
    }

    public final p g(Activity activity, Bitmap bitmap, boolean z9) {
        int i7;
        if (this.c != 0) {
            throw new IllegalStateException("startFloating in state " + this.c);
        }
        l2.i iVar = this.b;
        ArrayList arrayList = (ArrayList) iVar.c;
        int i10 = 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            if (oVar != this && oVar.e()) {
                oVar.b();
            }
        }
        final i iVar2 = new i(this, activity);
        this.e = iVar2;
        RectF rectF = new RectF();
        m mVar = iVar2.b;
        i.j(rectF, mVar.I(), mVar.U());
        iVar2.z = d0.b().a.getFloat("scale_factor", 1.0f);
        Point point = g0.q;
        iVar2.A = (Math.min(point.x, point.y) - (i.m() * 2.0f)) / iVar2.h();
        iVar2.x = (int) rectF.width();
        iVar2.y = (int) rectF.height();
        iVar2.B = rectF.left;
        iVar2.C = rectF.top - g0.m;
        int I = mVar.I();
        int U = mVar.U();
        float f10 = ((I <= 0 || U <= 0) ? 0.5625f : ((float) U) / ((float) I)) < 1.0f ? 0.6f : 0.45f;
        j51 j51Var = iVar2.F;
        j51Var.q = f10;
        j51Var.a();
        r1.g gVar = new r1.g(iVar2, i.Q);
        r1.h hVar = new r1.h();
        hVar.a(0.75f);
        hVar.b(650.0f);
        gVar.m = hVar;
        final int i11 = 0;
        gVar.a(new c(iVar2, i11));
        iVar2.D = gVar;
        r1.g gVar2 = new r1.g(iVar2, i.R);
        r1.h hVar2 = new r1.h();
        hVar2.a(0.75f);
        hVar2.b(650.0f);
        gVar2.m = hVar2;
        gVar2.a(new c(iVar2, i10));
        iVar2.E = gVar2;
        Activity activity2 = iVar2.c;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(iVar2, i10));
        iVar2.p = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        iVar2.p.setStylusScaleEnabled(false);
        iVar2.q = new rt(activity2, new h(iVar2, scaledTouchSlop));
        iVar2.i = new e(iVar2, activity2, i10);
        org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, iVar2);
        iVar2.h = eVar;
        eVar.addView(iVar2.i, ha.c(-1.0f, -1));
        e eVar2 = iVar2.i;
        float L = g0.L(10.0f);
        q0 q0Var = u0.a;
        eVar2.setOutlineProvider(new s0(0, L));
        iVar2.i.setClipToOutline(true);
        r6.i(k6.Ug, iVar2.i, null);
        ImageView imageView = new ImageView(activity2);
        iVar2.l = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        iVar2.l.setVisibility(8);
        iVar2.i.addView(iVar2.l, ha.c(-1.0f, -1));
        j51Var.n = new vy(iVar2, 21);
        iVar2.m = new e(iVar2, activity2, i11);
        e eVar3 = iVar2.m;
        Objects.requireNonNull(eVar3);
        iVar2.G = new qm0(new t0(eVar3, 9), true);
        iVar2.m.setWillNotDraw(false);
        iVar2.m.setAlpha(0.0f);
        View view = new View(activity2);
        view.setBackgroundColor(1275068416);
        iVar2.m.addView(view, ha.c(-1.0f, -1));
        int L2 = g0.L(8.0f);
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_close);
        int i12 = k6.Vg;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        r6.t(imageView2, i12, null, mode);
        int i13 = k6.i6;
        y h02 = k6.h0(k6.x0(null, i13, false), 1, -1);
        n6 N = r6.N(i13);
        imageView2.setBackground(h02);
        r6.k(imageView2, h02, null, N, null);
        imageView2.setPadding(L2, L2, L2, L2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ti.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                switch (i11) {
                    case 0:
                        iVar2.a.b();
                        break;
                    case 1:
                        o oVar2 = iVar2.a;
                        if (oVar2.c == 1) {
                            l2.i iVar3 = oVar2.b;
                            t0 t0Var = new t0(oVar2, 13);
                            if (iVar3.b && (launchActivity = (LaunchActivity) iVar3.f) != null && !g0.H1(launchActivity)) {
                                t0Var.run();
                                break;
                            } else {
                                ((ArrayList) iVar3.d).add(t0Var);
                                if (((LaunchActivity) iVar3.f) != null && !iVar3.a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.b, ((LaunchActivity) iVar3.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        org.telegram.messenger.t0.b.startActivity(intent);
                                        break;
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        i iVar4 = iVar2;
                        m mVar2 = iVar4.b;
                        if (mVar2.h()) {
                            mVar2.b();
                        } else {
                            if (iVar4.H) {
                                mVar2.c(0L);
                                iVar4.H = false;
                            }
                            mVar2.f();
                        }
                        iVar4.k();
                        iVar4.a.b.f();
                        break;
                }
            }
        });
        iVar2.m.addView(imageView2, ha.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity2);
        imageView3.setImageResource(R.drawable.pip_video_expand);
        r6.t(imageView3, i12, null, mode);
        final int i14 = 1;
        y h03 = k6.h0(k6.x0(null, i13, false), 1, -1);
        n6 N2 = r6.N(i13);
        imageView3.setBackground(h03);
        r6.k(imageView3, h03, null, N2, null);
        imageView3.setPadding(L2, L2, L2, L2);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: ti.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                switch (i14) {
                    case 0:
                        iVar2.a.b();
                        break;
                    case 1:
                        o oVar2 = iVar2.a;
                        if (oVar2.c == 1) {
                            l2.i iVar3 = oVar2.b;
                            t0 t0Var = new t0(oVar2, 13);
                            if (iVar3.b && (launchActivity = (LaunchActivity) iVar3.f) != null && !g0.H1(launchActivity)) {
                                t0Var.run();
                                break;
                            } else {
                                ((ArrayList) iVar3.d).add(t0Var);
                                if (((LaunchActivity) iVar3.f) != null && !iVar3.a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.b, ((LaunchActivity) iVar3.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        org.telegram.messenger.t0.b.startActivity(intent);
                                        break;
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        i iVar4 = iVar2;
                        m mVar2 = iVar4.b;
                        if (mVar2.h()) {
                            mVar2.b();
                        } else {
                            if (iVar4.H) {
                                mVar2.c(0L);
                                iVar4.H = false;
                            }
                            mVar2.f();
                        }
                        iVar4.k();
                        iVar4.a.b.f();
                        break;
                }
            }
        });
        iVar2.m.addView(imageView3, ha.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity2);
        iVar2.n = imageView4;
        r6.t(imageView4, i12, null, mode);
        r6.R(iVar2.n, k6.h0(k6.x0(null, i13, false), 1, -1), null, r6.N(i13), null);
        final int i15 = 2;
        iVar2.n.setOnClickListener(new View.OnClickListener() { // from class: ti.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                switch (i15) {
                    case 0:
                        iVar2.a.b();
                        break;
                    case 1:
                        o oVar2 = iVar2.a;
                        if (oVar2.c == 1) {
                            l2.i iVar3 = oVar2.b;
                            t0 t0Var = new t0(oVar2, 13);
                            if (iVar3.b && (launchActivity = (LaunchActivity) iVar3.f) != null && !g0.H1(launchActivity)) {
                                t0Var.run();
                                break;
                            } else {
                                ((ArrayList) iVar3.d).add(t0Var);
                                if (((LaunchActivity) iVar3.f) != null && !iVar3.a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.b, ((LaunchActivity) iVar3.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        org.telegram.messenger.t0.b.startActivity(intent);
                                        break;
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        i iVar4 = iVar2;
                        m mVar2 = iVar4.b;
                        if (mVar2.h()) {
                            mVar2.b();
                        } else {
                            if (iVar4.H) {
                                mVar2.c(0L);
                                iVar4.H = false;
                            }
                            mVar2.f();
                        }
                        iVar4.k();
                        iVar4.a.b.f();
                        break;
                }
            }
        });
        iVar2.n.setVisibility(mVar.e0() ? 0 : 8);
        iVar2.m.addView(iVar2.n, ha.e(38, 38, 17));
        b3 b3Var = new b3(iVar2, activity2);
        iVar2.o = b3Var;
        b3Var.setVisibility(mVar.e0() ? 0 : 8);
        iVar2.m.addView(iVar2.o, ha.c(-1.0f, -1));
        iVar2.i.addView(iVar2.m, ha.c(-1.0f, -1));
        View D = mVar.D();
        iVar2.k = D;
        if (D != null) {
            g0.E2(D);
            iVar2.i.addView(iVar2.k, 0, ha.c(-1.0f, -1));
        } else {
            p pVar = new p(activity2);
            iVar2.j = pVar;
            iVar2.i.addView(pVar, 0, ha.c(-1.0f, -1));
        }
        if (bitmap != null && iVar2.j != null) {
            iVar2.l.setImageBitmap(bitmap);
            iVar2.l.setVisibility(0);
            iVar2.j.setFirstFrameCallback(new b(iVar2, i15));
        }
        iVar2.a();
        if (z9) {
            iVar2.h.setAlpha(0.0f);
            iVar2.h.setScaleX(0.1f);
            iVar2.h.setScaleY(0.1f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(xq.f);
            i7 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(iVar2.h, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(iVar2.h, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(iVar2.h, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
            animatorSet.start();
        } else {
            i7 = 1;
        }
        iVar2.k();
        p pVar2 = iVar2.j;
        this.c = i7;
        iVar.f();
        return pVar2;
    }
}
