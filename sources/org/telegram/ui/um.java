package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class um extends org.telegram.ui.ActionBar.n0 {
    public float a;
    public final /* synthetic */ cn b;

    public um(cn cnVar) {
        this.b = cnVar;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final boolean a() {
        return this.b.I3 == null;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final boolean b() {
        cn cnVar = this.b;
        if (!cnVar.gd.f) {
            if (cnVar.I3 != null && cnVar.D1 != null) {
                View currentView = cnVar.E1.getCurrentView();
                cn cnVar2 = currentView instanceof en ? ((en) currentView).a : cnVar;
                if (!cnVar2.ed.f) {
                    cnVar2.rc(true);
                    return false;
                }
                int currentPosition = cnVar.D1.a.getCurrentPosition();
                int i7 = cnVar.F1;
                if (currentPosition != i7) {
                    cnVar.D1.a.d(i7, i7);
                    return false;
                }
            } else if (cnVar.ed.f) {
                cnVar.rc(false);
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
        cn cnVar = this.b;
        cnVar.b8();
        if (cnVar.C3 != null || cnVar.D3 != null) {
            ImageView imageView = cnVar.h3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (cnVar.B3) {
            cnVar.W1.getAdapter().U(null, 0, null, false, true);
            cnVar.B3 = false;
            cnVar.j0.P("", true);
        }
        cnVar.j0.setSearchFieldHint(org.telegram.messenger.id.M0(cnVar.da() ? 2131745868 : 2131745836, null));
        cnVar.g3.setVisibility(0);
        ImageView imageView2 = cnVar.h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        cnVar.C3 = null;
        cnVar.D3 = null;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        int i7;
        int i10;
        org.telegram.messenger.ij ijVar;
        TLRPC.Chat chat;
        cn cnVar = this.b;
        cnVar.G3 = false;
        cnVar.cd();
        cnVar.pd();
        ImageView imageView = cnVar.g3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = cnVar.h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (cnVar.B3) {
            cnVar.W1.getAdapter().U(null, 0, null, false, true);
            cnVar.B3 = false;
        }
        cnVar.W1.setReversed(false);
        cnVar.W1.getAdapter().k0 = false;
        cnVar.B7();
        cnVar.C3 = null;
        cnVar.D3 = null;
        cnVar.I3 = null;
        cnVar.j0.setSearchFieldHint(org.telegram.messenger.id.M0(cnVar.da() ? 2131745868 : 2131745836, null));
        cnVar.j0.setSearchFieldCaption(null);
        cnVar.fd.a(false, true);
        cnVar.gd.a(false, true);
        if (cnVar.Z.h0() && TextUtils.isEmpty(cnVar.Z.getSlowModeTimer()) && (((chat = cnVar.e) == null || org.telegram.messenger.t3.q(chat)) && !cnVar.ba())) {
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = cnVar.f0;
            if (xVar != null) {
                xVar.e(0);
            }
            er erVar = cnVar.e0;
            if (erVar != null) {
                erVar.b(true);
            }
            org.telegram.ui.ActionBar.r0 r0Var2 = cnVar.o0;
            if (r0Var2 != null && cnVar.fa) {
                r0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = cnVar.p0;
            if (xVar2 != null && cnVar.ga) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var3 = cnVar.k0;
            if (r0Var3 != null) {
                r0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = cnVar.l0;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.r0 r0Var5 = cnVar.i0;
            if (r0Var5 != null) {
                r0Var5.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = cnVar.p0;
            if (xVar3 != null && cnVar.ga) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var6 = cnVar.k0;
            if (r0Var6 != null) {
                r0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.r0 r0Var7 = cnVar.o0;
            if (r0Var7 != null && cnVar.fa) {
                r0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = cnVar.f0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            er erVar2 = cnVar.e0;
            if (erVar2 != null) {
                erVar2.b(false);
            }
        }
        if (cnVar.E1 != null) {
            if (cnVar.D1.a.getCurrentPosition() != 0) {
                cnVar.D1.a.d(0, 0);
                cnVar.G1 = true;
            } else {
                cnVar.E1.h.clear();
            }
        }
        int i11 = cnVar.f4;
        if (i11 == 3 || i11 == 8 || ((cnVar.r4 == 0 && !org.telegram.messenger.t10.z(cnVar.f)) || ((ijVar = cnVar.l4) != null && ijVar.M1() < 10))) {
            cnVar.j0.setVisibility(8);
        }
        cnVar.q0 = false;
        cnVar.Cd();
        org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
        mediaDataController.Y0.clear();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        if (cnVar.c4 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.oa.a(i10).b(3).a();
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i7);
            a10.b.a();
            a10.c.a();
        }
        jg.m1 m1Var = cnVar.a4;
        if (m1Var != null) {
            m1Var.f();
        }
        cnVar.kb();
        cnVar.Oc(false);
        cnVar.fd(0, true);
        cnVar.Fd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new tm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        cnVar.ed.a(false, true);
        cnVar.od();
        cnVar.E3 = null;
        cnVar.pd();
        cnVar.cd();
        ck ckVar = cnVar.C1;
        if (ckVar != null) {
            ckVar.d.M(new gq(2));
            ckVar.h = 0L;
            cnVar.C1.g(false);
        }
        pj pjVar = cnVar.D1;
        if (pjVar != null) {
            pjVar.b(false);
        }
        cnVar.Pb(false);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void i() {
        pj pjVar;
        int i7;
        cn cnVar = this.b;
        cnVar.G3 = true;
        cnVar.cd();
        cnVar.pd();
        if (((cnVar.r4 != 0 && cnVar.f4 != 3) || org.telegram.messenger.t10.z(cnVar.f)) && !cnVar.Ic) {
            cnVar.Na(null);
        }
        if (cnVar.i5) {
            cnVar.saveKeyboardPositionBeforeTransition();
            if (!cnVar.kb) {
                Activity parentActivity = cnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i7);
            }
            org.telegram.messenger.g0.i3(new dh(this, 10), 500L);
            fi.m3 m3Var = cnVar.u2;
            if (m3Var != null) {
                m3Var.f(true);
            }
            fi.m3 m3Var2 = cnVar.w2;
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new tm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ck ckVar = cnVar.C1;
        if (ckVar != null) {
            ckVar.g(!cnVar.kb && ckVar.a() && cnVar.I3 == null);
        }
        if (cnVar.I3 == null || (pjVar = cnVar.D1) == null) {
            return;
        }
        int currentPosition = pjVar.a.getCurrentPosition();
        int i10 = cnVar.F1;
        if (currentPosition != i10) {
            cnVar.D1.a.d(i10, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void j(jg.o0 o0Var) {
        cn cnVar = this.b;
        ck ckVar = cnVar.C1;
        if (ckVar != null) {
            ckVar.d.M(new gq(2));
            ckVar.h = 0L;
        }
        cnVar.E3 = null;
        cnVar.pd();
        cnVar.cd();
        cnVar.Pb(false);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        cn cnVar = this.b;
        boolean z9 = false;
        cnVar.md(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : cnVar.H3;
        cnVar.H3 = obj;
        if (TextUtils.isEmpty(obj) || !(cnVar.H3.startsWith("$") || cnVar.H3.startsWith("#"))) {
            cnVar.I3 = null;
            pj pjVar = cnVar.D1;
            if (pjVar != null) {
                pjVar.b(false);
                cnVar.od();
            }
            pj pjVar2 = cnVar.D1;
            if (pjVar2 != null && pjVar2.a.getCurrentPosition() != 0) {
                cnVar.D1.a.d(0, 0);
            }
        } else {
            cnVar.c8();
            if (cnVar.H3.contains("@")) {
                String str = cnVar.H3;
                g6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                cnVar.presentFragment(new org.telegram.ui.Components.s20(str, g6Var));
                return;
            }
            if (cnVar.I3 == null) {
                cnVar.I3 = cnVar.H3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new tm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ck ckVar = cnVar.C1;
                if (ckVar != null) {
                    if (!cnVar.kb && ckVar.a() && cnVar.I3 == null) {
                        z9 = true;
                    }
                    ckVar.g(z9);
                }
            }
            cnVar.I3 = cnVar.H3;
            cnVar.g7(true);
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            org.telegram.messenger.oa.a(i10).c(cnVar.I3);
            cnVar.H1.f.O(true);
            View currentView = cnVar.E1.getCurrentView();
            if (cnVar.c4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                org.telegram.messenger.oa.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(i11);
                a10.b.a();
                a10.c.a();
            }
            if (currentView instanceof en) {
                ((en) currentView).a.qd(cnVar.I3);
            }
            cnVar.od();
            cnVar.r2.e(true, true);
            cnVar.rc(true);
            z9 = true;
        }
        pj pjVar3 = cnVar.D1;
        if (pjVar3 != null) {
            pjVar3.b(z9);
        }
        org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
        String str2 = cnVar.H3;
        long j3 = cnVar.j6;
        long j10 = cnVar.b7;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        mediaDataController.X1(str2, j3, j10, i7, 0, cnVar.r4, false, cnVar.C3, cnVar.D3, true, cnVar.E3);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        cn cnVar = this.b;
        te.a aVar = cnVar.gd;
        if (cnVar.I3 == null) {
            cnVar.rc(false);
        }
        cnVar.b8();
        if (cnVar.B3) {
            cnVar.W1.getAdapter().U("@" + editText.getText().toString(), 0, cnVar.K6, true, true);
        } else if (cnVar.C3 == null && cnVar.D3 == null && cnVar.h3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.id.M0(2131745766, null))) {
            cnVar.h3.callOnClick();
        }
        if (cnVar.I3 != null) {
            boolean z9 = editText.length() == 0;
            if (z9 != aVar.f) {
                if (z9) {
                    cnVar.c8();
                }
                aVar.a(z9, true);
                fi.g1 g1Var = cnVar.E1;
                if (g1Var != null) {
                    g1Var.E(0);
                }
                if (z9) {
                    cnVar.rc(true);
                }
                cnVar.Oc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final boolean m() {
        return this.b.I3 == null;
    }
}
