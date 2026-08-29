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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ui(Object obj, int i10) {
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
                vi viVar = (vi) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((tn) viVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(viVar.c);
                break;
            case 1:
                tn.X1(((lj) obj).u3);
                break;
            case 2:
                ((oj) obj).T.w0.O(false);
                break;
            case 3:
                oi oiVar = (oi) obj;
                tn tnVar = oiVar.b;
                if (tnVar.a2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(tnVar.a2, (Property<org.telegram.ui.Components.g40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new nh.q5(oiVar, 27));
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
                em emVar = ((ul) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.o2) emVar.M).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                emVar.M.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((im) obj).c.e9(true);
                break;
            case 7:
                ((ri) obj).c(false);
                break;
            case 8:
                tn tnVar2 = ((gn) obj).h;
                tnVar2.getNotificationCenter().onAnimationFinish(tnVar2.E9);
                break;
            case 9:
                tn tnVar3 = ((ln) obj).h;
                tnVar3.f0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(tnVar3.f0.getSearchField());
                if (tnVar3.la > 0) {
                    df dfVar = new df(tnVar3, i14);
                    tnVar3.ma = dfVar;
                    AndroidUtilities.runOnUIThread(dfVar, 200L);
                    break;
                }
                break;
            case 10:
                ko koVar = ((io) obj).a;
                koVar.e.setImageDrawable(koVar.r);
                koVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar.z0;
                if (user != null) {
                    user.photo = null;
                    koVar.getMessagesController().putUser(koVar.z0, true);
                }
                koVar.K0 = true;
                if (koVar.N0 == null) {
                    koVar.N0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar.X.e.setAnimation(koVar.N0);
                break;
            case 11:
                ((nq) obj).run(0);
                break;
            case 12:
                ((nr) obj).invalidateSelf();
                break;
            case 13:
                vr vrVar = (vr) obj;
                ArrayList arrayList = vrVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                vrVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((ns) obj).a;
                contactsActivity.V.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.V.r);
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((dt) obj).a.p();
                break;
            case 17:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
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
                ((org.telegram.ui.Cells.pa) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                fy fyVar = ((ew) obj).x0;
                fyVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) fyVar, 9, true));
                fyVar.v0.setIsEditing(false);
                fyVar.I4(false);
                break;
            case 23:
                fy fyVar2 = ((fw) obj).b;
                fyVar2.v0.setIsEditing(true);
                fyVar2.I4(true);
                break;
            case 24:
                ((gw) obj).a.b0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                fy fyVar3 = ((sx) obj).a;
                i12 = ((org.telegram.ui.ActionBar.o2) fyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                fyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((oy) obj).removeSelfFromStack();
                break;
            case 27:
                ry ryVar = (ry) obj;
                ArrayList arrayList2 = ryVar.x;
                ArrayList arrayList3 = ryVar.w;
                if (ryVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = ryVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = ryVar.v;
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
                            } catch (JSONException e10) {
                                e = e10;
                                ryVar.r = 0;
                                ryVar.v = null;
                                ryVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                ryVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = ryVar.F;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(ryVar.b).getInputPeer(ryVar.E);
                        ConnectionsManager.getInstance(ryVar.b).sendRequest(tL_messages_setTyping, null);
                        ryVar.r = 0;
                        ryVar.v = null;
                        ryVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                ryVar.y = null;
            case 28:
                ((nz) obj).e0(true);
                break;
            default:
                ((lz) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
