package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class tm extends org.telegram.ui.ActionBar.m0 {
    public float a;
    public final /* synthetic */ bn b;

    public tm(bn bnVar) {
        this.b = bnVar;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean a() {
        return this.b.J3 == null;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean b() {
        bn bnVar = this.b;
        if (!bnVar.id.f) {
            if (bnVar.J3 != null && bnVar.E1 != null) {
                View currentView = bnVar.F1.getCurrentView();
                bn bnVar2 = currentView instanceof dn ? ((dn) currentView).a : bnVar;
                if (!bnVar2.gd.f) {
                    bnVar2.sc(true);
                    return false;
                }
                int currentPosition = bnVar.E1.a.getCurrentPosition();
                int i7 = bnVar.G1;
                if (currentPosition != i7) {
                    bnVar.E1.a.e(i7, i7);
                    return false;
                }
            } else if (bnVar.gd.f) {
                bnVar.sc(false);
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
        bn bnVar = this.b;
        bnVar.c8();
        if (bnVar.D3 != null || bnVar.E3 != null) {
            ImageView imageView = bnVar.i3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U(null, 0, null, false, true);
            bnVar.C3 = false;
            bnVar.k0.Q("", true);
        }
        bnVar.k0.setSearchFieldHint(org.telegram.messenger.hd.N0(bnVar.ea() ? 2131745672 : 2131745640, null));
        bnVar.h3.setVisibility(0);
        ImageView imageView2 = bnVar.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        bnVar.D3 = null;
        bnVar.E3 = null;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        int i7;
        int i10;
        org.telegram.messenger.gj gjVar;
        TLRPC.Chat chat;
        bn bnVar = this.b;
        bnVar.H3 = false;
        bnVar.dd();
        bnVar.qd();
        ImageView imageView = bnVar.h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = bnVar.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U(null, 0, null, false, true);
            bnVar.C3 = false;
        }
        bnVar.X1.setReversed(false);
        bnVar.X1.getAdapter().l0 = false;
        bnVar.B7();
        bnVar.D3 = null;
        bnVar.E3 = null;
        bnVar.J3 = null;
        bnVar.k0.setSearchFieldHint(org.telegram.messenger.hd.N0(bnVar.ea() ? 2131745672 : 2131745640, null));
        bnVar.k0.setSearchFieldCaption(null);
        bnVar.hd.a(false, true);
        bnVar.id.a(false, true);
        if (bnVar.a0.I0() && TextUtils.isEmpty(bnVar.a0.getSlowModeTimer()) && (((chat = bnVar.e) == null || org.telegram.messenger.v3.q(chat)) && !bnVar.ca())) {
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = bnVar.g0;
            if (xVar != null) {
                xVar.e(0);
            }
            fr frVar = bnVar.f0;
            if (frVar != null) {
                frVar.b(true);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = bnVar.p0;
            if (q0Var2 != null && bnVar.ha) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = bnVar.q0;
            if (xVar2 != null && bnVar.ia) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = bnVar.l0;
            if (q0Var3 != null) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = bnVar.m0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.q0 q0Var5 = bnVar.j0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = bnVar.q0;
            if (xVar3 != null && bnVar.ia) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var6 = bnVar.l0;
            if (q0Var6 != null) {
                q0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var7 = bnVar.p0;
            if (q0Var7 != null && bnVar.ha) {
                q0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = bnVar.g0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            fr frVar2 = bnVar.f0;
            if (frVar2 != null) {
                frVar2.b(false);
            }
        }
        if (bnVar.F1 != null) {
            if (bnVar.E1.a.getCurrentPosition() != 0) {
                bnVar.E1.a.e(0, 0);
                bnVar.H1 = true;
            } else {
                bnVar.F1.h.clear();
            }
        }
        int i11 = bnVar.g4;
        if (i11 == 3 || i11 == 8 || ((bnVar.s4 == 0 && !org.telegram.messenger.p10.A(bnVar.f)) || ((gjVar = bnVar.m4) != null && gjVar.M1() < 10))) {
            bnVar.k0.setVisibility(8);
        }
        bnVar.r0 = false;
        bnVar.Dd();
        org.telegram.messenger.si mediaDataController = bnVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        mediaDataController.b1.clear();
        if (bnVar.d4 == 3) {
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.na.a(i10).b(3).a();
        } else {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(i7);
            a10.b.a();
            a10.c.a();
        }
        jg.l1 l1Var = bnVar.b4;
        if (l1Var != null) {
            l1Var.f();
        }
        bnVar.lb();
        bnVar.Pc(false);
        bnVar.gd(0, true);
        bnVar.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new sm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        bnVar.gd.a(false, true);
        bnVar.pd();
        bnVar.F3 = null;
        bnVar.qd();
        bnVar.dd();
        bk bkVar = bnVar.D1;
        if (bkVar != null) {
            bkVar.d.M(new hq(2));
            bkVar.h = 0L;
            bnVar.D1.g(false);
        }
        oj ojVar = bnVar.E1;
        if (ojVar != null) {
            ojVar.b(false);
        }
        bnVar.Qb(false);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        oj ojVar;
        int i7;
        bn bnVar = this.b;
        bnVar.H3 = true;
        bnVar.dd();
        bnVar.qd();
        if (((bnVar.s4 != 0 && bnVar.g4 != 3) || org.telegram.messenger.p10.A(bnVar.f)) && !bnVar.Kc) {
            bnVar.Oa(null);
        }
        if (bnVar.k5) {
            bnVar.saveKeyboardPositionBeforeTransition();
            if (!bnVar.mb) {
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                org.telegram.messenger.g0.Z2(parentActivity, i7);
            }
            org.telegram.messenger.g0.h3(new bh(this, 10), 500L);
            hi.l3 l3Var = bnVar.v2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            hi.l3 l3Var2 = bnVar.x2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new sm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        bk bkVar = bnVar.D1;
        if (bkVar != null) {
            bkVar.g(!bnVar.mb && bkVar.a() && bnVar.J3 == null);
        }
        if (bnVar.J3 == null || (ojVar = bnVar.E1) == null) {
            return;
        }
        int currentPosition = ojVar.a.getCurrentPosition();
        int i10 = bnVar.G1;
        if (currentPosition != i10) {
            bnVar.E1.a.e(i10, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void j(jg.o0 o0Var) {
        bn bnVar = this.b;
        bk bkVar = bnVar.D1;
        if (bkVar != null) {
            bkVar.d.M(new hq(2));
            bkVar.h = 0L;
        }
        bnVar.F3 = null;
        bnVar.qd();
        bnVar.dd();
        bnVar.Qb(false);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var;
        bn bnVar = this.b;
        boolean z10 = false;
        bnVar.nd(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : bnVar.I3;
        bnVar.I3 = obj;
        if (TextUtils.isEmpty(obj) || !(bnVar.I3.startsWith("$") || bnVar.I3.startsWith("#"))) {
            bnVar.J3 = null;
            oj ojVar = bnVar.E1;
            if (ojVar != null) {
                ojVar.b(false);
                bnVar.pd();
            }
            oj ojVar2 = bnVar.E1;
            if (ojVar2 != null && ojVar2.a.getCurrentPosition() != 0) {
                bnVar.E1.a.e(0, 0);
            }
        } else {
            bnVar.d8();
            if (bnVar.I3.contains("@")) {
                String str = bnVar.I3;
                h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                bnVar.presentFragment(new org.telegram.ui.Components.f30(str, h6Var));
                return;
            }
            if (bnVar.J3 == null) {
                bnVar.J3 = bnVar.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new sm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                bk bkVar = bnVar.D1;
                if (bkVar != null) {
                    if (!bnVar.mb && bkVar.a() && bnVar.J3 == null) {
                        z10 = true;
                    }
                    bkVar.g(z10);
                }
            }
            bnVar.J3 = bnVar.I3;
            bnVar.g7(true);
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.na.a(i10).c(bnVar.J3);
            bnVar.I1.f.O(true);
            View currentView = bnVar.F1.getCurrentView();
            if (bnVar.d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.na.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.na a10 = org.telegram.messenger.na.a(i11);
                a10.b.a();
                a10.c.a();
            }
            if (currentView instanceof dn) {
                ((dn) currentView).a.rd(bnVar.J3);
            }
            bnVar.pd();
            bnVar.s2.e(true, true);
            bnVar.sc(true);
            z10 = true;
        }
        oj ojVar3 = bnVar.E1;
        if (ojVar3 != null) {
            ojVar3.b(z10);
        }
        org.telegram.messenger.si mediaDataController = bnVar.getMediaDataController();
        String str2 = bnVar.I3;
        long j3 = bnVar.l6;
        long j10 = bnVar.d7;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        mediaDataController.c2(str2, j3, j10, i7, 0, bnVar.s4, false, bnVar.D3, bnVar.E3, true, bnVar.F3);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        bn bnVar = this.b;
        te.a aVar = bnVar.id;
        if (bnVar.J3 == null) {
            bnVar.sc(false);
        }
        bnVar.c8();
        if (bnVar.C3) {
            bnVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, bnVar.M6, true, true);
        } else if (bnVar.D3 == null && bnVar.E3 == null && bnVar.i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.hd.N0(2131745570, null))) {
            bnVar.i3.callOnClick();
        }
        if (bnVar.J3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != aVar.f) {
                if (z10) {
                    bnVar.d8();
                }
                aVar.a(z10, true);
                hi.i1 i1Var = bnVar.F1;
                if (i1Var != null) {
                    i1Var.A(0);
                }
                if (z10) {
                    bnVar.sc(true);
                }
                bnVar.Pc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean m() {
        return this.b.J3 == null;
    }
}
