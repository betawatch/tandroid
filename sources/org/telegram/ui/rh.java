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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rh(Object obj, int i10) {
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
                ((n6) obj).a(Boolean.FALSE, null);
                break;
            case 1:
                ci.k kVar = (ci.k) obj;
                i10 = ((org.telegram.ui.ActionBar.k2) ((un) kVar.e)).currentAccount;
                org.telegram.messenger.zs.f(i10).j(kVar.c);
                break;
            case 2:
                dj djVar = (dj) obj;
                i11 = ((org.telegram.ui.ActionBar.k2) ((un) djVar.e)).currentAccount;
                org.telegram.messenger.zs.f(i11).j(djVar.c);
                break;
            case 3:
                un.d2(((vj) obj).F3);
                break;
            case 4:
                ((yj) obj).T.C0.O(false);
                break;
            case 5:
                bi biVar = (bi) obj;
                un unVar = biVar.b;
                if (unVar.s2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(unVar.s2, (Property<org.telegram.ui.Components.q30, Float>) View.ALPHA, 0.0f));
                    animatorSet.addListener(new s9(biVar, 17));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    break;
                }
                break;
            case 6:
                ((org.telegram.messenger.jj) obj).q = false;
                break;
            case 7:
                Bundle bundle = new Bundle();
                fm fmVar = ((zl) obj).c.a;
                i12 = ((org.telegram.ui.ActionBar.k2) fmVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.d20.i(i12).n);
                fmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 8:
                ((hm) obj).b.r9(true);
                break;
            case 9:
                ((bj) obj).c(false);
                break;
            case 10:
                un unVar2 = ((gn) obj).h;
                unVar2.getNotificationCenter().j(unVar2.ba);
                break;
            case 11:
                un unVar3 = ((mn) obj).b;
                unVar3.j0.getSearchField().requestFocus();
                org.telegram.messenger.i0.J3(unVar3.j0.getSearchField());
                if (unVar3.Ia > 0) {
                    mf mfVar = new mf(unVar3, 10);
                    unVar3.Ja = mfVar;
                    org.telegram.messenger.i0.h3(mfVar, 200L);
                    break;
                }
                break;
            case 12:
                oo ooVar = ((lo) obj).a;
                ooVar.e.setImageDrawable(ooVar.r);
                ooVar.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.cd.L0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ooVar.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar.getMessagesController().U3(ooVar.C0, true, false);
                }
                ooVar.O0 = true;
                if (ooVar.R0 == null) {
                    ooVar.R0 = new org.telegram.ui.Components.bi0(R.raw.camera_outline, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                }
                ooVar.b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                ooVar.b0.e.setAnimation(ooVar.R0);
                break;
            case 13:
                ((sq) obj).a(0);
                break;
            case 14:
                ((vr) obj).invalidateSelf();
                break;
            case 15:
                cs csVar = (cs) obj;
                ArrayList arrayList = csVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                csVar.invalidateSelf();
                break;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 17:
                ((gt) obj).a.o();
                break;
            case 18:
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) obj;
                org.telegram.ui.ActionBar.z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                    break;
                }
                break;
            case 19:
                org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(((org.telegram.messenger.c) obj).a);
                q6.getMessagesStorage().a.c(new org.telegram.messenger.y5(q6, i15));
                break;
            case 20:
                ((org.telegram.ui.Cells.d3) obj).updateColors();
                break;
            case 21:
                ((org.telegram.ui.Cells.ma) obj).updateColors();
                break;
            case 22:
                ((org.telegram.ui.Cells.l) obj).updateColors();
                break;
            case 23:
                ((ay) ((ar) obj).b).f0.setAlpha(1.0f);
                break;
            case 24:
                Bundle bundle2 = new Bundle();
                ay ayVar = ((ox) obj).a;
                i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.d20.i(i13).e());
                bundle2.putBoolean("my_profile", true);
                ayVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 25:
                ay ayVar2 = ((qx) obj).B0;
                ayVar2.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) ayVar2, 9, true));
                ayVar2.z0.setIsEditing(false);
                ayVar2.T4(false);
                break;
            case 26:
                ay ayVar3 = ((rx) obj).b;
                ayVar3.z0.setIsEditing(true);
                ayVar3.T4(true);
                break;
            case 27:
                ((iy) obj).removeSelfFromStack();
                break;
            case 28:
                ly lyVar = (ly) obj;
                ArrayList arrayList2 = lyVar.y;
                ArrayList arrayList3 = lyVar.x;
                if (lyVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = lyVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = lyVar.w;
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
                                lyVar.r = 0;
                                lyVar.w = null;
                                lyVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.f8.g(e, true);
                                lyVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = lyVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.vp.r1(lyVar.b).i1(lyVar.I);
                        ConnectionsManager.getInstance(lyVar.b).sendRequest(tL_messages_setTyping, null);
                        lyVar.r = 0;
                        lyVar.w = null;
                        lyVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                lyVar.D = null;
            default:
                ((iz) obj).i0(true);
                break;
        }
    }
}
