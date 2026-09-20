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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.ActionBar.g5 {
    public float f;
    public final /* synthetic */ zn h;

    public rn(zn znVar) {
        this.h = znVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        zn znVar = this.h;
        if (!znVar.zc.f) {
            if (znVar.u3 != null && znVar.p1 != null) {
                View currentView = znVar.q1.getCurrentView();
                zn znVar2 = currentView instanceof bo ? ((bo) currentView).a : znVar;
                if (!znVar2.xc.f) {
                    znVar2.Lb(true);
                    return false;
                }
                int currentPosition = znVar.p1.a.getCurrentPosition();
                int i10 = znVar.r1;
                if (currentPosition != i10) {
                    znVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (znVar.xc.f) {
                znVar.Lb(false);
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
        zn znVar = this.h;
        znVar.L7();
        if (znVar.o3 != null || znVar.p3 != null) {
            ImageView imageView = znVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (znVar.n3) {
            znVar.I1.getAdapter().U(null, 0, null, false, true);
            znVar.n3 = false;
            znVar.j0.H("", true);
        }
        znVar.j0.setSearchFieldHint(LocaleController.getString(znVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        znVar.S2.setVisibility(0);
        ImageView imageView2 = znVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        znVar.o3 = null;
        znVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        zn znVar = this.h;
        znVar.s3 = false;
        znVar.vc();
        znVar.Ic();
        ImageView imageView = znVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = znVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (znVar.n3) {
            znVar.I1.getAdapter().U(null, 0, null, false, true);
            znVar.n3 = false;
        }
        znVar.I1.setReversed(false);
        znVar.I1.getAdapter().k0 = false;
        znVar.m7();
        znVar.o3 = null;
        znVar.p3 = null;
        znVar.u3 = null;
        znVar.j0.setSearchFieldHint(LocaleController.getString(znVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        znVar.j0.setSearchFieldCaption(null);
        znVar.yc.a(false, true);
        znVar.zc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = znVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                zn.J3(znVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            hs hsVar = znVar.d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = znVar.m0;
            if (v0Var2 != null && znVar.K9) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = znVar.n0;
            if (yVar4 != null && znVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = znVar.k0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
            }
        } else if (znVar.Y.k0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer()) && ((chat = znVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var4 = znVar.h0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = znVar.i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = znVar.e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            hs hsVar2 = znVar.d0;
            if (hsVar2 != null) {
                hsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = znVar.m0;
            if (v0Var5 != null && znVar.K9) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = znVar.n0;
            if (yVar7 != null && znVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = znVar.k0;
            if (v0Var6 != null) {
                v0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var7 = znVar.h0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = znVar.n0;
            if (yVar8 != null && znVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var8 = znVar.k0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = znVar.m0;
            if (v0Var9 != null && znVar.K9) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = znVar.i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = znVar.e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            hs hsVar3 = znVar.d0;
            if (hsVar3 != null) {
                hsVar3.b(false);
            }
        }
        if (znVar.q1 != null) {
            if (znVar.p1.a.getCurrentPosition() != 0) {
                znVar.p1.a.d(0, 0);
                znVar.s1 = true;
            } else {
                znVar.q1.h.clear();
            }
        }
        int i12 = znVar.R3;
        if (i12 == 3 || i12 == 8 || ((znVar.d4 == 0 && !UserObject.isReplyUser(znVar.f)) || ((messageObject = znVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            znVar.j0.setVisibility(8);
        }
        znVar.o0 = false;
        znVar.getMediaDataController().clearFoundMessageObjects();
        if (znVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        gg.o1 o1Var = znVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        znVar.Ia();
        znVar.hc(false);
        znVar.yc(0, true);
        znVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new qn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        znVar.xc.a(false, true);
        znVar.Hc();
        znVar.q3 = null;
        znVar.Ic();
        znVar.vc();
        xk xkVar = znVar.o1;
        if (xkVar != null) {
            xkVar.d.N(new ir(2));
            xkVar.h = 0L;
            znVar.o1.g(false);
        }
        jk jkVar = znVar.p1;
        if (jkVar != null) {
            jkVar.b(false);
        }
        znVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        jk jkVar;
        int i10;
        zn znVar = this.h;
        znVar.s3 = true;
        znVar.vc();
        znVar.Ic();
        if (((znVar.d4 != 0 && znVar.R3 != 3) || UserObject.isReplyUser(znVar.f)) && !znVar.cc) {
            znVar.la(null);
        }
        if (znVar.W4) {
            znVar.saveKeyboardPositionBeforeTransition();
            if (!znVar.Oa) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new cj(this, 9), 500L);
            hj hjVar = znVar.g2;
            if (hjVar != null) {
                hjVar.b(true);
            }
            org.telegram.ui.Components.i40 i40Var = znVar.i2;
            if (i40Var != null) {
                i40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new qn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xk xkVar = znVar.o1;
        if (xkVar != null) {
            xkVar.g(!znVar.Oa && xkVar.a() && znVar.u3 == null);
        }
        if (znVar.u3 == null || (jkVar = znVar.p1) == null) {
            return;
        }
        int currentPosition = jkVar.a.getCurrentPosition();
        int i11 = znVar.r1;
        if (currentPosition != i11) {
            znVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void o(gg.q0 q0Var) {
        zn znVar = this.h;
        xk xkVar = znVar.o1;
        if (xkVar != null) {
            xkVar.d.N(new ir(2));
            xkVar.h = 0L;
        }
        znVar.q3 = null;
        znVar.Ic();
        znVar.vc();
        znVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.h2 h2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        zn znVar = this.h;
        boolean z10 = false;
        znVar.Fc(0, 0, -1);
        String obj = h2Var != null ? h2Var.getText().toString() : znVar.t3;
        znVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(znVar.t3.startsWith("$") || znVar.t3.startsWith("#"))) {
            znVar.u3 = null;
            jk jkVar = znVar.p1;
            if (jkVar != null) {
                jkVar.b(false);
                znVar.Hc();
            }
            jk jkVar2 = znVar.p1;
            if (jkVar2 != null && jkVar2.a.getCurrentPosition() != 0) {
                znVar.p1.a.d(0, 0);
            }
        } else {
            znVar.M7();
            if (znVar.t3.contains("@")) {
                String str = znVar.t3;
                f6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                znVar.presentFragment(new org.telegram.ui.Components.b40(str, f6Var));
                return;
            }
            if (znVar.u3 == null) {
                znVar.u3 = znVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new qn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                xk xkVar = znVar.o1;
                if (xkVar != null) {
                    if (!znVar.Oa && xkVar.a() && znVar.u3 == null) {
                        z10 = true;
                    }
                    xkVar.g(z10);
                }
            }
            znVar.u3 = znVar.t3;
            znVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(znVar.u3);
            znVar.t1.f.N(true);
            View currentView = znVar.q1.getCurrentView();
            if (znVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof bo) {
                ((bo) currentView).a.Jc(znVar.u3);
            }
            znVar.Hc();
            znVar.d2.e(true, true);
            znVar.Lb(true);
            z10 = true;
        }
        jk jkVar3 = znVar.p1;
        if (jkVar3 != null) {
            jkVar3.b(z10);
        }
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str2 = znVar.t3;
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, znVar.d4, znVar.o3, znVar.p3, znVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        zn znVar = this.h;
        le.b bVar = znVar.zc;
        if (znVar.u3 == null) {
            znVar.Lb(false);
        }
        znVar.L7();
        if (znVar.n3) {
            znVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, znVar.u6, true, true);
        } else if (znVar.o3 == null && znVar.p3 == null && znVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            znVar.T2.callOnClick();
        }
        if (znVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    znVar.M7();
                }
                bVar.a(z10, true);
                ci.i1 i1Var = znVar.q1;
                if (i1Var != null) {
                    i1Var.E(0);
                }
                if (z10) {
                    znVar.Lb(true);
                }
                znVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
