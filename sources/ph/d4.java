package ph;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import org.telegram.ui.kh;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String upperCase;
        boolean z4;
        w51 w51Var;
        int i10;
        String str = "";
        int i11 = 6;
        boolean z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                c5 c5Var = (c5) this.b;
                c5Var.d0(c5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 1:
                ((ca) this.b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 2:
                c7 c7Var = (c7) this.b;
                ArrayList arrayList = (ArrayList) obj;
                if (c7Var.e0 || c7Var.d0 != null) {
                    TLRPC.WebPage webPage = c7Var.d0;
                    u6 u6Var = new u6(c7Var, 0);
                    int i12 = a7.a;
                    i51 J = i51.J(a7.class);
                    J.G = webPage;
                    J.D = u6Var;
                    arrayList.add(J);
                }
                arrayList.add(i51.k(c7Var.V));
                arrayList.add(i51.A(1, null));
                i51 i13 = i51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i13.K(c7Var.j0);
                arrayList.add(i13);
                if (c7Var.j0) {
                    arrayList.add(i51.k(c7Var.W));
                }
                arrayList.add(i51.A(3, null));
                arrayList.add(i51.k(c7Var.X));
                break;
            case 3:
                da daVar = (da) this.b;
                Float f10 = (Float) obj2;
                long duration = daVar.U0.getDuration() < 100 ? daVar.H1.h0 : daVar.U0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                t6 t6Var = daVar.H1;
                float f11 = t6Var.a0;
                float f12 = t6Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j10 = (long) (f13 * f14);
                s9 s9Var = daVar.U0;
                long j11 = (long) ((f12 * f14) + j10);
                daVar.J1 = j11;
                s9Var.m(j11);
                h9 h9Var = daVar.s1;
                if (h9Var != null) {
                    h9Var.setCoverTime(daVar.J1);
                }
                t6 t6Var2 = daVar.H1;
                if (t6Var2 != null && t6Var2.g) {
                    t6Var2.j = true;
                    break;
                }
                break;
            case 4:
                ((ha) this.b).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 5:
                ((qh.g) this.b).C0((ArrayList) obj, (w51) obj2);
                break;
            case 6:
                qh.f fVar = (qh.f) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(i51.k(fVar.V));
                arrayList2.add(i51.k(fVar.W));
                break;
            case 7:
                ((rh.j) this.b).E0((ArrayList) obj, (w51) obj2);
                break;
            case 8:
                rh.r.U((rh.r) this.b, (ArrayList) obj);
                break;
            case 9:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.b;
                String str2 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb.append("~");
                    sb.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str2 == null) {
                    upperCase = null;
                } else {
                    if (!str2.isEmpty()) {
                        switch (str2) {
                            case "application/epub+zip":
                                str = "epub";
                                break;
                            case "application/vnd.oasis.opendocument.text":
                                str = "odt";
                                break;
                            case "video/3gpp":
                            case "audio/3gpp":
                                str = "3gp";
                                break;
                            case "application/vnd.ms-fontobject":
                                str = "eot";
                                break;
                            case "application/x-cdf":
                                str = "cda";
                                break;
                            case "application/x-csh":
                                str = "csh";
                                break;
                            case "video/x-msvideo":
                                str = "avi";
                                break;
                            case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
                                str = "pptx";
                                break;
                            case "application/vnd.ms-powerpoint":
                                str = "ppt";
                                break;
                            case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
                                str = "docx";
                                break;
                            case "audio/x-midi":
                                str = "midi";
                                break;
                            case "text/calendar":
                                str = "ics";
                                break;
                            case "application/x-httpd-php":
                                str = "php";
                                break;
                            case "audio/3gpp2":
                            case "video/3gpp2":
                                str = "3g2";
                                break;
                            case "application/vnd.apple.installer+xml":
                                str = "mpkg";
                                break;
                            case "application/vnd.ms-excel":
                                str = "xls";
                                break;
                            case "application/gzip":
                            case "application/x-gzip":
                                str = "gz";
                                break;
                            case "application/x-sh":
                                str = "sh";
                                break;
                            case "audio/ogg":
                                str = "opus";
                                break;
                            case "text/plain":
                                str = "txt";
                                break;
                            case "application/x-abiword":
                                str = "abw";
                                break;
                            case "application/ld+json":
                                str = "jsonld";
                                break;
                            case "application/msword":
                                str = "doc";
                                break;
                            case "application/x-bzip":
                                str = "bz";
                                break;
                            case "application/octet-stream":
                                str = "bin";
                                break;
                            case "application/x-bzip2":
                                str = "bz2";
                                break;
                            case "application/vnd.oasis.opendocument.presentation":
                                str = "odp";
                                break;
                            case "application/x-7z-compressed":
                                str = "7z";
                                break;
                            case "application/x-freearc":
                                str = "arc";
                                break;
                            case "audio/mpeg":
                                str = "mp3";
                                break;
                            case "application/vnd.rar":
                                str = "rar";
                                break;
                            case "image/vnd.microsoft.icon":
                                str = "ico";
                                break;
                            case "application/vnd.oasis.opendocument.spreadsheet":
                                str = "ods";
                                break;
                            case "application/vnd.amazon.ebook":
                                str = "azw";
                                break;
                            case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
                                str = "xlsx";
                                break;
                            case "application/java-archive":
                                str = "jar";
                                break;
                            case "text/javascript":
                                str = "js";
                                break;
                            default:
                                if (str2.contains("/")) {
                                    str2 = str2.substring(str2.indexOf("/") + 1);
                                }
                                if (str2.contains("-")) {
                                    str2 = str2.substring(str2.indexOf("-") + 1);
                                }
                                if (str2.contains("+")) {
                                    str2 = str2.substring(0, str2.indexOf("+"));
                                }
                                str = str2.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(upperCase.toUpperCase());
                }
                if (sb.length() <= 0) {
                    sb.append(LocaleController.getString(R.string.AttachDocument));
                }
                k6Var.setText(sb);
                break;
            case 10:
                rh.e1 e1Var = (rh.e1) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(i51.j(-1, e1Var.X));
                arrayList3.add(i51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.V))));
                break;
            case 11:
                rh.p2 p2Var = (rh.p2) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    break;
                } else {
                    rh.y3 y3Var = p2Var.s0;
                    if (y3Var != null) {
                        y3Var.a(tL_webViewResultUrl);
                        p2Var.n();
                        break;
                    }
                }
                break;
            case 12:
                ((rh.d3) this.b).F0((ArrayList) obj, (w51) obj2);
                break;
            case 13:
                ((rh.x3) this.b).U((ArrayList) obj, (w51) obj2);
                break;
            case 14:
                ((sh.q) this.b).v.c((ArrayList) obj);
                break;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                vn0 vn0Var = (vn0) ((tf.z) this.b);
                qy qyVar = vn0Var.F0;
                AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                p70 I = p70.I(qyVar, (org.telegram.ui.Cells.g6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z4 = false;
                } else {
                    p70 J2 = I.J();
                    J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new dc0(I, 24), false);
                    J2.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J2.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J2.k();
                        }
                        J2.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z4 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new kh.y2(I, J2, i11), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new kh(vn0Var, qyVar, vn0Var.G0, I, 20), z4);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new kh((Object) vn0Var, (Object) qyVar, (Object) tL_sponsoredPeer, (Object) I, 21), z4);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new gp(vn0Var, qyVar, I, 15), z4);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z4;
                I.Z();
                break;
            case 16:
                uf.c.U((uf.c) this.b, (ArrayList) obj, (w51) obj2);
                break;
            case 17:
                uf.k kVar = (uf.k) this.b;
                kVar.I.dismiss();
                kVar.y = (String) obj;
                kVar.B = (TLRPC.InputDocument) obj2;
                kVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(kVar.d);
                kVar.n.setSticker(kVar.y);
                kVar.e0(true);
                a61 a61Var = kVar.a;
                if (a61Var != null && (w51Var = a61Var.V2) != null) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 18:
                uf.f0 f0Var = (uf.f0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                w51Var2.B = 1;
                LinearLayout linearLayout = f0Var.X;
                i51 i51Var = new i51(-4);
                i51Var.d = -5;
                i51Var.c = linearLayout;
                i51Var.z = -1;
                arrayList4.add(i51Var);
                TL_account.TL_connectedBot tL_connectedBot = f0Var.U;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        ai.q(R.string.SessionBotConnectedFrom, arrayList4);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(i51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList4.add(i51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList4.add(i51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(i51.B(null));
                    }
                    w51Var2.U();
                    ai.q(R.string.BusinessBotChats2, arrayList4);
                    int i14 = uf.f0.d0;
                    i51 w10 = i51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(f0Var.b0);
                    arrayList4.add(w10);
                    int i15 = uf.f0.e0;
                    i51 w11 = i51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!f0Var.b0);
                    arrayList4.add(w11);
                    w51Var2.T();
                    arrayList4.add(i51.B(null));
                    uf.v vVar = f0Var.W;
                    if (vVar != null) {
                        vVar.a(arrayList4, w51Var2, true);
                    }
                    ai.A(R.string.BusinessBotChatsInfo2, arrayList4);
                    break;
                }
                break;
            case 19:
                final uf.l0 l0Var = (uf.l0) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                LongSparseArray longSparseArray = l0Var.K;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                i51 i51Var2 = new i51(2);
                i51Var2.l = string;
                i51Var2.o = string2;
                i51Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                i51Var2.n = "🤖🏝️";
                i51Var2.z = 120;
                arrayList5.add(i51Var2);
                if (l0Var.J != null) {
                    w51Var3.U();
                    long j12 = l0Var.J.id;
                    i51 i51Var3 = new i51(13);
                    i51Var3.x = j12;
                    i51Var3.K(true);
                    final int i16 = z10 ? 1 : 0;
                    i51Var3.D = new View.OnClickListener() { // from class: uf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var3.G;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var4.G;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var5.G;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(i51Var3);
                    w51Var3.T();
                } else {
                    w51Var3.U();
                    arrayList5.add(i51.k(l0Var.e));
                    longSparseArray.clear();
                    boolean z11 = false;
                    for (int i17 = 0; i17 < l0Var.d.d.size(); i17++) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i17);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.id;
                                String str3 = l0Var.y;
                                i51 i51Var4 = new i51(13);
                                i51Var4.x = j13;
                                i51Var4.n = str3;
                                arrayList5.add(i51Var4);
                                longSparseArray.put(user.id, user);
                                z11 = true;
                            }
                        }
                    }
                    for (int i18 = 0; i18 < l0Var.d.e.size(); i18++) {
                        TLObject tLObject2 = (TLObject) l0Var.d.e.get(i18);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.id;
                                String str4 = l0Var.y;
                                i51 i51Var5 = new i51(13);
                                i51Var5.x = j14;
                                i51Var5.n = str4;
                                arrayList5.add(i51Var5);
                                longSparseArray.put(user2.id, user2);
                                z11 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f.getText().toString()) || l0Var.d.e() || l0Var.x)) {
                        arrayList5.add(i51.k(l0Var.n));
                        z11 = true;
                    }
                    l0Var.h.setVisibility(z11 ? 0 : 8);
                    w51Var3.T();
                }
                arrayList5.add(i51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                w51Var3.U();
                i51 t6 = i51.t(LocaleController.getString(R.string.BusinessBotChats2));
                t6.g = l0Var.J != null;
                arrayList5.add(t6);
                i51 w12 = i51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.F);
                w12.g = l0Var.J != null;
                arrayList5.add(w12);
                i51 w13 = i51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.F);
                w13.g = l0Var.J != null;
                arrayList5.add(w13);
                w51Var3.T();
                arrayList5.add(i51.B(null));
                l0Var.v.a(arrayList5, w51Var3, l0Var.J != null);
                ai.A(R.string.BusinessBotChatsInfo2, arrayList5);
                if (l0Var.J != null) {
                    w51Var3.U();
                    ai.q(R.string.BusinessBotPermissions, arrayList5);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    i51 m9 = i51.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.G;
                    m9.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m9.f = !l0Var.M;
                    final int i19 = 1;
                    m9.D = new View.OnClickListener() { // from class: uf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var3.G;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var5.G;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m9);
                    if (l0Var.M) {
                        i51 y10 = i51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.g = false;
                        y10.i = 1;
                        arrayList5.add(y10);
                        i51 y11 = i51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(l0Var.G.reply);
                        y11.i = 1;
                        arrayList5.add(y11);
                        i51 y12 = i51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(l0Var.G.read_messages);
                        y12.i = 1;
                        arrayList5.add(y12);
                        i51 y13 = i51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(l0Var.G.delete_sent_messages);
                        y13.i = 1;
                        arrayList5.add(y13);
                        i51 y14 = i51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(l0Var.G.delete_received_messages);
                        y14.i = 1;
                        arrayList5.add(y14);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.G;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    i51 m10 = i51.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.G;
                    m10.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m10.f = !l0Var.N;
                    final int i20 = 2;
                    m10.D = new View.OnClickListener() { // from class: uf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m10);
                    if (l0Var.N) {
                        i51 y15 = i51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(l0Var.G.edit_name);
                        y15.i = 1;
                        arrayList5.add(y15);
                        i51 y16 = i51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(l0Var.G.edit_bio);
                        y16.i = 1;
                        arrayList5.add(y16);
                        i51 y17 = i51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(l0Var.G.edit_profile_photo);
                        y17.i = 1;
                        arrayList5.add(y17);
                        i51 y18 = i51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(l0Var.G.edit_username);
                        y18.i = 1;
                        arrayList5.add(y18);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.G;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    i51 m11 = i51.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.G;
                    m11.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m11.f = !l0Var.O;
                    final int i21 = 3;
                    m11.D = new View.OnClickListener() { // from class: uf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m11);
                    if (l0Var.O) {
                        i51 y19 = i51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(l0Var.G.view_gifts);
                        y19.i = 1;
                        arrayList5.add(y19);
                        i51 y20 = i51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(l0Var.G.sell_gifts);
                        y20.i = 1;
                        arrayList5.add(y20);
                        i51 y21 = i51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(l0Var.G.change_gift_settings);
                        y21.i = 1;
                        arrayList5.add(y21);
                        i51 y22 = i51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(l0Var.G.transfer_and_upgrade_gifts);
                        y22.i = 1;
                        arrayList5.add(y22);
                        i51 y23 = i51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(l0Var.G.transfer_stars);
                        y23.i = 1;
                        arrayList5.add(y23);
                    }
                    i51 m12 = i51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m12.K(l0Var.G.manage_stories);
                    final int i22 = 4;
                    m12.D = new View.OnClickListener() { // from class: uf.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.J = null;
                                    l0Var2.c.V2.N(true);
                                    l0Var2.Y(true);
                                    break;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.G;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.c.V2.N(true);
                                    l0Var3.Y(true);
                                    break;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.G;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        l0Var4.X(-14, true, new h0(l0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.c.V2.N(true);
                                        l0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.G;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        l0Var5.X(-17, true, new h0(l0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.c.V2.N(true);
                                        l0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var6 = l0Var;
                                    l0Var6.G.manage_stories = !r0.manage_stories;
                                    l0Var6.c.V2.N(true);
                                    l0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(m12);
                    w51Var3.T();
                    arrayList5.add(i51.A(-4, null));
                    arrayList5.add(i51.A(-5, null));
                    arrayList5.add(i51.A(-6, null));
                    arrayList5.add(i51.A(-7, null));
                    break;
                }
                break;
            case 20:
                uf.n0.U((uf.n0) this.b, (ArrayList) obj, (w51) obj2);
                break;
            case 21:
                uf.v0 v0Var = (uf.v0) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i23 = R.raw.biz_map;
                i51 i51Var6 = new i51(2);
                i51Var6.l = string6;
                i51Var6.o = string7;
                i51Var6.k = i23;
                arrayList6.add(i51Var6);
                arrayList6.add(i51.k(v0Var.e));
                arrayList6.add(i51.B(null));
                i51 i24 = i51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i24.K(v0Var.x != null);
                arrayList6.add(i24);
                if (v0Var.x != null) {
                    arrayList6.add(i51.k(v0Var.h));
                }
                arrayList6.add(i51.B(null));
                if (v0Var.w != null && (v0Var.x != null || !TextUtils.isEmpty(v0Var.y))) {
                    z10 = true;
                }
                v0Var.D = z10;
                if (z10) {
                    i51 e = i51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.r = true;
                    arrayList6.add(e);
                    arrayList6.add(i51.B(null));
                }
                v0Var.U(true);
                break;
            case 22:
                uf.x0.V((uf.x0) this.b, (ArrayList) obj);
                break;
            case 23:
                uf.z0 z0Var = (uf.z0) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = z0Var.b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                i51 i51Var7 = new i51(9);
                i51Var7.d = -1;
                i51Var7.l = string8;
                i51Var7.K(z0Var.r);
                arrayList7.add(i51Var7);
                arrayList7.add(i51.B(null));
                if (z0Var.r) {
                    for (int i25 = 0; i25 < arrayList8.size(); i25++) {
                        if (i25 > 0) {
                            arrayList7.add(i51.B(null));
                        }
                        uf.w0 w0Var = (uf.w0) arrayList8.get(i25);
                        if (!z0Var.U()) {
                            int i26 = i25 * 3;
                            arrayList7.add(i51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), uf.w0.a(w0Var.a), i26));
                            arrayList7.add(i51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), uf.w0.a(w0Var.b), i26 + 1));
                            i51 e6 = i51.e(i26 + 2, LocaleController.getString(R.string.Remove));
                            e6.r = true;
                            arrayList7.add(e6);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList7.add(i51.B(null));
                        i51 c3 = i51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c3.q = true;
                        arrayList7.add(c3);
                    }
                    ai.A(R.string.BusinessHoursDayInfo, arrayList7);
                    break;
                }
                break;
            case 24:
                uf.r1.V((uf.r1) this.b, (ArrayList) obj, (w51) obj2);
                break;
            case 25:
                uh.a aVar = (uh.a) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(i51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList9.add(i51.j(1, aVar.W));
                arrayList9.add(i51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList9.add(i51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.Z = arrayList9.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z12 = aVar.Y;
                i51 x10 = i51.x(151, string9, LocaleController.getString(z12 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(true ^ aVar.V);
                arrayList9.add(x10);
                i51 x11 = i51.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z12 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(aVar.V);
                arrayList9.add(x11);
                arrayList9.add(i51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 26:
                ((ArrayList) obj).add(i51.j(0, ((uh.b) this.b).U));
                break;
            case 27:
                Utilities.themeQueue.postRunnable(new uf.d0(i11, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 28:
                vh.w wVar = (vh.w) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                arrayList10.add(i51.j(1, wVar.X));
                arrayList10.add(i51.j(3, wVar.a0));
                if (wVar.f0 != null) {
                    arrayList10.add(i51.j(2, wVar.Y));
                    break;
                }
                break;
            default:
                vh.s3.H1((vh.s3[]) this.b, (ArrayList) obj, (w51) obj2);
                break;
        }
    }
}
