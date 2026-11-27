// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qu1 extends o7 {
    public float a;
    public final /* synthetic */ zu1 b;

    public qu1(zu1 zu1Var) {
        this.b = zu1Var;
    }

    @Override // o7
    public final boolean a() {
        return this.b.J3 == null;
    }

    @Override // o7
    public final boolean b() {
        zu1 zu1Var = this.b;
        if (!zu1Var.wd.f) {
            if (zu1Var.J3 != null && zu1Var.E1 != null) {
                View currentView = zu1Var.F1.getCurrentView();
                zu1 zu1Var2 = currentView instanceof hv1 ? ((hv1) currentView).a : zu1Var;
                if (!zu1Var2.ud.f) {
                    zu1Var2.nc(true);
                    return false;
                }
                int currentPosition = zu1Var.E1.a.getCurrentPosition();
                byte b = zu1Var.G1;
                if (currentPosition != b) {
                    zu1Var.E1.a.e(b, b);
                    return false;
                }
            } else if (zu1Var.ud.f) {
                zu1Var.nc(false);
                return false;
            }
        }
        return true;
    }

    @Override // o7
    public final boolean d() {
        return this.b.C3;
    }

    @Override // o7
    public final void f() {
        zu1 zu1Var = this.b;
        zu1Var.c6();
        if (zu1Var.D3 != null || zu1Var.E3 != null) {
            ImageView imageView = zu1Var.i3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (zu1Var.C3) {
            zu1Var.X1.getAdapter().U(null, 0, null, false, true);
            zu1Var.C3 = false;
            zu1Var.k0.P("", true);
        }
        zu1Var.k0.setSearchFieldHint(ob6.M0(zu1Var.j8() ? 2131745596 : 2131745564, null));
        zu1Var.h3.setVisibility(0);
        ImageView imageView2 = zu1Var.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        zu1Var.D3 = null;
        zu1Var.E3 = null;
    }

    @Override // o7
    public final void h() {
        int i;
        int i2;
        r47 r47Var;
        TLRPC.Chat chat;
        zu1 zu1Var = this.b;
        zu1Var.H3 = false;
        zu1Var.dd();
        zu1Var.qd();
        ImageView imageView = zu1Var.h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = zu1Var.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (zu1Var.C3) {
            zu1Var.X1.getAdapter().U(null, 0, null, false, true);
            zu1Var.C3 = false;
        }
        zu1Var.X1.setReversed(false);
        zu1Var.X1.getAdapter().l0 = false;
        zu1Var.y5();
        zu1Var.D3 = null;
        zu1Var.E3 = null;
        zu1Var.J3 = null;
        zu1Var.k0.setSearchFieldHint(ob6.M0(zu1Var.j8() ? 2131745596 : 2131745564, null));
        zu1Var.k0.setSearchFieldCaption(null);
        zu1Var.vd.a(false, true);
        zu1Var.wd.a(false, true);
        if (zu1Var.a0.L0() && TextUtils.isEmpty(zu1Var.a0.getSlowModeTimer()) && (((chat = zu1Var.e) == null || xc2.q(chat)) && !zu1Var.g8())) {
            s7 s7Var = zu1Var.j0;
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
            r6 r6Var = zu1Var.g0;
            if (r6Var != null) {
                r6Var.e(0);
            }
            yq2 yq2Var = zu1Var.f0;
            if (yq2Var != null) {
                yq2Var.b(true);
            }
            s7 s7Var2 = zu1Var.p0;
            if (s7Var2 != null && zu1Var.ha) {
                s7Var2.setVisibility(8);
            }
            r6 r6Var2 = zu1Var.q0;
            if (r6Var2 != null && zu1Var.ia) {
                r6Var2.e(8);
            }
            s7 s7Var3 = zu1Var.l0;
            if (s7Var3 != null) {
                s7Var3.setVisibility(8);
            }
            s7 s7Var4 = zu1Var.m0;
            if (s7Var4 != null) {
                s7Var4.setVisibility(8);
            }
        } else {
            s7 s7Var5 = zu1Var.j0;
            if (s7Var5 != null) {
                s7Var5.setVisibility(0);
            }
            r6 r6Var3 = zu1Var.q0;
            if (r6Var3 != null && zu1Var.ia) {
                r6Var3.e(0);
            }
            s7 s7Var6 = zu1Var.l0;
            if (s7Var6 != null) {
                s7Var6.setVisibility(0);
            }
            s7 s7Var7 = zu1Var.p0;
            if (s7Var7 != null && zu1Var.ha) {
                s7Var7.setVisibility(0);
            }
            r6 r6Var4 = zu1Var.g0;
            if (r6Var4 != null) {
                r6Var4.e(8);
            }
            yq2 yq2Var2 = zu1Var.f0;
            if (yq2Var2 != null) {
                yq2Var2.b(false);
            }
        }
        if (zu1Var.F1 != null) {
            if (zu1Var.E1.a.getCurrentPosition() != 0) {
                zu1Var.E1.a.e(0, 0);
                zu1Var.H1 = true;
            } else {
                zu1Var.F1.h.clear();
            }
        }
        int i3 = zu1Var.g4;
        if (i3 == 3 || i3 == 8 || ((zu1Var.s4 == 0 && !lbc.B(zu1Var.f)) || ((r47Var = zu1Var.m4) != null && r47Var.M1() < 10))) {
            zu1Var.k0.setVisibility(8);
        }
        zu1Var.r0 = false;
        zu1Var.Dd();
        ls6 mediaDataController = zu1Var.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        mediaDataController.b1.clear();
        if (zu1Var.d4 == 3) {
            i2 = ((e) zu1Var).currentAccount;
            df5.a(i2).b(3).a();
        } else {
            i = ((e) zu1Var).currentAccount;
            df5 a = df5.a(i);
            a.b.a();
            a.c.a();
        }
        yc7 yc7Var = zu1Var.b4;
        if (yc7Var != null) {
            yc7Var.f();
        }
        zu1Var.db();
        zu1Var.Pc(false);
        zu1Var.gd(0, true);
        zu1Var.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new pu1(this, (byte) 2));
        ofFloat.setInterpolator(k43.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        zu1Var.ud.a(false, true);
        zu1Var.pd();
        zu1Var.F3 = null;
        zu1Var.qd();
        zu1Var.dd();
        zr1 zr1Var = zu1Var.D1;
        if (zr1Var != null) {
            zr1Var.d.N(new t42((byte) 2));
            zr1Var.h = 0L;
            zu1Var.D1.g(false);
        }
        kr1 kr1Var = zu1Var.E1;
        if (kr1Var != null) {
            kr1Var.b(false);
        }
        zu1Var.Jb(false);
    }

    @Override // o7
    public final void i() {
        kr1 kr1Var;
        int i;
        zu1 zu1Var = this.b;
        zu1Var.H3 = true;
        zu1Var.dd();
        zu1Var.qd();
        if (((zu1Var.s4 != 0 && zu1Var.g4 != 3) || lbc.B(zu1Var.f)) && !zu1Var.Yc) {
            zu1Var.Ca(null);
        }
        if (zu1Var.k5) {
            zu1Var.saveKeyboardPositionBeforeTransition();
            if (!zu1Var.mb) {
                Activity parentActivity = zu1Var.getParentActivity();
                i = ((e) zu1Var).classGuid;
                hl.V2(parentActivity, i);
            }
            hl.d3(new go1(this, (byte) 10), 500L);
            kg5 kg5Var = zu1Var.v2;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            kg5 kg5Var2 = zu1Var.x2;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new pu1(this, (byte) 1));
        ofFloat.setInterpolator(k43.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        zr1 zr1Var = zu1Var.D1;
        if (zr1Var != null) {
            zr1Var.g(!zu1Var.mb && zr1Var.a() && zu1Var.J3 == null);
        }
        if (zu1Var.J3 == null || (kr1Var = zu1Var.E1) == null) {
            return;
        }
        int currentPosition = kr1Var.a.getCurrentPosition();
        byte b = zu1Var.G1;
        if (currentPosition != b) {
            zu1Var.E1.a.e(b, b);
        }
    }

    @Override // o7
    public final void j(ph4 ph4Var) {
        zu1 zu1Var = this.b;
        zr1 zr1Var = zu1Var.D1;
        if (zr1Var != null) {
            zr1Var.d.N(new t42((byte) 2));
            zr1Var.h = 0L;
        }
        zu1Var.F3 = null;
        zu1Var.qd();
        zu1Var.dd();
        zu1Var.Jb(false);
    }

    @Override // o7
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i;
        int i2;
        int i3;
        int i4;
        vnb vnbVar;
        zu1 zu1Var = this.b;
        boolean z = false;
        zu1Var.nd(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : zu1Var.I3;
        zu1Var.I3 = obj;
        if (TextUtils.isEmpty(obj) || !(zu1Var.I3.startsWith("$") || zu1Var.I3.startsWith("#"))) {
            zu1Var.J3 = null;
            kr1 kr1Var = zu1Var.E1;
            if (kr1Var != null) {
                kr1Var.b(false);
                zu1Var.pd();
            }
            kr1 kr1Var2 = zu1Var.E1;
            if (kr1Var2 != null && kr1Var2.a.getCurrentPosition() != 0) {
                zu1Var.E1.a.e(0, 0);
            }
        } else {
            zu1Var.d6();
            if (zu1Var.I3.contains("@")) {
                String str = zu1Var.I3;
                vnbVar = ((e) zu1Var).resourceProvider;
                zu1Var.presentFragment(new ue5(str, vnbVar));
                return;
            }
            if (zu1Var.J3 == null) {
                zu1Var.J3 = zu1Var.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new pu1(this, (byte) 0));
                ofFloat.setInterpolator(k43.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                zr1 zr1Var = zu1Var.D1;
                if (zr1Var != null) {
                    if (!zu1Var.mb && zr1Var.a() && zu1Var.J3 == null) {
                        z = true;
                    }
                    zr1Var.g(z);
                }
            }
            zu1Var.J3 = zu1Var.I3;
            zu1Var.d5(true);
            i2 = ((e) zu1Var).currentAccount;
            df5.a(i2).c(zu1Var.J3);
            zu1Var.I1.f.O(true);
            View currentView = zu1Var.F1.getCurrentView();
            if (zu1Var.d4 == 3) {
                i4 = ((e) zu1Var).currentAccount;
                df5.a(i4).b(3).a();
            } else {
                i3 = ((e) zu1Var).currentAccount;
                df5 a = df5.a(i3);
                a.b.a();
                a.c.a();
            }
            if (currentView instanceof hv1) {
                ((hv1) currentView).a.rd(zu1Var.J3);
            }
            zu1Var.pd();
            zu1Var.s2.e(true, true);
            zu1Var.nc(true);
            z = true;
        }
        kr1 kr1Var3 = zu1Var.E1;
        if (kr1Var3 != null) {
            kr1Var3.b(z);
        }
        ls6 mediaDataController = zu1Var.getMediaDataController();
        String str2 = zu1Var.I3;
        long j = zu1Var.l6;
        long j2 = zu1Var.d7;
        i = ((e) zu1Var).classGuid;
        mediaDataController.Z1(str2, j, j2, i, 0, zu1Var.s4, false, zu1Var.D3, zu1Var.E3, true, zu1Var.F3);
    }

    @Override // o7
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        zu1 zu1Var = this.b;
        fm0 fm0Var = zu1Var.wd;
        if (zu1Var.J3 == null) {
            zu1Var.nc(false);
        }
        zu1Var.c6();
        if (zu1Var.C3) {
            zu1Var.X1.getAdapter().U("@" + editTextBoldCursor.getText().toString(), 0, zu1Var.M6, true, true);
        } else if (zu1Var.D3 == null && zu1Var.E3 == null && zu1Var.i3 != null && TextUtils.equals(editTextBoldCursor.getText(), ob6.M0(2131745494, null))) {
            zu1Var.i3.callOnClick();
        }
        if (zu1Var.J3 != null) {
            boolean z = editTextBoldCursor.length() == 0;
            if (z != fm0Var.f) {
                if (z) {
                    zu1Var.d6();
                }
                fm0Var.a(z, true);
                ir1 ir1Var = zu1Var.F1;
                if (ir1Var != null) {
                    ir1Var.F(0);
                }
                if (z) {
                    zu1Var.nc(true);
                }
                zu1Var.Pc(false);
            }
        }
    }

    @Override // o7
    public final boolean m() {
        return this.b.J3 == null;
    }
}
