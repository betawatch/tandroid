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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ri(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 9;
        int i14 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                si siVar = (si) obj;
                i9 = ((org.telegram.ui.ActionBar.o2) ((qn) siVar.e)).currentAccount;
                NotificationCenter.getInstance(i9).onAnimationFinish(siVar.c);
                break;
            case 1:
                qn.X1(((ij) obj).u3);
                break;
            case 2:
                ((lj) obj).T.w0.O(false);
                break;
            case 3:
                li liVar = (li) obj;
                qn qnVar = liVar.b;
                if (qnVar.a2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(qnVar.a2, (Property<org.telegram.ui.Components.s30, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new mh.x(liVar, 25));
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
                bm bmVar = ((sl) obj).c.a;
                i10 = ((org.telegram.ui.ActionBar.o2) bmVar.M).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i10).clientUserId);
                bmVar.M.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                ((gm) obj).c.e9(true);
                break;
            case 7:
                ((oi) obj).c(false);
                break;
            case 8:
                qn qnVar2 = ((dn) obj).h;
                qnVar2.getNotificationCenter().onAnimationFinish(qnVar2.E9);
                break;
            case 9:
                qn qnVar3 = ((in) obj).h;
                qnVar3.f0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(qnVar3.f0.getSearchField());
                if (qnVar3.la > 0) {
                    gf gfVar = new gf(qnVar3, i13);
                    qnVar3.ma = gfVar;
                    AndroidUtilities.runOnUIThread(gfVar, 200L);
                    break;
                }
                break;
            case 10:
                ho hoVar = ((fo) obj).a;
                hoVar.e.setImageDrawable(hoVar.r);
                hoVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = hoVar.z0;
                if (user != null) {
                    user.photo = null;
                    hoVar.getMessagesController().putUser(hoVar.z0, true);
                }
                hoVar.K0 = true;
                if (hoVar.N0 == null) {
                    hoVar.N0 = new org.telegram.ui.Components.mi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                hoVar.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                hoVar.X.e.setAnimation(hoVar.N0);
                break;
            case 11:
                ((lq) obj).run(0);
                break;
            case 12:
                ((nr) obj).invalidateSelf();
                break;
            case 13:
                wr wrVar = (wr) obj;
                ArrayList arrayList = wrVar.c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                wrVar.invalidateSelf();
                break;
            case 14:
                ContactsActivity contactsActivity = ((os) obj).a;
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
                ((org.telegram.ui.Cells.z2) obj).d();
                break;
            case 20:
                ((org.telegram.ui.Cells.sa) obj).b();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                break;
            case 22:
                dy dyVar = ((cw) obj).x0;
                dyVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) dyVar, 9, true));
                dyVar.v0.setIsEditing(false);
                dyVar.I4(false);
                break;
            case 23:
                dy dyVar2 = ((dw) obj).b;
                dyVar2.v0.setIsEditing(true);
                dyVar2.I4(true);
                break;
            case 24:
                ((ew) obj).a.b0.setAlpha(1.0f);
                break;
            case 25:
                Bundle bundle2 = new Bundle();
                dy dyVar3 = ((qx) obj).a;
                i11 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i11).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                dyVar3.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 26:
                ((my) obj).removeSelfFromStack();
                break;
            case 27:
                py pyVar = (py) obj;
                ArrayList arrayList2 = pyVar.x;
                ArrayList arrayList3 = pyVar.w;
                if (pyVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = pyVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = pyVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i15)).intValue() + 1);
                                jSONObject2.put("t", ((Long) arrayList3.get(i15)).longValue() / 1000.0f);
                                jSONArray.put(i15, jSONObject2);
                            } catch (JSONException e10) {
                                e = e10;
                                pyVar.r = 0;
                                pyVar.v = null;
                                pyVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                pyVar.y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = pyVar.F;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(pyVar.b).getInputPeer(pyVar.E);
                        ConnectionsManager.getInstance(pyVar.b).sendRequest(tL_messages_setTyping, null);
                        pyVar.r = 0;
                        pyVar.v = null;
                        pyVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                pyVar.y = null;
            case 28:
                ((lz) obj).d0(true);
                break;
            default:
                ((jz) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
