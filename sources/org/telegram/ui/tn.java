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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class tn extends org.telegram.ui.ActionBar.h5 {
    public float f;
    public final /* synthetic */ bo h;

    public tn(bo boVar) {
        this.h = boVar;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.h5
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

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean f() {
        return this.h.n3;
    }

    @Override // org.telegram.ui.ActionBar.h5
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

    @Override // org.telegram.ui.ActionBar.h5
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
        org.telegram.ui.ActionBar.z zVar = boVar.i0;
        if (zVar != null && zVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = boVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = boVar.i0;
            if (zVar2 != null) {
                zVar2.f(0);
                bo.J3(boVar);
            }
            org.telegram.ui.ActionBar.z zVar3 = boVar.e0;
            if (zVar3 != null) {
                zVar3.f(8);
            }
            js jsVar = boVar.d0;
            if (jsVar != null) {
                jsVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = boVar.m0;
            if (w0Var2 != null && boVar.K9) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar4 = boVar.n0;
            if (zVar4 != null && boVar.L9) {
                zVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = boVar.k0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (boVar.Y.l0() && TextUtils.isEmpty(boVar.Y.getSlowModeTimer()) && ((chat = boVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = boVar.h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar5 = boVar.i0;
            if (zVar5 != null) {
                zVar5.f(8);
            }
            org.telegram.ui.ActionBar.z zVar6 = boVar.e0;
            if (zVar6 != null) {
                zVar6.f(0);
            }
            js jsVar2 = boVar.d0;
            if (jsVar2 != null) {
                jsVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = boVar.m0;
            if (w0Var5 != null && boVar.K9) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar7 = boVar.n0;
            if (zVar7 != null && boVar.L9) {
                zVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = boVar.k0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = boVar.h0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar8 = boVar.n0;
            if (zVar8 != null && boVar.L9) {
                zVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = boVar.k0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = boVar.m0;
            if (w0Var9 != null && boVar.K9) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar9 = boVar.i0;
            if (zVar9 != null) {
                zVar9.f(8);
            }
            org.telegram.ui.ActionBar.z zVar10 = boVar.e0;
            if (zVar10 != null) {
                zVar10.f(8);
            }
            js jsVar3 = boVar.d0;
            if (jsVar3 != null) {
                jsVar3.b(false);
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
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
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
        zk zkVar = boVar.o1;
        if (zkVar != null) {
            zkVar.d.N(new kr(2));
            zkVar.h = 0L;
            boVar.o1.g(false);
        }
        lk lkVar = boVar.p1;
        if (lkVar != null) {
            lkVar.b(false);
        }
        boVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        lk lkVar;
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
                i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ej(this, 9), 500L);
            jj jjVar = boVar.g2;
            if (jjVar != null) {
                jjVar.b(true);
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
        zk zkVar = boVar.o1;
        if (zkVar != null) {
            zkVar.g(!boVar.Oa && zkVar.a() && boVar.u3 == null);
        }
        if (boVar.u3 == null || (lkVar = boVar.p1) == null) {
            return;
        }
        int currentPosition = lkVar.a.getCurrentPosition();
        int i11 = boVar.r1;
        if (currentPosition != i11) {
            boVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void o(gg.q0 q0Var) {
        bo boVar = this.h;
        zk zkVar = boVar.o1;
        if (zkVar != null) {
            zkVar.d.N(new kr(2));
            zkVar.h = 0L;
        }
        boVar.q3 = null;
        boVar.Ic();
        boVar.vc();
        boVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void p(ci.h2 h2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        bo boVar = this.h;
        boolean z10 = false;
        boVar.Fc(0, 0, -1);
        String obj = h2Var != null ? h2Var.getText().toString() : boVar.t3;
        boVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(boVar.t3.startsWith("$") || boVar.t3.startsWith("#"))) {
            boVar.u3 = null;
            lk lkVar = boVar.p1;
            if (lkVar != null) {
                lkVar.b(false);
                boVar.Hc();
            }
            lk lkVar2 = boVar.p1;
            if (lkVar2 != null && lkVar2.a.getCurrentPosition() != 0) {
                boVar.p1.a.d(0, 0);
            }
        } else {
            boVar.M7();
            if (boVar.t3.contains("@")) {
                String str = boVar.t3;
                f6Var = ((org.telegram.ui.ActionBar.o2) boVar).resourceProvider;
                boVar.presentFragment(new org.telegram.ui.Components.b40(str, f6Var));
                return;
            }
            if (boVar.u3 == null) {
                boVar.u3 = boVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new sn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                zk zkVar = boVar.o1;
                if (zkVar != null) {
                    if (!boVar.Oa && zkVar.a() && boVar.u3 == null) {
                        z10 = true;
                    }
                    zkVar.g(z10);
                }
            }
            boVar.u3 = boVar.t3;
            boVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(boVar.u3);
            boVar.t1.f.N(true);
            View currentView = boVar.q1.getCurrentView();
            if (boVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
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
        lk lkVar3 = boVar.p1;
        if (lkVar3 != null) {
            lkVar3.b(z10);
        }
        MediaDataController mediaDataController = boVar.getMediaDataController();
        String str2 = boVar.t3;
        long j3 = boVar.T5;
        long j10 = boVar.L6;
        i10 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, boVar.d4, boVar.o3, boVar.p3, boVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.h5
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
                    i1Var.E(0);
                }
                if (z10) {
                    boVar.Lb(true);
                }
                boVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
