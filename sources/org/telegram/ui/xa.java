package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.k8((ac) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (wa) this.f));
                break;
            case 1:
                fo foVar = (fo) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l4 = (Long) obj;
                int i10 = foVar.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.L(foVar.getParentActivity(), foVar.T5, new a1.d(foVar, tL_document, str, obj2, 4), foVar.ea);
                } else {
                    foVar.getSendMessagesHelper().sendSticker(tL_document, str, foVar.T5, foVar.n5, foVar.X3, null, foVar.l5, sendAnimationData, true, 0, 0, false, obj2, foVar.H8(), l4.longValue(), foVar.S8(), foVar.g5);
                    tL_document = tL_document;
                }
                foVar.j9(false);
                foVar.Y.m(tL_document);
                foVar.Y.setFieldText("");
                break;
            case 2:
                final fo foVar2 = (fo) this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                String str2 = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? foVar2.getMessagesController().getUserFull(user.id) : null;
                org.telegram.ui.Components.l80 I = org.telegram.ui.Components.l80.I(foVar2, u1Var);
                org.telegram.ui.Components.cn0 cn0Var = new org.telegram.ui.Components.cn0(foVar2.getParentActivity(), foVar2.ea);
                I.p = new ye(cn0Var, 1);
                z zVar = new z(foVar2, user, str2, 2);
                org.telegram.ui.Components.l80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new su0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new t1(foVar2, I, str2), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new su0(zVar, 27), false);
                if (tL_contact == null && (user == null || !foVar2.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new fi.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new af(foVar2, str2, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new af(foVar2, str2, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new af(foVar2, str2, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new vg(foVar2, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i11 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.tg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i11) {
                                    case 0:
                                        fo foVar3 = foVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            foVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z12, foVar3.getParentActivity(), userFull2, foVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z122, foVar3.getParentActivity(), userFull2, foVar3.getAccountInstance());
                                    default:
                                        fo foVar4 = foVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            foVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z13, foVar4.getParentActivity(), userFull3, foVar4.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z132, foVar4.getParentActivity(), userFull3, foVar4.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i12 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.tg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i12) {
                                    case 0:
                                        fo foVar3 = foVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            foVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z122, foVar3.getParentActivity(), userFull2, foVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z1222, foVar3.getParentActivity(), userFull2, foVar3.getAccountInstance());
                                    default:
                                        fo foVar4 = foVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            foVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z132, foVar4.getParentActivity(), userFull3, foVar4.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z1322, foVar4.getParentActivity(), userFull3, foVar4.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new af(foVar2, str2, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new af(foVar2, str2, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new t1(foVar2, cn0Var, user, 17));
                }
                cn0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.s61) {
                    String url = ((org.telegram.ui.Components.s61) characterStyle).getURL();
                    if (url == null) {
                        url = "";
                    }
                    String trim = url.trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        trim = trim.substring(0, 204) + "…";
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    cn0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    cn0Var.f(u1Var, characterStyle, null, false);
                }
                foVar2.showDialog(cn0Var);
                break;
            case 3:
                org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) this.b;
                String str3 = (String) this.f;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.vy vyVar = uyVar.a;
                String str4 = vyVar.v;
                ArrayList arrayList4 = vyVar.r;
                ArrayList arrayList5 = vyVar.h;
                ArrayList arrayList6 = vyVar.s;
                org.telegram.ui.Components.wz wzVar = vyVar.F;
                if (str3.equals(str4)) {
                    org.telegram.ui.Components.vw vwVar = wzVar.V;
                    org.telegram.ui.Components.iy iyVar = wzVar.P;
                    int i13 = 0;
                    vwVar.e(false);
                    vyVar.y = true;
                    s4.g0 adapter = iyVar.getAdapter();
                    org.telegram.ui.Components.vy vyVar2 = wzVar.S;
                    if (adapter != vyVar2) {
                        iyVar.setAdapter(vyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(vyVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        org.telegram.ui.Components.oy oyVar = (org.telegram.ui.Components.oy) obj3;
                        if (longSparseIntArray.indexOfKey(oyVar.c.id) < 0) {
                            longSparseIntArray.append(oyVar.c.id, 1);
                            arrayList6.add(oyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        org.telegram.ui.Components.oy oyVar2 = (org.telegram.ui.Components.oy) obj4;
                        if (longSparseIntArray.indexOfKey(oyVar2.c.id) < 0) {
                            longSparseIntArray.append(oyVar2.c.id, 1);
                            arrayList6.add(oyVar2);
                        }
                    }
                    vyVar.l();
                    break;
                }
                break;
            case 4:
                yy yyVar = (yy) this.b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.c;
                Long l10 = (Long) this.d;
                sd sdVar = (sd) this.e;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f;
                yyVar.getClass();
                a2Var.dismiss();
                yyVar.getMessagesController().loadChannelParticipants(l10);
                sy syVar = yyVar.C2;
                yyVar.removeSelfFromStack();
                sdVar.removeSelfFromStack();
                m2Var.finishFragment();
                if (syVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    syVar.w(yyVar, arrayList7, null, false, yyVar.J2, yyVar.K2, yyVar.L2, null);
                    break;
                }
                break;
            default:
                zh.r3.s0((zh.r3) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.bd[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ xa(org.telegram.ui.Components.uy uyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 3;
        this.b = uyVar;
        this.f = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
