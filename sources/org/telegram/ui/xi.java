package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xi(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = 9;
        int i16 = 0;
        Object obj = this.b;
        switch (i14) {
            case 0:
                fi.m5 m5Var = (fi.m5) obj;
                i10 = ((org.telegram.ui.ActionBar.r2) ((wn) m5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(m5Var.b);
                break;
            case 1:
                zi ziVar = (zi) obj;
                i11 = ((org.telegram.ui.ActionBar.r2) ((wn) ziVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ziVar.c);
                break;
            case 2:
                wn.a2(((rj) obj).H3);
                break;
            case 3:
                ((uj) obj).T.A0.O(false);
                break;
            case 4:
                si siVar = (si) obj;
                wn wnVar = siVar.b;
                if (wnVar.q2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(wnVar.q2, (Property<org.telegram.ui.Components.t40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new kg.e(siVar, 27));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    break;
                }
                break;
            case 5:
                ((MessageObject) obj).settingAvatar = false;
                break;
            case 6:
                Bundle bundle = new Bundle();
                hm hmVar = ((xl) obj).c.a;
                i12 = ((org.telegram.ui.ActionBar.r2) hmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                hmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((lm) obj).c.r9(true);
                break;
            case 8:
                ((vi) obj).c(false);
                break;
            case 9:
                wn wnVar2 = ((in) obj).j;
                wnVar2.getNotificationCenter().onAnimationFinish(wnVar2.Y9);
                break;
            case 10:
                wn wnVar3 = ((on) obj).b;
                wnVar3.j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(wnVar3.j0.getSearchField());
                if (wnVar3.Fa > 0) {
                    jf jfVar = new jf(wnVar3, i15);
                    wnVar3.Ga = jfVar;
                    AndroidUtilities.runOnUIThread(jfVar, 200L);
                    break;
                }
                break;
            case 11:
                oo ooVar = ((mo) obj).a;
                ooVar.e.setImageDrawable(ooVar.r);
                ooVar.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = ooVar.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar.getMessagesController().putUser(ooVar.C0, true);
                }
                ooVar.N0 = true;
                if (ooVar.Q0 == null) {
                    ooVar.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                ooVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                ooVar.b0.e.setAnimation(ooVar.Q0);
                break;
            case 12:
                ((rq) obj).run(0);
                break;
            case 13:
                ((sr) obj).invalidateSelf();
                break;
            case 14:
                as asVar = (as) obj;
                ArrayList arrayList = asVar.c;
                int size = arrayList.size();
                while (i16 < size) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((View) obj2).invalidate();
                }
                asVar.invalidateSelf();
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((dt) obj).a.n();
                break;
            case 17:
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) obj;
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 19:
                ((org.telegram.ui.Cells.x2) obj).updateColors();
                break;
            case 20:
                ((org.telegram.ui.Cells.xa) obj).updateColors();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                break;
            case 22:
                ((bw) obj).a.f0.setAlpha(1.0f);
                break;
            case 23:
                Bundle bundle2 = new Bundle();
                ey eyVar = ((qx) obj).a;
                i13 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                eyVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 24:
                ey eyVar2 = ((tx) obj).B0;
                eyVar2.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) eyVar2, 9, true));
                eyVar2.z0.setIsEditing(false);
                eyVar2.Q4(false);
                break;
            case 25:
                ey eyVar3 = ((ux) obj).b;
                eyVar3.z0.setIsEditing(true);
                eyVar3.Q4(true);
                break;
            case 26:
                ((ny) obj).removeSelfFromStack();
                break;
            case 27:
                qy qyVar = (qy) obj;
                ArrayList arrayList2 = qyVar.x;
                ArrayList arrayList3 = qyVar.w;
                if (qyVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = qyVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = qyVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i17)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i17)).longValue() / 1000.0f);
                                jSONArray.put(i17, jSONObject2);
                            } catch (JSONException e) {
                                e = e;
                                qyVar.r = 0;
                                qyVar.v = null;
                                qyVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                qyVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = qyVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(qyVar.b).getInputPeer(qyVar.I);
                        ConnectionsManager.getInstance(qyVar.b).sendRequest(tL_messages_setTyping, null);
                        qyVar.r = 0;
                        qyVar.v = null;
                        qyVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                qyVar.y = null;
            case 28:
                ((oz) obj).f0(true);
                break;
            default:
                ((mz) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
