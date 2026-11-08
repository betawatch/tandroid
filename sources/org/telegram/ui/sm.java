package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class sm extends org.telegram.ui.ActionBar.n0 {
    public float a;
    public final /* synthetic */ an b;

    public sm(an anVar) {
        this.b = anVar;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final boolean a() {
        return this.b.I3 == null;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final boolean b() {
        an anVar = this.b;
        if (!anVar.ed.f) {
            if (anVar.I3 != null && anVar.D1 != null) {
                View currentView = anVar.E1.getCurrentView();
                an anVar2 = currentView instanceof cn ? ((cn) currentView).a : anVar;
                if (!anVar2.cd.f) {
                    anVar2.oc(true);
                    return false;
                }
                int currentPosition = anVar.D1.a.getCurrentPosition();
                int i7 = anVar.F1;
                if (currentPosition != i7) {
                    anVar.D1.a.d(i7, i7);
                    return false;
                }
            } else if (anVar.cd.f) {
                anVar.oc(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final boolean d() {
        return this.b.B3;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void f() {
        an anVar = this.b;
        anVar.a8();
        if (anVar.C3 != null || anVar.D3 != null) {
            ImageView imageView = anVar.h3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (anVar.B3) {
            anVar.W1.getAdapter().U(null, 0, null, false, true);
            anVar.B3 = false;
            anVar.j0.P("", true);
        }
        anVar.j0.setSearchFieldHint(org.telegram.messenger.id.M0(anVar.ca() ? 2131745871 : 2131745839, null));
        anVar.g3.setVisibility(0);
        ImageView imageView2 = anVar.h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        anVar.C3 = null;
        anVar.D3 = null;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        int i7;
        int i10;
        org.telegram.messenger.ij ijVar;
        TLRPC.Chat chat;
        an anVar = this.b;
        anVar.G3 = false;
        anVar.Zc();
        anVar.md();
        ImageView imageView = anVar.g3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = anVar.h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (anVar.B3) {
            anVar.W1.getAdapter().U(null, 0, null, false, true);
            anVar.B3 = false;
        }
        anVar.W1.setReversed(false);
        anVar.W1.getAdapter().k0 = false;
        anVar.A7();
        anVar.C3 = null;
        anVar.D3 = null;
        anVar.I3 = null;
        anVar.j0.setSearchFieldHint(org.telegram.messenger.id.M0(anVar.ca() ? 2131745871 : 2131745839, null));
        anVar.j0.setSearchFieldCaption(null);
        anVar.dd.a(false, true);
        anVar.ed.a(false, true);
        if (anVar.Z.h0() && TextUtils.isEmpty(anVar.Z.getSlowModeTimer()) && (((chat = anVar.e) == null || org.telegram.messenger.t3.q(chat)) && !anVar.aa())) {
            org.telegram.ui.ActionBar.r0 r0Var = anVar.i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f0;
            if (xVar != null) {
                xVar.e(0);
            }
            cr crVar = anVar.e0;
            if (crVar != null) {
                crVar.b(true);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = anVar.o0;
            if (r0Var2 != null && anVar.da) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = anVar.p0;
            if (xVar2 != null && anVar.ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = anVar.k0;
            if (r0Var3 != null) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = anVar.l0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.r0 r0Var5 = anVar.i0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = anVar.p0;
            if (xVar3 != null && anVar.ea) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var6 = anVar.k0;
            if (r0Var6 != null) {
                r0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var7 = anVar.o0;
            if (r0Var7 != null && anVar.da) {
                r0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = anVar.f0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            cr crVar2 = anVar.e0;
            if (crVar2 != null) {
                crVar2.b(false);
            }
        }
        if (anVar.E1 != null) {
            if (anVar.D1.a.getCurrentPosition() != 0) {
                anVar.D1.a.d(0, 0);
                anVar.G1 = true;
            } else {
                anVar.E1.h.clear();
            }
        }
        int i11 = anVar.f4;
        if (i11 == 3 || i11 == 8 || ((anVar.r4 == 0 && !org.telegram.messenger.t10.z(anVar.f)) || ((ijVar = anVar.l4) != null && ijVar.N1() < 10))) {
            anVar.j0.setVisibility(8);
        }
        anVar.q0 = false;
        anVar.zd();
        org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
        mediaDataController.Y0.clear();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        if (anVar.c4 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.oa.a(i10).b(3).a();
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i7);
            a10.b.a();
            a10.c.a();
        }
        jg.m1 m1Var = anVar.a4;
        if (m1Var != null) {
            m1Var.f();
        }
        anVar.hb();
        anVar.Lc(false);
        anVar.cd(0, true);
        anVar.Cd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new rm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        anVar.cd.a(false, true);
        anVar.ld();
        anVar.E3 = null;
        anVar.md();
        anVar.Zc();
        ak akVar = anVar.C1;
        if (akVar != null) {
            akVar.d.M(new eq(2));
            akVar.h = 0L;
            anVar.C1.g(false);
        }
        nj njVar = anVar.D1;
        if (njVar != null) {
            njVar.b(false);
        }
        anVar.Mb(false);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void i() {
        nj njVar;
        int i7;
        an anVar = this.b;
        anVar.G3 = true;
        anVar.Zc();
        anVar.md();
        if (((anVar.r4 != 0 && anVar.f4 != 3) || org.telegram.messenger.t10.z(anVar.f)) && !anVar.Gc) {
            anVar.La(null);
        }
        if (anVar.i5) {
            anVar.saveKeyboardPositionBeforeTransition();
            if (!anVar.ib) {
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i7);
            }
            org.telegram.messenger.g0.i3(new bh(this, 10), 500L);
            fi.m3 m3Var = anVar.u2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            fi.m3 m3Var2 = anVar.w2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new rm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ak akVar = anVar.C1;
        if (akVar != null) {
            akVar.g(!anVar.ib && akVar.a() && anVar.I3 == null);
        }
        if (anVar.I3 == null || (njVar = anVar.D1) == null) {
            return;
        }
        int currentPosition = njVar.a.getCurrentPosition();
        int i10 = anVar.F1;
        if (currentPosition != i10) {
            anVar.D1.a.d(i10, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void j(jg.o0 o0Var) {
        an anVar = this.b;
        ak akVar = anVar.C1;
        if (akVar != null) {
            akVar.d.M(new eq(2));
            akVar.h = 0L;
        }
        anVar.E3 = null;
        anVar.md();
        anVar.Zc();
        anVar.Mb(false);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        an anVar = this.b;
        boolean z9 = false;
        anVar.jd(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : anVar.H3;
        anVar.H3 = obj;
        if (TextUtils.isEmpty(obj) || !(anVar.H3.startsWith("$") || anVar.H3.startsWith("#"))) {
            anVar.I3 = null;
            nj njVar = anVar.D1;
            if (njVar != null) {
                njVar.b(false);
                anVar.ld();
            }
            nj njVar2 = anVar.D1;
            if (njVar2 != null && njVar2.a.getCurrentPosition() != 0) {
                anVar.D1.a.d(0, 0);
            }
        } else {
            anVar.b8();
            if (anVar.H3.contains("@")) {
                String str = anVar.H3;
                f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                anVar.presentFragment(new org.telegram.ui.Components.r20(str, f6Var));
                return;
            }
            if (anVar.I3 == null) {
                anVar.I3 = anVar.H3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new rm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ak akVar = anVar.C1;
                if (akVar != null) {
                    if (!anVar.ib && akVar.a() && anVar.I3 == null) {
                        z9 = true;
                    }
                    akVar.g(z9);
                }
            }
            anVar.I3 = anVar.H3;
            anVar.f7(true);
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.oa.a(i10).c(anVar.I3);
            anVar.H1.f.O(true);
            View currentView = anVar.E1.getCurrentView();
            if (anVar.c4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                org.telegram.messenger.oa.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i11);
                a10.b.a();
                a10.c.a();
            }
            if (currentView instanceof cn) {
                ((cn) currentView).a.nd(anVar.I3);
            }
            anVar.ld();
            anVar.r2.e(true, true);
            anVar.oc(true);
            z9 = true;
        }
        nj njVar3 = anVar.D1;
        if (njVar3 != null) {
            njVar3.b(z9);
        }
        org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
        String str2 = anVar.H3;
        long j3 = anVar.j6;
        long j10 = anVar.b7;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        mediaDataController.X1(str2, j3, j10, i7, 0, anVar.r4, false, anVar.C3, anVar.D3, true, anVar.E3);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        an anVar = this.b;
        te.a aVar = anVar.ed;
        if (anVar.I3 == null) {
            anVar.oc(false);
        }
        anVar.a8();
        if (anVar.B3) {
            anVar.W1.getAdapter().U("@" + editText.getText().toString(), 0, anVar.K6, true, true);
        } else if (anVar.C3 == null && anVar.D3 == null && anVar.h3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.id.M0(2131745769, null))) {
            anVar.h3.callOnClick();
        }
        if (anVar.I3 != null) {
            boolean z9 = editText.length() == 0;
            if (z9 != aVar.f) {
                if (z9) {
                    anVar.b8();
                }
                aVar.a(z9, true);
                fi.g1 g1Var = anVar.E1;
                if (g1Var != null) {
                    g1Var.E(0);
                }
                if (z9) {
                    anVar.oc(true);
                }
                anVar.Lc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final boolean m() {
        return this.b.I3 == null;
    }
}
