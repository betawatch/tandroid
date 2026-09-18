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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ua(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                AndroidUtilities.runOnUIThread(new ai.z8((wb) this.b, (TLRPC.ChannelParticipant) obj, (ArrayList) this.c, (ArrayList) this.d, (ArrayList) this.e, (ta) this.f));
                break;
            case 1:
                final bo boVar = (bo) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                String str = (String) this.d;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull userFull = user != null ? boVar.getMessagesController().getUserFull(user.id) : null;
                org.telegram.ui.Components.n70 I = org.telegram.ui.Components.n70.I(boVar, t1Var);
                org.telegram.ui.Components.bm0 bm0Var = new org.telegram.ui.Components.bm0(boVar.getParentActivity(), boVar.ea);
                I.p = new re(bm0Var, 1);
                y yVar = new y(boVar, user, str, 2);
                org.telegram.ui.Components.n70 J = I.J();
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ou0(I, 25), false);
                J.k();
                J.c(R.drawable.msg_addbot, LocaleController.getString(R.string.CreateNewContact), new q1(boVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, LocaleController.getString(R.string.AddToExistingContact), new ou0(yVar, 26), false);
                if (tL_contact == null && (user == null || !boVar.getContactsController().contactsDict.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), new ei.m2(I, J, 4), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, LocaleController.getString(R.string.InviteToTelegramShort), new te(boVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new te(boVar, str, 9), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new te(boVar, str, 10), false);
                    I.k();
                    I.p(13, -1, LocaleController.getString(R.string.NumberNotOnTelegram));
                } else {
                    I.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new ug(boVar, user, 0), false);
                    if (!UserObject.isUserSelf(user)) {
                        final int i10 = 0;
                        I.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoiceCallViaTelegram), new Runnable() { // from class: org.telegram.ui.tg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i10) {
                                    case 0:
                                        bo boVar2 = boVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            boVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                    default:
                                        bo boVar3 = boVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            boVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        I.c(R.drawable.msg_videocall, LocaleController.getString(R.string.VideoCallViaTelegram), new Runnable() { // from class: org.telegram.ui.tg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i11) {
                                    case 0:
                                        bo boVar2 = boVar;
                                        TLRPC.UserFull userFull2 = userFull;
                                        if (userFull2 != null) {
                                            boVar2.getClass();
                                            if (userFull2.video_calls_available) {
                                                z10 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, false, z10, boVar2.getParentActivity(), userFull2, boVar2.getAccountInstance());
                                    default:
                                        bo boVar3 = boVar;
                                        TLRPC.UserFull userFull3 = userFull;
                                        if (userFull3 != null) {
                                            boVar3.getClass();
                                            if (userFull3.video_calls_available) {
                                                z11 = true;
                                                org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        org.telegram.ui.Components.voip.f2.m(user, true, z11, boVar3.getParentActivity(), userFull3, boVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, LocaleController.getString(R.string.VoiceCallViaCarrier), new te(boVar, str, 6), false);
                    I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyNumber), new te(boVar, str, 7), false);
                    I.k();
                    I.n(user, LocaleController.getString(R.string.ViewProfile), new q1(boVar, bm0Var, user, 16));
                }
                bm0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.p51) {
                    String url = ((org.telegram.ui.Components.p51) characterStyle).getURL();
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
                    bm0Var.f(t1Var, characterStyle, spannableString, false);
                } else {
                    bm0Var.f(t1Var, characterStyle, null, false);
                }
                boVar.showDialog(bm0Var);
                break;
            case 2:
                bo boVar2 = (bo) this.b;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) this.c;
                String str2 = (String) this.d;
                MessageObject.SendAnimationData sendAnimationData = (MessageObject.SendAnimationData) this.f;
                Long l4 = (Long) obj;
                int i12 = boVar2.R3;
                Object obj2 = this.e;
                if (i12 == 1) {
                    org.telegram.ui.Components.c5.M(boVar2.getParentActivity(), boVar2.T5, new a1.d(boVar2, tL_document, str2, obj2, 4), boVar2.ea);
                } else {
                    boVar2.getSendMessagesHelper().sendSticker(tL_document, str2, boVar2.T5, boVar2.n5, boVar2.X3, null, boVar2.l5, sendAnimationData, true, 0, 0, false, obj2, boVar2.C8(), l4.longValue(), boVar2.N8(), boVar2.g5);
                    tL_document = tL_document;
                }
                boVar2.e9(false);
                boVar2.Y.p(tL_document);
                boVar2.Y.setFieldText("");
                break;
            case 3:
                org.telegram.ui.Components.iy iyVar = (org.telegram.ui.Components.iy) this.b;
                String str3 = (String) this.f;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.Components.jy jyVar = iyVar.a;
                String str4 = jyVar.v;
                ArrayList arrayList4 = jyVar.r;
                ArrayList arrayList5 = jyVar.h;
                ArrayList arrayList6 = jyVar.s;
                org.telegram.ui.Components.kz kzVar = jyVar.F;
                if (str3.equals(str4)) {
                    org.telegram.ui.Components.jw jwVar = kzVar.V;
                    org.telegram.ui.Components.vx vxVar = kzVar.P;
                    int i13 = 0;
                    jwVar.e(false);
                    jyVar.y = true;
                    s4.h0 adapter = vxVar.getAdapter();
                    org.telegram.ui.Components.jy jyVar2 = kzVar.S;
                    if (adapter != jyVar2) {
                        vxVar.setAdapter(jyVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(jyVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        org.telegram.ui.Components.cy cyVar = (org.telegram.ui.Components.cy) obj3;
                        if (longSparseIntArray.indexOfKey(cyVar.c.id) < 0) {
                            longSparseIntArray.append(cyVar.c.id, 1);
                            arrayList6.add(cyVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        org.telegram.ui.Components.cy cyVar2 = (org.telegram.ui.Components.cy) obj4;
                        if (longSparseIntArray.indexOfKey(cyVar2.c.id) < 0) {
                            longSparseIntArray.append(cyVar2.c.id, 1);
                            arrayList6.add(cyVar2);
                        }
                    }
                    jyVar.l();
                    break;
                }
                break;
            case 4:
                wy wyVar = (wy) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.c;
                Long l10 = (Long) this.d;
                nd ndVar = (nd) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f;
                wyVar.getClass();
                c2Var.dismiss();
                wyVar.getMessagesController().loadChannelParticipants(l10);
                qy qyVar = wyVar.C2;
                wyVar.removeSelfFromStack();
                ndVar.removeSelfFromStack();
                o2Var.finishFragment();
                if (qyVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(MessagesStorage.TopicKey.of(-l10.longValue(), 0L));
                    qyVar.u(wyVar, arrayList7, null, false, wyVar.J2, wyVar.K2, wyVar.L2, null);
                    break;
                }
                break;
            default:
                yh.a4.s0((yh.a4) this.b, (TL_stars.StarGift) this.c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.xc[]) this.e, (boolean[]) this.f, (ArrayList) obj);
                break;
        }
    }

    public /* synthetic */ ua(org.telegram.ui.Components.iy iyVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 3;
        this.b = iyVar;
        this.f = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
