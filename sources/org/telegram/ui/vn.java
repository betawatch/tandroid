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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vn extends org.telegram.ui.ActionBar.i5 {
    public float f;
    public final /* synthetic */ eo h;

    public vn(eo eoVar) {
        this.h = eoVar;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean b() {
        eo eoVar = this.h;
        if (!eoVar.Ac.f) {
            if (eoVar.u3 != null && eoVar.p1 != null) {
                View currentView = eoVar.q1.getCurrentView();
                eo eoVar2 = currentView instanceof go ? ((go) currentView).a : eoVar;
                if (!eoVar2.yc.f) {
                    eoVar2.Lb(true);
                    return false;
                }
                int currentPosition = eoVar.p1.a.getCurrentPosition();
                int i10 = eoVar.r1;
                if (currentPosition != i10) {
                    eoVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (eoVar.yc.f) {
                eoVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean f() {
        return this.h.n3;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void k() {
        eo eoVar = this.h;
        eoVar.L7();
        if (eoVar.o3 != null || eoVar.p3 != null) {
            ImageView imageView = eoVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (eoVar.n3) {
            eoVar.I1.getAdapter().U(null, 0, null, false, true);
            eoVar.n3 = false;
            eoVar.j0.H("", true);
        }
        eoVar.j0.setSearchFieldHint(LocaleController.getString(eoVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        eoVar.S2.setVisibility(0);
        ImageView imageView2 = eoVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        eoVar.o3 = null;
        eoVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        eo eoVar = this.h;
        eoVar.s3 = false;
        eoVar.vc();
        eoVar.Ic();
        ImageView imageView = eoVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = eoVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (eoVar.n3) {
            eoVar.I1.getAdapter().U(null, 0, null, false, true);
            eoVar.n3 = false;
        }
        eoVar.I1.setReversed(false);
        eoVar.I1.getAdapter().k0 = false;
        eoVar.m7();
        eoVar.o3 = null;
        eoVar.p3 = null;
        eoVar.u3 = null;
        eoVar.j0.setSearchFieldHint(LocaleController.getString(eoVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        eoVar.j0.setSearchFieldCaption(null);
        eoVar.zc.a(false, true);
        eoVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.y yVar = eoVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = eoVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = eoVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                eo.J3(eoVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = eoVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            is isVar = eoVar.d0;
            if (isVar != null) {
                isVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = eoVar.m0;
            if (w0Var2 != null && eoVar.K9) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = eoVar.n0;
            if (yVar4 != null && eoVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = eoVar.k0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (eoVar.Y.k0() && TextUtils.isEmpty(eoVar.Y.getSlowModeTimer()) && ((chat = eoVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = eoVar.h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = eoVar.i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = eoVar.e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            is isVar2 = eoVar.d0;
            if (isVar2 != null) {
                isVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = eoVar.m0;
            if (w0Var5 != null && eoVar.K9) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = eoVar.n0;
            if (yVar7 != null && eoVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = eoVar.k0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = eoVar.h0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = eoVar.n0;
            if (yVar8 != null && eoVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = eoVar.k0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = eoVar.m0;
            if (w0Var9 != null && eoVar.K9) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = eoVar.i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = eoVar.e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            is isVar3 = eoVar.d0;
            if (isVar3 != null) {
                isVar3.b(false);
            }
        }
        if (eoVar.q1 != null) {
            if (eoVar.p1.a.getCurrentPosition() != 0) {
                eoVar.p1.a.d(0, 0);
                eoVar.s1 = true;
            } else {
                eoVar.q1.h.clear();
            }
        }
        int i12 = eoVar.R3;
        if (i12 == 3 || i12 == 8 || ((eoVar.d4 == 0 && !UserObject.isReplyUser(eoVar.f)) || ((messageObject = eoVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            eoVar.j0.setVisibility(8);
        }
        eoVar.o0 = false;
        eoVar.getMediaDataController().clearFoundMessageObjects();
        if (eoVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        fg.p1 p1Var = eoVar.M3;
        if (p1Var != null) {
            p1Var.l();
        }
        eoVar.Ia();
        eoVar.hc(false);
        eoVar.yc(0, true);
        eoVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new un(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        eoVar.yc.a(false, true);
        eoVar.Hc();
        eoVar.q3 = null;
        eoVar.Ic();
        eoVar.vc();
        al alVar = eoVar.o1;
        if (alVar != null) {
            alVar.d.M(new mr(2));
            alVar.h = 0L;
            eoVar.o1.g(false);
        }
        mk mkVar = eoVar.p1;
        if (mkVar != null) {
            mkVar.b(false);
        }
        eoVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        mk mkVar;
        int i10;
        eo eoVar = this.h;
        eoVar.s3 = true;
        eoVar.vc();
        eoVar.Ic();
        if (((eoVar.d4 != 0 && eoVar.R3 != 3) || UserObject.isReplyUser(eoVar.f)) && !eoVar.dc) {
            eoVar.la(null);
        }
        if (eoVar.W4) {
            eoVar.saveKeyboardPositionBeforeTransition();
            if (!eoVar.Oa) {
                Activity parentActivity = eoVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new fj(this, 9), 500L);
            kj kjVar = eoVar.g2;
            if (kjVar != null) {
                kjVar.b(true);
            }
            org.telegram.ui.Components.s40 s40Var = eoVar.i2;
            if (s40Var != null) {
                s40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new un(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        al alVar = eoVar.o1;
        if (alVar != null) {
            alVar.g(!eoVar.Oa && alVar.a() && eoVar.u3 == null);
        }
        if (eoVar.u3 == null || (mkVar = eoVar.p1) == null) {
            return;
        }
        int currentPosition = mkVar.a.getCurrentPosition();
        int i11 = eoVar.r1;
        if (currentPosition != i11) {
            eoVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void o(fg.q0 q0Var) {
        eo eoVar = this.h;
        al alVar = eoVar.o1;
        if (alVar != null) {
            alVar.d.M(new mr(2));
            alVar.h = 0L;
        }
        eoVar.q3 = null;
        eoVar.Ic();
        eoVar.vc();
        eoVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void p(bi.t2 t2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        eo eoVar = this.h;
        boolean z10 = false;
        eoVar.Fc(0, 0, -1);
        String obj = t2Var != null ? t2Var.getText().toString() : eoVar.t3;
        eoVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(eoVar.t3.startsWith("$") || eoVar.t3.startsWith("#"))) {
            eoVar.u3 = null;
            mk mkVar = eoVar.p1;
            if (mkVar != null) {
                mkVar.b(false);
                eoVar.Hc();
            }
            mk mkVar2 = eoVar.p1;
            if (mkVar2 != null && mkVar2.a.getCurrentPosition() != 0) {
                eoVar.p1.a.d(0, 0);
            }
        } else {
            eoVar.M7();
            if (eoVar.t3.contains("@")) {
                String str = eoVar.t3;
                f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                eoVar.presentFragment(new org.telegram.ui.Components.l40(str, f6Var));
                return;
            }
            if (eoVar.u3 == null) {
                eoVar.u3 = eoVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new un(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                al alVar = eoVar.o1;
                if (alVar != null) {
                    if (!eoVar.Oa && alVar.a() && eoVar.u3 == null) {
                        z10 = true;
                    }
                    alVar.g(z10);
                }
            }
            eoVar.u3 = eoVar.t3;
            eoVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(eoVar.u3);
            eoVar.t1.f.N(true);
            View currentView = eoVar.q1.getCurrentView();
            if (eoVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof go) {
                ((go) currentView).a.Jc(eoVar.u3);
            }
            eoVar.Hc();
            eoVar.d2.e(true, true);
            eoVar.Lb(true);
            z10 = true;
        }
        mk mkVar3 = eoVar.p1;
        if (mkVar3 != null) {
            mkVar3.b(z10);
        }
        MediaDataController mediaDataController = eoVar.getMediaDataController();
        String str2 = eoVar.t3;
        long j3 = eoVar.T5;
        long j10 = eoVar.L6;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, eoVar.d4, eoVar.o3, eoVar.p3, eoVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        eo eoVar = this.h;
        le.b bVar = eoVar.Ac;
        if (eoVar.u3 == null) {
            eoVar.Lb(false);
        }
        eoVar.L7();
        if (eoVar.n3) {
            eoVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, eoVar.u6, true, true);
        } else if (eoVar.o3 == null && eoVar.p3 == null && eoVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            eoVar.T2.callOnClick();
        }
        if (eoVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    eoVar.M7();
                }
                bVar.a(z10, true);
                bi.p1 p1Var = eoVar.q1;
                if (p1Var != null) {
                    p1Var.D(0);
                }
                if (z10) {
                    eoVar.Lb(true);
                }
                eoVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
