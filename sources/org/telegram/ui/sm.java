package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sm extends org.telegram.ui.ActionBar.m0 {
    public float a;
    public final /* synthetic */ an b;

    public sm(an anVar) {
        this.b = anVar;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean a() {
        return this.b.J3 == null;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean b() {
        an anVar = this.b;
        if (!anVar.hd.f) {
            if (anVar.J3 != null && anVar.E1 != null) {
                View currentView = anVar.F1.getCurrentView();
                an anVar2 = currentView instanceof cn ? ((cn) currentView).a : anVar;
                if (!anVar2.fd.f) {
                    anVar2.sc(true);
                    return false;
                }
                int currentPosition = anVar.E1.a.getCurrentPosition();
                int i7 = anVar.G1;
                if (currentPosition != i7) {
                    anVar.E1.a.d(i7, i7);
                    return false;
                }
            } else if (anVar.fd.f) {
                anVar.sc(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean d() {
        return this.b.C3;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void f() {
        an anVar = this.b;
        anVar.c8();
        if (anVar.D3 != null || anVar.E3 != null) {
            ImageView imageView = anVar.i3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (anVar.C3) {
            anVar.X1.getAdapter().U(null, 0, null, false, true);
            anVar.C3 = false;
            anVar.k0.Q("", true);
        }
        anVar.k0.setSearchFieldHint(org.telegram.messenger.hd.M0(anVar.ea() ? 2131745868 : 2131745836, null));
        anVar.h3.setVisibility(0);
        ImageView imageView2 = anVar.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        anVar.D3 = null;
        anVar.E3 = null;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        int i7;
        int i10;
        org.telegram.messenger.gj gjVar;
        TLRPC.Chat chat;
        an anVar = this.b;
        anVar.H3 = false;
        anVar.dd();
        anVar.qd();
        ImageView imageView = anVar.h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = anVar.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (anVar.C3) {
            anVar.X1.getAdapter().U(null, 0, null, false, true);
            anVar.C3 = false;
        }
        anVar.X1.setReversed(false);
        anVar.X1.getAdapter().l0 = false;
        anVar.B7();
        anVar.D3 = null;
        anVar.E3 = null;
        anVar.J3 = null;
        anVar.k0.setSearchFieldHint(org.telegram.messenger.hd.M0(anVar.ea() ? 2131745868 : 2131745836, null));
        anVar.k0.setSearchFieldCaption(null);
        anVar.gd.a(false, true);
        anVar.hd.a(false, true);
        if (anVar.a0.w0() && TextUtils.isEmpty(anVar.a0.getSlowModeTimer()) && (((chat = anVar.e) == null || org.telegram.messenger.t3.q(chat)) && !anVar.ca())) {
            org.telegram.ui.ActionBar.q0 q0Var = anVar.j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.g0;
            if (xVar != null) {
                xVar.e(0);
            }
            er erVar = anVar.f0;
            if (erVar != null) {
                erVar.b(true);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = anVar.p0;
            if (q0Var2 != null && anVar.ga) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = anVar.q0;
            if (xVar2 != null && anVar.ha) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = anVar.l0;
            if (q0Var3 != null) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = anVar.m0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.q0 q0Var5 = anVar.j0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = anVar.q0;
            if (xVar3 != null && anVar.ha) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var6 = anVar.l0;
            if (q0Var6 != null) {
                q0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var7 = anVar.p0;
            if (q0Var7 != null && anVar.ga) {
                q0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = anVar.g0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            er erVar2 = anVar.f0;
            if (erVar2 != null) {
                erVar2.b(false);
            }
        }
        if (anVar.F1 != null) {
            if (anVar.E1.a.getCurrentPosition() != 0) {
                anVar.E1.a.d(0, 0);
                anVar.H1 = true;
            } else {
                anVar.F1.h.clear();
            }
        }
        int i11 = anVar.g4;
        if (i11 == 3 || i11 == 8 || ((anVar.s4 == 0 && !org.telegram.messenger.q10.z(anVar.f)) || ((gjVar = anVar.m4) != null && gjVar.M1() < 10))) {
            anVar.k0.setVisibility(8);
        }
        anVar.r0 = false;
        anVar.Dd();
        org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        mediaDataController.b1.clear();
        if (anVar.d4 == 3) {
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.na.a(i10).b(3).a();
        } else {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(i7);
            a10.b.a();
            a10.c.a();
        }
        jg.l1 l1Var = anVar.b4;
        if (l1Var != null) {
            l1Var.f();
        }
        anVar.lb();
        anVar.Pc(false);
        anVar.gd(0, true);
        anVar.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new rm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        anVar.fd.a(false, true);
        anVar.pd();
        anVar.F3 = null;
        anVar.qd();
        anVar.dd();
        ak akVar = anVar.D1;
        if (akVar != null) {
            akVar.d.M(new gq(2));
            akVar.h = 0L;
            anVar.D1.g(false);
        }
        nj njVar = anVar.E1;
        if (njVar != null) {
            njVar.b(false);
        }
        anVar.Qb(false);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        nj njVar;
        int i7;
        an anVar = this.b;
        anVar.H3 = true;
        anVar.dd();
        anVar.qd();
        if (((anVar.s4 != 0 && anVar.g4 != 3) || org.telegram.messenger.q10.z(anVar.f)) && !anVar.Jc) {
            anVar.Oa(null);
        }
        if (anVar.j5) {
            anVar.saveKeyboardPositionBeforeTransition();
            if (!anVar.lb) {
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i7);
            }
            org.telegram.messenger.g0.i3(new bh(this, 10), 500L);
            hi.l3 l3Var = anVar.v2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            hi.l3 l3Var2 = anVar.x2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new rm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ak akVar = anVar.D1;
        if (akVar != null) {
            akVar.g(!anVar.lb && akVar.a() && anVar.J3 == null);
        }
        if (anVar.J3 == null || (njVar = anVar.E1) == null) {
            return;
        }
        int currentPosition = njVar.a.getCurrentPosition();
        int i10 = anVar.G1;
        if (currentPosition != i10) {
            anVar.E1.a.d(i10, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void j(jg.o0 o0Var) {
        an anVar = this.b;
        ak akVar = anVar.D1;
        if (akVar != null) {
            akVar.d.M(new gq(2));
            akVar.h = 0L;
        }
        anVar.F3 = null;
        anVar.qd();
        anVar.dd();
        anVar.Qb(false);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        an anVar = this.b;
        boolean z10 = false;
        anVar.nd(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : anVar.I3;
        anVar.I3 = obj;
        if (TextUtils.isEmpty(obj) || !(anVar.I3.startsWith("$") || anVar.I3.startsWith("#"))) {
            anVar.J3 = null;
            nj njVar = anVar.E1;
            if (njVar != null) {
                njVar.b(false);
                anVar.pd();
            }
            nj njVar2 = anVar.E1;
            if (njVar2 != null && njVar2.a.getCurrentPosition() != 0) {
                anVar.E1.a.d(0, 0);
            }
        } else {
            anVar.d8();
            if (anVar.I3.contains("@")) {
                String str = anVar.I3;
                e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                anVar.presentFragment(new org.telegram.ui.Components.u20(str, e6Var));
                return;
            }
            if (anVar.J3 == null) {
                anVar.J3 = anVar.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new rm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ak akVar = anVar.D1;
                if (akVar != null) {
                    if (!anVar.lb && akVar.a() && anVar.J3 == null) {
                        z10 = true;
                    }
                    akVar.g(z10);
                }
            }
            anVar.J3 = anVar.I3;
            anVar.g7(true);
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            org.telegram.messenger.na.a(i10).c(anVar.J3);
            anVar.I1.f.O(true);
            View currentView = anVar.F1.getCurrentView();
            if (anVar.d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                org.telegram.messenger.na.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                org.telegram.messenger.na a10 = org.telegram.messenger.na.a(i11);
                a10.b.a();
                a10.c.a();
            }
            if (currentView instanceof cn) {
                ((cn) currentView).a.rd(anVar.J3);
            }
            anVar.pd();
            anVar.s2.e(true, true);
            anVar.sc(true);
            z10 = true;
        }
        nj njVar3 = anVar.E1;
        if (njVar3 != null) {
            njVar3.b(z10);
        }
        org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
        String str2 = anVar.I3;
        long j3 = anVar.k6;
        long j10 = anVar.c7;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        mediaDataController.X1(str2, j3, j10, i7, 0, anVar.s4, false, anVar.D3, anVar.E3, true, anVar.F3);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        an anVar = this.b;
        te.a aVar = anVar.hd;
        if (anVar.J3 == null) {
            anVar.sc(false);
        }
        anVar.c8();
        if (anVar.C3) {
            anVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, anVar.L6, true, true);
        } else if (anVar.D3 == null && anVar.E3 == null && anVar.i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.hd.M0(2131745766, null))) {
            anVar.i3.callOnClick();
        }
        if (anVar.J3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != aVar.f) {
                if (z10) {
                    anVar.d8();
                }
                aVar.a(z10, true);
                hi.i1 i1Var = anVar.F1;
                if (i1Var != null) {
                    i1Var.C(0);
                }
                if (z10) {
                    anVar.sc(true);
                }
                anVar.Pc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean m() {
        return this.b.J3 == null;
    }
}
