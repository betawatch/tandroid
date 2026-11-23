package wi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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
import c8.ma;
import fi.u2;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import v4.f0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class n {
    public final l a;
    public final l2.i b;
    public int c = 0;
    public int d = 0;
    public h e;
    public boolean f;
    public boolean g;

    public n(l2.i iVar, l lVar) {
        this.b = iVar;
        this.a = lVar;
    }

    public final void a(y10 y10Var) {
        h hVar;
        if (this.c != 1 || (hVar = this.e) == null) {
            return;
        }
        this.e = null;
        this.c = 0;
        hVar.K = true;
        hVar.d();
        g0.h3(new wg.q(8, hVar, y10Var), 100L);
        this.b.f();
    }

    public final void b() {
        int i7 = this.c;
        if (i7 == 3) {
            return;
        }
        this.c = 3;
        h hVar = this.e;
        l2.i iVar = this.b;
        l lVar = this.a;
        if (hVar == null) {
            lVar.U();
            iVar.i(this, i7);
            return;
        }
        this.e = null;
        boolean z10 = i7 == 1;
        Objects.requireNonNull(lVar);
        v4.p pVar = new v4.p(lVar, 12);
        if (!hVar.K) {
            hVar.K = true;
            hVar.d();
            r1.g gVar = hVar.D;
            if (gVar != null) {
                gVar.d();
                hVar.E.d();
            }
            if (z10 && hVar.g) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(nr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
                animatorSet.addListener(new h10(24, hVar, pVar));
                animatorSet.start();
            } else {
                hVar.f(pVar);
            }
        }
        iVar.i(this, i7);
    }

    public final void c() {
        h hVar = this.e;
        if (hVar != null) {
            hVar.k();
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

    public final o g(Activity activity, Bitmap bitmap, boolean z10) {
        int i7;
        if (this.c != 0) {
            throw new IllegalStateException("startFloating in state " + this.c);
        }
        l2.i iVar = this.b;
        ArrayList arrayList = (ArrayList) iVar.c;
        int i10 = 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar != this && nVar.e()) {
                nVar.b();
            }
        }
        final h hVar = new h(this, activity);
        this.e = hVar;
        RectF rectF = new RectF();
        l lVar = hVar.b;
        h.j(rectF, lVar.J(), lVar.a0());
        hVar.z = ((SharedPreferences) jn.m().b).getFloat("scale_factor", 1.0f);
        Point point = g0.q;
        hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
        hVar.x = (int) rectF.width();
        hVar.y = (int) rectF.height();
        hVar.B = rectF.left;
        hVar.C = rectF.top - g0.m;
        int J = lVar.J();
        int a02 = lVar.a0();
        float f10 = ((J <= 0 || a02 <= 0) ? 0.5625f : ((float) a02) / ((float) J)) < 1.0f ? 0.6f : 0.45f;
        a61 a61Var = hVar.F;
        a61Var.q = f10;
        a61Var.a();
        r1.g gVar = new r1.g(hVar, h.Q);
        r1.h hVar2 = new r1.h();
        hVar2.a(0.75f);
        hVar2.b(650.0f);
        gVar.m = hVar2;
        final int i11 = 0;
        gVar.a(new c(hVar, i11));
        hVar.D = gVar;
        r1.g gVar2 = new r1.g(hVar, h.R);
        r1.h hVar3 = new r1.h();
        hVar3.a(0.75f);
        hVar3.b(650.0f);
        gVar2.m = hVar3;
        gVar2.a(new c(hVar, i10));
        hVar.E = gVar2;
        Activity activity2 = hVar.c;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new og.b(hVar, i10));
        hVar.p = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        hVar.p.setStylusScaleEnabled(false);
        hVar.q = new qf(activity2, new g(hVar, scaledTouchSlop));
        hVar.i = new d(hVar, activity2, i10);
        org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
        hVar.h = eVar;
        eVar.addView(hVar.i, ma.c(-1.0f, -1));
        d dVar = hVar.i;
        float L = g0.L(10.0f);
        q0 q0Var = u0.a;
        dVar.setOutlineProvider(new s0(0, L));
        hVar.i.setClipToOutline(true);
        t6.h(m6.Xg, hVar.i, null);
        ImageView imageView = new ImageView(activity2);
        hVar.l = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        hVar.l.setVisibility(8);
        hVar.i.addView(hVar.l, ma.c(-1.0f, -1));
        a61Var.n = new f0(hVar);
        hVar.m = new d(hVar, activity2, i11);
        d dVar2 = hVar.m;
        Objects.requireNonNull(dVar2);
        hVar.G = new fn0(new v4.p(dVar2, 9), true);
        hVar.m.setWillNotDraw(false);
        hVar.m.setAlpha(0.0f);
        View view = new View(activity2);
        view.setBackgroundColor(1275068416);
        hVar.m.addView(view, ma.c(-1.0f, -1));
        int L2 = g0.L(8.0f);
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_close);
        int i12 = m6.Yg;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        t6.s(imageView2, i12, null, mode);
        int i13 = m6.i6;
        y h02 = m6.h0(m6.x0(null, i13, false), 1, -1);
        p6 M = t6.M(i13);
        imageView2.setBackground(h02);
        t6.j(imageView2, h02, null, M, null);
        imageView2.setPadding(L2, L2, L2, L2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: wi.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                switch (i11) {
                    case 0:
                        hVar.a.b();
                        break;
                    case 1:
                        n nVar2 = hVar.a;
                        if (nVar2.c == 1) {
                            l2.i iVar2 = nVar2.b;
                            v4.p pVar = new v4.p(nVar2, 13);
                            if (iVar2.b && (launchActivity = (LaunchActivity) iVar2.f) != null && !g0.H1(launchActivity)) {
                                pVar.run();
                                break;
                            } else {
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f) != null && !iVar2.a) {
                                    try {
                                        Intent intent = new Intent(t0.b, ((LaunchActivity) iVar2.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        t0.b.startActivity(intent);
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
                        h hVar4 = hVar;
                        l lVar2 = hVar4.b;
                        if (lVar2.h()) {
                            lVar2.b();
                        } else {
                            if (hVar4.H) {
                                lVar2.c(0L);
                                hVar4.H = false;
                            }
                            lVar2.f();
                        }
                        hVar4.k();
                        hVar4.a.b.f();
                        break;
                }
            }
        });
        hVar.m.addView(imageView2, ma.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity2);
        imageView3.setImageResource(R.drawable.pip_video_expand);
        t6.s(imageView3, i12, null, mode);
        final int i14 = 1;
        y h03 = m6.h0(m6.x0(null, i13, false), 1, -1);
        p6 M2 = t6.M(i13);
        imageView3.setBackground(h03);
        t6.j(imageView3, h03, null, M2, null);
        imageView3.setPadding(L2, L2, L2, L2);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: wi.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                switch (i14) {
                    case 0:
                        hVar.a.b();
                        break;
                    case 1:
                        n nVar2 = hVar.a;
                        if (nVar2.c == 1) {
                            l2.i iVar2 = nVar2.b;
                            v4.p pVar = new v4.p(nVar2, 13);
                            if (iVar2.b && (launchActivity = (LaunchActivity) iVar2.f) != null && !g0.H1(launchActivity)) {
                                pVar.run();
                                break;
                            } else {
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f) != null && !iVar2.a) {
                                    try {
                                        Intent intent = new Intent(t0.b, ((LaunchActivity) iVar2.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        t0.b.startActivity(intent);
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
                        h hVar4 = hVar;
                        l lVar2 = hVar4.b;
                        if (lVar2.h()) {
                            lVar2.b();
                        } else {
                            if (hVar4.H) {
                                lVar2.c(0L);
                                hVar4.H = false;
                            }
                            lVar2.f();
                        }
                        hVar4.k();
                        hVar4.a.b.f();
                        break;
                }
            }
        });
        hVar.m.addView(imageView3, ma.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity2);
        hVar.n = imageView4;
        t6.s(imageView4, i12, null, mode);
        t6.Q(hVar.n, m6.h0(m6.x0(null, i13, false), 1, -1), null, t6.M(i13), null);
        final int i15 = 2;
        hVar.n.setOnClickListener(new View.OnClickListener() { // from class: wi.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchActivity launchActivity;
                switch (i15) {
                    case 0:
                        hVar.a.b();
                        break;
                    case 1:
                        n nVar2 = hVar.a;
                        if (nVar2.c == 1) {
                            l2.i iVar2 = nVar2.b;
                            v4.p pVar = new v4.p(nVar2, 13);
                            if (iVar2.b && (launchActivity = (LaunchActivity) iVar2.f) != null && !g0.H1(launchActivity)) {
                                pVar.run();
                                break;
                            } else {
                                ((ArrayList) iVar2.d).add(pVar);
                                if (((LaunchActivity) iVar2.f) != null && !iVar2.a) {
                                    try {
                                        Intent intent = new Intent(t0.b, ((LaunchActivity) iVar2.f).getClass());
                                        intent.addFlags(TLObject.FLAG_28);
                                        t0.b.startActivity(intent);
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
                        h hVar4 = hVar;
                        l lVar2 = hVar4.b;
                        if (lVar2.h()) {
                            lVar2.b();
                        } else {
                            if (hVar4.H) {
                                lVar2.c(0L);
                                hVar4.H = false;
                            }
                            lVar2.f();
                        }
                        hVar4.k();
                        hVar4.a.b.f();
                        break;
                }
            }
        });
        hVar.n.setVisibility(lVar.o0() ? 0 : 8);
        hVar.m.addView(hVar.n, ma.e(38, 38, 17));
        u2 u2Var = new u2(hVar, activity2);
        hVar.o = u2Var;
        u2Var.setVisibility(lVar.o0() ? 0 : 8);
        hVar.m.addView(hVar.o, ma.c(-1.0f, -1));
        hVar.i.addView(hVar.m, ma.c(-1.0f, -1));
        View E = lVar.E();
        hVar.k = E;
        if (E != null) {
            g0.E2(E);
            hVar.i.addView(hVar.k, 0, ma.c(-1.0f, -1));
        } else {
            o oVar = new o(activity2);
            hVar.j = oVar;
            hVar.i.addView(oVar, 0, ma.c(-1.0f, -1));
        }
        if (bitmap != null && hVar.j != null) {
            hVar.l.setImageBitmap(bitmap);
            hVar.l.setVisibility(0);
            hVar.j.setFirstFrameCallback(new b(hVar, i15));
        }
        hVar.a();
        if (z10) {
            hVar.h.setAlpha(0.0f);
            hVar.h.setScaleX(0.1f);
            hVar.h.setScaleY(0.1f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(nr.f);
            i7 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
            animatorSet.start();
        } else {
            i7 = 1;
        }
        hVar.k();
        o oVar2 = hVar.j;
        this.c = i7;
        iVar.f();
        return oVar2;
    }
}
