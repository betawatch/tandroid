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
import c8.na;
import fi.u2;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.LaunchActivity;
import ug.u1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class n {
    public final l a;
    public final l2.j b;
    public int c = 0;
    public int d = 0;
    public h e;
    public boolean f;
    public boolean g;

    public n(l2.j jVar, l lVar) {
        this.b = jVar;
        this.a = lVar;
    }

    public final void a(w10 w10Var) {
        h hVar;
        if (this.c != 1 || (hVar = this.e) == null) {
            return;
        }
        this.e = null;
        this.c = 0;
        hVar.K = true;
        hVar.d();
        g0.h3(new v9.b(12, hVar, w10Var), 100L);
        this.b.f();
    }

    public final void b() {
        int i7 = this.c;
        if (i7 == 3) {
            return;
        }
        this.c = 3;
        h hVar = this.e;
        l2.j jVar = this.b;
        l lVar = this.a;
        if (hVar == null) {
            lVar.v1();
            jVar.i(this, i7);
            return;
        }
        this.e = null;
        boolean z10 = i7 == 1;
        Objects.requireNonNull(lVar);
        u1 u1Var = new u1(lVar, 13);
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
                animatorSet.setInterpolator(kr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
                animatorSet.addListener(new f10(24, hVar, u1Var));
                animatorSet.start();
            } else {
                hVar.f(u1Var);
            }
        }
        jVar.i(this, i7);
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
        l2.j jVar = this.b;
        ArrayList arrayList = (ArrayList) jVar.c;
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
        h.j(rectF, lVar.b1(), lVar.V1());
        hVar.z = ((SharedPreferences) aa.F2().b).getFloat("scale_factor", 1.0f);
        Point point = g0.q;
        hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
        hVar.x = (int) rectF.width();
        hVar.y = (int) rectF.height();
        hVar.B = rectF.left;
        hVar.C = rectF.top - g0.m;
        int b12 = lVar.b1();
        int V1 = lVar.V1();
        float f10 = ((b12 <= 0 || V1 <= 0) ? 0.5625f : ((float) V1) / ((float) b12)) < 1.0f ? 0.6f : 0.45f;
        z51 z51Var = hVar.F;
        z51Var.q = f10;
        z51Var.a();
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
        hVar.q = new aa(activity2, new g(hVar, scaledTouchSlop));
        hVar.i = new d(hVar, activity2, i10);
        org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
        hVar.h = eVar;
        eVar.addView(hVar.i, na.c(-1.0f, -1));
        d dVar = hVar.i;
        float L = g0.L(10.0f);
        q0 q0Var = u0.a;
        dVar.setOutlineProvider(new s0(0, L));
        hVar.i.setClipToOutline(true);
        u6.h(n6.Xg, hVar.i, null);
        ImageView imageView = new ImageView(activity2);
        hVar.l = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        hVar.l.setVisibility(8);
        hVar.i.addView(hVar.l, na.c(-1.0f, -1));
        z51Var.n = new nd0(hVar, 25);
        hVar.m = new d(hVar, activity2, i11);
        d dVar2 = hVar.m;
        Objects.requireNonNull(dVar2);
        hVar.G = new en0(new u1(dVar2, 10), true);
        hVar.m.setWillNotDraw(false);
        hVar.m.setAlpha(0.0f);
        View view = new View(activity2);
        view.setBackgroundColor(1275068416);
        hVar.m.addView(view, na.c(-1.0f, -1));
        int L2 = g0.L(8.0f);
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_close);
        int i12 = n6.Yg;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        u6.s(imageView2, i12, null, mode);
        int i13 = n6.i6;
        y h02 = n6.h0(n6.x0(null, i13, false), 1, -1);
        q6 M = u6.M(i13);
        imageView2.setBackground(h02);
        u6.j(imageView2, h02, null, M, null);
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
                            l2.j jVar2 = nVar2.b;
                            u1 u1Var = new u1(nVar2, 14);
                            if (jVar2.b && (launchActivity = (LaunchActivity) jVar2.f) != null && !g0.H1(launchActivity)) {
                                u1Var.run();
                                break;
                            } else {
                                ((ArrayList) jVar2.d).add(u1Var);
                                if (((LaunchActivity) jVar2.f) != null && !jVar2.a) {
                                    try {
                                        Intent intent = new Intent(t0.b, ((LaunchActivity) jVar2.f).getClass());
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
                        if (lVar2.j()) {
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
        hVar.m.addView(imageView2, na.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity2);
        imageView3.setImageResource(R.drawable.pip_video_expand);
        u6.s(imageView3, i12, null, mode);
        final int i14 = 1;
        y h03 = n6.h0(n6.x0(null, i13, false), 1, -1);
        q6 M2 = u6.M(i13);
        imageView3.setBackground(h03);
        u6.j(imageView3, h03, null, M2, null);
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
                            l2.j jVar2 = nVar2.b;
                            u1 u1Var = new u1(nVar2, 14);
                            if (jVar2.b && (launchActivity = (LaunchActivity) jVar2.f) != null && !g0.H1(launchActivity)) {
                                u1Var.run();
                                break;
                            } else {
                                ((ArrayList) jVar2.d).add(u1Var);
                                if (((LaunchActivity) jVar2.f) != null && !jVar2.a) {
                                    try {
                                        Intent intent = new Intent(t0.b, ((LaunchActivity) jVar2.f).getClass());
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
                        if (lVar2.j()) {
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
        hVar.m.addView(imageView3, na.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity2);
        hVar.n = imageView4;
        u6.s(imageView4, i12, null, mode);
        u6.Q(hVar.n, n6.h0(n6.x0(null, i13, false), 1, -1), null, u6.M(i13), null);
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
                            l2.j jVar2 = nVar2.b;
                            u1 u1Var = new u1(nVar2, 14);
                            if (jVar2.b && (launchActivity = (LaunchActivity) jVar2.f) != null && !g0.H1(launchActivity)) {
                                u1Var.run();
                                break;
                            } else {
                                ((ArrayList) jVar2.d).add(u1Var);
                                if (((LaunchActivity) jVar2.f) != null && !jVar2.a) {
                                    try {
                                        Intent intent = new Intent(t0.b, ((LaunchActivity) jVar2.f).getClass());
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
                        if (lVar2.j()) {
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
        hVar.n.setVisibility(lVar.C2() ? 0 : 8);
        hVar.m.addView(hVar.n, na.e(38, 38, 17));
        u2 u2Var = new u2(hVar, activity2);
        hVar.o = u2Var;
        u2Var.setVisibility(lVar.C2() ? 0 : 8);
        hVar.m.addView(hVar.o, na.c(-1.0f, -1));
        hVar.i.addView(hVar.m, na.c(-1.0f, -1));
        View K0 = lVar.K0();
        hVar.k = K0;
        if (K0 != null) {
            g0.E2(K0);
            hVar.i.addView(hVar.k, 0, na.c(-1.0f, -1));
        } else {
            o oVar = new o(activity2);
            hVar.j = oVar;
            hVar.i.addView(oVar, 0, na.c(-1.0f, -1));
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
            animatorSet.setInterpolator(kr.f);
            i7 = 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
            animatorSet.start();
        } else {
            i7 = 1;
        }
        hVar.k();
        o oVar2 = hVar.j;
        this.c = i7;
        jVar.f();
        return oVar2;
    }
}
