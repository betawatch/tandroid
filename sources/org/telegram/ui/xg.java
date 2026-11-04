package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xg(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 9;
        int i15 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                ((o6) obj).a(Boolean.FALSE, null);
                break;
            case 1:
                gi.z4 z4Var = (gi.z4) obj;
                i3 = ((org.telegram.ui.ActionBar.d2) ((wm) z4Var.e)).currentAccount;
                org.telegram.messenger.hs.f(i3).j(z4Var.b);
                break;
            case 2:
                fi fiVar = (fi) obj;
                i10 = ((org.telegram.ui.ActionBar.d2) ((wm) fiVar.e)).currentAccount;
                org.telegram.messenger.hs.f(i10).j(fiVar.c);
                break;
            case 3:
                wm.e2(((wi) obj).G3);
                break;
            case 4:
                ((zi) obj).T.D0.O(false);
                break;
            case 5:
                ((org.telegram.messenger.zi) obj).q = false;
                break;
            case 6:
                Bundle bundle = new Bundle();
                fl flVar = ((zk) obj).c.a;
                i11 = ((org.telegram.ui.ActionBar.d2) flVar.R).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.h10.i(i11).n);
                flVar.R.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((hl) obj).b.B9(true);
                break;
            case 8:
                ((di) obj).c(false);
                break;
            case 9:
                wm wmVar = ((im) obj).h;
                wmVar.getNotificationCenter().j(wmVar.ca);
                break;
            case 10:
                wm wmVar2 = ((om) obj).b;
                wmVar2.k0.getSearchField().requestFocus();
                org.telegram.messenger.g0.K3(wmVar2.k0.getSearchField());
                if (wmVar2.Ja > 0) {
                    xe xeVar = new xe(wmVar2, i14);
                    wmVar2.Ka = xeVar;
                    org.telegram.messenger.g0.i3(xeVar, 200L);
                    break;
                }
                break;
            case 11:
                ln lnVar = ((jn) obj).a;
                lnVar.e.setImageDrawable(lnVar.r);
                lnVar.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = lnVar.D0;
                if (user != null) {
                    user.photo = null;
                    lnVar.getMessagesController().X3(lnVar.D0, true, false);
                }
                lnVar.P0 = true;
                if (lnVar.S0 == null) {
                    lnVar.S0 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                lnVar.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                lnVar.c0.e.setAnimation(lnVar.S0);
                break;
            case 12:
                ((rp) obj).a(0);
                break;
            case 13:
                ((tq) obj).invalidateSelf();
                break;
            case 14:
                ar arVar = (ar) obj;
                ArrayList arrayList = arVar.c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                arVar.invalidateSelf();
                break;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
            case 16:
                ((es) obj).a.o();
                break;
            case 17:
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj;
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                    t2VarArr[0] = null;
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(((org.telegram.messenger.c) obj).a);
                q10.getMessagesStorage().a.c(new org.telegram.messenger.w5(q10, i15));
                break;
            case 19:
                ((org.telegram.ui.Cells.b3) obj).updateColors();
                break;
            case 20:
                ((org.telegram.ui.Cells.ma) obj).updateColors();
                break;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                break;
            case 22:
                ((uw) ((o9) obj).b).g0.setAlpha(1.0f);
                break;
            case 23:
                Bundle bundle2 = new Bundle();
                uw uwVar = ((gw) obj).a;
                i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.h10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                uwVar.presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 24:
                uw uwVar2 = ((jw) obj).C0;
                uwVar2.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) uwVar2, 9, true));
                uwVar2.A0.setIsEditing(false);
                uwVar2.U4(false);
                break;
            case 25:
                uw uwVar3 = ((kw) obj).b;
                uwVar3.A0.setIsEditing(true);
                uwVar3.U4(true);
                break;
            case 26:
                ((cx) obj).removeSelfFromStack();
                break;
            case 27:
                fx fxVar = (fx) obj;
                ArrayList arrayList2 = fxVar.y;
                ArrayList arrayList3 = fxVar.x;
                if (fxVar.r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = fxVar.r;
                    tL_sendMessageEmojiInteraction.emoticon = fxVar.w;
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
                                fxVar.r = 0;
                                fxVar.w = null;
                                fxVar.s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                fxVar.E = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = fxVar.K;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.hp.s1(fxVar.b).j1(fxVar.J);
                        ConnectionsManager.getInstance(fxVar.b).sendRequest(tL_messages_setTyping, null);
                        fxVar.r = 0;
                        fxVar.w = null;
                        fxVar.s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                fxVar.E = null;
            case 28:
                ((cy) obj).j0(true);
                break;
            default:
                ((zx) obj).a.getBackground().setState(new int[0]);
                break;
        }
    }
}
