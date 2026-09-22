package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tn extends org.telegram.ui.ActionBar.g5 {
    public float f;
    public final /* synthetic */ bo h;

    public tn(bo boVar) {
        this.h = boVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        bo boVar = this.h;
        if (!boVar.zc.f) {
            if (boVar.u3 != null && boVar.p1 != null) {
                View currentView = boVar.q1.getCurrentView();
                bo boVar2 = currentView instanceof eo ? ((eo) currentView).a : boVar;
                if (!boVar2.xc.f) {
                    boVar2.Lb(true);
                    return false;
                }
                int currentPosition = boVar.p1.a.getCurrentPosition();
                int i10 = boVar.r1;
                if (currentPosition != i10) {
                    boVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (boVar.xc.f) {
                boVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean f() {
        return this.h.n3;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void k() {
        bo boVar = this.h;
        boVar.L7();
        if (boVar.o3 != null || boVar.p3 != null) {
            ImageView imageView = boVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (boVar.n3) {
            boVar.I1.getAdapter().U(null, 0, null, false, true);
            boVar.n3 = false;
            boVar.j0.H("", true);
        }
        boVar.j0.setSearchFieldHint(LocaleController.getString(boVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        boVar.S2.setVisibility(0);
        ImageView imageView2 = boVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        boVar.o3 = null;
        boVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        bo boVar = this.h;
        boVar.s3 = false;
        boVar.vc();
        boVar.Ic();
        ImageView imageView = boVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = boVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (boVar.n3) {
            boVar.I1.getAdapter().U(null, 0, null, false, true);
            boVar.n3 = false;
        }
        boVar.I1.setReversed(false);
        boVar.I1.getAdapter().k0 = false;
        boVar.m7();
        boVar.o3 = null;
        boVar.p3 = null;
        boVar.u3 = null;
        boVar.j0.setSearchFieldHint(LocaleController.getString(boVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        boVar.j0.setSearchFieldCaption(null);
        boVar.yc.a(false, true);
        boVar.zc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = boVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = boVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = boVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                bo.J3(boVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = boVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            hs hsVar = boVar.d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = boVar.m0;
            if (v0Var2 != null && boVar.K9) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = boVar.n0;
            if (yVar4 != null && boVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = boVar.k0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
            }
        } else if (boVar.Y.l0() && TextUtils.isEmpty(boVar.Y.getSlowModeTimer()) && ((chat = boVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var4 = boVar.h0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = boVar.i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = boVar.e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            hs hsVar2 = boVar.d0;
            if (hsVar2 != null) {
                hsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = boVar.m0;
            if (v0Var5 != null && boVar.K9) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = boVar.n0;
            if (yVar7 != null && boVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = boVar.k0;
            if (v0Var6 != null) {
                v0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var7 = boVar.h0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = boVar.n0;
            if (yVar8 != null && boVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var8 = boVar.k0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = boVar.m0;
            if (v0Var9 != null && boVar.K9) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = boVar.i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = boVar.e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            hs hsVar3 = boVar.d0;
            if (hsVar3 != null) {
                hsVar3.b(false);
            }
        }
        if (boVar.q1 != null) {
            if (boVar.p1.a.getCurrentPosition() != 0) {
                boVar.p1.a.d(0, 0);
                boVar.s1 = true;
            } else {
                boVar.q1.h.clear();
            }
        }
        int i12 = boVar.R3;
        if (i12 == 3 || i12 == 8 || ((boVar.d4 == 0 && !UserObject.isReplyUser(boVar.f)) || ((messageObject = boVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            boVar.j0.setVisibility(8);
        }
        boVar.o0 = false;
        boVar.getMediaDataController().clearFoundMessageObjects();
        if (boVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        gg.o1 o1Var = boVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        boVar.Ia();
        boVar.hc(false);
        boVar.yc(0, true);
        boVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new sn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        boVar.xc.a(false, true);
        boVar.Hc();
        boVar.q3 = null;
        boVar.Ic();
        boVar.vc();
        yk ykVar = boVar.o1;
        if (ykVar != null) {
            ykVar.d.M(new kr(2));
            ykVar.h = 0L;
            boVar.o1.g(false);
        }
        kk kkVar = boVar.p1;
        if (kkVar != null) {
            kkVar.b(false);
        }
        boVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        kk kkVar;
        int i10;
        bo boVar = this.h;
        boVar.s3 = true;
        boVar.vc();
        boVar.Ic();
        if (((boVar.d4 != 0 && boVar.R3 != 3) || UserObject.isReplyUser(boVar.f)) && !boVar.cc) {
            boVar.la(null);
        }
        if (boVar.W4) {
            boVar.saveKeyboardPositionBeforeTransition();
            if (!boVar.Oa) {
                Activity parentActivity = boVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new dj(this, 9), 500L);
            ij ijVar = boVar.g2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var = boVar.i2;
            if (i40Var != null) {
                i40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new sn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        yk ykVar = boVar.o1;
        if (ykVar != null) {
            ykVar.g(!boVar.Oa && ykVar.a() && boVar.u3 == null);
        }
        if (boVar.u3 == null || (kkVar = boVar.p1) == null) {
            return;
        }
        int currentPosition = kkVar.a.getCurrentPosition();
        int i11 = boVar.r1;
        if (currentPosition != i11) {
            boVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void o(gg.q0 q0Var) {
        bo boVar = this.h;
        yk ykVar = boVar.o1;
        if (ykVar != null) {
            ykVar.d.M(new kr(2));
            ykVar.h = 0L;
        }
        boVar.q3 = null;
        boVar.Ic();
        boVar.vc();
        boVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.h2 h2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var;
        bo boVar = this.h;
        boolean z10 = false;
        boVar.Fc(0, 0, -1);
        String obj = h2Var != null ? h2Var.getText().toString() : boVar.t3;
        boVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(boVar.t3.startsWith("$") || boVar.t3.startsWith("#"))) {
            boVar.u3 = null;
            kk kkVar = boVar.p1;
            if (kkVar != null) {
                kkVar.b(false);
                boVar.Hc();
            }
            kk kkVar2 = boVar.p1;
            if (kkVar2 != null && kkVar2.a.getCurrentPosition() != 0) {
                boVar.p1.a.d(0, 0);
            }
        } else {
            boVar.M7();
            if (boVar.t3.contains("@")) {
                String str = boVar.t3;
                e6Var = ((org.telegram.ui.ActionBar.n2) boVar).resourceProvider;
                boVar.presentFragment(new org.telegram.ui.Components.b40(str, e6Var));
                return;
            }
            if (boVar.u3 == null) {
                boVar.u3 = boVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new sn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                yk ykVar = boVar.o1;
                if (ykVar != null) {
                    if (!boVar.Oa && ykVar.a() && boVar.u3 == null) {
                        z10 = true;
                    }
                    ykVar.g(z10);
                }
            }
            boVar.u3 = boVar.t3;
            boVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(boVar.u3);
            boVar.t1.f.N(true);
            View currentView = boVar.q1.getCurrentView();
            if (boVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof eo) {
                ((eo) currentView).a.Jc(boVar.u3);
            }
            boVar.Hc();
            boVar.d2.e(true, true);
            boVar.Lb(true);
            z10 = true;
        }
        kk kkVar3 = boVar.p1;
        if (kkVar3 != null) {
            kkVar3.b(z10);
        }
        MediaDataController mediaDataController = boVar.getMediaDataController();
        String str2 = boVar.t3;
        long j3 = boVar.T5;
        long j10 = boVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, boVar.d4, boVar.o3, boVar.p3, boVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        bo boVar = this.h;
        le.b bVar = boVar.zc;
        if (boVar.u3 == null) {
            boVar.Lb(false);
        }
        boVar.L7();
        if (boVar.n3) {
            boVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, boVar.u6, true, true);
        } else if (boVar.o3 == null && boVar.p3 == null && boVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            boVar.T2.callOnClick();
        }
        if (boVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    boVar.M7();
                }
                bVar.a(z10, true);
                ci.i1 i1Var = boVar.q1;
                if (i1Var != null) {
                    i1Var.D(0);
                }
                if (z10) {
                    boVar.Lb(true);
                }
                boVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
