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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wn extends org.telegram.ui.ActionBar.e5 {
    public float f;
    public final /* synthetic */ fo h;

    public wn(fo foVar) {
        this.h = foVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        fo foVar = this.h;
        if (!foVar.Ac.f) {
            if (foVar.u3 != null && foVar.p1 != null) {
                View currentView = foVar.q1.getCurrentView();
                fo foVar2 = currentView instanceof ho ? ((ho) currentView).a : foVar;
                if (!foVar2.yc.f) {
                    foVar2.Pb(true);
                    return false;
                }
                int currentPosition = foVar.p1.a.getCurrentPosition();
                int i10 = foVar.r1;
                if (currentPosition != i10) {
                    foVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (foVar.yc.f) {
                foVar.Pb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean f() {
        return this.h.n3;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void k() {
        fo foVar = this.h;
        foVar.O7();
        if (foVar.o3 != null || foVar.p3 != null) {
            ImageView imageView = foVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (foVar.n3) {
            foVar.I1.getAdapter().U(null, 0, null, false, true);
            foVar.n3 = false;
            foVar.j0.H("", true);
        }
        foVar.j0.setSearchFieldHint(LocaleController.getString(foVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        foVar.S2.setVisibility(0);
        ImageView imageView2 = foVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        foVar.o3 = null;
        foVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        fo foVar = this.h;
        foVar.s3 = false;
        foVar.zc();
        foVar.Mc();
        ImageView imageView = foVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = foVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (foVar.n3) {
            foVar.I1.getAdapter().U(null, 0, null, false, true);
            foVar.n3 = false;
        }
        foVar.I1.setReversed(false);
        foVar.I1.getAdapter().k0 = false;
        foVar.p7();
        foVar.o3 = null;
        foVar.p3 = null;
        foVar.u3 = null;
        foVar.j0.setSearchFieldHint(LocaleController.getString(foVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        foVar.j0.setSearchFieldCaption(null);
        foVar.zc.a(false, true);
        foVar.Ac.a(false, true);
        org.telegram.ui.ActionBar.x xVar = foVar.i0;
        if (xVar != null && xVar.o != null) {
            org.telegram.ui.ActionBar.u0 u0Var = foVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = foVar.i0;
            if (xVar2 != null) {
                xVar2.f(0);
                fo.S3(foVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = foVar.e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            ls lsVar = foVar.d0;
            if (lsVar != null) {
                lsVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = foVar.m0;
            if (u0Var2 != null && foVar.K9) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = foVar.n0;
            if (xVar4 != null && foVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = foVar.k0;
            if (u0Var3 != null) {
                u0Var3.setVisibility(8);
            }
        } else if (foVar.Y.i0() && TextUtils.isEmpty(foVar.Y.getSlowModeTimer()) && ((chat = foVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var4 = foVar.h0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = foVar.i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = foVar.e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            ls lsVar2 = foVar.d0;
            if (lsVar2 != null) {
                lsVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var5 = foVar.m0;
            if (u0Var5 != null && foVar.K9) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = foVar.n0;
            if (xVar7 != null && foVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = foVar.k0;
            if (u0Var6 != null) {
                u0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var7 = foVar.h0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = foVar.n0;
            if (xVar8 != null && foVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var8 = foVar.k0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = foVar.m0;
            if (u0Var9 != null && foVar.K9) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = foVar.i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = foVar.e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            ls lsVar3 = foVar.d0;
            if (lsVar3 != null) {
                lsVar3.b(false);
            }
        }
        if (foVar.q1 != null) {
            if (foVar.p1.a.getCurrentPosition() != 0) {
                foVar.p1.a.d(0, 0);
                foVar.s1 = true;
            } else {
                foVar.q1.h.clear();
            }
        }
        int i12 = foVar.R3;
        if (i12 == 3 || i12 == 8 || ((foVar.d4 == 0 && !UserObject.isReplyUser(foVar.f)) || ((messageObject = foVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            foVar.j0.setVisibility(8);
        }
        foVar.o0 = false;
        foVar.getMediaDataController().clearFoundMessageObjects();
        if (foVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        hg.n1 n1Var = foVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        foVar.Ma();
        foVar.lc(false);
        foVar.Cc(0, true);
        foVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new vn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        foVar.yc.a(false, true);
        foVar.Lc();
        foVar.q3 = null;
        foVar.Mc();
        foVar.zc();
        dl dlVar = foVar.o1;
        if (dlVar != null) {
            dlVar.d.M(new or(2));
            dlVar.h = 0L;
            foVar.o1.g(false);
        }
        pk pkVar = foVar.p1;
        if (pkVar != null) {
            pkVar.b(false);
        }
        foVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        pk pkVar;
        int i10;
        fo foVar = this.h;
        foVar.s3 = true;
        foVar.zc();
        foVar.Mc();
        if (((foVar.d4 != 0 && foVar.R3 != 3) || UserObject.isReplyUser(foVar.f)) && !foVar.dc) {
            foVar.qa(null);
        }
        if (foVar.W4) {
            foVar.saveKeyboardPositionBeforeTransition();
            if (!foVar.Pa) {
                Activity parentActivity = foVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new gj(this, 10), 500L);
            nj njVar = foVar.g2;
            if (njVar != null) {
                njVar.b(true);
            }
            org.telegram.ui.Components.v40 v40Var = foVar.i2;
            if (v40Var != null) {
                v40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new vn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        dl dlVar = foVar.o1;
        if (dlVar != null) {
            dlVar.g(!foVar.Pa && dlVar.a() && foVar.u3 == null);
        }
        if (foVar.u3 == null || (pkVar = foVar.p1) == null) {
            return;
        }
        int currentPosition = pkVar.a.getCurrentPosition();
        int i11 = foVar.r1;
        if (currentPosition != i11) {
            foVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void o(hg.p0 p0Var) {
        fo foVar = this.h;
        dl dlVar = foVar.o1;
        if (dlVar != null) {
            dlVar.d.M(new or(2));
            dlVar.h = 0L;
        }
        foVar.q3 = null;
        foVar.Mc();
        foVar.zc();
        foVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(di.g2 g2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var;
        fo foVar = this.h;
        boolean z10 = false;
        foVar.Jc(0, 0, -1);
        String obj = g2Var != null ? g2Var.getText().toString() : foVar.t3;
        foVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(foVar.t3.startsWith("$") || foVar.t3.startsWith("#"))) {
            foVar.u3 = null;
            pk pkVar = foVar.p1;
            if (pkVar != null) {
                pkVar.b(false);
                foVar.Lc();
            }
            pk pkVar2 = foVar.p1;
            if (pkVar2 != null && pkVar2.a.getCurrentPosition() != 0) {
                foVar.p1.a.d(0, 0);
            }
        } else {
            foVar.P7();
            if (foVar.t3.contains("@")) {
                String str = foVar.t3;
                c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                foVar.presentFragment(new org.telegram.ui.Components.o40(str, c6Var));
                return;
            }
            if (foVar.u3 == null) {
                foVar.u3 = foVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new vn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                dl dlVar = foVar.o1;
                if (dlVar != null) {
                    if (!foVar.Pa && dlVar.a() && foVar.u3 == null) {
                        z10 = true;
                    }
                    dlVar.g(z10);
                }
            }
            foVar.u3 = foVar.t3;
            foVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(foVar.u3);
            foVar.t1.f.N(true);
            View currentView = foVar.q1.getCurrentView();
            if (foVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof ho) {
                ((ho) currentView).a.Nc(foVar.u3);
            }
            foVar.Lc();
            foVar.d2.e(true, true);
            foVar.Pb(true);
            z10 = true;
        }
        pk pkVar3 = foVar.p1;
        if (pkVar3 != null) {
            pkVar3.b(z10);
        }
        MediaDataController mediaDataController = foVar.getMediaDataController();
        String str2 = foVar.t3;
        long j10 = foVar.T5;
        long j11 = foVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, foVar.d4, foVar.o3, foVar.p3, foVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        fo foVar = this.h;
        ne.b bVar = foVar.Ac;
        if (foVar.u3 == null) {
            foVar.Pb(false);
        }
        foVar.O7();
        if (foVar.n3) {
            foVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, foVar.u6, true, true);
        } else if (foVar.o3 == null && foVar.p3 == null && foVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            foVar.T2.callOnClick();
        }
        if (foVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    foVar.P7();
                }
                bVar.a(z10, true);
                di.h1 h1Var = foVar.q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    foVar.Pb(true);
                }
                foVar.lc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
