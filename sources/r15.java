// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r15 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r15(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z;
        byte b;
        String str;
        int size;
        int i;
        byte b2;
        String[] strArr;
        TLObject tLObject2 = tLObject;
        byte b3 = this.a;
        byte b4 = 14;
        byte b5 = 26;
        byte b6 = 2;
        String str2 = null;
        byte b7 = 20;
        byte b8 = 29;
        byte b9 = 25;
        byte b10 = 0;
        Object obj = this.b;
        switch (b3) {
            case 0:
                gm.c3(new ve4((t15) obj, tLObject2, (byte) 17));
                break;
            case 1:
                gm.c3(new if4(obj, (Object) tL_error, (Object) tLObject2, (byte) 19));
                break;
            case 2:
                i85 i85Var = (i85) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    oc7.r1(i85Var.b.n1.a).T3((TLRPC.TL_updates) tLObject2, false);
                    break;
                }
                break;
            case 3:
                gm.c3(new ve4((kd5) obj, tL_error, b8));
                break;
            case 4:
                gm.c3(new fd5((xs5) obj, tLObject2, b4));
                break;
            case 5:
                gm.c3(new if4((it5) obj, tL_error, tLObject2, b8));
                break;
            case 6:
                gm.c3(new k16((a66) obj, tLObject2, (byte) 4));
                break;
            case 7:
                gm.c3(new k16((ag6) obj, tL_error, (byte) 21));
                break;
            case 8:
                gm.c3(new dt5((rg6) obj, tL_error, tLObject2, (byte) 24));
                break;
            case 9:
                gm.c3(new dt5((wg6) obj, tLObject2, tL_error, b5));
                break;
            case 10:
                gm.c3(new fp6((n57) obj, tL_error, tLObject2, b4));
                break;
            case 11:
                gm.c3(new vt2((Runnable) obj, (byte) 3));
                break;
            case 12:
                cc7 cc7Var = (cc7) obj;
                TLRPC.ChannelParticipant channelParticipant = tLObject2 instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject2).participant : null;
                boolean z2 = (tL_error != null || channelParticipant == null || channelParticipant.left) ? false : true;
                if (channelParticipant != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant.admin_rights;
                    str2 = channelParticipant.rank;
                    tL_chatAdminRights = tL_chatAdminRights2;
                } else {
                    tL_chatAdminRights = null;
                }
                cc7Var.a(z2, tL_chatAdminRights, str2);
                break;
            case 13:
                gm.c3(new q87((ic7) obj, tLObject2, (byte) 16));
                break;
            case 14:
                jc7 jc7Var = (jc7) obj;
                ArrayList arrayList = new ArrayList();
                if (tLObject2 instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject2).documents;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        TLRPC.Document document = arrayList2.get(i2);
                        i2++;
                        arrayList.add(jc7Var.d(document));
                    }
                }
                gm.c3(new fp6((Object) jc7Var, tLObject2, arrayList, b5));
                break;
            case 15:
                gm.c3(new kl7((NotificationsSettingsActivity) obj, b6));
                break;
            case 16:
                gm.c3(new ud7(obj, (Object) tL_error, (Object) tLObject2, (byte) 11));
                break;
            case 17:
                sz7 sz7Var = (sz7) obj;
                if (tL_error != null && tL_error.text != null) {
                    gm.c3(new bl7(sz7Var, tL_error, b9));
                    break;
                }
                break;
            case 18:
                gm.c3(new a18((ai8) obj, tLObject2, b7));
                break;
            case 19:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.getClass();
                gm.c3(new ak8((Object) premiumPreviewFragment, (Object) tL_error, (Object) tLObject2, (byte) 0));
                break;
            case 20:
                gm.c3(new a18((PrivacyControlActivity) obj, tLObject2, b9));
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    gm.c3(new a18(privacySettingsActivity, (TL_account.Password) tLObject2, (byte) 27));
                    break;
                }
                break;
            case 22:
                uq8 uq8Var = (uq8) obj;
                int i3 = uq8Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    oc7.r1(i3).d4(tL_messages_webPage.users, false);
                    oc7.r1(i3).X3(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.WebPage) {
                    ArrayList arrayList3 = new ArrayList();
                    TLRPC.WebPage webPage = (TLRPC.WebPage) tLObject2;
                    TL_iv.Page page = webPage.cached_page;
                    if (page != null) {
                        int size3 = page.blocks.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size3) {
                                TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i4);
                                if (pageBlock instanceof TL_iv.pageBlockList) {
                                    if (i4 != 0) {
                                        TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(i4 - 1);
                                        if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                                            str = o.y(((TL_iv.pageBlockParagraph) pageBlock2).text).toString();
                                            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                                            size = pageblocklist.items.size();
                                            i = b10;
                                            while (i < size) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String C = o.C(tL_pageListItemText.text);
                                                    String charSequence = o.y(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(C) && !TextUtils.isEmpty(charSequence)) {
                                                        b2 = b10;
                                                        if (str != null) {
                                                            strArr = new String[2];
                                                            strArr[b2] = jb6.M0(2131745202, null);
                                                            strArr[1] = str;
                                                        } else {
                                                            strArr = new String[1];
                                                            strArr[b2] = jb6.M0(2131745202, null);
                                                        }
                                                        arrayList3.add(new bc7(charSequence, strArr, C));
                                                        i++;
                                                        b10 = b2;
                                                    }
                                                }
                                                b2 = b10;
                                                i++;
                                                b10 = b2;
                                            }
                                            b = b10;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    i = b10;
                                    while (i < size) {
                                    }
                                    b = b10;
                                } else {
                                    b = b10;
                                    if (!(pageBlock instanceof TL_iv.pageBlockAnchor)) {
                                    }
                                }
                                i4++;
                                b10 = b;
                            } else {
                                b = b10;
                            }
                        }
                        uq8Var.F = webPage;
                    } else {
                        b = 0;
                    }
                    gm.c3(new mn8(uq8Var, arrayList3, (byte) 17));
                    z = b;
                } else {
                    z = 0;
                }
                uq8Var.G = z;
                break;
            case 23:
                gm.c3(new ey8((pz8) obj, tLObject2, (byte) 5));
                break;
            case 24:
                p19 p19Var = (p19) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject2;
                    int i5 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    p19Var.post(new h65(p19Var, i5, tL_messages_messageReactionsList, b8));
                    break;
                }
                break;
            case 25:
                gm.c3(new t19((c29) obj, tLObject2, b10));
                break;
            case 26:
                gm.c3(new ey8((gd9) obj, tLObject2, b7));
                break;
            case 27:
                gm.c3(new ey8((fi9) obj, tLObject2, b9));
                break;
            case 28:
                gm.c3(new ey8((kl9) obj, tLObject2, (byte) 28));
                break;
            default:
                gm.c3(new ak8(obj, tLObject2, (Object) tL_error, (byte) 18));
                break;
        }
    }
}
