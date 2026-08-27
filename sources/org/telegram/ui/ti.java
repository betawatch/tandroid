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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti(Object obj, int i10) {
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
                ui uiVar = (ui) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((rn) uiVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(uiVar.c);
                break;
            case 1:
                rn.X1(((kj) obj).u3);
                break;
            case 2:
                ((nj) obj).T.w0.O(false);
                break;
            case 3:
                ni niVar = (ni) obj;
                rn rnVar = niVar.b;
                if (rnVar.a2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(rnVar.a2, (Property<org.telegram.ui.Components.x30, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new lh.h9(niVar, 27));
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
                dm dmVar = ((tl) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.n2) dmVar.M).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                dmVar.M.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((hm) obj).c.e9(true);
                break;
            case 7:
                ((qi) obj).c(false);
                break;
            case 8:
                rn rnVar2 = ((en) obj).h;
                rnVar2.getNotificationCenter().onAnimationFinish(rnVar2.E9);
                break;
            case 9:
                rn rnVar3 = ((jn) obj).h;
                rnVar3.f0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(rnVar3.f0.getSearchField());
                if (rnVar3.la > 0) {
                    gf gfVar = new gf(rnVar3, i14);
                    rnVar3.ma = gfVar;
                    AndroidUtilities.runOnUIThread(gfVar, 200L);
                    break;
                }
                break;
            case 10:
                jo joVar = ((ho) obj).a;
                joVar.e.setImageDrawable(joVar.r);
                joVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = joVar.z0;
                if (user != null) {
                    user.photo = null;
                    joVar.getMessagesController().putUser(joVar.z0, true);
                }
                joVar.K0 = true;
                if (joVar.N0 == null) {
                    joVar.N0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                joVar.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                joVar.X.e.setAnimation(joVar.N0);
                break;
            case 11:
                ((nq) obj).run(0);
                break;
            case 12:
                ((pr) obj).invalidateSelf();
                break;
            case 13:
                xr xrVar = (xr) obj;
                ArrayList arrayList = xrVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                xrVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((ps) obj).a;
                contactsActivity.V.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.V.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((ft) obj).a.p();
                break;
            case 17:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 19:
                ((org.telegram.ui.Cells.x2) obj).d();
                break;
            case 20:
                ((org.telegram.ui.Cells.oa) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                gy gyVar = ((fw) obj).x0;
                gyVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) gyVar, 9, true));
                gyVar.v0.setIsEditing(false);
                gyVar.I4(false);
                break;
            case 23:
                gy gyVar2 = ((gw) obj).b;
                gyVar2.v0.setIsEditing(true);
                gyVar2.I4(true);
                break;
            case 24:
                ((hw) obj).a.b0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                gy gyVar3 = ((tx) obj).a;
                i12 = ((org.telegram.ui.ActionBar.n2) gyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                gyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((py) obj).removeSelfFromStack();
                break;
            case 27:
                sy syVar = (sy) obj;
                ArrayList arrayList2 = syVar.x;
                ArrayList arrayList3 = syVar.w;
                if (syVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = syVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = syVar.v;
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
                            } catch (JSONException e9) {
                                e = e9;
                                syVar.r = 0;
                                syVar.v = null;
                                syVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                syVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = syVar.F;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(syVar.b).getInputPeer(syVar.E);
                        ConnectionsManager.getInstance(syVar.b).sendRequest(tL_messages_setTyping, null);
                        syVar.r = 0;
                        syVar.v = null;
                        syVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                syVar.y = null;
            case 28:
                ((oz) obj).e0(true);
                break;
            default:
                ((mz) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
