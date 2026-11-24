// default package

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class so7 extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ so7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        a aVar;
        byte b = this.a;
        rk8 rk8Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gm.t1(((NotificationsCustomSettingsActivity) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    gm.t1(((w78) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 3:
                ih8 ih8Var = (ih8) obj;
                ch8 ch8Var = ih8Var.l1;
                if (i == 0) {
                    int L = gm.L(13.0f);
                    int i2 = ih8Var.y1;
                    int i3 = ih8Var.t0;
                    if (((i2 - i3) - L) + i3 < a.getCurrentActionBarHeight() && ch8Var.canScrollVertically(1) && (b59Var = (b59) ch8Var.K(0)) != null) {
                        View view = b59Var.a;
                        if (view.getTop() > gm.L(7.0f)) {
                            ch8Var.x0(0, view.getTop() - gm.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 4:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                if (i == 0) {
                    aVar = ((d) premiumPreviewFragment).actionBar;
                    int L2 = gm.L(16.0f) + aVar.getBottom();
                    float f = premiumPreviewFragment.g0;
                    r59 r59Var = premiumPreviewFragment.a;
                    if (f > 0.5f) {
                        r59Var.x0(0, premiumPreviewFragment.d0 - L2, null);
                        break;
                    } else {
                        View m = r59Var.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m != null && m.getTop() < 0) {
                            premiumPreviewFragment.a.x0(0, m.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 5:
                fj8 fj8Var = (fj8) obj;
                if (i == 1) {
                    fj8Var.l3 = true;
                }
                if (i == 0) {
                    for (int i4 = 0; i4 < recyclerView.getChildCount(); i4++) {
                        rk8 rk8Var2 = (rk8) fj8Var.getChildAt(i4);
                        if (rk8Var == null || rk8Var2.a > rk8Var.a) {
                            rk8Var = rk8Var2;
                        }
                    }
                    if (rk8Var != null) {
                        fj8Var.z1(rk8Var, true);
                        fj8Var.l3 = false;
                        fj8Var.x0(0, rk8Var.getTop() - ((fj8Var.getMeasuredHeight() - rk8Var.getMeasuredHeight()) / 2), gm.H);
                    }
                    fj8Var.A1();
                    break;
                } else {
                    gm.r(fj8Var.m3);
                    break;
                }
                break;
            case 8:
                if (i == 0) {
                    ((gy8) obj).w = false;
                    break;
                }
                break;
            case 10:
                r59 r59Var2 = (r59) obj;
                boolean z = r59Var2.u2;
                if (i == 0) {
                    if (z) {
                        r59Var2.u2 = false;
                        nm7.e().k(100, 512);
                    }
                } else if (!z && r59Var2.w1) {
                    r59Var2.u2 = true;
                    nm7.e().k(99, 512);
                }
                if (i != 0 && r59Var2.M1 != null) {
                    zs4 zs4Var = r59Var2.d1;
                    if (zs4Var != null) {
                        gm.r(zs4Var);
                        r59Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        r59Var2.L1.I(obtain);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    r59Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = r59Var2.M1;
                    r59Var2.k1(view2, 0.0f, 0.0f, false);
                    r59Var2.M1 = null;
                    r59Var2.n1(view2, null);
                    r59Var2.O1 = false;
                }
                k69 k69Var = r59Var2.Z0;
                if (k69Var != null) {
                    k69Var.a(recyclerView, i);
                }
                boolean z2 = i == 1 || i == 2;
                r59Var2.J1 = z2;
                if (z2) {
                    r59Var2.K1 = true;
                    break;
                }
                break;
            case 14:
                if (i == 1) {
                    gm.t1(((qc9) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 15:
                ju9 ju9Var = (ju9) obj;
                if (i == 1) {
                    gm.t1(ju9Var.G.getCurrentFocus());
                }
                ju9Var.a();
                break;
            case 16:
                if (i == 0) {
                    zz9 zz9Var = (zz9) obj;
                    if (zz9Var.d2) {
                        zz9Var.d2 = false;
                        break;
                    }
                }
                break;
            case 19:
                if (i == 1) {
                    gm.t1(((b1a) obj).T1.getEditText());
                    break;
                }
                break;
            case 20:
                i2a i2aVar = (i2a) obj;
                if (i == 0) {
                    i2aVar.W = true;
                    i2aVar.invalidate();
                }
                if (i == 1) {
                    i2aVar.W = false;
                    kq kqVar = i2aVar.d;
                    ValueAnimator valueAnimator = (ValueAnimator) kqVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) kqVar.c).cancel();
                        kqVar.c = null;
                    }
                    gm.t1(i2aVar);
                    break;
                }
                break;
            case 21:
                if (i == 0) {
                    daa daaVar = (daa) obj;
                    if (daaVar.F != null) {
                        zja zjaVar = daaVar.d;
                        if (zjaVar == null || !zjaVar.x()) {
                            float f2 = daaVar.Y;
                            if (f2 > 0.0f && f2 < 1.0f) {
                                q7c q7cVar = daaVar.c;
                                if (f2 >= 0.5f) {
                                    q7cVar.x0(0, (int) (-(daaVar.a0 - daaVar.Z)), d53.h);
                                    break;
                                } else {
                                    q7cVar.x0(0, (int) Math.ceil(daaVar.Z - daaVar.b0), d53.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r10.x() != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    @Override // k69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ig5 ig5Var;
        mr3 mr3Var;
        y49 y49Var;
        float f;
        Object[] objArr;
        float y;
        int measuredHeight;
        rja rjaVar;
        byte b = this.a;
        boolean z = false;
        boolean z2 = true;
        Object obj = this.b;
        switch (b) {
            case 1:
                w78 w78Var = (w78) obj;
                if (w78Var.K == null) {
                    int K0 = w78Var.N.K0();
                    int abs = K0 == -1 ? 0 : Math.abs(w78Var.N.M0() - K0) + 1;
                    if (abs > 0 && K0 + abs > w78Var.N.A() - 2 && !w78Var.r && !w78Var.s) {
                        w78Var.i0(w78Var.w, w78Var.x, w78Var.a, true);
                        break;
                    }
                }
                break;
            case 2:
                kg8 kg8Var = (kg8) obj;
                if (i2 != 0 && (ig5Var = kg8Var.h) != null) {
                    ig5Var.a();
                }
                fdb fdbVar = kg8Var.R;
                if (fdbVar != null && fdbVar.s) {
                    ddb delegate = fdbVar.getDelegate();
                    if (delegate instanceof ng8) {
                        smb smbVar = kg8Var.c;
                        View F = smbVar.F((ng8) delegate);
                        u69 T = F != null ? smbVar.T(F) : null;
                        if (T != null) {
                            View view = T.a;
                            int direction = kg8Var.R.getDirection();
                            fdb fdbVar2 = kg8Var.R;
                            if (direction == 0) {
                                fdbVar2.setTranslationY((view.getY() - gm.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fdbVar2.setTranslationY(view.getY());
                            }
                            u46 u46Var = kg8Var.d;
                            if (!u46Var.c.j(view) || !u46Var.d.j(view)) {
                                kg8Var.R.e();
                                break;
                            }
                        } else {
                            kg8Var.R.e();
                            break;
                        }
                    } else {
                        kg8Var.R.e();
                        break;
                    }
                }
                break;
            case 3:
                ih8 ih8Var = (ih8) obj;
                if (ih8Var.l1.getChildCount() > 0) {
                    ih8Var.G0();
                    break;
                }
                break;
            case 4:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (mr3Var = premiumPreviewFragment.x0) != null) {
                    mr3Var.f(i, i2);
                    premiumPreviewFragment.n0();
                    break;
                }
                break;
            case 5:
                fj8 fj8Var = (fj8) obj;
                if (recyclerView.getScrollState() == 1) {
                    fj8Var.z1(null, true);
                }
                fj8Var.invalidate();
                break;
            case 6:
                ((PrivacyControlActivity) obj).P0();
                break;
            case 7:
                km8 km8Var = (km8) obj;
                if (!km8Var.getMessagesController().z0) {
                    int abs2 = Math.abs(km8Var.b.M0() - km8Var.b.K0()) + 1;
                    int b2 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && km8Var.b.M0() >= b2 - 10) {
                        km8Var.getMessagesController().E0(false);
                        break;
                    }
                }
                break;
            case 8:
                gy8 gy8Var = (gy8) obj;
                if (!gy8Var.w) {
                    gy8Var.h.a(gy8Var.f(gy8Var.c()), true);
                    break;
                }
                break;
            case 9:
                v29 v29Var = (v29) obj;
                fv fvVar = v29Var.b;
                int[] iArr = v29Var.g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i3 = iArr[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i3, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    if (childAt instanceof t29) {
                        ((t29) childAt).h = min;
                    } else {
                        childAt.setScaleX(min);
                        childAt.setScaleY(min);
                    }
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i3) - (childAt2.getWidth() + iArr[0]), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    if (childAt2 instanceof t29) {
                        ((t29) childAt2).h = min2;
                    } else {
                        childAt2.setScaleX(min2);
                        childAt2.setScaleY(min2);
                    }
                }
                for (int i4 = 1; i4 < fvVar.getChildCount() - 1; i4++) {
                    View childAt3 = fvVar.getChildAt(i4);
                    if (childAt3 instanceof t29) {
                        ((t29) childAt3).h = 1.0f;
                    } else {
                        childAt3.setScaleX(1.0f);
                        childAt3.setScaleY(1.0f);
                    }
                }
                v29Var.invalidate();
                break;
            case 10:
                r59 r59Var = (r59) obj;
                Rect rect = r59Var.F1;
                k69 k69Var = r59Var.Z0;
                if (k69Var != null) {
                    k69Var.b(recyclerView, i, i2);
                }
                if (r59Var.D1 != -1) {
                    rect.offset(-i, -i2);
                    fg0 fg0Var = r59Var.C1;
                    if (fg0Var != null) {
                        fg0Var.setBounds(rect);
                    }
                    r59Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                r59Var.M0(false);
                if (i2 != 0 && (y49Var = r59Var.e1) != null) {
                    y49Var.c();
                }
                c59 c59Var = r59Var.T1;
                if (c59Var != null) {
                    r59Var.f1(c59Var, 700, false);
                    break;
                }
                break;
            case 11:
                ca9 ca9Var = (ca9) obj;
                ca9Var.e.invalidate();
                da9 da9Var = ca9Var.w;
                int i5 = da9.v1;
                da9Var.b.invalidate();
                break;
            case 12:
                zb9 zb9Var = (zb9) obj;
                for (int i6 = 0; i6 < zb9Var.f.getChildCount(); i6++) {
                    if (zb9Var.f.getChildAt(i6) instanceof tk4) {
                        zb9Var.d.l(false);
                        break;
                    }
                }
                break;
            case 13:
                ((yb9) obj).Y0();
                break;
            case 16:
                zz9 zz9Var = (zz9) obj;
                zz9Var.e1();
                if (zz9Var.n1.J1 && !zz9Var.d2) {
                    gm.t1(zz9Var.b);
                    break;
                }
                break;
            case 17:
                p0a p0aVar = (p0a) obj;
                if (p0aVar.Z0()) {
                    p0aVar.T1.a();
                    break;
                }
                break;
            case 18:
                ((s0a) obj).Y0();
                break;
            case 20:
                i2a i2aVar = (i2a) obj;
                i2aVar.a();
                i2aVar.invalidate();
                break;
            case 21:
                daa daaVar = (daa) obj;
                daaVar.o0(false, true);
                daaVar.p0();
                if (daaVar.c.J1) {
                    gm.t1(daaVar.fragmentView);
                    break;
                }
                break;
            case 22:
                ((mia) obj).E0();
                break;
            case 23:
                fja fjaVar = (fja) obj;
                if (recyclerView == fjaVar.H) {
                    fjaVar.S += i2;
                }
                if (fjaVar.Q == null && fjaVar.R == 0) {
                    fjaVar.C();
                    break;
                }
                break;
            case 24:
                ((apa) obj).S1.W();
                break;
            case 25:
                kpa kpaVar = (kpa) obj;
                View view2 = kpaVar.l2;
                FrameLayout frameLayout = kpaVar.g2;
                r59 r59Var2 = kpaVar.n1;
                for (int childCount = r59Var2.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt4 = r59Var2.getChildAt(childCount);
                    int R = RecyclerView.R(childAt4);
                    if (R >= 0) {
                        if (R == 2) {
                            y = childAt4.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        } else if (R == 1) {
                            f = childAt4.getY();
                            objArr = true;
                            float height = frameLayout.getHeight() + f;
                            if (objArr != false && height >= 0.0f) {
                                z2 = false;
                            }
                            if (kpaVar.q2 != z2) {
                                kpaVar.q2 = z2;
                                if (z2) {
                                    view2.setVisibility(0);
                                }
                                view2.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new n28((byte) 17, (Object) kpaVar, z2)).start();
                            }
                            kpaVar.E1 = f <= 0.0f ? 0 : gm.L(6.0f);
                            frameLayout.setVisibility(objArr == true ? 0 : 8);
                            frameLayout.setTranslationY(f);
                            break;
                        } else if (R == 0) {
                            y = childAt4.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        f = y - measuredHeight;
                        objArr = true;
                        float height2 = frameLayout.getHeight() + f;
                        if (objArr != false) {
                            z2 = false;
                        }
                        if (kpaVar.q2 != z2) {
                        }
                        kpaVar.E1 = f <= 0.0f ? 0 : gm.L(6.0f);
                        frameLayout.setVisibility(objArr == true ? 0 : 8);
                        frameLayout.setTranslationY(f);
                    }
                }
                f = 0.0f;
                objArr = false;
                float height22 = frameLayout.getHeight() + f;
                if (objArr != false) {
                }
                if (kpaVar.q2 != z2) {
                }
                kpaVar.E1 = f <= 0.0f ? 0 : gm.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f);
            case 26:
                ((wsa) obj).T1.h();
                break;
            case 27:
                nxa nxaVar = (nxa) obj;
                fn0 fn0Var = nxaVar.Y;
                if (!nxaVar.c.canScrollVertically(-1)) {
                    rjaVar = ((d) nxaVar).simpleActionBar;
                    break;
                }
                z = true;
                fn0Var.a(z, true);
                break;
            case 28:
                kxa kxaVar = (kxa) obj;
                q7c q7cVar = kxaVar.a;
                if (q7cVar.canScrollVertically(1)) {
                    for (int i7 = 0; i7 < q7cVar.getChildCount(); i7++) {
                        if (!(q7cVar.getChildAt(i7) instanceof tk4)) {
                        }
                    }
                    break;
                }
                kxaVar.h.run();
                break;
            case 29:
                xza xzaVar = (xza) obj;
                if (xzaVar.v0.size() != xzaVar.w0.size() && !xzaVar.A0 && xzaVar.U.M0() > xzaVar.X.d0 - 20) {
                    xzaVar.k0();
                    break;
                }
                break;
        }
    }

    private final void c(RecyclerView recyclerView, int i) {
    }

    private final void d(RecyclerView recyclerView, int i, int i2) {
    }
}
