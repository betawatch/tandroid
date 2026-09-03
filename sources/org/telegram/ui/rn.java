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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.ActionBar.h5 {
    public float f;
    public final /* synthetic */ zn h;

    public rn(zn znVar) {
        this.h = znVar;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean a() {
        return this.h.r3 == null;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean b() {
        zn znVar = this.h;
        if (!znVar.xc.f) {
            if (znVar.r3 != null && znVar.m1 != null) {
                View currentView = znVar.n1.getCurrentView();
                zn znVar2 = currentView instanceof bo ? ((bo) currentView).a : znVar;
                if (!znVar2.vc.f) {
                    znVar2.Lb(true);
                    return false;
                }
                int currentPosition = znVar.m1.a.getCurrentPosition();
                int i10 = znVar.o1;
                if (currentPosition != i10) {
                    znVar.m1.a.d(i10, i10);
                    return false;
                }
            } else if (znVar.vc.f) {
                znVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean f() {
        return this.h.k3;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void k() {
        zn znVar = this.h;
        znVar.L7();
        if (znVar.l3 != null || znVar.m3 != null) {
            ImageView imageView = znVar.Q2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (znVar.k3) {
            znVar.F1.getAdapter().U(null, 0, null, false, true);
            znVar.k3 = false;
            znVar.g0.H("", true);
        }
        znVar.g0.setSearchFieldHint(LocaleController.getString(znVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        znVar.P2.setVisibility(0);
        ImageView imageView2 = znVar.Q2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        znVar.l3 = null;
        znVar.m3 = null;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        zn znVar = this.h;
        znVar.p3 = false;
        znVar.vc();
        znVar.Ic();
        ImageView imageView = znVar.P2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = znVar.Q2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (znVar.k3) {
            znVar.F1.getAdapter().U(null, 0, null, false, true);
            znVar.k3 = false;
        }
        znVar.F1.setReversed(false);
        znVar.F1.getAdapter().h0 = false;
        znVar.m7();
        znVar.l3 = null;
        znVar.m3 = null;
        znVar.r3 = null;
        znVar.g0.setSearchFieldHint(LocaleController.getString(znVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        znVar.g0.setSearchFieldCaption(null);
        znVar.wc.a(false, true);
        znVar.xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = znVar.f0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = znVar.e0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.f0;
            if (yVar2 != null) {
                yVar2.f(0);
                zn.J3(znVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.b0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            es esVar = znVar.a0;
            if (esVar != null) {
                esVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = znVar.j0;
            if (w0Var2 != null && znVar.H9) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = znVar.k0;
            if (yVar4 != null && znVar.I9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = znVar.h0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (znVar.V.k0() && TextUtils.isEmpty(znVar.V.getSlowModeTimer()) && ((chat = znVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = znVar.e0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = znVar.f0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = znVar.b0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            es esVar2 = znVar.a0;
            if (esVar2 != null) {
                esVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = znVar.j0;
            if (w0Var5 != null && znVar.H9) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = znVar.k0;
            if (yVar7 != null && znVar.I9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = znVar.h0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = znVar.e0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = znVar.k0;
            if (yVar8 != null && znVar.I9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = znVar.h0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = znVar.j0;
            if (w0Var9 != null && znVar.H9) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = znVar.f0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = znVar.b0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            es esVar3 = znVar.a0;
            if (esVar3 != null) {
                esVar3.b(false);
            }
        }
        if (znVar.n1 != null) {
            if (znVar.m1.a.getCurrentPosition() != 0) {
                znVar.m1.a.d(0, 0);
                znVar.p1 = true;
            } else {
                znVar.n1.h.clear();
            }
        }
        int i12 = znVar.O3;
        if (i12 == 3 || i12 == 8 || ((znVar.a4 == 0 && !UserObject.isReplyUser(znVar.f)) || ((messageObject = znVar.U3) != null && messageObject.getRepliesCount() < 10))) {
            znVar.g0.setVisibility(8);
        }
        znVar.l0 = false;
        znVar.getMediaDataController().clearFoundMessageObjects();
        if (znVar.L3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        tf.y0 y0Var = znVar.J3;
        if (y0Var != null) {
            y0Var.l();
        }
        znVar.Ia();
        znVar.hc(false);
        znVar.yc(0, true);
        znVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new qn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        znVar.vc.a(false, true);
        znVar.Hc();
        znVar.n3 = null;
        znVar.Ic();
        znVar.vc();
        xk xkVar = znVar.l1;
        if (xkVar != null) {
            xkVar.d.M(new hr(2));
            xkVar.h = 0L;
            znVar.l1.g(false);
        }
        jk jkVar = znVar.m1;
        if (jkVar != null) {
            jkVar.b(false);
        }
        znVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        jk jkVar;
        int i10;
        zn znVar = this.h;
        znVar.p3 = true;
        znVar.vc();
        znVar.Ic();
        if (((znVar.a4 != 0 && znVar.O3 != 3) || UserObject.isReplyUser(znVar.f)) && !znVar.ac) {
            znVar.la(null);
        }
        if (znVar.T4) {
            znVar.saveKeyboardPositionBeforeTransition();
            if (!znVar.La) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new bj(this, 9), 500L);
            gj gjVar = znVar.d2;
            if (gjVar != null) {
                gjVar.b(true);
            }
            org.telegram.ui.Components.l40 l40Var = znVar.f2;
            if (l40Var != null) {
                l40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new qn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xk xkVar = znVar.l1;
        if (xkVar != null) {
            xkVar.g(!znVar.La && xkVar.a() && znVar.r3 == null);
        }
        if (znVar.r3 == null || (jkVar = znVar.m1) == null) {
            return;
        }
        int currentPosition = jkVar.a.getCurrentPosition();
        int i11 = znVar.o1;
        if (currentPosition != i11) {
            znVar.m1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void o(tf.e0 e0Var) {
        zn znVar = this.h;
        xk xkVar = znVar.l1;
        if (xkVar != null) {
            xkVar.d.M(new hr(2));
            xkVar.h = 0L;
        }
        znVar.n3 = null;
        znVar.Ic();
        znVar.vc();
        znVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void p(kg.f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        zn znVar = this.h;
        boolean z4 = false;
        znVar.Fc(0, 0, -1);
        String obj = fVar != null ? fVar.getText().toString() : znVar.q3;
        znVar.q3 = obj;
        if (TextUtils.isEmpty(obj) || !(znVar.q3.startsWith("$") || znVar.q3.startsWith("#"))) {
            znVar.r3 = null;
            jk jkVar = znVar.m1;
            if (jkVar != null) {
                jkVar.b(false);
                znVar.Hc();
            }
            jk jkVar2 = znVar.m1;
            if (jkVar2 != null && jkVar2.a.getCurrentPosition() != 0) {
                znVar.m1.a.d(0, 0);
            }
        } else {
            znVar.M7();
            if (znVar.q3.contains("@")) {
                String str = znVar.q3;
                f6Var = ((org.telegram.ui.ActionBar.p2) znVar).resourceProvider;
                znVar.presentFragment(new org.telegram.ui.Components.e40(str, f6Var));
                return;
            }
            if (znVar.r3 == null) {
                znVar.r3 = znVar.q3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new qn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                xk xkVar = znVar.l1;
                if (xkVar != null) {
                    if (!znVar.La && xkVar.a() && znVar.r3 == null) {
                        z4 = true;
                    }
                    xkVar.g(z4);
                }
            }
            znVar.r3 = znVar.q3;
            znVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(znVar.r3);
            znVar.q1.f.N(true);
            View currentView = znVar.n1.getCurrentView();
            if (znVar.L3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof bo) {
                ((bo) currentView).a.Jc(znVar.r3);
            }
            znVar.Hc();
            znVar.a2.e(true, true);
            znVar.Lb(true);
            z4 = true;
        }
        jk jkVar3 = znVar.m1;
        if (jkVar3 != null) {
            jkVar3.b(z4);
        }
        MediaDataController mediaDataController = znVar.getMediaDataController();
        String str2 = znVar.q3;
        long j10 = znVar.Q5;
        long j11 = znVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, znVar.a4, znVar.l3, znVar.m3, znVar.n3);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        zn znVar = this.h;
        xd.a aVar = znVar.xc;
        if (znVar.r3 == null) {
            znVar.Lb(false);
        }
        znVar.L7();
        if (znVar.k3) {
            znVar.F1.getAdapter().U("@" + editText.getText().toString(), 0, znVar.r6, true, true);
        } else if (znVar.l3 == null && znVar.m3 == null && znVar.Q2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            znVar.Q2.callOnClick();
        }
        if (znVar.r3 != null) {
            boolean z4 = editText.length() == 0;
            if (z4 != aVar.f) {
                if (z4) {
                    znVar.M7();
                }
                aVar.a(z4, true);
                gk gkVar = znVar.n1;
                if (gkVar != null) {
                    gkVar.D(0);
                }
                if (z4) {
                    znVar.Lb(true);
                }
                znVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean r() {
        return this.h.r3 == null;
    }
}
