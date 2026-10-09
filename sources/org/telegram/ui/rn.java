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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        if (!znVar.Ac.f) {
            if (znVar.u3 != null && znVar.p1 != null) {
                View currentView = znVar.q1.getCurrentView();
                zn znVar2 = currentView instanceof bo ? ((bo) currentView).a : znVar;
                if (!znVar2.yc.f) {
                    znVar2.Pb(true);
                    return false;
                }
                int currentPosition = znVar.p1.a.getCurrentPosition();
                int i10 = znVar.r1;
                if (currentPosition != i10) {
                    znVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (znVar.yc.f) {
                znVar.Pb(false);
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
        znVar.O7();
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
        znVar.j0.setSearchFieldHint(LocaleController.getString(znVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
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
        znVar.zc();
        znVar.Mc();
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
        znVar.p7();
        znVar.o3 = null;
        znVar.p3 = null;
        znVar.u3 = null;
        znVar.j0.setSearchFieldHint(LocaleController.getString(znVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        znVar.j0.setSearchFieldCaption(null);
        znVar.zc.a(false, true);
        znVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.y yVar = znVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                zn.S3(znVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            fs fsVar = znVar.d0;
            if (fsVar != null) {
                fsVar.b(false);
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
        } else if (znVar.Y.i0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer()) && ((chat = znVar.e) == null || ChatObject.canSendPlain(chat))) {
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
            fs fsVar2 = znVar.d0;
            if (fsVar2 != null) {
                fsVar2.b(true);
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
            fs fsVar3 = znVar.d0;
            if (fsVar3 != null) {
                fsVar3.b(false);
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
        gg.n1 n1Var = znVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        znVar.Ma();
        znVar.lc(false);
        znVar.Cc(0, true);
        znVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new qn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.hs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        znVar.yc.a(false, true);
        znVar.Lc();
        znVar.q3 = null;
        znVar.Mc();
        znVar.zc();
        zk zkVar = znVar.o1;
        if (zkVar != null) {
            zkVar.d.M(new ir(2));
            zkVar.h = 0L;
            znVar.o1.g(false);
        }
        lk lkVar = znVar.p1;
        if (lkVar != null) {
            lkVar.b(false);
        }
        znVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        lk lkVar;
        int i10;
        zn znVar = this.h;
        znVar.s3 = true;
        znVar.zc();
        znVar.Mc();
        if (((znVar.d4 != 0 && znVar.R3 != 3) || UserObject.isReplyUser(znVar.f)) && !znVar.dc) {
            znVar.qa(null);
        }
        if (znVar.W4) {
            znVar.saveKeyboardPositionBeforeTransition();
            if (!znVar.Pa) {
                Activity parentActivity = znVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new cj(this, 10), 500L);
            jj jjVar = znVar.g2;
            if (jjVar != null) {
                jjVar.b(true);
            }
            org.telegram.ui.Components.z40 z40Var = znVar.i2;
            if (z40Var != null) {
                z40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new qn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.hs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        zk zkVar = znVar.o1;
        if (zkVar != null) {
            zkVar.g(!znVar.Pa && zkVar.a() && znVar.u3 == null);
        }
        if (znVar.u3 == null || (lkVar = znVar.p1) == null) {
            return;
        }
        int currentPosition = lkVar.a.getCurrentPosition();
        int i11 = znVar.r1;
        if (currentPosition != i11) {
            znVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void o(gg.p0 p0Var) {
        zn znVar = this.h;
        zk zkVar = znVar.o1;
        if (zkVar != null) {
            zkVar.d.M(new ir(2));
            zkVar.h = 0L;
        }
        znVar.q3 = null;
        znVar.Mc();
        znVar.zc();
        znVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ci.g2 g2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var;
        zn znVar = this.h;
        boolean z10 = false;
        znVar.Jc(0, 0, -1);
        String obj = g2Var != null ? g2Var.getText().toString() : znVar.t3;
        znVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(znVar.t3.startsWith("$") || znVar.t3.startsWith("#"))) {
            znVar.u3 = null;
            lk lkVar = znVar.p1;
            if (lkVar != null) {
                lkVar.b(false);
                znVar.Lc();
            }
            lk lkVar2 = znVar.p1;
            if (lkVar2 != null && lkVar2.a.getCurrentPosition() != 0) {
                znVar.p1.a.d(0, 0);
            }
        } else {
            znVar.P7();
            if (znVar.t3.contains("@")) {
                String str = znVar.t3;
                e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                znVar.presentFragment(new org.telegram.ui.Components.s40(str, e6Var));
                return;
            }
            if (znVar.u3 == null) {
                znVar.u3 = znVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new qn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.hs.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                zk zkVar = znVar.o1;
                if (zkVar != null) {
                    if (!znVar.Pa && zkVar.a() && znVar.u3 == null) {
                        z10 = true;
                    }
                    zkVar.g(z10);
                }
            }
            znVar.u3 = znVar.t3;
            znVar.U6(true);
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
                ((bo) currentView).a.Nc(znVar.u3);
            }
            znVar.Lc();
            znVar.d2.e(true, true);
            znVar.Pb(true);
            z10 = true;
        }
        lk lkVar3 = znVar.p1;
        if (lkVar3 != null) {
            lkVar3.b(z10);
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
        me.b bVar = znVar.Ac;
        if (znVar.u3 == null) {
            znVar.Pb(false);
        }
        znVar.O7();
        if (znVar.n3) {
            znVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, znVar.u6, true, true);
        } else if (znVar.o3 == null && znVar.p3 == null && znVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            znVar.T2.callOnClick();
        }
        if (znVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    znVar.P7();
                }
                bVar.a(z10, true);
                ci.h1 h1Var = znVar.q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    znVar.Pb(true);
                }
                znVar.lc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
