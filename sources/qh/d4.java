package qh;

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
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.ih;
import org.telegram.ui.py;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        x51 x51Var;
        int i10;
        String str = "";
        int i11 = 6;
        boolean z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                b5 b5Var = (b5) this.b;
                b5Var.d0(b5Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 1:
                ((ba) this.b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 2:
                b7 b7Var = (b7) this.b;
                ArrayList arrayList = (ArrayList) obj;
                if (b7Var.e0 || b7Var.d0 != null) {
                    TLRPC.WebPage webPage = b7Var.d0;
                    t6 t6Var = new t6(b7Var, 0);
                    int i12 = z6.a;
                    j51 J = j51.J(z6.class);
                    J.G = webPage;
                    J.D = t6Var;
                    arrayList.add(J);
                }
                arrayList.add(j51.k(b7Var.V));
                arrayList.add(j51.A(1, null));
                j51 i13 = j51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i13.K(b7Var.j0);
                arrayList.add(i13);
                if (b7Var.j0) {
                    arrayList.add(j51.k(b7Var.W));
                }
                arrayList.add(j51.A(3, null));
                arrayList.add(j51.k(b7Var.X));
                break;
            case 3:
                ca caVar = (ca) this.b;
                Float f10 = (Float) obj2;
                long duration = caVar.U0.getDuration() < 100 ? caVar.H1.h0 : caVar.U0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                s6 s6Var = caVar.H1;
                float f11 = s6Var.a0;
                float f12 = s6Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j10 = (long) (f13 * f14);
                q9 q9Var = caVar.U0;
                long j11 = (long) ((f12 * f14) + j10);
                caVar.J1 = j11;
                q9Var.m(j11);
                f9 f9Var = caVar.s1;
                if (f9Var != null) {
                    f9Var.setCoverTime(caVar.J1);
                }
                s6 s6Var2 = caVar.H1;
                if (s6Var2 != null && s6Var2.g) {
                    s6Var2.j = true;
                    break;
                }
                break;
            case 4:
                ((fa) this.b).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 5:
                ((rh.g) this.b).C0((ArrayList) obj, (x51) obj2);
                break;
            case 6:
                rh.f fVar = (rh.f) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(j51.k(fVar.V));
                arrayList2.add(j51.k(fVar.W));
                break;
            case 7:
                ((sh.j) this.b).E0((ArrayList) obj, (x51) obj2);
                break;
            case 8:
                sh.r.U((sh.r) this.b, (ArrayList) obj);
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
                sh.e1 e1Var = (sh.e1) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(j51.j(-1, e1Var.X));
                arrayList3.add(j51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.V))));
                break;
            case 11:
                sh.p2 p2Var = (sh.p2) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    break;
                } else {
                    sh.y3 y3Var = p2Var.s0;
                    if (y3Var != null) {
                        y3Var.a(tL_webViewResultUrl);
                        p2Var.n();
                        break;
                    }
                }
                break;
            case 12:
                ((sh.d3) this.b).F0((ArrayList) obj, (x51) obj2);
                break;
            case 13:
                ((sh.x3) this.b).U((ArrayList) obj, (x51) obj2);
                break;
            case 14:
                ((th.q) this.b).v.c((ArrayList) obj);
                break;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                xn0 xn0Var = (xn0) ((uf.z) this.b);
                py pyVar = xn0Var.F0;
                AndroidUtilities.hideKeyboard(pyVar.getParentActivity().getCurrentFocus());
                q70 I = q70.I(pyVar, (org.telegram.ui.Cells.h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z4 = false;
                } else {
                    q70 J2 = I.J();
                    J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ec0(I, 24), false);
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
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new lh.y2(I, J2, i11), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ih(xn0Var, pyVar, xn0Var.G0, I, 20), z4);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ih((Object) xn0Var, (Object) pyVar, (Object) tL_sponsoredPeer, (Object) I, 21), z4);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new jp(xn0Var, pyVar, I, 15), z4);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z4;
                I.Z();
                break;
            case 16:
                vf.c.U((vf.c) this.b, (ArrayList) obj, (x51) obj2);
                break;
            case 17:
                vf.k kVar = (vf.k) this.b;
                kVar.I.dismiss();
                kVar.y = (String) obj;
                kVar.B = (TLRPC.InputDocument) obj2;
                kVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(kVar.d);
                kVar.n.setSticker(kVar.y);
                kVar.e0(true);
                b61 b61Var = kVar.a;
                if (b61Var != null && (x51Var = b61Var.V2) != null) {
                    x51Var.N(true);
                    break;
                }
                break;
            case 18:
                vf.f0 f0Var = (vf.f0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                x51 x51Var2 = (x51) obj2;
                x51Var2.B = 1;
                LinearLayout linearLayout = f0Var.X;
                j51 j51Var = new j51(-4);
                j51Var.d = -5;
                j51Var.c = linearLayout;
                j51Var.z = -1;
                arrayList4.add(j51Var);
                TL_account.TL_connectedBot tL_connectedBot = f0Var.U;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        yh.r(R.string.SessionBotConnectedFrom, arrayList4);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(j51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList4.add(j51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList4.add(j51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(j51.B(null));
                    }
                    x51Var2.U();
                    yh.r(R.string.BusinessBotChats2, arrayList4);
                    int i14 = vf.f0.d0;
                    j51 w10 = j51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(f0Var.b0);
                    arrayList4.add(w10);
                    int i15 = vf.f0.e0;
                    j51 w11 = j51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!f0Var.b0);
                    arrayList4.add(w11);
                    x51Var2.T();
                    arrayList4.add(j51.B(null));
                    vf.v vVar = f0Var.W;
                    if (vVar != null) {
                        vVar.a(arrayList4, x51Var2, true);
                    }
                    yh.A(R.string.BusinessBotChatsInfo2, arrayList4);
                    break;
                }
                break;
            case 19:
                final vf.l0 l0Var = (vf.l0) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                x51 x51Var3 = (x51) obj2;
                LongSparseArray longSparseArray = l0Var.K;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                j51 j51Var2 = new j51(2);
                j51Var2.l = string;
                j51Var2.o = string2;
                j51Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                j51Var2.n = "🤖🏝️";
                j51Var2.z = 120;
                arrayList5.add(j51Var2);
                if (l0Var.J != null) {
                    x51Var3.U();
                    long j12 = l0Var.J.id;
                    j51 j51Var3 = new j51(13);
                    j51Var3.x = j12;
                    j51Var3.K(true);
                    final int i16 = z10 ? 1 : 0;
                    j51Var3.D = new View.OnClickListener() { // from class: vf.i0
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
                    arrayList5.add(j51Var3);
                    x51Var3.T();
                } else {
                    x51Var3.U();
                    arrayList5.add(j51.k(l0Var.e));
                    longSparseArray.clear();
                    boolean z11 = false;
                    for (int i17 = 0; i17 < l0Var.d.d.size(); i17++) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i17);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.id;
                                String str3 = l0Var.y;
                                j51 j51Var4 = new j51(13);
                                j51Var4.x = j13;
                                j51Var4.n = str3;
                                arrayList5.add(j51Var4);
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
                                j51 j51Var5 = new j51(13);
                                j51Var5.x = j14;
                                j51Var5.n = str4;
                                arrayList5.add(j51Var5);
                                longSparseArray.put(user2.id, user2);
                                z11 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f.getText().toString()) || l0Var.d.e() || l0Var.x)) {
                        arrayList5.add(j51.k(l0Var.n));
                        z11 = true;
                    }
                    l0Var.h.setVisibility(z11 ? 0 : 8);
                    x51Var3.T();
                }
                arrayList5.add(j51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                x51Var3.U();
                j51 t6 = j51.t(LocaleController.getString(R.string.BusinessBotChats2));
                t6.g = l0Var.J != null;
                arrayList5.add(t6);
                j51 w12 = j51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.F);
                w12.g = l0Var.J != null;
                arrayList5.add(w12);
                j51 w13 = j51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.F);
                w13.g = l0Var.J != null;
                arrayList5.add(w13);
                x51Var3.T();
                arrayList5.add(j51.B(null));
                l0Var.v.a(arrayList5, x51Var3, l0Var.J != null);
                yh.A(R.string.BusinessBotChatsInfo2, arrayList5);
                if (l0Var.J != null) {
                    x51Var3.U();
                    yh.r(R.string.BusinessBotPermissions, arrayList5);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.G;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    j51 m9 = j51.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.G;
                    m9.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m9.f = !l0Var.M;
                    final int i19 = 1;
                    m9.D = new View.OnClickListener() { // from class: vf.i0
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
                        j51 y10 = j51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.g = false;
                        y10.i = 1;
                        arrayList5.add(y10);
                        j51 y11 = j51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(l0Var.G.reply);
                        y11.i = 1;
                        arrayList5.add(y11);
                        j51 y12 = j51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(l0Var.G.read_messages);
                        y12.i = 1;
                        arrayList5.add(y12);
                        j51 y13 = j51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(l0Var.G.delete_sent_messages);
                        y13.i = 1;
                        arrayList5.add(y13);
                        j51 y14 = j51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(l0Var.G.delete_received_messages);
                        y14.i = 1;
                        arrayList5.add(y14);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.G;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    j51 m10 = j51.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.G;
                    m10.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m10.f = !l0Var.N;
                    final int i20 = 2;
                    m10.D = new View.OnClickListener() { // from class: vf.i0
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
                        j51 y15 = j51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(l0Var.G.edit_name);
                        y15.i = 1;
                        arrayList5.add(y15);
                        j51 y16 = j51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(l0Var.G.edit_bio);
                        y16.i = 1;
                        arrayList5.add(y16);
                        j51 y17 = j51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(l0Var.G.edit_profile_photo);
                        y17.i = 1;
                        arrayList5.add(y17);
                        j51 y18 = j51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(l0Var.G.edit_username);
                        y18.i = 1;
                        arrayList5.add(y18);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.G;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    j51 m11 = j51.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.G;
                    m11.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m11.f = !l0Var.O;
                    final int i21 = 3;
                    m11.D = new View.OnClickListener() { // from class: vf.i0
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
                        j51 y19 = j51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(l0Var.G.view_gifts);
                        y19.i = 1;
                        arrayList5.add(y19);
                        j51 y20 = j51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(l0Var.G.sell_gifts);
                        y20.i = 1;
                        arrayList5.add(y20);
                        j51 y21 = j51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(l0Var.G.change_gift_settings);
                        y21.i = 1;
                        arrayList5.add(y21);
                        j51 y22 = j51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(l0Var.G.transfer_and_upgrade_gifts);
                        y22.i = 1;
                        arrayList5.add(y22);
                        j51 y23 = j51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(l0Var.G.transfer_stars);
                        y23.i = 1;
                        arrayList5.add(y23);
                    }
                    j51 m12 = j51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m12.K(l0Var.G.manage_stories);
                    final int i22 = 4;
                    m12.D = new View.OnClickListener() { // from class: vf.i0
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
                    x51Var3.T();
                    arrayList5.add(j51.A(-4, null));
                    arrayList5.add(j51.A(-5, null));
                    arrayList5.add(j51.A(-6, null));
                    arrayList5.add(j51.A(-7, null));
                    break;
                }
                break;
            case 20:
                vf.n0.U((vf.n0) this.b, (ArrayList) obj, (x51) obj2);
                break;
            case 21:
                vf.v0 v0Var = (vf.v0) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i23 = R.raw.biz_map;
                j51 j51Var6 = new j51(2);
                j51Var6.l = string6;
                j51Var6.o = string7;
                j51Var6.k = i23;
                arrayList6.add(j51Var6);
                arrayList6.add(j51.k(v0Var.e));
                arrayList6.add(j51.B(null));
                j51 i24 = j51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i24.K(v0Var.x != null);
                arrayList6.add(i24);
                if (v0Var.x != null) {
                    arrayList6.add(j51.k(v0Var.h));
                }
                arrayList6.add(j51.B(null));
                if (v0Var.w != null && (v0Var.x != null || !TextUtils.isEmpty(v0Var.y))) {
                    z10 = true;
                }
                v0Var.D = z10;
                if (z10) {
                    j51 e6 = j51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e6.r = true;
                    arrayList6.add(e6);
                    arrayList6.add(j51.B(null));
                }
                v0Var.U(true);
                break;
            case 22:
                vf.x0.V((vf.x0) this.b, (ArrayList) obj);
                break;
            case 23:
                vf.z0 z0Var = (vf.z0) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = z0Var.b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                j51 j51Var7 = new j51(9);
                j51Var7.d = -1;
                j51Var7.l = string8;
                j51Var7.K(z0Var.r);
                arrayList7.add(j51Var7);
                arrayList7.add(j51.B(null));
                if (z0Var.r) {
                    for (int i25 = 0; i25 < arrayList8.size(); i25++) {
                        if (i25 > 0) {
                            arrayList7.add(j51.B(null));
                        }
                        vf.w0 w0Var = (vf.w0) arrayList8.get(i25);
                        if (!z0Var.U()) {
                            int i26 = i25 * 3;
                            arrayList7.add(j51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), vf.w0.a(w0Var.a), i26));
                            arrayList7.add(j51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), vf.w0.a(w0Var.b), i26 + 1));
                            j51 e10 = j51.e(i26 + 2, LocaleController.getString(R.string.Remove));
                            e10.r = true;
                            arrayList7.add(e10);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList7.add(j51.B(null));
                        j51 c3 = j51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c3.q = true;
                        arrayList7.add(c3);
                    }
                    yh.A(R.string.BusinessHoursDayInfo, arrayList7);
                    break;
                }
                break;
            case 24:
                vf.r1.V((vf.r1) this.b, (ArrayList) obj, (x51) obj2);
                break;
            case 25:
                vh.a aVar = (vh.a) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(j51.D(0, AndroidUtilities.dp(12.0f)));
                arrayList9.add(j51.j(1, aVar.W));
                arrayList9.add(j51.D(2, AndroidUtilities.dp(12.0f)));
                arrayList9.add(j51.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.Z = arrayList9.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z12 = aVar.Y;
                j51 x10 = j51.x(151, string9, LocaleController.getString(z12 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(true ^ aVar.V);
                arrayList9.add(x10);
                j51 x11 = j51.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z12 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(aVar.V);
                arrayList9.add(x11);
                arrayList9.add(j51.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 26:
                ((ArrayList) obj).add(j51.j(0, ((vh.b) this.b).U));
                break;
            case 27:
                Utilities.themeQueue.postRunnable(new vf.d0(i11, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 28:
                wh.w wVar = (wh.w) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                arrayList10.add(j51.j(1, wVar.X));
                arrayList10.add(j51.j(3, wVar.a0));
                if (wVar.f0 != null) {
                    arrayList10.add(j51.j(2, wVar.Y));
                    break;
                }
                break;
            default:
                wh.r3.I1((wh.r3[]) this.b, (ArrayList) obj, (x51) obj2);
                break;
        }
    }
}
