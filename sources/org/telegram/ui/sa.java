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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                AndroidUtilities.runOnUIThread(new ai.z8((ub) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ra) this.f));
                break;
            case 1:
                final wn wnVar = (wn) this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? wnVar.getMessagesController().getUserFull(user.id) : null;
                org.telegram.ui.Components.y70 I = org.telegram.ui.Components.y70.I(wnVar, u1Var);
                org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(wnVar.getParentActivity(), wnVar.ea);
                I.p = new qe(mm0Var, 1);
                z zVar = new z(wnVar, user, str, 2);
                org.telegram.ui.Components.y70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new eu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(wnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new eu0(zVar, 26), false);
                if (tL_contact == null && (user == null || !wnVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new se(wnVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(wnVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(wnVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new mg(wnVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i10 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.kg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i10) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.kg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i11) {
                                    case 0:
                                        wn wnVar2 = wnVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            wnVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, false, z10, wnVar2.getParentActivity(), userFull2, wnVar2.getAccountInstance());
                                    default:
                                        wn wnVar3 = wnVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            wnVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.g2.m(user, true, z11, wnVar3.getParentActivity(), userFull3, wnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(wnVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(wnVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(wnVar, mm0Var, user, 16));
                }
                mm0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.b61) {
                    String url = ((org.telegram.ui.Components.b61) characterStyle).getURL();
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
                    mm0Var.f(u1Var, characterStyle, spannableString, false);
                } else {
                    mm0Var.f(u1Var, characterStyle, null, false);
                }
                wnVar.showDialog(mm0Var);
                break;
            case 2:
                wn wnVar2 = (wn) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l4 = (Long) obj;
                int i12 = wnVar2.R3;
                Object obj2 = this.e;
                if (i12 == 1) {
                    org.telegram.ui.Components.e5.M(wnVar2.getParentActivity(), wnVar2.T5, new a1.d(wnVar2, tL_document, str2, obj2, 4), wnVar2.ea);
                } else {
                    wnVar2.getSendMessagesHelper().sendSticker(tL_document, str2, wnVar2.T5, wnVar2.n5, wnVar2.X3, null, wnVar2.l5, sendAnimationData, true, 0, 0, false, obj2, wnVar2.C8(), l4.longValue(), wnVar2.N8(), wnVar2.g5);
                    tL_document = tL_document;
                }
                wnVar2.e9(false);
                wnVar2.Y.o(tL_document);
                wnVar2.Y.setFieldText("");
                break;
            case 3:
                org.telegram.ui.Components.ky kyVar = (org.telegram.ui.Components.ky) this.b;
                String str3 = (String) this.f;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.ly lyVar = kyVar.a;
                String str4 = lyVar.v;
                ArrayList arrayList4 = lyVar.r;
                ArrayList arrayList5 = lyVar.h;
                ArrayList arrayList6 = lyVar.s;
                org.telegram.ui.Components.lz lzVar = lyVar.F;
                if (str3.equals(str4)) {
                    org.telegram.ui.Components.kw kwVar = lzVar.V;
                    org.telegram.ui.Components.xx xxVar = lzVar.P;
                    int i13 = 0;
                    kwVar.e(false);
                    lyVar.y = true;
                    s4.h0 adapter = xxVar.getAdapter();
                    org.telegram.ui.Components.ly lyVar2 = lzVar.S;
                    if (adapter != lyVar2) {
                        xxVar.setAdapter(lyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(lyVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        org.telegram.ui.Components.ey eyVar = (org.telegram.ui.Components.ey) obj3;
                        if (longSparseIntArray.indexOfKey(eyVar.c.id) < 0) {
                            longSparseIntArray.append(eyVar.c.id, 1);
                            arrayList6.add(eyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        org.telegram.ui.Components.ey eyVar2 = (org.telegram.ui.Components.ey) obj4;
                        if (longSparseIntArray.indexOfKey(eyVar2.c.id) < 0) {
                            longSparseIntArray.append(eyVar2.c.id, 1);
                            arrayList6.add(eyVar2);
                        }
                    }
                    lyVar.l();
                    break;
                }
                break;
            case 4:
                qy qyVar = (qy) this.b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.c;
                Long l10 = (Long) this.d;
                ld ldVar = (ld) this.e;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f;
                qyVar.getClass();
                a2Var.dismiss();
                qyVar.getMessagesController().loadChannelParticipants(l10);
                ky kyVar2 = qyVar.C2;
                qyVar.removeSelfFromStack();
                ldVar.removeSelfFromStack();
                m2Var.finishFragment();
                if (kyVar2 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    kyVar2.u(qyVar, arrayList7, null, false, qyVar.J2, qyVar.K2, qyVar.L2, null);
                    break;
                }
                break;
            default:
                yh.x3.r0((yh.x3) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.zc[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ sa(org.telegram.ui.Components.ky kyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 3;
        this.b = kyVar;
        this.f = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
