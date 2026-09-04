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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                AndroidUtilities.runOnUIThread(new bi.h8((ub) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (sa) this.f));
                break;
            case 1:
                final co coVar = (co) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? coVar.getMessagesController().getUserFull(user.id) : null;
                org.telegram.ui.Components.n70 I = org.telegram.ui.Components.n70.I(coVar, t1Var);
                org.telegram.ui.Components.am0 am0Var = new org.telegram.ui.Components.am0(coVar.getParentActivity(), coVar.ea);
                I.p = new qe(am0Var, 1);
                y yVar = new y(coVar, user, str, 2);
                org.telegram.ui.Components.n70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lu0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new r1(coVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new lu0(yVar, 26), false);
                if (tL_contact == null && (user == null || !coVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new fi.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new se(coVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(coVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(coVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new sg(coVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i10 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.rg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i10) {
                                    case 0:
                                        co coVar2 = coVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            coVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                    default:
                                        co coVar3 = coVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            coVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.rg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i11) {
                                    case 0:
                                        co coVar2 = coVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            coVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, false, z10, coVar2.getParentActivity(), userFull2, coVar2.getAccountInstance());
                                    default:
                                        co coVar3 = coVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            coVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.d2.m(user, true, z11, coVar3.getParentActivity(), userFull3, coVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new se(coVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new se(coVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new r1(coVar, am0Var, user, 16));
                }
                am0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.n51) {
                    String url = ((org.telegram.ui.Components.n51) characterStyle).getURL();
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
                    am0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    am0Var.f(t1Var, characterStyle, null, false);
                }
                coVar.showDialog(am0Var);
                break;
            case 2:
                co coVar2 = (co) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l4 = (Long) obj;
                int i12 = coVar2.R3;
                Object obj2 = this.e;
                if (i12 == 1) {
                    org.telegram.ui.Components.e5.M(coVar2.getParentActivity(), coVar2.T5, new a1.d(coVar2, tL_document, str2, obj2, 4), coVar2.ea);
                } else {
                    coVar2.getSendMessagesHelper().sendSticker(tL_document, str2, coVar2.T5, coVar2.n5, coVar2.X3, null, coVar2.l5, sendAnimationData, true, 0, 0, false, obj2, coVar2.C8(), l4.longValue(), coVar2.N8(), coVar2.g5);
                    tL_document = tL_document;
                }
                coVar2.e9(false);
                coVar2.Y.o(tL_document);
                coVar2.Y.setFieldText("");
                break;
            case 3:
                org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) this.b;
                String str3 = (String) this.f;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.ky kyVar = jyVar.a;
                String str4 = kyVar.v;
                ArrayList arrayList4 = kyVar.r;
                ArrayList arrayList5 = kyVar.h;
                ArrayList arrayList6 = kyVar.s;
                org.telegram.ui.Components.kz kzVar = kyVar.F;
                if (str3.equals(str4)) {
                    org.telegram.ui.Components.kw kwVar = kzVar.V;
                    org.telegram.ui.Components.kx kxVar = kzVar.P;
                    int i13 = 0;
                    kwVar.e(false);
                    kyVar.y = true;
                    s4.h0 adapter = kxVar.getAdapter();
                    org.telegram.ui.Components.ky kyVar2 = kzVar.S;
                    if (adapter != kyVar2) {
                        kxVar.setAdapter(kyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(kyVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        org.telegram.ui.Components.dy dyVar = (org.telegram.ui.Components.dy) obj3;
                        if (longSparseIntArray.indexOfKey(dyVar.c.id) < 0) {
                            longSparseIntArray.append(dyVar.c.id, 1);
                            arrayList6.add(dyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        org.telegram.ui.Components.dy dyVar2 = (org.telegram.ui.Components.dy) obj4;
                        if (longSparseIntArray.indexOfKey(dyVar2.c.id) < 0) {
                            longSparseIntArray.append(dyVar2.c.id, 1);
                            arrayList6.add(dyVar2);
                        }
                    }
                    kyVar.l();
                    break;
                }
                break;
            case 4:
                uy uyVar = (uy) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                Long l10 = (Long) this.d;
                md mdVar = (md) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                uyVar.getClass();
                b2Var.dismiss();
                uyVar.getMessagesController().loadChannelParticipants(l10);
                oy oyVar = uyVar.C2;
                uyVar.removeSelfFromStack();
                mdVar.removeSelfFromStack();
                n2Var.finishFragment();
                if (oyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    oyVar.u(uyVar, arrayList7, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
                    break;
                }
                break;
            default:
                zh.w3.s0((zh.w3) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.ad[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ ta(org.telegram.ui.Components.jy jyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 3;
        this.b = jyVar;
        this.f = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
