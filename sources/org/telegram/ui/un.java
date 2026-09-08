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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class un extends org.telegram.ui.ActionBar.g5 {
    public float f;
    public final /* synthetic */ co h;

    public un(co coVar) {
        this.h = coVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        co coVar = this.h;
        if (!coVar.Ac.f) {
            if (coVar.u3 != null && coVar.p1 != null) {
                View currentView = coVar.q1.getCurrentView();
                co coVar2 = currentView instanceof fo ? ((fo) currentView).a : coVar;
                if (!coVar2.yc.f) {
                    coVar2.Lb(true);
                    return false;
                }
                int currentPosition = coVar.p1.a.getCurrentPosition();
                int i10 = coVar.r1;
                if (currentPosition != i10) {
                    coVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (coVar.yc.f) {
                coVar.Lb(false);
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
        co coVar = this.h;
        coVar.L7();
        if (coVar.o3 != null || coVar.p3 != null) {
            ImageView imageView = coVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (coVar.n3) {
            coVar.I1.getAdapter().U(null, 0, null, false, true);
            coVar.n3 = false;
            coVar.j0.H("", true);
        }
        coVar.j0.setSearchFieldHint(LocaleController.getString(coVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        coVar.S2.setVisibility(0);
        ImageView imageView2 = coVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        coVar.o3 = null;
        coVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        co coVar = this.h;
        coVar.s3 = false;
        coVar.vc();
        coVar.Ic();
        ImageView imageView = coVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = coVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (coVar.n3) {
            coVar.I1.getAdapter().U(null, 0, null, false, true);
            coVar.n3 = false;
        }
        coVar.I1.setReversed(false);
        coVar.I1.getAdapter().k0 = false;
        coVar.m7();
        coVar.o3 = null;
        coVar.p3 = null;
        coVar.u3 = null;
        coVar.j0.setSearchFieldHint(LocaleController.getString(coVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        coVar.j0.setSearchFieldCaption(null);
        coVar.zc.a(false, true);
        coVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.y yVar = coVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = coVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = coVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                co.J3(coVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = coVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            hs hsVar = coVar.d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = coVar.m0;
            if (v0Var2 != null && coVar.K9) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = coVar.n0;
            if (yVar4 != null && coVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = coVar.k0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
            }
        } else if (coVar.Y.k0() && TextUtils.isEmpty(coVar.Y.getSlowModeTimer()) && ((chat = coVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var4 = coVar.h0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = coVar.i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = coVar.e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            hs hsVar2 = coVar.d0;
            if (hsVar2 != null) {
                hsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = coVar.m0;
            if (v0Var5 != null && coVar.K9) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = coVar.n0;
            if (yVar7 != null && coVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = coVar.k0;
            if (v0Var6 != null) {
                v0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var7 = coVar.h0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = coVar.n0;
            if (yVar8 != null && coVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var8 = coVar.k0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = coVar.m0;
            if (v0Var9 != null && coVar.K9) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = coVar.i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = coVar.e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            hs hsVar3 = coVar.d0;
            if (hsVar3 != null) {
                hsVar3.b(false);
            }
        }
        if (coVar.q1 != null) {
            if (coVar.p1.a.getCurrentPosition() != 0) {
                coVar.p1.a.d(0, 0);
                coVar.s1 = true;
            } else {
                coVar.q1.h.clear();
            }
        }
        int i12 = coVar.R3;
        if (i12 == 3 || i12 == 8 || ((coVar.d4 == 0 && !UserObject.isReplyUser(coVar.f)) || ((messageObject = coVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            coVar.j0.setVisibility(8);
        }
        coVar.o0 = false;
        coVar.getMediaDataController().clearFoundMessageObjects();
        if (coVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        hg.o1 o1Var = coVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        coVar.Ia();
        coVar.hc(false);
        coVar.yc(0, true);
        coVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new tn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        coVar.yc.a(false, true);
        coVar.Hc();
        coVar.q3 = null;
        coVar.Ic();
        coVar.vc();
        yk ykVar = coVar.o1;
        if (ykVar != null) {
            ykVar.d.M(new lr(2));
            ykVar.h = 0L;
            coVar.o1.g(false);
        }
        kk kkVar = coVar.p1;
        if (kkVar != null) {
            kkVar.b(false);
        }
        coVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        kk kkVar;
        int i10;
        co coVar = this.h;
        coVar.s3 = true;
        coVar.vc();
        coVar.Ic();
        if (((coVar.d4 != 0 && coVar.R3 != 3) || UserObject.isReplyUser(coVar.f)) && !coVar.dc) {
            coVar.la(null);
        }
        if (coVar.W4) {
            coVar.saveKeyboardPositionBeforeTransition();
            if (!coVar.Oa) {
                Activity parentActivity = coVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new dj(this, 9), 500L);
            ij ijVar = coVar.g2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var = coVar.i2;
            if (i40Var != null) {
                i40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new tn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        yk ykVar = coVar.o1;
        if (ykVar != null) {
            ykVar.g(!coVar.Oa && ykVar.a() && coVar.u3 == null);
        }
        if (coVar.u3 == null || (kkVar = coVar.p1) == null) {
            return;
        }
        int currentPosition = kkVar.a.getCurrentPosition();
        int i11 = coVar.r1;
        if (currentPosition != i11) {
            coVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void o(hg.q0 q0Var) {
        co coVar = this.h;
        yk ykVar = coVar.o1;
        if (ykVar != null) {
            ykVar.d.M(new lr(2));
            ykVar.h = 0L;
        }
        coVar.q3 = null;
        coVar.Ic();
        coVar.vc();
        coVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(di.h2 h2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        co coVar = this.h;
        boolean z10 = false;
        coVar.Fc(0, 0, -1);
        String obj = h2Var != null ? h2Var.getText().toString() : coVar.t3;
        coVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(coVar.t3.startsWith("$") || coVar.t3.startsWith("#"))) {
            coVar.u3 = null;
            kk kkVar = coVar.p1;
            if (kkVar != null) {
                kkVar.b(false);
                coVar.Hc();
            }
            kk kkVar2 = coVar.p1;
            if (kkVar2 != null && kkVar2.a.getCurrentPosition() != 0) {
                coVar.p1.a.d(0, 0);
            }
        } else {
            coVar.M7();
            if (coVar.t3.contains("@")) {
                String str = coVar.t3;
                f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                coVar.presentFragment(new org.telegram.ui.Components.b40(str, f6Var));
                return;
            }
            if (coVar.u3 == null) {
                coVar.u3 = coVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new tn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                yk ykVar = coVar.o1;
                if (ykVar != null) {
                    if (!coVar.Oa && ykVar.a() && coVar.u3 == null) {
                        z10 = true;
                    }
                    ykVar.g(z10);
                }
            }
            coVar.u3 = coVar.t3;
            coVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(coVar.u3);
            coVar.t1.f.N(true);
            View currentView = coVar.q1.getCurrentView();
            if (coVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof fo) {
                ((fo) currentView).a.Jc(coVar.u3);
            }
            coVar.Hc();
            coVar.d2.e(true, true);
            coVar.Lb(true);
            z10 = true;
        }
        kk kkVar3 = coVar.p1;
        if (kkVar3 != null) {
            kkVar3.b(z10);
        }
        MediaDataController mediaDataController = coVar.getMediaDataController();
        String str2 = coVar.t3;
        long j3 = coVar.T5;
        long j10 = coVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, coVar.d4, coVar.o3, coVar.p3, coVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        co coVar = this.h;
        le.b bVar = coVar.Ac;
        if (coVar.u3 == null) {
            coVar.Lb(false);
        }
        coVar.L7();
        if (coVar.n3) {
            coVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, coVar.u6, true, true);
        } else if (coVar.o3 == null && coVar.p3 == null && coVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            coVar.T2.callOnClick();
        }
        if (coVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    coVar.M7();
                }
                bVar.a(z10, true);
                di.i1 i1Var = coVar.q1;
                if (i1Var != null) {
                    i1Var.D(0);
                }
                if (z10) {
                    coVar.Lb(true);
                }
                coVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
