package org.telegram.ui;

import android.content.Context;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wq(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xq xqVar = (xq) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                jr jrVar = xqVar.a;
                if (org.telegram.ui.Components.oc.a(jrVar)) {
                    org.telegram.ui.Components.oc.C(jrVar, user.first_name).j();
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.Components.e0) this.b).q0.unsave((TL_aicompose.TL_aiComposeTone) this.c);
                break;
            case 2:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                qVar.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 3:
                boolean[] zArr = (boolean[]) this.b;
                ky0 ky0Var = (ky0) this.c;
                if (zArr[0]) {
                    ky0Var.run();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.b;
                TLObject tLObject = (TLObject) this.c;
                v9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                gcVar.n = true;
                ViewParent viewParent = gcVar.e;
                if (viewParent instanceof org.telegram.ui.Components.mb) {
                    org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) ((org.telegram.ui.Components.mb) viewParent);
                    nbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(nbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(nbVar.b, true, false, true);
                }
                gcVar.i(true);
                break;
            case 6:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ((org.telegram.ui.Components.ad) this.b).removeView((kh.x3) this.c);
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                kh.x3 x3Var = (kh.x3) this.c;
                int i9 = ChatActivityEnterView.i5;
                chatActivityEnterView.removeView(x3Var);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i10 = ChatActivityEnterView.i5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.S = null;
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.hd hdVar = (org.telegram.ui.Components.hd) this.c;
                int i11 = ChatActivityEnterView.i5;
                hdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.M, chatActivityEnterView3.L2, true);
                break;
            case 11:
                org.telegram.ui.Components.ig igVar = (org.telegram.ui.Components.ig) this.b;
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = igVar.R;
                chatActivityEnterView4.e1 = chatActivityEnterView4.d1.getAudioRightMs() - chatActivityEnterView4.d1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.d1.getAudioLeftMs(), chatActivityEnterView4.d1.getAudioRightMs(), fgVar);
                break;
            case 12:
                ((org.telegram.ui.Components.ki) this.b).containerView.removeView((kh.x3) this.c);
                break;
            case 13:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                kiVar.dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.ki kiVar2 = (org.telegram.ui.Components.ki) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.di) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                kiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(kiVar2.F1).updateAttachMenuBotsInCache();
                break;
            case 15:
                org.telegram.ui.Components.ki kiVar3 = (org.telegram.ui.Components.ki) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(kiVar3.F1).loadAttachMenuBots(false, true);
                if (kiVar3.u0 == kiVar3.t0.get(tL_attachMenuBot2.bot_id)) {
                    kiVar3.Q1(kiVar3.f0);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                viVar.D = false;
                viVar.E = arrayList;
                viVar.O();
                break;
            case 17:
                org.telegram.ui.Components.vi viVar2 = (org.telegram.ui.Components.vi) this.b;
                ((org.telegram.ui.Components.ki) this.c).Z0();
                viVar2.K();
                viVar2.b.X1(viVar2, 0);
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new wq(19, (org.telegram.ui.Components.oj) this.b, ((org.telegram.ui.Components.nj) this.c).run()));
                break;
            case 19:
                ((org.telegram.ui.Components.oj) this.b).setStatus((CharSequence) this.c);
                break;
            case 20:
                org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) this.b;
                String str = (String) this.c;
                ekVar.getClass();
                ArrayList arrayList2 = new ArrayList(ekVar.T.v.c);
                if (ekVar.T.v.d.isEmpty()) {
                    arrayList2.addAll(0, ekVar.T.v.e);
                }
                Utilities.searchQueue.postRunnable(new bg.d(ekVar, str, !ekVar.N.isEmpty(), arrayList2, 15));
                break;
            case 21:
                org.telegram.ui.Components.ek ekVar2 = (org.telegram.ui.Components.ek) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                org.telegram.ui.Components.fk fkVar = ekVar2.T;
                boolean z10 = fkVar.U;
                org.telegram.ui.Components.uj ujVar = fkVar.r;
                if (z10) {
                    f2.r0 adapter = ujVar.getAdapter();
                    org.telegram.ui.Components.ek ekVar3 = fkVar.y;
                    if (adapter != ekVar3) {
                        ujVar.setAdapter(ekVar3);
                    }
                }
                ekVar2.s = arrayList3;
                ekVar2.l();
                break;
            case 22:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.b;
                float[] fArr = (float[]) this.c;
                xkVar.getClass();
                xkVar.a0(fArr[0], fArr[1]);
                break;
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                org.telegram.ui.Components.ci ciVar = (org.telegram.ui.Components.ci) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                int currentItemTop = ciVar.getCurrentItemTop();
                int listTopPadding = ciVar.getListTopPadding();
                org.telegram.ui.Components.kl klVar = chatAttachAlertPhotoLayout.A;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                klVar.scrollBy(0, listTopPadding);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                org.telegram.ui.Components.ul ulVar = chatAttachAlertPhotoLayout2.L;
                if (ulVar != null) {
                    ulVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.hm hmVar = (org.telegram.ui.Components.hm) this.b;
                org.telegram.ui.Components.ci ciVar2 = (org.telegram.ui.Components.ci) this.c;
                int currentItemTop2 = ciVar2.getCurrentItemTop();
                int listTopPadding2 = ciVar2.getListTopPadding();
                gh.f1 f1Var = hmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                f1Var.scrollBy(0, listTopPadding2);
                break;
            case 26:
                org.telegram.ui.Components.wn wnVar = (org.telegram.ui.Components.wn) this.b;
                pf.h hVar = (pf.h) this.c;
                org.telegram.ui.Components.yn.a(wnVar.c);
                hVar.run();
                break;
            case 27:
                ((org.telegram.ui.Components.xo) this.b).b.x((List) this.c);
                break;
            case 28:
                ((org.telegram.ui.Components.yo) this.b).b.x((List) this.c);
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                ve.e.s(context, "https://t.me/BotFather?start=deletebot");
                break;
        }
    }
}
