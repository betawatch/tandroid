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
import bg.p0;
import bg.r0;
import bg.t0;
import c8.ja;
import fi.w2;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.LaunchActivity;
import ug.t1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    public final void a(z10 z10Var) {
        h hVar;
        if (this.c != 1 || (hVar = this.e) == null) {
            return;
        }
        this.e = null;
        this.c = 0;
        hVar.K = true;
        hVar.d();
        g0.i3(new t1(14, hVar, z10Var), 100L);
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
            lVar.V();
            iVar.i(this, i7);
            return;
        }
        this.e = null;
        boolean z10 = i7 == 1;
        Objects.requireNonNull(lVar);
        vg.o oVar = new vg.o(lVar, 10);
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
                animatorSet.setInterpolator(er.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(hVar.h, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
                animatorSet.addListener(new y50(23, hVar, oVar));
                animatorSet.start();
            } else {
                hVar.f(oVar);
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
        h.j(rectF, lVar.L(), lVar.b0());
        hVar.z = ((SharedPreferences) u7.i.b().a).getFloat("scale_factor", 1.0f);
        Point point = g0.q;
        hVar.A = (Math.min(point.x, point.y) - (h.m() * 2.0f)) / hVar.h();
        hVar.x = (int) rectF.width();
        hVar.y = (int) rectF.height();
        hVar.B = rectF.left;
        hVar.C = rectF.top - g0.m;
        int L = lVar.L();
        int b02 = lVar.b0();
        float f10 = ((L <= 0 || b02 <= 0) ? 0.5625f : ((float) b02) / ((float) L)) < 1.0f ? 0.6f : 0.45f;
        m51 m51Var = hVar.F;
        m51Var.q = f10;
        m51Var.a();
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
        hVar.q = new ff(activity2, new g(hVar, scaledTouchSlop));
        hVar.i = new d(hVar, activity2, i10);
        org.telegram.ui.e eVar = new org.telegram.ui.e(3, activity2, hVar);
        hVar.h = eVar;
        eVar.addView(hVar.i, ja.c(-1.0f, -1));
        d dVar = hVar.i;
        float L2 = g0.L(10.0f);
        p0 p0Var = t0.a;
        dVar.setOutlineProvider(new r0(0, L2));
        hVar.i.setClipToOutline(true);
        q6.h(j6.Xg, hVar.i, null);
        ImageView imageView = new ImageView(activity2);
        hVar.l = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        hVar.l.setVisibility(8);
        hVar.i.addView(hVar.l, ja.c(-1.0f, -1));
        m51Var.n = new cf(hVar);
        hVar.m = new d(hVar, activity2, i11);
        d dVar2 = hVar.m;
        Objects.requireNonNull(dVar2);
        hVar.G = new um0(new vg.o(dVar2, 7), true);
        hVar.m.setWillNotDraw(false);
        hVar.m.setAlpha(0.0f);
        View view = new View(activity2);
        view.setBackgroundColor(1275068416);
        hVar.m.addView(view, ja.c(-1.0f, -1));
        int L3 = g0.L(8.0f);
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_close);
        int i12 = j6.Yg;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        q6.s(imageView2, i12, null, mode);
        int i13 = j6.i6;
        y h02 = j6.h0(j6.x0(null, i13, false), 1, -1);
        m6 M = q6.M(i13);
        imageView2.setBackground(h02);
        q6.j(imageView2, h02, null, M, null);
        imageView2.setPadding(L3, L3, L3, L3);
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
                            vg.o oVar = new vg.o(nVar2, 11);
                            if (iVar2.b && (launchActivity = (LaunchActivity) iVar2.f) != null && !g0.H1(launchActivity)) {
                                oVar.run();
                                break;
                            } else {
                                ((ArrayList) iVar2.d).add(oVar);
                                if (((LaunchActivity) iVar2.f) != null && !iVar2.a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.b, ((LaunchActivity) iVar2.f).getClass());
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
        hVar.m.addView(imageView2, ja.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity2);
        imageView3.setImageResource(R.drawable.pip_video_expand);
        q6.s(imageView3, i12, null, mode);
        final int i14 = 1;
        y h03 = j6.h0(j6.x0(null, i13, false), 1, -1);
        m6 M2 = q6.M(i13);
        imageView3.setBackground(h03);
        q6.j(imageView3, h03, null, M2, null);
        imageView3.setPadding(L3, L3, L3, L3);
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
                            vg.o oVar = new vg.o(nVar2, 11);
                            if (iVar2.b && (launchActivity = (LaunchActivity) iVar2.f) != null && !g0.H1(launchActivity)) {
                                oVar.run();
                                break;
                            } else {
                                ((ArrayList) iVar2.d).add(oVar);
                                if (((LaunchActivity) iVar2.f) != null && !iVar2.a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.b, ((LaunchActivity) iVar2.f).getClass());
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
        hVar.m.addView(imageView3, ja.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity2);
        hVar.n = imageView4;
        q6.s(imageView4, i12, null, mode);
        q6.Q(hVar.n, j6.h0(j6.x0(null, i13, false), 1, -1), null, q6.M(i13), null);
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
                            vg.o oVar = new vg.o(nVar2, 11);
                            if (iVar2.b && (launchActivity = (LaunchActivity) iVar2.f) != null && !g0.H1(launchActivity)) {
                                oVar.run();
                                break;
                            } else {
                                ((ArrayList) iVar2.d).add(oVar);
                                if (((LaunchActivity) iVar2.f) != null && !iVar2.a) {
                                    try {
                                        Intent intent = new Intent(org.telegram.messenger.t0.b, ((LaunchActivity) iVar2.f).getClass());
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
        hVar.n.setVisibility(lVar.t0() ? 0 : 8);
        hVar.m.addView(hVar.n, ja.e(38, 38, 17));
        w2 w2Var = new w2(hVar, activity2);
        hVar.o = w2Var;
        w2Var.setVisibility(lVar.t0() ? 0 : 8);
        hVar.m.addView(hVar.o, ja.c(-1.0f, -1));
        hVar.i.addView(hVar.m, ja.c(-1.0f, -1));
        View D = lVar.D();
        hVar.k = D;
        if (D != null) {
            g0.E2(D);
            hVar.i.addView(hVar.k, 0, ja.c(-1.0f, -1));
        } else {
            o oVar = new o(activity2);
            hVar.j = oVar;
            hVar.i.addView(oVar, 0, ja.c(-1.0f, -1));
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
            animatorSet.setInterpolator(er.f);
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
