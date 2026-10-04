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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class qn extends org.telegram.ui.ActionBar.f5 {
    public float f;
    public final /* synthetic */ yn h;

    public qn(yn ynVar) {
        this.h = ynVar;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean a() {
        return this.h.s3 == null;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean b() {
        yn ynVar = this.h;
        if (!ynVar.xc.f) {
            if (ynVar.s3 != null && ynVar.n1 != null) {
                View currentView = ynVar.o1.getCurrentView();
                yn ynVar2 = currentView instanceof ao ? ((ao) currentView).a : ynVar;
                if (!ynVar2.vc.f) {
                    ynVar2.Kb(true);
                    return false;
                }
                int currentPosition = ynVar.n1.a.getCurrentPosition();
                int i10 = ynVar.p1;
                if (currentPosition != i10) {
                    ynVar.n1.a.d(i10, i10);
                    return false;
                }
            } else if (ynVar.vc.f) {
                ynVar.Kb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean f() {
        return this.h.l3;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void k() {
        yn ynVar = this.h;
        ynVar.L7();
        if (ynVar.m3 != null || ynVar.n3 != null) {
            ImageView imageView = ynVar.R2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (ynVar.l3) {
            ynVar.G1.getAdapter().U(null, 0, null, false, true);
            ynVar.l3 = false;
            ynVar.h0.H("", true);
        }
        ynVar.h0.setSearchFieldHint(LocaleController.getString(ynVar.D9() ? R.string.SavedTagSearchHint : R.string.Search));
        ynVar.Q2.setVisibility(0);
        ImageView imageView2 = ynVar.R2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ynVar.m3 = null;
        ynVar.n3 = null;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        yn ynVar = this.h;
        ynVar.q3 = false;
        ynVar.uc();
        ynVar.Hc();
        ImageView imageView = ynVar.Q2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = ynVar.R2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (ynVar.l3) {
            ynVar.G1.getAdapter().U(null, 0, null, false, true);
            ynVar.l3 = false;
        }
        ynVar.G1.setReversed(false);
        ynVar.G1.getAdapter().k0 = false;
        ynVar.m7();
        ynVar.m3 = null;
        ynVar.n3 = null;
        ynVar.s3 = null;
        ynVar.h0.setSearchFieldHint(LocaleController.getString(ynVar.D9() ? R.string.SavedTagSearchHint : R.string.Search));
        ynVar.h0.setSearchFieldCaption(null);
        ynVar.wc.a(false, true);
        ynVar.xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = ynVar.g0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = ynVar.f0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = ynVar.g0;
            if (yVar2 != null) {
                yVar2.f(0);
                yn.J3(ynVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = ynVar.c0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            fs fsVar = ynVar.b0;
            if (fsVar != null) {
                fsVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = ynVar.k0;
            if (v0Var2 != null && ynVar.I9) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = ynVar.l0;
            if (yVar4 != null && ynVar.J9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = ynVar.i0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
            }
        } else if (ynVar.W.k0() && TextUtils.isEmpty(ynVar.W.getSlowModeTimer()) && ((chat = ynVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var4 = ynVar.f0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = ynVar.g0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = ynVar.c0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            fs fsVar2 = ynVar.b0;
            if (fsVar2 != null) {
                fsVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = ynVar.k0;
            if (v0Var5 != null && ynVar.I9) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = ynVar.l0;
            if (yVar7 != null && ynVar.J9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = ynVar.i0;
            if (v0Var6 != null) {
                v0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var7 = ynVar.f0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = ynVar.l0;
            if (yVar8 != null && ynVar.J9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var8 = ynVar.i0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = ynVar.k0;
            if (v0Var9 != null && ynVar.I9) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = ynVar.g0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = ynVar.c0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            fs fsVar3 = ynVar.b0;
            if (fsVar3 != null) {
                fsVar3.b(false);
            }
        }
        if (ynVar.o1 != null) {
            if (ynVar.n1.a.getCurrentPosition() != 0) {
                ynVar.n1.a.d(0, 0);
                ynVar.q1 = true;
            } else {
                ynVar.o1.h.clear();
            }
        }
        int i12 = ynVar.P3;
        if (i12 == 3 || i12 == 8 || ((ynVar.b4 == 0 && !UserObject.isReplyUser(ynVar.f)) || ((messageObject = ynVar.V3) != null && messageObject.getRepliesCount() < 10))) {
            ynVar.h0.setVisibility(8);
        }
        ynVar.m0 = false;
        ynVar.getMediaDataController().clearFoundMessageObjects();
        if (ynVar.M3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        gg.o1 o1Var = ynVar.K3;
        if (o1Var != null) {
            o1Var.l();
        }
        ynVar.Ha();
        ynVar.gc(false);
        ynVar.xc(0, true);
        ynVar.Vc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new pn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ynVar.vc.a(false, true);
        ynVar.Gc();
        ynVar.o3 = null;
        ynVar.Hc();
        ynVar.uc();
        vk vkVar = ynVar.m1;
        if (vkVar != null) {
            vkVar.d.M(new hr(2));
            vkVar.h = 0L;
            ynVar.m1.g(false);
        }
        hk hkVar = ynVar.n1;
        if (hkVar != null) {
            hkVar.b(false);
        }
        ynVar.jb(false);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
        hk hkVar;
        int i10;
        yn ynVar = this.h;
        ynVar.q3 = true;
        ynVar.uc();
        ynVar.Hc();
        if (((ynVar.b4 != 0 && ynVar.P3 != 3) || UserObject.isReplyUser(ynVar.f)) && !ynVar.ac) {
            ynVar.ka(null);
        }
        if (ynVar.U4) {
            ynVar.saveKeyboardPositionBeforeTransition();
            if (!ynVar.Ma) {
                Activity parentActivity = ynVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new bj(this, 9), 500L);
            gj gjVar = ynVar.e2;
            if (gjVar != null) {
                gjVar.b(true);
            }
            org.telegram.ui.Components.m40 m40Var = ynVar.g2;
            if (m40Var != null) {
                m40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new pn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = ynVar.m1;
        if (vkVar != null) {
            vkVar.g(!ynVar.Ma && vkVar.a() && ynVar.s3 == null);
        }
        if (ynVar.s3 == null || (hkVar = ynVar.n1) == null) {
            return;
        }
        int currentPosition = hkVar.a.getCurrentPosition();
        int i11 = ynVar.p1;
        if (currentPosition != i11) {
            ynVar.n1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void o(gg.q0 q0Var) {
        yn ynVar = this.h;
        vk vkVar = ynVar.m1;
        if (vkVar != null) {
            vkVar.d.M(new hr(2));
            vkVar.h = 0L;
        }
        ynVar.o3 = null;
        ynVar.Hc();
        ynVar.uc();
        ynVar.jb(false);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void p(ci.h2 h2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        yn ynVar = this.h;
        boolean z10 = false;
        ynVar.Ec(0, 0, -1);
        String obj = h2Var != null ? h2Var.getText().toString() : ynVar.r3;
        ynVar.r3 = obj;
        if (TextUtils.isEmpty(obj) || !(ynVar.r3.startsWith("$") || ynVar.r3.startsWith("#"))) {
            ynVar.s3 = null;
            hk hkVar = ynVar.n1;
            if (hkVar != null) {
                hkVar.b(false);
                ynVar.Gc();
            }
            hk hkVar2 = ynVar.n1;
            if (hkVar2 != null && hkVar2.a.getCurrentPosition() != 0) {
                ynVar.n1.a.d(0, 0);
            }
        } else {
            ynVar.M7();
            if (ynVar.r3.contains("@")) {
                String str = ynVar.r3;
                d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                ynVar.presentFragment(new org.telegram.ui.Components.f40(str, d6Var));
                return;
            }
            if (ynVar.s3 == null) {
                ynVar.s3 = ynVar.r3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new pn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = ynVar.m1;
                if (vkVar != null) {
                    if (!ynVar.Ma && vkVar.a() && ynVar.s3 == null) {
                        z10 = true;
                    }
                    vkVar.g(z10);
                }
            }
            ynVar.s3 = ynVar.r3;
            ynVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(ynVar.s3);
            ynVar.r1.f.N(true);
            View currentView = ynVar.o1.getCurrentView();
            if (ynVar.M3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof ao) {
                ((ao) currentView).a.Ic(ynVar.s3);
            }
            ynVar.Gc();
            ynVar.b2.e(true, true);
            ynVar.Kb(true);
            z10 = true;
        }
        hk hkVar3 = ynVar.n1;
        if (hkVar3 != null) {
            hkVar3.b(z10);
        }
        MediaDataController mediaDataController = ynVar.getMediaDataController();
        String str2 = ynVar.r3;
        long j3 = ynVar.R5;
        long j10 = ynVar.J6;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, ynVar.b4, ynVar.m3, ynVar.n3, ynVar.o3);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        yn ynVar = this.h;
        le.b bVar = ynVar.xc;
        if (ynVar.s3 == null) {
            ynVar.Kb(false);
        }
        ynVar.L7();
        if (ynVar.l3) {
            ynVar.G1.getAdapter().U("@" + editText.getText().toString(), 0, ynVar.s6, true, true);
        } else if (ynVar.m3 == null && ynVar.n3 == null && ynVar.R2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            ynVar.R2.callOnClick();
        }
        if (ynVar.s3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    ynVar.M7();
                }
                bVar.a(z10, true);
                ci.i1 i1Var = ynVar.o1;
                if (i1Var != null) {
                    i1Var.E(0);
                }
                if (z10) {
                    ynVar.Kb(true);
                }
                ynVar.gc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean r() {
        return this.h.s3 == null;
    }
}
