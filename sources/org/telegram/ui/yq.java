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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yq(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zq zqVar = (zq) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                lr lrVar = zqVar.a;
                if (org.telegram.ui.Components.mc.a(lrVar)) {
                    org.telegram.ui.Components.mc.C(lrVar, user.first_name).j();
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
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.b;
                TLObject tLObject = (TLObject) this.c;
                t9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    t9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.ec ecVar = (org.telegram.ui.Components.ec) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                ecVar.n = true;
                ViewParent viewParent = ecVar.e;
                if (viewParent instanceof org.telegram.ui.Components.kb) {
                    org.telegram.ui.Components.lb lbVar = (org.telegram.ui.Components.lb) ((org.telegram.ui.Components.kb) viewParent);
                    lbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(lbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(lbVar.b, true, false, true);
                }
                ecVar.i(true);
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
                ((org.telegram.ui.Components.xc) this.b).removeView((lh.w3) this.c);
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                lh.w3 w3Var = (lh.w3) this.c;
                int i10 = ChatActivityEnterView.i5;
                chatActivityEnterView.removeView(w3Var);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.i5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.S = null;
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.ed edVar = (org.telegram.ui.Components.ed) this.c;
                int i12 = ChatActivityEnterView.i5;
                edVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.M, chatActivityEnterView3.L2, true);
                break;
            case 11:
                org.telegram.ui.Components.eg egVar = (org.telegram.ui.Components.eg) this.b;
                org.telegram.ui.Components.bg bgVar = (org.telegram.ui.Components.bg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = egVar.R;
                chatActivityEnterView4.e1 = chatActivityEnterView4.d1.getAudioRightMs() - chatActivityEnterView4.d1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.d1.getAudioLeftMs(), chatActivityEnterView4.d1.getAudioRightMs(), bgVar);
                break;
            case 12:
                ((org.telegram.ui.Components.gi) this.b).containerView.removeView((lh.w3) this.c);
                break;
            case 13:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                giVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.gi giVar2 = (org.telegram.ui.Components.gi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.zh) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                giVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(giVar2.F1).updateAttachMenuBotsInCache();
                break;
            case 15:
                org.telegram.ui.Components.gi giVar3 = (org.telegram.ui.Components.gi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(giVar3.F1).loadAttachMenuBots(false, true);
                if (giVar3.u0 == giVar3.t0.get(tL_attachMenuBot2.bot_id)) {
                    giVar3.Q1(giVar3.f0);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                riVar.D = false;
                riVar.E = arrayList;
                riVar.P();
                break;
            case 17:
                org.telegram.ui.Components.ri riVar2 = (org.telegram.ui.Components.ri) this.b;
                ((org.telegram.ui.Components.gi) this.c).Z0();
                riVar2.L();
                riVar2.b.X1(riVar2, 0);
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new yq(19, (org.telegram.ui.Components.kj) this.b, ((org.telegram.ui.Components.jj) this.c).run()));
                break;
            case 19:
                ((org.telegram.ui.Components.kj) this.b).setStatus((CharSequence) this.c);
                break;
            case 20:
                org.telegram.ui.Components.ak akVar = (org.telegram.ui.Components.ak) this.b;
                String str = (String) this.c;
                akVar.getClass();
                ArrayList arrayList2 = new ArrayList(akVar.T.v.c);
                if (akVar.T.v.d.isEmpty()) {
                    arrayList2.addAll(0, akVar.T.v.e);
                }
                Utilities.searchQueue.postRunnable(new cg.c(akVar, str, !akVar.N.isEmpty(), arrayList2, 14));
                break;
            case 21:
                org.telegram.ui.Components.ak akVar2 = (org.telegram.ui.Components.ak) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                org.telegram.ui.Components.bk bkVar = akVar2.T;
                boolean z10 = bkVar.U;
                org.telegram.ui.Components.qj qjVar = bkVar.r;
                if (z10) {
                    f2.q0 adapter = qjVar.getAdapter();
                    org.telegram.ui.Components.ak akVar3 = bkVar.y;
                    if (adapter != akVar3) {
                        qjVar.setAdapter(akVar3);
                    }
                }
                akVar2.s = arrayList3;
                akVar2.l();
                break;
            case 22:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.b;
                float[] fArr = (float[]) this.c;
                tkVar.getClass();
                tkVar.b0(fArr[0], fArr[1]);
                break;
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                org.telegram.ui.Components.yh yhVar = (org.telegram.ui.Components.yh) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                int currentItemTop = yhVar.getCurrentItemTop();
                int listTopPadding = yhVar.getListTopPadding();
                org.telegram.ui.Components.gl glVar = chatAttachAlertPhotoLayout.A;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                glVar.scrollBy(0, listTopPadding);
                break;
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout2.L;
                if (qlVar != null) {
                    qlVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.em emVar = (org.telegram.ui.Components.em) this.b;
                org.telegram.ui.Components.yh yhVar2 = (org.telegram.ui.Components.yh) this.c;
                int currentItemTop2 = yhVar2.getCurrentItemTop();
                int listTopPadding2 = yhVar2.getListTopPadding();
                hh.f1 f1Var = emVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                f1Var.scrollBy(0, listTopPadding2);
                break;
            case 26:
                org.telegram.ui.Components.un unVar = (org.telegram.ui.Components.un) this.b;
                qf.i iVar = (qf.i) this.c;
                org.telegram.ui.Components.wn.a(unVar.c);
                iVar.run();
                break;
            case 27:
                ((org.telegram.ui.Components.vo) this.b).b.y((List) this.c);
                break;
            case 28:
                ((org.telegram.ui.Components.wo) this.b).b.y((List) this.c);
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                Context context = (Context) this.c;
                e3Var.dismiss();
                we.e.s(context, "https://t.me/BotFather?start=deletebot");
                break;
        }
    }
}
