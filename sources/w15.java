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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class w15 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w15(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
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
        byte b4 = 29;
        byte b5 = 10;
        byte b6 = 2;
        String str2 = null;
        byte b7 = 25;
        byte b8 = 24;
        char c = 1;
        byte b9 = 17;
        byte b10 = 22;
        byte b11 = 0;
        Object obj = this.b;
        switch (b3) {
            case 0:
                hl.c3(new se4((y15) obj, tLObject2, (byte) 13));
                break;
            case 1:
                hl.c3(new re4(obj, (Object) tL_error, (Object) tLObject2, b10));
                break;
            case 2:
                m85 m85Var = (m85) obj;
                if (tLObject2 instanceof TLRPC.TL_updates) {
                    uc7.s1(m85Var.b.n1.a).Y3((TLRPC.TL_updates) tLObject2, false);
                    break;
                }
                break;
            case 3:
                hl.c3(new se4((nd5) obj, tL_error, b7));
                break;
            case 4:
                hl.c3(new tg5((bt5) obj, tLObject2, b5));
                break;
            case 5:
                hl.c3(new ls5((lt5) obj, tL_error, tLObject2, b6));
                break;
            case 6:
                hl.c3(new z56((e66) obj, tLObject2, (byte) 0));
                break;
            case 7:
                hl.c3(new z56((dg6) obj, tL_error, b9));
                break;
            case 8:
                hl.c3(new ls5(obj, (Object) tL_error, (Object) tLObject2, (byte) 27));
                break;
            case 9:
                hl.c3(new ls5((zg6) obj, tLObject2, tL_error, b4));
                break;
            case 10:
                hl.c3(new yg6((u57) obj, tL_error, tLObject2, b9));
                break;
            case 11:
                hl.c3(new dt2((Runnable) obj, (byte) 3));
                break;
            case 12:
                ic7 ic7Var = (ic7) obj;
                TLRPC.ChannelParticipant channelParticipant = tLObject2 instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject2).participant : null;
                boolean z2 = (tL_error != null || channelParticipant == null || channelParticipant.left) ? false : true;
                if (channelParticipant != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant.admin_rights;
                    str2 = channelParticipant.rank;
                    tL_chatAdminRights = tL_chatAdminRights2;
                } else {
                    tL_chatAdminRights = null;
                }
                ic7Var.a(z2, tL_chatAdminRights, str2);
                break;
            case 13:
                hl.c3(new t87((oc7) obj, tLObject2, (byte) 12));
                break;
            case 14:
                pc7 pc7Var = (pc7) obj;
                ArrayList arrayList = new ArrayList();
                if (tLObject2 instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject2).documents;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        TLRPC.Document document = arrayList2.get(i2);
                        i2++;
                        arrayList.add(pc7Var.d(document));
                    }
                }
                hl.c3(new yg6(pc7Var, tLObject2, arrayList, b4));
                break;
            case 15:
                hl.c3(new fe7((NotificationsSettingsActivity) obj, b5));
                break;
            case 16:
                hl.c3(new fd7(obj, (Object) tL_error, (Object) tLObject2, (byte) 16));
                break;
            case 17:
                w08 w08Var = (w08) obj;
                if (tL_error != null && tL_error.text != null) {
                    hl.c3(new pl7(w08Var, tL_error, b10));
                    break;
                }
                break;
            case 18:
                hl.c3(new h68((mj8) obj, tLObject2, b9));
                break;
            case 19:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.getClass();
                hl.c3(new sa8(premiumPreviewFragment, tL_error, tLObject2, (byte) 5));
                break;
            case 20:
                hl.c3(new h68((PrivacyControlActivity) obj, tLObject2, b10));
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                if (tLObject2 != null) {
                    hl.c3(new h68(privacySettingsActivity, (TL_account.Password) tLObject2, b8));
                    break;
                }
                break;
            case 22:
                fs8 fs8Var = (fs8) obj;
                int i3 = fs8Var.f;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    uc7.s1(i3).j4(tL_messages_webPage.users, false);
                    uc7.s1(i3).c4(tL_messages_webPage.chats, false);
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
                                            i = b11;
                                            while (i < size) {
                                                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                                                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                                                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                                                    String C = o.C(tL_pageListItemText.text);
                                                    String charSequence = o.y(tL_pageListItemText.text).toString();
                                                    if (!TextUtils.isEmpty(C) && !TextUtils.isEmpty(charSequence)) {
                                                        b2 = b11;
                                                        if (str != null) {
                                                            strArr = new String[2];
                                                            strArr[b2] = ob6.M0(2131745196, null);
                                                            strArr[1] = str;
                                                        } else {
                                                            strArr = new String[1];
                                                            strArr[b2] = ob6.M0(2131745196, null);
                                                        }
                                                        arrayList3.add(new hc7(charSequence, strArr, C));
                                                        i++;
                                                        b11 = b2;
                                                    }
                                                }
                                                b2 = b11;
                                                i++;
                                                b11 = b2;
                                            }
                                            b = b11;
                                        }
                                    }
                                    str = null;
                                    TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) pageBlock;
                                    size = pageblocklist2.items.size();
                                    i = b11;
                                    while (i < size) {
                                    }
                                    b = b11;
                                } else {
                                    b = b11;
                                    if (!(pageBlock instanceof TL_iv.pageBlockAnchor)) {
                                    }
                                }
                                i4++;
                                b11 = b;
                            } else {
                                b = b11;
                            }
                        }
                        fs8Var.F = webPage;
                    } else {
                        b = 0;
                    }
                    hl.c3(new hp8(fs8Var, arrayList3, (byte) 12));
                    z = b;
                } else {
                    z = 0;
                }
                fs8Var.G = z;
                break;
            case 23:
                hl.c3(new z09((b19) obj, tLObject2, c == true ? 1 : 0));
                break;
            case 24:
                c39 c39Var = (c39) obj;
                if (tLObject2 instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject2;
                    int i5 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    c39Var.post(new a39(c39Var, i5, tL_messages_messageReactionsList, b11));
                    break;
                }
                break;
            case 25:
                hl.c3(new f39((o39) obj, tLObject2, b11));
                break;
            case 26:
                hl.c3(new z09((ue9) obj, tLObject2, b9));
                break;
            case 27:
                hl.c3(new z09((sj9) obj, tLObject2, b10));
                break;
            case 28:
                hl.c3(new z09((wm9) obj, tLObject2, b7));
                break;
            default:
                hl.c3(new sa8((xm9) obj, tLObject2, tL_error, b8));
                break;
        }
    }
}
