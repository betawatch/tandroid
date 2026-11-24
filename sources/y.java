// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ArticleViewer$WindowView;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public y(vg1 vg1Var) {
        this.a = (byte) 14;
        this.b = vg1Var;
        Typeface typeface = gm.a;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        b59 b59Var2;
        b59 b59Var3;
        int top;
        b59 b59Var4;
        b59 b59Var5;
        int top2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                if (i == 1) {
                    gm.t1(((wc) obj).a);
                    break;
                }
                break;
            case 5:
                if (i == 0) {
                    ((m) obj).M.Q0.U();
                    break;
                }
                break;
            case 6:
                i30 i30Var = (i30) obj;
                p20 p20Var = i30Var.r1;
                if (i != 0) {
                    if (i == 1) {
                        gm.t1(i30Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int L = gm.L(13.0f);
                    int i2 = i30Var.t2;
                    int i3 = i30Var.t0;
                    if (((i2 - i3) - L) + i3 < a.getCurrentActionBarHeight() && p20Var.canScrollVertically(1) && (b59Var = (b59) p20Var.K(i30Var.o2 ? 1 : 0)) != null) {
                        View view = b59Var.a;
                        if (view.getTop() > gm.L(7.0f)) {
                            p20Var.x0(0, view.getTop() - gm.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                vg1 vg1Var = (vg1) obj;
                if (i != 1) {
                    if (i == 0) {
                        vg1Var.T = false;
                        vg1Var.W = false;
                        vg1Var.Q0(true);
                        break;
                    }
                } else {
                    vg1Var.T = true;
                    vg1Var.W = true;
                    break;
                }
                break;
            case 16:
                if (i == 1) {
                    gm.t1(((yv1) obj).m1);
                    break;
                }
                break;
            case 18:
                h32 h32Var = (h32) obj;
                fv fvVar = h32Var.n;
                i22 i22Var = h32Var.b;
                if (i == 0) {
                    int L2 = gm.L(13.0f);
                    r7 r7Var = i22Var.X2;
                    int L3 = L2 + (r7Var != null ? gm.L(r7Var.getAlpha() * 26.0f) : 0);
                    int i4 = i22Var.t0;
                    if (((i22Var.Y3[0] - i4) - L3) + i4 < a.getCurrentActionBarHeight() && (b59Var2 = (b59) fvVar.K(0)) != null) {
                        View view2 = b59Var2.a;
                        if (view2.getTop() > gm.L(7.0f)) {
                            fvVar.x0(0, view2.getTop() - gm.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 20:
                p42 p42Var = (p42) obj;
                i22 i22Var2 = p42Var.b;
                d42 d42Var = p42Var.r;
                if (i == 0) {
                    int L4 = gm.L(13.0f);
                    int i5 = i22Var2.t0;
                    if (((i22Var2.Y3[0] - i5) - L4) + i5 < a.getCurrentActionBarHeight() && (b59Var3 = (b59) d42Var.K(0)) != null && (top = (b59Var3.a.getTop() - gm.m) - gm.L(56.0f)) > 0) {
                        d42Var.x0(0, top, null);
                    }
                }
                if (i == 1 && p42Var.c0 && d42Var.getAdapter() == p42Var.E) {
                    gm.t1(i22Var2.getCurrentFocus());
                }
                p42Var.V = i != 0;
                break;
            case 21:
                q42 q42Var = (q42) obj;
                r59 r59Var = q42Var.r;
                i22 i22Var3 = q42Var.b;
                if (i == 0) {
                    int L5 = gm.L(13.0f);
                    r7 r7Var2 = i22Var3.X2;
                    int L6 = L5 + (r7Var2 != null ? gm.L(r7Var2.getAlpha() * 26.0f) : 0);
                    int i6 = i22Var3.t0;
                    if (((i22Var3.Y3[0] - i6) - L6) + i6 < a.getCurrentActionBarHeight() && (b59Var4 = (b59) r59Var.K(0)) != null) {
                        View view3 = b59Var4.a;
                        if (view3.getTop() > gm.L(7.0f)) {
                            r59Var.x0(0, view3.getTop() - gm.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                v72 v72Var = (v72) obj;
                smb smbVar = v72Var.s;
                if (i == 0) {
                    int L7 = gm.L(13.0f);
                    i22 i22Var4 = v72Var.b;
                    int i7 = i22Var4.t0;
                    if (((i22Var4.Y3[0] - i7) - L7) + i7 < a.getCurrentActionBarHeight() && (b59Var5 = (b59) smbVar.K(1)) != null && (top2 = (b59Var5.a.getTop() - gm.m) - gm.L(65.0f)) > 0) {
                        smbVar.x0(0, top2, null);
                    }
                    int i8 = v72Var.X0;
                    if (i8 >= 0) {
                        v72Var.k0(i8);
                        v72Var.X0 = -1;
                        break;
                    }
                }
                break;
            case 25:
                if (i == 1) {
                    gm.t1(((ke2) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 28:
                if (i == 1) {
                    gm.t1(((wg2) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0206, code lost:
    
        if (r0.x() != false) goto L98;
     */
    @Override // k69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        rja rjaVar;
        int i3;
        int i4;
        sh4 sh4Var;
        ig5 ig5Var;
        byte b = this.a;
        int i5 = 0;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((a1) obj).u1();
                break;
            case 1:
                ((pf2) obj).run();
                break;
            case 2:
                ((wc) obj).a();
                break;
            case 3:
                ht htVar = (ht) obj;
                if (!htVar.J && !htVar.r && htVar.d.M0() > htVar.F - 2) {
                    htVar.b0();
                    break;
                }
                break;
            case 4:
                o oVar = (o) obj;
                if (oVar.j0.x.J1) {
                    gm.t1(oVar.i0.c0);
                    break;
                }
                break;
            case 5:
                o oVar2 = ((m) obj).M;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    oVar2.Q0.F();
                    sx sxVar = oVar2.L;
                    if (sxVar != null) {
                        sxVar.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = oVar2.g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    oVar2.d0();
                    sx sxVar2 = oVar2.L;
                    if (sxVar2 == null || sxVar2.G) {
                        oVar2.V(oVar2.K0 - i2);
                        break;
                    }
                }
                break;
            case 6:
                i30 i30Var = (i30) obj;
                u46 u46Var = i30Var.s1;
                i30Var.U0();
                i30Var.T0();
                if (!i30Var.p1) {
                    int K0 = u46Var.K0();
                    if (i30Var.o2) {
                        K0 = Math.max(0, K0 - 1);
                    }
                    int abs = K0 != -1 ? Math.abs(u46Var.M0() - K0) + 1 : 0;
                    int b2 = recyclerView.getAdapter().b();
                    MediaController.w();
                    if (!gda.K0) {
                        if (K0 + abs > b2 - 10) {
                            MediaController.w().O();
                            break;
                        }
                    } else if (K0 < 10) {
                        MediaController.w().O();
                        break;
                    }
                }
                break;
            case 7:
                dn0 dn0Var = (dn0) obj;
                if (!dn0Var.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(dn0Var.w)) {
                        dn0Var.e.d();
                    } else {
                        cb cbVar = dn0Var.f;
                        if (cbVar != null) {
                            cbVar.d();
                        }
                    }
                }
                if (dn0Var.a.J1) {
                    gm.t1(dn0Var.fragmentView);
                    break;
                }
                break;
            case 8:
                py1 py1Var = (py1) obj;
                View m = py1Var.c.getLayoutManager().m(0);
                float y = m != null ? m.getY() : 0.0f;
                py1Var.h = y >= 0.0f ? y : 0.0f;
                py1Var.b();
                break;
            case 9:
                zt0 zt0Var = (zt0) obj;
                yt0 yt0Var = zt0Var.n;
                if (!recyclerView.canScrollVertically(1)) {
                    zt0Var.removeCallbacks(yt0Var);
                    zt0Var.post(yt0Var);
                    break;
                }
                break;
            case 10:
                ((ela) obj).invalidate();
                break;
            case 11:
                ((f51) obj).m0();
                break;
            case 12:
                y71 y71Var = (y71) obj;
                if (!y71Var.b.canScrollVertically(-1)) {
                    rjaVar = ((d) y71Var).simpleActionBar;
                    break;
                }
                z = true;
                fn0 fn0Var = y71Var.T;
                if (fn0Var != null) {
                    fn0Var.a(z, true);
                    break;
                }
                break;
            case 13:
                ((k91) obj).t0();
                break;
            case 14:
                vg1 vg1Var = (vg1) obj;
                vg1Var.w.invalidate();
                if (i2 != 0 && vg1Var.T && !vg1Var.R && vg1Var.N.getTag() == null) {
                    AnimatorSet animatorSet = vg1Var.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    vg1Var.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    vg1Var.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    vg1Var.S.playTogether(ObjectAnimator.ofFloat(vg1Var.N, "alpha", 1.0f));
                    vg1Var.S.addListener(new b91((Object) this, (byte) 3));
                    vg1Var.S.start();
                }
                vg1Var.L0(true);
                vg1Var.h1();
                break;
            case 15:
                mh1 mh1Var = (mh1) obj;
                long j = mh1Var.S;
                while (true) {
                    if (i5 < mh1Var.c.getChildCount()) {
                        if (!(mh1Var.c.getChildAt(i5) instanceof tk4)) {
                            i5++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i3 = ((d) mh1Var).currentAccount;
                ku0.g(i3).d(j).a();
                i4 = ((d) mh1Var).currentAccount;
                ku0.g(i4).e(j).a();
                break;
            case 17:
                s22 s22Var = (s22) obj;
                s22Var.b.H1(s22Var, i2);
                break;
            case 18:
                h32 h32Var = (h32) obj;
                if (h32Var.n.getChildCount() > 0) {
                    h32Var.b.H1(h32Var, i2);
                    break;
                }
                break;
            case 19:
                w32 w32Var = (w32) obj;
                w32Var.b.H1(w32Var, i2);
                w32Var.S();
                break;
            case 20:
                p42 p42Var = (p42) obj;
                l32 l32Var = p42Var.F;
                p42Var.b.H1(p42Var, i2);
                p42Var.Z();
                y59 adapter = p42Var.r.getAdapter();
                o42 o42Var = p42Var.E;
                if (adapter == o42Var) {
                    int K02 = l32Var.K0();
                    int M0 = l32Var.M0();
                    int abs2 = Math.abs(M0 - K02) + 1;
                    int b3 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && M0 >= b3 - 10) {
                        o42 o42Var2 = o42Var.Y.E;
                        if (!o42Var2.T && !o42Var2.W && (sh4Var = o42Var.E) != null) {
                            o42Var.Z(o42Var.y, o42Var.F, o42Var.G, sh4Var, o42Var.K, false);
                            break;
                        }
                    }
                }
                break;
            case 21:
                q42 q42Var = (q42) obj;
                q42Var.b.H1(q42Var, i2);
                q42Var.w.setTranslationY(Math.max(0, q42Var.getCurrentItemTop()));
                break;
            case 22:
                v72 v72Var = (v72) obj;
                l32 l32Var2 = v72Var.x;
                v72Var.b.H1(v72Var, i2);
                n72 n72Var = v72Var.y;
                if (n72Var != null && n72Var.s) {
                    ddb delegate = n72Var.getDelegate();
                    if (delegate instanceof ng8) {
                        smb smbVar = v72Var.s;
                        View F = smbVar.F((ng8) delegate);
                        u69 T = F == null ? null : smbVar.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b4 = T.b();
                            if (n72Var.getDirection() == 0) {
                                n72Var.setTranslationY((view.getY() - gm.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                n72Var.setTranslationY(view.getY());
                            }
                            if (b4 < l32Var2.K0() || b4 > l32Var2.M0()) {
                                n72Var.e();
                            }
                        } else {
                            n72Var.e();
                        }
                    } else {
                        n72Var.e();
                    }
                }
                if (i2 != 0 && (ig5Var = v72Var.E) != null) {
                    ig5Var.a();
                    break;
                }
                break;
            case 23:
                a82 a82Var = (a82) obj;
                a82Var.b.H1(a82Var, i2);
                a82Var.Q();
                break;
            case 24:
                q82 q82Var = (q82) obj;
                q82Var.b.H1(q82Var, i2);
                break;
            case 26:
                ((qe2) obj).c(true);
                break;
            case 27:
                if2 if2Var = (if2) obj;
                if (if2Var.w1.L0() + 10 >= if2Var.q1.b()) {
                    if2Var.K0();
                    break;
                }
                break;
            case 29:
                ap2 ap2Var = (ap2) obj;
                ap2Var.w.b(ap2Var.d);
                break;
        }
    }

    public /* synthetic */ y(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(RecyclerView recyclerView, int i, int i2) {
    }
}
