package sg;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import kg.i1;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ay;
import org.telegram.ui.un;
import org.telegram.ui.uw;
import th.c7;
import th.d2;
import th.e5;
import th.f7;
import th.g2;
import th.h4;
import th.i5;
import th.j4;
import th.l6;
import th.n7;
import th.o7;
import th.q4;
import th.q6;
import th.s0;
import th.s5;
import th.s6;
import th.u3;
import th.v2;
import th.w0;
import th.x6;
import th.x7;
import th.y3;
import th.z2;
import th.z5;
import vh.i6;
import vh.p2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ((ValueAnimator) this.b).start();
                break;
            case 1:
                k2 k2Var = ((w) this.b).g2.r;
                if (!(k2Var instanceof un)) {
                    k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new i1(k2Var, 11, false));
                        break;
                    }
                } else {
                    k2Var.showDialog(new i1(k2Var, 11, false));
                    break;
                }
                break;
            case 2:
                ay ayVar = ((uw) this.b).O0;
                if (!ayVar.L || !ayVar.i4().I()) {
                    ayVar.I4(true, true);
                    break;
                } else {
                    ayVar.E0.h();
                    break;
                }
                break;
            case 3:
                ((th.q0) this.b).a.t(false);
                break;
            case 4:
                s0 s0Var = ((th.r0) this.b).a;
                zs.f(s0Var.e).k(zs.G2, Long.valueOf(s0Var.g()));
                break;
            case 5:
                w0 w0Var = (w0) this.b;
                w0Var.H = false;
                w0Var.j(false);
                w0Var.T = false;
                break;
            case 6:
                ((d2) this.b).a.O0();
                break;
            case 7:
                z2 z2Var = ((g2) this.b).y;
                v2 v2Var = z2Var.z1;
                if (v2Var != null) {
                    if (!z2Var.C1 && !z2Var.D1 && !z2Var.E1) {
                        o7 o7Var = ((f7) v2Var).d;
                        if (!o7Var.n0.getCurrentPeerView().b1(true) && !o7Var.n0.E(true)) {
                            o7Var.D(true);
                            break;
                        }
                    } else if (!z2Var.x1.e) {
                        z2Var.F0 = 0L;
                        break;
                    } else {
                        ((n7) z2Var.v2.c).loopBack();
                        break;
                    }
                }
                break;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i10 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                org.telegram.messenger.i0.b4(profileStoriesView);
                break;
            case 10:
                y3.a(((u3) this.b).d);
                break;
            case 11:
                h4 h4Var = (h4) this.b;
                if (h4Var.isShowing()) {
                    h4Var.J0(true);
                    break;
                }
                break;
            case 12:
                vh.s0 s0Var2 = (vh.s0) this.b;
                s0Var2.b(s0Var2.b);
                s0Var2.c = false;
                break;
            case 13:
                ((i6) this.b).run();
                break;
            case 14:
                i5 i5Var = (i5) this.b;
                i5Var.c();
                i5Var.a(true);
                break;
            case 15:
                ((j4) this.b).a(null);
                break;
            case 16:
                ((s5) this.b).R();
                break;
            case 17:
                z5 z5Var = (z5) this.b;
                ArrayList arrayList = z5Var.c;
                if (arrayList != null) {
                    z5Var.a.i1 = arrayList;
                }
                z2 z2Var2 = z5Var.a;
                long j10 = z5Var.b;
                if (z2Var2.k1 != j10 || z2Var2.i1 != null) {
                    z2Var2.k1 = j10;
                    z2Var2.h1();
                    z2Var2.g1();
                    z2Var2.d1(true);
                    TL_stories.PeerStories peerStories = z2Var2.s0.Q0;
                    if (peerStories == null) {
                        e5 e5Var = z2Var2.B1;
                        TL_stories.PeerStories y3 = e5Var.y(j10);
                        if (y3 == null) {
                            y3 = e5Var.z(j10);
                            z10 = true;
                        }
                        e5Var.V(y3, z10);
                        break;
                    } else {
                        z2Var2.B1.V(peerStories, true);
                        break;
                    }
                }
                break;
            case 18:
                ((ji.a) this.b).f(true);
                break;
            case 19:
                ((l6) this.b).requestLayout();
                break;
            case 20:
                s6 s6Var = (s6) this.b;
                p2 p2Var = s6Var.c;
                if (p2Var != null) {
                    p2Var.e(true);
                    s6Var.c = null;
                }
                s6Var.b(false);
                break;
            case 21:
                q6 q6Var = (q6) this.b;
                if (q6Var.w) {
                    q6Var.E = true;
                    q6Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    q6Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    q6Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    q6Var.invalidate();
                    break;
                }
                break;
            case 22:
                o7 o7Var2 = ((x6) this.b).b;
                try {
                    c7 c7Var = o7Var2.s;
                    if (c7Var != null) {
                        if (o7Var2.b) {
                            org.telegram.messenger.i0.E2(c7Var);
                        } else {
                            o7Var2.n.removeView(c7Var);
                        }
                        o7Var2.s = null;
                        o7Var2.E();
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((c7) this.b).r0.Y(true);
                break;
            case 24:
                ((x7) this.b).c();
                break;
            case 25:
                ((bi) this.b).hide();
                break;
            case 26:
                uh.i iVar = (uh.i) this.b;
                uq0 uq0Var = iVar.W;
                q4 q4Var = iVar.a;
                uq0Var.a(q4Var == null ? "" : q4Var.E);
                break;
            case 27:
                ((vh.g) this.b).c.W = false;
                break;
            case 28:
                ((vh.j) this.b).invalidateSelf();
                break;
            default:
                ((vh.w) this.b).g = -1L;
                break;
        }
    }
}
