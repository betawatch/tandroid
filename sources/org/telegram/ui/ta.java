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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ta(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                AndroidUtilities.runOnUIThread(new ai.a9((vb) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (sa) this.f));
                break;
            case 1:
                zn znVar = (zn) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l4 = (Long) obj;
                int i10 = znVar.R3;
                Object obj2 = this.e;
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.L(znVar.getParentActivity(), znVar.T5, new a1.d(znVar, tL_document, str, obj2, 4), znVar.ea);
                } else {
                    znVar.getSendMessagesHelper().sendSticker(tL_document, str, znVar.T5, znVar.n5, znVar.X3, null, znVar.l5, sendAnimationData, true, 0, 0, false, obj2, znVar.H8(), l4.longValue(), znVar.S8(), znVar.g5);
                    tL_document = tL_document;
                }
                znVar.j9(false);
                znVar.Y.m(tL_document);
                znVar.Y.setFieldText("");
                break;
            case 2:
                final zn znVar2 = (zn) this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                String str2 = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? znVar2.getMessagesController().getUserFull(user.id) : null;
                org.telegram.ui.Components.p80 I = org.telegram.ui.Components.p80.I(znVar2, u1Var);
                org.telegram.ui.Components.gn0 gn0Var = new org.telegram.ui.Components.gn0(znVar2.getParentActivity(), znVar2.ea);
                I.p = new se(gn0Var, 1);
                z zVar = new z(znVar2, user, str2, 2);
                org.telegram.ui.Components.p80 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new nu0(I, 26), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(znVar2, I, str2), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new nu0(zVar, 27), false);
                if (tL_contact == null && (user == null || !znVar2.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new ue(znVar2, str2, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(znVar2, str2, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(znVar2, str2, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new qg(znVar2, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i11 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.og
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i11) {
                                    case 0:
                                        zn znVar3 = znVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z12, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z122, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                    default:
                                        zn znVar4 = znVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z13, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z132, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i12 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.og
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i12) {
                                    case 0:
                                        zn znVar3 = znVar2;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            znVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z122, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z1222, znVar3.getParentActivity(), userFull2, znVar3.getAccountInstance());
                                    default:
                                        zn znVar4 = znVar2;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            znVar4.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z132, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z1322, znVar4.getParentActivity(), userFull3, znVar4.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new ue(znVar2, str2, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new ue(znVar2, str2, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(znVar2, gn0Var, user, 17));
                }
                gn0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.v61) {
                    String url = ((org.telegram.ui.Components.v61) characterStyle).getURL();
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
                    gn0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    gn0Var.f(u1Var, characterStyle, null, false);
                }
                znVar2.showDialog(gn0Var);
                break;
            case 3:
                org.telegram.ui.Components.yy yyVar = (org.telegram.ui.Components.yy) this.b;
                String str3 = (String) this.f;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.zy zyVar = yyVar.a;
                String str4 = zyVar.v;
                ArrayList arrayList4 = zyVar.r;
                ArrayList arrayList5 = zyVar.h;
                ArrayList arrayList6 = zyVar.s;
                org.telegram.ui.Components.a00 a00Var = zyVar.F;
                if (str3.equals(str4)) {
                    org.telegram.ui.Components.zw zwVar = a00Var.V;
                    org.telegram.ui.Components.my myVar = a00Var.P;
                    int i13 = 0;
                    zwVar.e(false);
                    zyVar.y = true;
                    s4.i0 adapter = myVar.getAdapter();
                    org.telegram.ui.Components.zy zyVar2 = a00Var.S;
                    if (adapter != zyVar2) {
                        myVar.setAdapter(zyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(zyVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        org.telegram.ui.Components.sy syVar = (org.telegram.ui.Components.sy) obj3;
                        if (longSparseIntArray.indexOfKey(syVar.c.id) < 0) {
                            longSparseIntArray.append(syVar.c.id, 1);
                            arrayList6.add(syVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        org.telegram.ui.Components.sy syVar2 = (org.telegram.ui.Components.sy) obj4;
                        if (longSparseIntArray.indexOfKey(syVar2.c.id) < 0) {
                            longSparseIntArray.append(syVar2.c.id, 1);
                            arrayList6.add(syVar2);
                        }
                    }
                    zyVar.l();
                    break;
                }
                break;
            case 4:
                ty tyVar = (ty) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Long l10 = (Long) this.d;
                md mdVar = (md) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                tyVar.getClass();
                b2Var.dismiss();
                tyVar.getMessagesController().loadChannelParticipants(l10);
                ny nyVar = tyVar.C2;
                tyVar.removeSelfFromStack();
                mdVar.removeSelfFromStack();
                n2Var.finishFragment();
                if (nyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    nyVar.w(tyVar, arrayList7, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
                    break;
                }
                break;
            default:
                yh.s3.s0((yh.s3) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.cd[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ ta(org.telegram.ui.Components.yy yyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 3;
        this.b = yyVar;
        this.f = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
