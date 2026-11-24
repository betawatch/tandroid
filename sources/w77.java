// default package

import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w77 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w77(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ab  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        ArrayList<TLRPC.Chat> arrayList;
        TLRPC.EmojiStatus emojiStatus;
        int i;
        spa spaVar;
        spa spaVar2;
        spa spaVar3;
        byte b = this.a;
        boolean z = true;
        int i2 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                na7 na7Var = (na7) obj4;
                jo2 jo2Var = (jo2) obj3;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    na7Var.U3(peerLinkRequests.chats, false);
                    na7Var.a4(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList2 = peerLinkRequests.requests;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList2.get(i3);
                        i3++;
                        long j = -cf3.n(communityPeerRequest.peer);
                        if (na7Var.L0(j) == null) {
                            na7Var.X2(0, j, true);
                        }
                    }
                    jo2Var.a(peerLinkRequests, null);
                    break;
                } else {
                    jo2Var.a(null, tL_error);
                    break;
                }
            case 1:
                na7 na7Var2 = (na7) obj4;
                be2 be2Var = (be2) obj3;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                if (messages_chats != null) {
                    na7Var2.U3(messages_chats.chats, false);
                    arrayList = messages_chats.chats;
                    na7Var2.E4 = arrayList;
                } else {
                    arrayList = null;
                }
                be2Var.a(arrayList);
                break;
            case 2:
                na7 na7Var3 = (na7) obj4;
                md3 md3Var = (md3) obj3;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    na7Var3.U3(participantJoinedChats.chats, false);
                    na7Var3.a4(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList3 = participantJoinedChats.creator_chat_ids;
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Long l = arrayList3.get(i4);
                        i4++;
                        long longValue = l.longValue();
                        if (na7Var3.L0(longValue) == null) {
                            na7Var3.X2(0, longValue, true);
                        }
                    }
                }
                md3Var.a(participantJoinedChats, tL_error2);
                break;
            case 3:
                ((boolean[]) obj4)[0] = true;
                ((fx0) obj3).dismiss();
                break;
            case 4:
                wt7 wt7Var = (wt7) obj4;
                l34 l34Var = (l34) obj3;
                ((ob6) l34Var).r(wt7Var.v1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                wt7Var.a0(l34Var);
                break;
            case 5:
                i8c i8cVar = (i8c) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((hd) obj4).dismiss();
                if (tL_error3 != null) {
                    i8cVar.a(null, tL_error3.text);
                    break;
                } else {
                    i8cVar.a(passkey, null);
                    break;
                }
            case 6:
                ((c01) obj4).b();
                ((xz7) obj3).a((Boolean) obj);
                break;
            case 7:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj4;
                kh8 kh8Var = (kh8) obj3;
                Long l2 = (Long) obj;
                Integer num = (Integer) obj2;
                premiumPreviewFragment.getClass();
                if (l2 == null) {
                    emojiStatus = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l2.longValue();
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                    }
                    emojiStatus = tL_emojiStatus;
                }
                premiumPreviewFragment.getMessagesController().m5(emojiStatus, null);
                kh8Var.b(l2 != null ? l2.longValue() : 0L, true);
                break;
            case 8:
                sq8 sq8Var = (sq8) obj4;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((xsa) obj3).l;
                int size3 = arrayList5.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj5 = arrayList5.get(i5);
                    i5++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                    if (savedStarGift.pinned_to_top) {
                        int i6 = f08.b;
                        c4c K = c4c.K(f08.class);
                        K.H = savedStarGift;
                        K.L(sq8Var.l1 == savedStarGift.gift.id);
                        K.v = 1;
                        arrayList4.add(K);
                    }
                }
                break;
            case 9:
                jq5 jq5Var = (jq5) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                gl.r((t7a) obj4);
                if (wallettransaction != null) {
                    long j2 = wallettransaction.fee;
                    if (j2 > 0) {
                        r9 = j2;
                    }
                }
                jq5Var.a(Long.valueOf(r9));
                break;
            case 10:
                TextView textView = (TextView) obj4;
                long[] jArr = (long[]) obj3;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    long j3 = wallettransaction2.fee;
                    if (j3 > 0) {
                        jArr[0] = j3;
                        textView.setText(k96.V(null, null, 2131742828, c.w(j3, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 11:
                upa upaVar = (upa) obj4;
                ArrayList arrayList6 = (ArrayList) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                spa[] spaVarArr = upaVar.n;
                je5 je5Var = upaVar.U;
                if (je5Var != null) {
                    je5Var.f(true);
                    upaVar.U = null;
                }
                upaVar.j0 = true;
                upaVar.k0 = starGift == null;
                upaVar.l0 = runnable;
                npa npaVar = new npa(upaVar.h);
                ArrayList arrayList7 = new ArrayList();
                for (int i7 = 0; i7 < spaVarArr.length; i7++) {
                    spa spaVar4 = spaVarArr[i7];
                    if (spaVar4 != null) {
                        TL_stars.StarGift starGift2 = spaVar4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList7.add(Integer.valueOf(i7));
                        }
                    }
                }
                int i8 = 4;
                int i9 = 40;
                if (arrayList7.size() == 1) {
                    npaVar.e(spaVarArr[((Integer) arrayList7.get(0)).intValue()], 5, 0.0f);
                    npaVar.d(false);
                    npaVar.c(26.0f, -26.0f);
                    npaVar.a(90);
                    npaVar.d(true);
                    npaVar.a(20);
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    spa spaVar5 = spaVarArr[0];
                    if (spaVar5 != null) {
                        TL_stars.StarGift starGift3 = spaVar5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            npaVar.e(spaVar5, iArr[0], 0.0f);
                            npaVar.c(25.0f, -22.0f);
                            i = 1;
                            spaVar = spaVarArr[1];
                            if (spaVar != null) {
                                TL_stars.StarGift starGift4 = spaVar.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i > 0) {
                                        npaVar.a(42);
                                    }
                                    npaVar.e(spaVarArr[1], iArr[i], 0.0f);
                                    npaVar.c(25.0f, 31.0f);
                                    i++;
                                }
                            }
                            spaVar2 = spaVarArr[2];
                            if (spaVar2 != null) {
                                TL_stars.StarGift starGift5 = spaVar2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i > 0) {
                                        npaVar.a(42);
                                    }
                                    npaVar.e(spaVarArr[2], iArr[i], 180.0f);
                                    npaVar.c(-36.0f, -36.0f);
                                    i++;
                                }
                            }
                            spaVar3 = spaVarArr[3];
                            if (spaVar3 != null) {
                                TL_stars.StarGift starGift6 = spaVar3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i > 0) {
                                        npaVar.a(42);
                                    }
                                    npaVar.e(spaVarArr[3], iArr[i], 0.0f);
                                    npaVar.c(-31.0f, 31.0f);
                                    i++;
                                }
                            }
                            npaVar.d(false);
                            npaVar.a(40);
                            npaVar.d(true);
                            npaVar.a(40);
                            i8 = iArr[i];
                            i9 = 80;
                        }
                    }
                    i = 0;
                    spaVar = spaVarArr[1];
                    if (spaVar != null) {
                    }
                    spaVar2 = spaVarArr[2];
                    if (spaVar2 != null) {
                    }
                    spaVar3 = spaVarArr[3];
                    if (spaVar3 != null) {
                    }
                    npaVar.d(false);
                    npaVar.a(40);
                    npaVar.d(true);
                    npaVar.a(40);
                    i8 = iArr[i];
                    i9 = 80;
                }
                int i10 = i9;
                mpa mpaVar = new mpa(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new t79(upaVar, i8, starGift, (byte) 11));
                ArrayList arrayList8 = npaVar.b;
                arrayList8.add(mpaVar);
                arrayList8.add(new mpa(4, 0.0f, 0.0f, i10, i8, -90.0f, null, null));
                npaVar.d = new bm8((Object) upaVar, (Object) starGift, (Object) arrayList6, (Object) runnable, (byte) 29);
                npaVar.e = false;
                npaVar.c = 0;
                npaVar.l = false;
                int size4 = arrayList8.size();
                while (true) {
                    opa opaVar = npaVar.a;
                    if (i2 >= size4) {
                        opaVar.I = npaVar;
                        npaVar.b();
                        break;
                    } else {
                        Object obj6 = arrayList8.get(i2);
                        i2++;
                        mpa mpaVar2 = (mpa) obj6;
                        int i11 = mpaVar2.e;
                        if (i11 >= 0 && i11 < 6) {
                            float f = mpaVar2.f;
                            if (f != 0.0f) {
                                opaVar.E[i11] = f;
                            }
                        }
                    }
                }
                break;
            case 12:
                ((jva) obj4).P0((c4c) obj3, (Boolean) obj, (String) obj2);
                break;
            case 13:
                zua zuaVar = (zua) obj4;
                c4c c4cVar = (c4c) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                if (zuaVar.getContext() != null) {
                    if (bool.booleanValue()) {
                        new u21((FrameLayout) zuaVar.b, zuaVar.J0).I(R.raw.stars_topup, k96.M0(2131744922, null), gl.T2(k96.G((int) c4cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                        zuaVar.V1.c(true);
                        gta.v(zuaVar.a, false).P(true);
                        break;
                    } else if (str != null) {
                        new u21((FrameLayout) zuaVar.b, zuaVar.J0).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str)).j();
                        break;
                    }
                }
                break;
            case 14:
                ava avaVar = (ava) obj4;
                c4c c4cVar2 = (c4c) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                if (avaVar.getContext() != null) {
                    avaVar.dismiss();
                    gta.v(avaVar.a, false).P(true);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        if (bool2.booleanValue()) {
                            u21.b0(S).I(R.raw.stars_topup, k96.M0(2131744922, null), gl.T2(k96.G((int) c4cVar2.C, "StarsAcquiredInfo", new Object[0]))).j();
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null) {
                                launchActivity.w0.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            u21.b0(S).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str2)).j();
                            break;
                        }
                    }
                }
                break;
            case 15:
                rzb rzbVar = (rzb) obj4;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                bzb bzbVar = rzbVar.y1;
                qzb qzbVar = rzbVar.H1;
                rzbVar.l1 = null;
                if (tL_error4 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error4.text)) {
                    if (tL_textWithEntities2 != null) {
                        rzbVar.O1 = false;
                        TLRPC.TL_textWithEntities L0 = rzb.L0(tL_textWithEntities, tL_textWithEntities2);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0.text);
                        k27.b(valueOf, L0.entities, false, true, false, false, 0);
                        rzbVar.z1.setText(rzbVar.M0(valueOf));
                        qzbVar.D(bzbVar);
                        break;
                    } else if (rzbVar.O1) {
                        rzbVar.dismiss();
                        kk7.e().k(kk7.R4, 1, k96.M0(2131743707, null));
                        break;
                    } else {
                        yjb.x(null, 2131743707, new u21((FrameLayout) rzbVar.b, rzbVar.J0), null);
                        mzb mzbVar = rzbVar.w1.e;
                        String str3 = rzbVar.v1;
                        rzbVar.u1 = str3;
                        mzbVar.setText(rzb.J0(str3, null, null));
                        qzbVar.D(bzbVar);
                        break;
                    }
                } else {
                    rzbVar.T0();
                    break;
                }
            case 16:
                a61 a61Var = (a61) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                v4c v4cVar = ((u4c) obj4).i;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) || tL_error5 != null) {
                    v4cVar.getClass();
                    z = false;
                }
                a61Var.a(Boolean.valueOf(z));
                v4cVar.getClass();
                break;
            case 17:
                ArrayList arrayList9 = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                int i12 = ((h7c) obj4).a.a;
                if (vector != null) {
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    for (int i13 = 0; i13 < vector.objects.size(); i13++) {
                        if (((Long) arrayList9.get(i13)).longValue() > 0) {
                            TLRPC.User V1 = na7.q1(i12).V1((Long) arrayList9.get(i13));
                            if (V1 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i13);
                                V1.stories_max_id = tL_recentStory;
                                int i14 = V1.flags2;
                                if (tL_recentStory != null) {
                                    V1.flags2 = i14 | 32;
                                } else {
                                    V1.flags2 = i14 & (-33);
                                }
                                arrayList10.add(V1);
                            }
                        } else {
                            TLRPC.Chat K0 = na7.q1(i12).K0((Long) arrayList9.get(i13));
                            if (K0 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i13);
                                K0.stories_max_id = tL_recentStory2;
                                int i15 = K0.flags2;
                                if (tL_recentStory2 != null) {
                                    K0.flags2 = i15 | 16;
                                } else {
                                    K0.flags2 = i15 & (-17);
                                }
                                arrayList11.add(K0);
                            }
                        }
                    }
                    ad7.Y(i12).j1(arrayList10, arrayList11, true, true);
                    kk7.f(i12).k(2, 0);
                    break;
                }
                break;
            case 18:
                ((toc) obj4).f0((p8c) obj3, (y05) obj, (String) obj2);
                break;
            case 19:
                ypc ypcVar = (ypc) obj4;
                f28 f28Var = (f28) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    ypcVar.a0.setLoading(false);
                    break;
                } else {
                    f28Var.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                }
            default:
                itc itcVar = (itc) obj4;
                String str4 = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i16 = itcVar.a;
                if (webpagepreview != null) {
                    na7.q1(i16).a4(webpagepreview.users, false);
                    na7.q1(i16).U3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r11 = messageMedia.webpage;
                    }
                }
                itcVar.b.put(str4, r11);
                ArrayList arrayList12 = (ArrayList) itcVar.c.remove(str4);
                if (arrayList12 != null) {
                    int size5 = arrayList12.size();
                    while (i2 < size5) {
                        Object obj7 = arrayList12.get(i2);
                        i2++;
                        ((i8c) obj7).a(r11, tL_error6);
                    }
                    break;
                }
                break;
        }
    }
}
