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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s87 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s87(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ab  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        int i;
        ArrayList<TLRPC.Chat> arrayList;
        TLRPC.EmojiStatus emojiStatus;
        int i2;
        sra sraVar;
        sra sraVar2;
        sra sraVar3;
        byte b = this.a;
        boolean z = true;
        int i3 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) obj4;
                jac jacVar = (jac) obj3;
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (messages_chats != null) {
                    ArrayList arrayList2 = new ArrayList(messages_chats.chats.size());
                    oc7Var.X3(messages_chats.chats, true);
                    ArrayList<TLRPC.Chat> arrayList3 = messages_chats.chats;
                    int size = arrayList3.size();
                    while (i3 < size) {
                        TLRPC.Chat chat = arrayList3.get(i3);
                        i3++;
                        TLRPC.Chat chat2 = chat;
                        if (chat2.creator && !sd2.p0(chat2) && !sd2.Y(chat2)) {
                            arrayList2.add(chat2);
                        }
                    }
                    jacVar.a(arrayList2, null);
                    break;
                } else {
                    jacVar.a(null, tL_error);
                    break;
                }
                break;
            case 1:
                oc7 oc7Var2 = (oc7) obj4;
                gp2 gp2Var = (gp2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList<TLRPC.Update> arrayList4 = updates.updates;
                    int size2 = arrayList4.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            TLRPC.Update update = arrayList4.get(i4);
                            i4++;
                            TLRPC.Update update2 = update;
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) update2).message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                    i = 2;
                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i = 1;
                                }
                            }
                        } else {
                            i = 0;
                        }
                    }
                    oc7Var2.T3(updates, false);
                    gm.c3(new ob4((Object) oc7Var2, (Object) gp2Var, i, (byte) 10));
                    break;
                } else if (gp2Var != null) {
                    gm.c3(new q87(gp2Var, tL_error2, (byte) 11));
                    break;
                }
                break;
            case 2:
                oc7 oc7Var3 = (oc7) obj4;
                up2 up2Var = (up2) obj3;
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (peerLinkRequests != null) {
                    oc7Var3.X3(peerLinkRequests.chats, false);
                    oc7Var3.d4(peerLinkRequests.users, false);
                    ArrayList<TL_communities.CommunityPeerRequest> arrayList5 = peerLinkRequests.requests;
                    int size3 = arrayList5.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        TL_communities.CommunityPeerRequest communityPeerRequest = arrayList5.get(i5);
                        i5++;
                        long j = -pg3.n(communityPeerRequest.peer);
                        if (oc7Var3.M0(j) == null) {
                            oc7Var3.a3(0, j, true);
                        }
                    }
                    up2Var.a(peerLinkRequests, null);
                    break;
                } else {
                    up2Var.a(null, tL_error3);
                    break;
                }
            case 3:
                oc7 oc7Var4 = (oc7) obj4;
                mf2 mf2Var = (mf2) obj3;
                TLRPC.messages_Chats messages_chats2 = (TLRPC.messages_Chats) obj;
                if (messages_chats2 != null) {
                    oc7Var4.X3(messages_chats2.chats, false);
                    arrayList = messages_chats2.chats;
                    oc7Var4.G4 = arrayList;
                } else {
                    arrayList = null;
                }
                mf2Var.a(arrayList);
                break;
            case 4:
                oc7 oc7Var5 = (oc7) obj4;
                ye3 ye3Var = (ye3) obj3;
                TL_communities.ParticipantJoinedChats participantJoinedChats = (TL_communities.ParticipantJoinedChats) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (participantJoinedChats != null) {
                    oc7Var5.X3(participantJoinedChats.chats, false);
                    oc7Var5.d4(participantJoinedChats.users, false);
                    ArrayList<Long> arrayList6 = participantJoinedChats.creator_chat_ids;
                    int size4 = arrayList6.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Long l = arrayList6.get(i6);
                        i6++;
                        long longValue = l.longValue();
                        if (oc7Var5.M0(longValue) == null) {
                            oc7Var5.a3(0, longValue, true);
                        }
                    }
                }
                ye3Var.a(participantJoinedChats, tL_error4);
                break;
            case 5:
                ((boolean[]) obj4)[0] = true;
                ((my0) obj3).dismiss();
                break;
            case 6:
                xv7 xv7Var = (xv7) obj4;
                w44 w44Var = (w44) obj3;
                ((nd6) w44Var).r(xv7Var.v1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                xv7Var.a0(w44Var);
                break;
            case 7:
                jac jacVar2 = (jac) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                ((he) obj4).dismiss();
                if (tL_error5 != null) {
                    jacVar2.a(null, tL_error5.text);
                    break;
                } else {
                    jacVar2.a(passkey, null);
                    break;
                }
            case 8:
                ((k11) obj4).b();
                ((a28) obj3).a((Boolean) obj);
                break;
            case 9:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj4;
                lj8 lj8Var = (lj8) obj3;
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
                premiumPreviewFragment.getMessagesController().p5(emojiStatus, null);
                lj8Var.b(l2 != null ? l2.longValue() : 0L, true);
                break;
            case 10:
                us8 us8Var = (us8) obj4;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = ((ava) obj3).l;
                int size5 = arrayList8.size();
                int i7 = 0;
                while (i7 < size5) {
                    Object obj5 = arrayList8.get(i7);
                    i7++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                    if (savedStarGift.pinned_to_top) {
                        int i8 = i28.b;
                        c6c K = c6c.K(i28.class);
                        K.H = savedStarGift;
                        K.L(us8Var.l1 == savedStarGift.gift.id);
                        K.v = 1;
                        arrayList7.add(K);
                    }
                }
                break;
            case 11:
                hs5 hs5Var = (hs5) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                gm.r((e6a) obj4);
                if (wallettransaction != null) {
                    long j2 = wallettransaction.fee;
                    if (j2 > 0) {
                        r10 = j2;
                    }
                }
                hs5Var.a(Long.valueOf(r10));
                break;
            case 12:
                TextView textView = (TextView) obj4;
                long[] jArr = (long[]) obj3;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    long j3 = wallettransaction2.fee;
                    if (j3 > 0) {
                        jArr[0] = j3;
                        textView.setText(jb6.V(null, null, 2131742754, c.w(j3, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 13:
                ura uraVar = (ura) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                Runnable runnable = (Runnable) obj2;
                sra[] sraVarArr = uraVar.n;
                hg5 hg5Var = uraVar.U;
                if (hg5Var != null) {
                    hg5Var.f(true);
                    uraVar.U = null;
                }
                uraVar.j0 = true;
                uraVar.k0 = starGift == null;
                uraVar.l0 = runnable;
                nra nraVar = new nra(uraVar.h);
                ArrayList arrayList10 = new ArrayList();
                for (int i9 = 0; i9 < sraVarArr.length; i9++) {
                    sra sraVar4 = sraVarArr[i9];
                    if (sraVar4 != null) {
                        TL_stars.StarGift starGift2 = sraVar4.h;
                        if (starGift2 == null) {
                            starGift2 = null;
                        }
                        if (starGift2 != null) {
                            arrayList10.add(Integer.valueOf(i9));
                        }
                    }
                }
                int i10 = 4;
                int i11 = 40;
                if (arrayList10.size() == 1) {
                    nraVar.e(sraVarArr[((Integer) arrayList10.get(0)).intValue()], 5, 0.0f);
                    nraVar.d(false);
                    nraVar.c(26.0f, -26.0f);
                    nraVar.a(90);
                    nraVar.d(true);
                    nraVar.a(20);
                } else {
                    int[] iArr = {5, 0, 2, 3, 4};
                    sra sraVar5 = sraVarArr[0];
                    if (sraVar5 != null) {
                        TL_stars.StarGift starGift3 = sraVar5.h;
                        if (starGift3 == null) {
                            starGift3 = null;
                        }
                        if (starGift3 != null) {
                            nraVar.e(sraVar5, iArr[0], 0.0f);
                            nraVar.c(25.0f, -22.0f);
                            i2 = 1;
                            sraVar = sraVarArr[1];
                            if (sraVar != null) {
                                TL_stars.StarGift starGift4 = sraVar.h;
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                if (starGift4 != null) {
                                    if (i2 > 0) {
                                        nraVar.a(42);
                                    }
                                    nraVar.e(sraVarArr[1], iArr[i2], 0.0f);
                                    nraVar.c(25.0f, 31.0f);
                                    i2++;
                                }
                            }
                            sraVar2 = sraVarArr[2];
                            if (sraVar2 != null) {
                                TL_stars.StarGift starGift5 = sraVar2.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 != null) {
                                    if (i2 > 0) {
                                        nraVar.a(42);
                                    }
                                    nraVar.e(sraVarArr[2], iArr[i2], 180.0f);
                                    nraVar.c(-36.0f, -36.0f);
                                    i2++;
                                }
                            }
                            sraVar3 = sraVarArr[3];
                            if (sraVar3 != null) {
                                TL_stars.StarGift starGift6 = sraVar3.h;
                                if ((starGift6 != null ? starGift6 : null) != null) {
                                    if (i2 > 0) {
                                        nraVar.a(42);
                                    }
                                    nraVar.e(sraVarArr[3], iArr[i2], 0.0f);
                                    nraVar.c(-31.0f, 31.0f);
                                    i2++;
                                }
                            }
                            nraVar.d(false);
                            nraVar.a(40);
                            nraVar.d(true);
                            nraVar.a(40);
                            i10 = iArr[i2];
                            i11 = 80;
                        }
                    }
                    i2 = 0;
                    sraVar = sraVarArr[1];
                    if (sraVar != null) {
                    }
                    sraVar2 = sraVarArr[2];
                    if (sraVar2 != null) {
                    }
                    sraVar3 = sraVarArr[3];
                    if (sraVar3 != null) {
                    }
                    nraVar.d(false);
                    nraVar.a(40);
                    nraVar.d(true);
                    nraVar.a(40);
                    i10 = iArr[i2];
                    i11 = 80;
                }
                int i12 = i11;
                mra mraVar = new mra(1, 0.0f, 0.0f, 0, -1, 0.0f, null, new v99(uraVar, i10, starGift, (byte) 11));
                ArrayList arrayList11 = nraVar.b;
                arrayList11.add(mraVar);
                arrayList11.add(new mra(4, 0.0f, 0.0f, i12, i10, -90.0f, null, null));
                nraVar.d = new no8((Object) uraVar, (Object) starGift, (Object) arrayList9, (Object) runnable, (byte) 29);
                nraVar.e = false;
                nraVar.c = 0;
                nraVar.l = false;
                int size6 = arrayList11.size();
                while (true) {
                    ora oraVar = nraVar.a;
                    if (i3 >= size6) {
                        oraVar.I = nraVar;
                        nraVar.b();
                        break;
                    } else {
                        Object obj6 = arrayList11.get(i3);
                        i3++;
                        mra mraVar2 = (mra) obj6;
                        int i13 = mraVar2.e;
                        if (i13 >= 0 && i13 < 6) {
                            float f = mraVar2.f;
                            if (f != 0.0f) {
                                oraVar.E[i13] = f;
                            }
                        }
                    }
                }
                break;
            case 14:
                ((nxa) obj4).Q0((c6c) obj3, (Boolean) obj, (String) obj2);
                break;
            case 15:
                dxa dxaVar = (dxa) obj4;
                c6c c6cVar = (c6c) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                if (dxaVar.getContext() != null) {
                    if (bool.booleanValue()) {
                        new c41((FrameLayout) dxaVar.b, dxaVar.J0).I(R.raw.stars_topup, jb6.M0(2131744848, null), gm.S2(jb6.G((int) c6cVar.C, "StarsAcquiredInfo", new Object[0]))).j();
                        dxaVar.V1.c(true);
                        jva.v(dxaVar.a, false).P(true);
                        break;
                    } else if (str != null) {
                        new c41((FrameLayout) dxaVar.b, dxaVar.J0).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str)).j();
                        break;
                    }
                }
                break;
            case 16:
                exa exaVar = (exa) obj4;
                c6c c6cVar2 = (c6c) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                if (exaVar.getContext() != null) {
                    exaVar.dismiss();
                    jva.v(exaVar.a, false).P(true);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        if (bool2.booleanValue()) {
                            c41.b0(S).I(R.raw.stars_topup, jb6.M0(2131744848, null), gm.S2(jb6.G((int) c6cVar2.C, "StarsAcquiredInfo", new Object[0]))).j();
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null) {
                                launchActivity.w0.c(true);
                                break;
                            }
                        } else if (str2 != null) {
                            c41.b0(S).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str2)).j();
                            break;
                        }
                    }
                }
                break;
            case 17:
                s1c s1cVar = (s1c) obj4;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                c1c c1cVar = s1cVar.y1;
                r1c r1cVar = s1cVar.H1;
                s1cVar.l1 = null;
                if (tL_error6 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error6.text)) {
                    if (tL_textWithEntities2 != null) {
                        s1cVar.O1 = false;
                        TLRPC.TL_textWithEntities L0 = s1c.L0(tL_textWithEntities, tL_textWithEntities2);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0.text);
                        k47.b(valueOf, L0.entities, false, true, false, false, 0);
                        s1cVar.z1.setText(s1cVar.M0(valueOf));
                        r1cVar.D(c1cVar);
                        break;
                    } else if (s1cVar.O1) {
                        s1cVar.dismiss();
                        nm7.e().k(nm7.T4, 1, jb6.M0(2131743633, null));
                        break;
                    } else {
                        mlb.y(null, 2131743633, new c41((FrameLayout) s1cVar.b, s1cVar.J0), null);
                        n1c n1cVar = s1cVar.w1.e;
                        String str3 = s1cVar.v1;
                        s1cVar.u1 = str3;
                        n1cVar.setText(s1c.J0(str3, null, null));
                        r1cVar.D(c1cVar);
                        break;
                    }
                } else {
                    s1cVar.T0();
                    break;
                }
            case 18:
                h71 h71Var = (h71) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                v6c v6cVar = ((u6c) obj4).i;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) || tL_error7 != null) {
                    v6cVar.getClass();
                    z = false;
                }
                h71Var.a(Boolean.valueOf(z));
                v6cVar.getClass();
                break;
            case 19:
                ArrayList arrayList12 = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                int i14 = ((i9c) obj4).a.a;
                if (vector != null) {
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    for (int i15 = 0; i15 < vector.objects.size(); i15++) {
                        if (((Long) arrayList12.get(i15)).longValue() > 0) {
                            TLRPC.User W1 = oc7.r1(i14).W1((Long) arrayList12.get(i15));
                            if (W1 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i15);
                                W1.stories_max_id = tL_recentStory;
                                int i16 = W1.flags2;
                                if (tL_recentStory != null) {
                                    W1.flags2 = i16 | 32;
                                } else {
                                    W1.flags2 = i16 & (-33);
                                }
                                arrayList13.add(W1);
                            }
                        } else {
                            TLRPC.Chat L02 = oc7.r1(i14).L0((Long) arrayList12.get(i15));
                            if (L02 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i15);
                                L02.stories_max_id = tL_recentStory2;
                                int i17 = L02.flags2;
                                if (tL_recentStory2 != null) {
                                    L02.flags2 = i17 | 16;
                                } else {
                                    L02.flags2 = i17 & (-17);
                                }
                                arrayList14.add(L02);
                            }
                        }
                    }
                    cf7.Y(i14).j1(arrayList13, arrayList14, true, true);
                    nm7.f(i14).k(2, 0);
                    break;
                }
                break;
            case 20:
                ((vqc) obj4).g0((qac) obj3, (y25) obj, (String) obj2);
                break;
            case 21:
                asc ascVar = (asc) obj4;
                i48 i48Var = (i48) obj3;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    ascVar.a0.setLoading(false);
                    break;
                } else {
                    i48Var.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                }
            default:
                jvc jvcVar = (jvc) obj4;
                String str4 = (String) obj3;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                int i18 = jvcVar.a;
                if (webpagepreview != null) {
                    oc7.r1(i18).d4(webpagepreview.users, false);
                    oc7.r1(i18).X3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r12 = messageMedia.webpage;
                    }
                }
                jvcVar.b.put(str4, r12);
                ArrayList arrayList15 = (ArrayList) jvcVar.c.remove(str4);
                if (arrayList15 != null) {
                    int size7 = arrayList15.size();
                    while (i3 < size7) {
                        Object obj7 = arrayList15.get(i3);
                        i3++;
                        ((jac) obj7).a(r12, tL_error8);
                    }
                    break;
                }
                break;
        }
    }
}
