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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi(Object obj, int i10) {
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
        int i15 = 0;
        Object obj = this.b;
        switch (i14) {
            case 0:
                ei.n5 n5Var = (ei.n5) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((sn) n5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(n5Var.b);
                break;
            case 1:
                xi xiVar = (xi) obj;
                i11 = ((org.telegram.ui.ActionBar.n2) ((sn) xiVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(xiVar.c);
                break;
            case 2:
                sn.X1(((pj) obj).x3);
                break;
            case 3:
                ((sj) obj).T.A0.O(false);
                break;
            case 4:
                qi qiVar = (qi) obj;
                sn snVar = qiVar.b;
                if (snVar.e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(snVar.e2, (Property<org.telegram.ui.Components.r40, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new m.a(qiVar, 25));
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
                fm fmVar = ((vl) obj).c.a;
                i12 = ((org.telegram.ui.ActionBar.n2) fmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                fmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((jm) obj).c.j9(true);
                break;
            case 8:
                ((ti) obj).c(false);
                break;
            case 9:
                sn snVar2 = ((fn) obj).h;
                snVar2.getNotificationCenter().onAnimationFinish(snVar2.I9);
                break;
            case 10:
                sn snVar3 = ((kn) obj).s;
                snVar3.j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(snVar3.j0.getSearchField());
                if (snVar3.pa > 0) {
                    mf mfVar = new mf(snVar3, 7);
                    snVar3.qa = mfVar;
                    AndroidUtilities.runOnUIThread(mfVar, 200L);
                    break;
                }
                break;
            case 11:
                ko koVar = ((io) obj).a;
                koVar.e.setImageDrawable(koVar.r);
                koVar.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = koVar.D0;
                if (user != null) {
                    user.photo = null;
                    koVar.getMessagesController().putUser(koVar.D0, true);
                }
                koVar.O0 = true;
                if (koVar.R0 == null) {
                    koVar.R0 = new org.telegram.ui.Components.uj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                koVar.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                koVar.b0.e.setAnimation(koVar.R0);
                break;
            case 12:
                ((nq) obj).run(0);
                break;
            case 13:
                ((nr) obj).invalidateSelf();
                break;
            case 14:
                wr wrVar = (wr) obj;
                ArrayList arrayList = wrVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                wrVar.invalidateSelf();
                break;
            case 15:
                ContactsActivity contactsActivity = ((ns) obj).a;
                contactsActivity.Z.r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.r);
                break;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 17:
                ((ct) obj).a.p();
                break;
            case 18:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    break;
                }
                break;
            case 19:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                break;
            case 20:
                ((org.telegram.ui.Cells.z2) obj).d();
                break;
            case 21:
                ((org.telegram.ui.Cells.sa) obj).b();
                break;
            case 22:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 23:
                ey eyVar = ((cw) obj).B0;
                eyVar.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) eyVar, 9, true));
                eyVar.z0.setIsEditing(false);
                eyVar.G4(false);
                break;
            case 24:
                ey eyVar2 = ((dw) obj).b;
                eyVar2.z0.setIsEditing(true);
                eyVar2.G4(true);
                break;
            case 25:
                ((ew) obj).a.f0.setAlpha(1.0f);
                break;
            case 26:
                Bundle bundle2 = new Bundle();
                ey eyVar3 = ((rx) obj).a;
                i13 = ((org.telegram.ui.ActionBar.n2) eyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                eyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 27:
                ((ny) obj).removeSelfFromStack();
                break;
            case 28:
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
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i16)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i16)).longValue() / 1000.0f);
                                jSONArray.put(i16, jSONObject2);
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
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                qyVar.y = null;
            default:
                ((nz) obj).e0(true);
                break;
        }
    }
}
