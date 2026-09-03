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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zi(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 9;
        int i15 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                aj ajVar = (aj) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) ajVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(ajVar.c);
                break;
            case 1:
                xn.X1(((qj) obj).v3);
                break;
            case 2:
                ((tj) obj).T.x0.O(false);
                break;
            case 3:
                ti tiVar = (ti) obj;
                xn xnVar = tiVar.b;
                if (xnVar.b2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xnVar.b2, (Property<org.telegram.ui.Components.m40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new s5(tiVar, 18));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    break;
                }
                break;
            case 4:
                ((MessageObject) obj).settingAvatar = false;
                break;
            case 5:
                Bundle bundle = new Bundle();
                jm jmVar = ((am) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.p2) jmVar.N).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                jmVar.N.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((nm) obj).c.e9(true);
                break;
            case 7:
                ((wi) obj).c(false);
                break;
            case 8:
                xn xnVar2 = ((kn) obj).h;
                xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.F9);
                break;
            case 9:
                xn xnVar3 = ((pn) obj).h;
                xnVar3.g0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(xnVar3.g0.getSearchField());
                if (xnVar3.ma > 0) {
                    lf lfVar = new lf(xnVar3, i14);
                    xnVar3.na = lfVar;
                    AndroidUtilities.runOnUIThread(lfVar, 200L);
                    break;
                }
                break;
            case 10:
                po poVar = ((no) obj).a;
                poVar.e.setImageDrawable(poVar.r);
                poVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = poVar.A0;
                if (user != null) {
                    user.photo = null;
                    poVar.getMessagesController().putUser(poVar.A0, true);
                }
                poVar.L0 = true;
                if (poVar.O0 == null) {
                    poVar.O0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                poVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                poVar.Y.e.setAnimation(poVar.O0);
                break;
            case 11:
                ((uq) obj).run(0);
                break;
            case 12:
                ((ur) obj).invalidateSelf();
                break;
            case 13:
                ds dsVar = (ds) obj;
                ArrayList arrayList = dsVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                dsVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((vs) obj).a;
                contactsActivity.W.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.W.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((mt) obj).a.p();
                break;
            case 17:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 19:
                ((org.telegram.ui.Cells.z2) obj).d();
                break;
            case 20:
                ((org.telegram.ui.Cells.sa) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                py pyVar = ((ow) obj).y0;
                pyVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) pyVar, 9, true));
                pyVar.w0.setIsEditing(false);
                pyVar.I4(false);
                break;
            case 23:
                py pyVar2 = ((pw) obj).b;
                pyVar2.w0.setIsEditing(true);
                pyVar2.I4(true);
                break;
            case 24:
                ((qw) obj).a.c0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                py pyVar3 = ((dy) obj).a;
                i12 = ((org.telegram.ui.ActionBar.p2) pyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                pyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((yy) obj).removeSelfFromStack();
                break;
            case 27:
                cz czVar = (cz) obj;
                ArrayList arrayList2 = czVar.x;
                ArrayList arrayList3 = czVar.w;
                if (czVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = czVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = czVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i16)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i16)).longValue() / 1000.0f);
                                jSONArray.put(i16, jSONObject2);
                            } catch (JSONException e6) {
                                e = e6;
                                czVar.r = 0;
                                czVar.v = null;
                                czVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                czVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = czVar.G;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(czVar.b).getInputPeer(czVar.F);
                        ConnectionsManager.getInstance(czVar.b).sendRequest(tL_messages_setTyping, null);
                        czVar.r = 0;
                        czVar.v = null;
                        czVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                czVar.y = null;
            case 28:
                ((zz) obj).e0(true);
                break;
            default:
                ((xz) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
