package xh;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.b20;
import org.telegram.ui.oe0;
import org.webrtc.MediaStreamTrack;
import vh.k4;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c1 extends ha {
    public final int P1;
    public final String Q1;
    public p51 R1;
    public final z0 S1;
    public boolean T1;
    public boolean U1;
    public final org.telegram.tgnet.e V1;
    public int W1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    public c1(Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        super(context, null, false, false, p6Var);
        ?? r11;
        int i11;
        b1 d12;
        String str;
        String absolutePath;
        boolean z10;
        char c10;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int i12;
        TLRPC.TL_photo tL_photo2;
        this.T1 = false;
        this.U1 = false;
        this.P1 = i10;
        this.Q1 = h20.p(vp.r1(i10).Z1(Long.valueOf(j10)));
        this.V1 = eVar;
        Y0();
        this.z1 = org.telegram.messenger.i0.L(4.0f);
        this.A1 = org.telegram.messenger.i0.L(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file != null && file.exists() && webPage == null) {
            str = botInlineResult.type;
            absolutePath = file.getAbsolutePath();
            str.getClass();
            z10 = true;
            switch (str) {
                case "sticker":
                case "gif":
                case "file":
                case "audio":
                case "video":
                case "voice":
                    TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                    tL_document2.id = 0L;
                    tL_document2.size = 0L;
                    tL_document2.dc_id = 0;
                    tL_document2.mime_type = botInlineResult.content.mime_type;
                    tL_document2.file_reference = new byte[0];
                    tL_document2.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document2.attributes.add(tL_documentAttributeFilename);
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (str.equals("sticker")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 102340:
                            if (str.equals("gif")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3143036:
                            if (str.equals("file")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 93166550:
                            if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 112202875:
                            if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document2.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] h12 = jj.h1(botInlineResult);
                            tL_documentAttributeImageSize.w = h12[0];
                            tL_documentAttributeImageSize.h = h12[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K = hc.K(new File(b8.z(4), Utilities.a(botInlineResult.thumb.url) + "." + hc.B(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K != null) {
                                        TLRPC.PhotoSize Z = hc.Z(K, 90.0f, 90.0f, 55, false);
                                        if (Z != null) {
                                            tL_document2.thumbs.add(Z);
                                            tL_document2.flags |= 1;
                                        }
                                        K.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                f8.g(th2, true);
                                break;
                            }
                            break;
                        case 1:
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            if (!absolutePath.endsWith("mp4")) {
                                tL_document2.mime_type = "image/gif";
                                break;
                            } else {
                                tL_document2.mime_type = "video/mp4";
                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                break;
                            }
                        case 2:
                            int lastIndexOf = botInlineResult.content.mime_type.lastIndexOf(47);
                            if (lastIndexOf == -1) {
                                tL_documentAttributeFilename.file_name = "file";
                                break;
                            } else {
                                tL_documentAttributeFilename.file_name = "file." + botInlineResult.content.mime_type.substring(lastIndexOf + 1);
                                break;
                            }
                        case 3:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = jj.g1(botInlineResult);
                            tL_documentAttributeAudio.title = botInlineResult.title;
                            int i13 = tL_documentAttributeAudio.flags;
                            tL_documentAttributeAudio.flags = i13 | 1;
                            String str2 = botInlineResult.description;
                            if (str2 != null) {
                                tL_documentAttributeAudio.performer = str2;
                                tL_documentAttributeAudio.flags = i13 | 3;
                            }
                            tL_documentAttributeFilename.file_name = "audio.mp3";
                            tL_document2.attributes.add(tL_documentAttributeAudio);
                            break;
                        case 4:
                            tL_documentAttributeFilename.file_name = "video.mp4";
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                            int[] h13 = jj.h1(botInlineResult);
                            tL_documentAttributeVideo.w = h13[0];
                            tL_documentAttributeVideo.h = h13[1];
                            tL_documentAttributeVideo.duration = jj.g1(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap K2 = hc.K(new File(b8.z(4), Utilities.a(botInlineResult.thumb.url) + "." + hc.B(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (K2 != null) {
                                        TLRPC.PhotoSize Z2 = hc.Z(K2, 90.0f, 90.0f, 55, false);
                                        if (Z2 != null) {
                                            tL_document2.thumbs.add(Z2);
                                            tL_document2.flags |= 1;
                                        }
                                        K2.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                f8.g(th3, true);
                                break;
                            }
                            break;
                        case 5:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = jj.g1(botInlineResult);
                            tL_documentAttributeAudio2.voice = true;
                            tL_documentAttributeFilename.file_name = "audio.ogg";
                            tL_document2.attributes.add(tL_documentAttributeAudio2);
                            break;
                    }
                    if (tL_documentAttributeFilename.file_name == null) {
                        tL_documentAttributeFilename.file_name = "file";
                    }
                    if (tL_document2.mime_type == null) {
                        tL_document2.mime_type = "application/octet-stream";
                    }
                    if (tL_document2.thumbs.isEmpty()) {
                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                        int[] h14 = jj.h1(botInlineResult);
                        tL_photoSize.w = h14[0];
                        z10 = true;
                        tL_photoSize.h = h14[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    } else {
                        z10 = true;
                    }
                    tL_document = tL_document2;
                    tL_photo = null;
                    break;
                case "photo":
                    if (file.exists()) {
                        i12 = 0;
                        tL_photo2 = qz.C(i10).A(absolutePath, null, false);
                    } else {
                        i12 = 0;
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i10).getCurrentTime();
                        tL_photo2.file_reference = new byte[i12];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] h15 = jj.h1(botInlineResult);
                        tL_photoSize2.w = h15[i12];
                        tL_photoSize2.h = h15[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo2.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photo2;
                    tL_document = null;
                    z10 = true;
                    break;
                default:
                    tL_photo = null;
                    tL_document = null;
                    break;
            }
            i11 = i10;
            r11 = z10;
            d12 = d1(i11, j10, botInlineResult, tL_photo, tL_document, null);
        } else {
            r11 = 1;
            i11 = i10;
            d12 = d1(i11, j10, botInlineResult, null, null, webPage);
        }
        b1 b1Var = d12;
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, p6Var, false);
        s0Var.setDelegate(new w0());
        s0Var.setCustomText(cd.L0(2131752979, null));
        x0 x0Var = new x0(context, i11);
        x0Var.setDelegate(new y0());
        x0Var.s3(b1Var, null, false, false, false, false);
        LinearLayout f7 = m5.f(context, r11);
        f7.addView(s0Var, b6.o(-1, -2));
        f7.addView(x0Var, b6.o(-1, -2));
        z0 z0Var = new z0(context, null);
        this.S1 = z0Var;
        z0Var.U(k4.e(null, i11, j10, t6.I.q()));
        z0Var.addView(f7, b6.d(-1, -1.0f, zs.E1, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        vh.d i14 = z20.i(24, context, p6Var, r11);
        i14.i(cd.L0(2131752978, null), false, r11);
        i14.setOnClickListener(new oe0(this, tL_messages_preparedInlineMessage, eVar, i11, j10, qVar));
        frameLayout.addView(i14, b6.d(-1, 48.0f, zs.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.b;
        int i15 = this.t0;
        viewGroup.addView(frameLayout, b6.f(-2.0f, -1, 87, i15, 0, i15, 0));
        tk0 tk0Var = this.k1;
        int i16 = this.t0;
        tk0Var.setPadding(i16, 0, i16, org.telegram.messenger.i0.L(68.0f) + r11);
        this.k1.r1();
        int i17 = t6.a7;
        v0(t6.w0(i17, this.I0));
        Q(i17);
        this.R1.O(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.tgnet.TLRPC$Photo] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.tgnet.TLRPC$TL_document] */
    /* JADX WARN: Type inference failed for: r9v1, types: [org.telegram.tgnet.TLRPC$Document] */
    /* JADX WARN: Type inference failed for: r9v2, types: [org.telegram.tgnet.TLRPC$Document] */
    public static b1 d1(int i10, long j10, TLRPC.BotInlineResult botInlineResult, TLRPC.TL_photo tL_photo, TLRPC.TL_document tL_document, TLRPC.WebPage webPage) {
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.TL_photo tL_photo2 = tL_photo;
        if (tL_photo == null) {
            tL_photo2 = botInlineResult.photo;
        }
        if (tL_document == 0) {
            tL_document = botInlineResult.document;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = false;
        tL_message.flags |= 2048;
        tL_message.via_bot_id = j10;
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.peer_id = vp.r1(i10).y1(d20.i(i10).e());
        tL_message.from_id = vp.r1(i10).y1(d20.i(i10).e());
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage != null) {
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
                TLRPC.TL_botInlineMessageText tL_botInlineMessageText = (TLRPC.TL_botInlineMessageText) botInlineMessage;
                tL_message.message = tL_botInlineMessageText.message;
                tL_message.entities = tL_botInlineMessageText.entities;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
                TLRPC.TL_botInlineMessageMediaContact tL_botInlineMessageMediaContact = (TLRPC.TL_botInlineMessageMediaContact) botInlineMessage;
                TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                tL_messageMediaContact.phone_number = tL_botInlineMessageMediaContact.phone_number;
                tL_messageMediaContact.first_name = tL_botInlineMessageMediaContact.first_name;
                tL_messageMediaContact.last_name = tL_botInlineMessageMediaContact.last_name;
                tL_messageMediaContact.vcard = tL_botInlineMessageMediaContact.vcard;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaContact;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = ((TLRPC.TL_botInlineMessageMediaGeo) botInlineMessage).geo;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaGeo;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.venue_type;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaVenue;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
                TLRPC.TL_botInlineMessageMediaAuto tL_botInlineMessageMediaAuto = (TLRPC.TL_botInlineMessageMediaAuto) botInlineMessage;
                tL_message.message = tL_botInlineMessageMediaAuto.message;
                if (TLObject.hasFlag(tL_botInlineMessageMediaAuto.flags, 2)) {
                    tL_message.flags |= 128;
                    tL_message.entities = tL_botInlineMessageMediaAuto.entities;
                }
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineMessage;
                TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
                tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
                tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
                tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
                tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
                if (TLObject.hasFlag(tL_botInlineMessageMediaInvoice.flags, 1)) {
                    tL_messageMediaInvoice.flags |= 128;
                    tL_messageMediaInvoice.webPhoto = tL_botInlineMessageMediaInvoice.photo;
                }
                tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
                tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaInvoice;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
                TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_messageMediaWebPage.force_large_media = tL_botInlineMessageMediaWebPage.force_large_media;
                tL_messageMediaWebPage.force_small_media = tL_botInlineMessageMediaWebPage.force_small_media;
                tL_messageMediaWebPage.manual = tL_botInlineMessageMediaWebPage.manual;
                tL_messageMediaWebPage.safe = tL_botInlineMessageMediaWebPage.safe;
                tL_message.invert_media = tL_botInlineMessageMediaWebPage.invert_media;
                tL_message.message = tL_botInlineMessageMediaWebPage.message;
                if (webPage != null) {
                    tL_messageMediaWebPage.webpage = webPage;
                } else {
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    if (TLObject.hasFlag(tL_botInlineMessageMediaWebPage.flags, 2)) {
                        tL_message.flags |= 128;
                        tL_message.entities = tL_botInlineMessageMediaWebPage.entities;
                    }
                    String str = tL_botInlineMessageMediaWebPage.url;
                    tL_webPage.display_url = str;
                    tL_webPage.url = str;
                    tL_messageMediaWebPage.webpage = tL_webPage;
                }
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaWebPage;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
                tL_message.flags2 |= TLObject.FLAG_13;
                tL_message.rich_message = ((TLRPC.TL_botInlineMessageRichMessage) botInlineMessage).rich_message;
            }
        }
        if (tL_photo2 != null) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_messageMediaPhoto.photo = tL_photo2;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaPhoto;
        } else if (tL_document != 0) {
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_messageMediaDocument.flags |= 1;
            tL_messageMediaDocument.voice = "voice".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.round = "round".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.document = tL_document;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaDocument;
        }
        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
        if (botInlineMessage2 != null && (replyMarkup = botInlineMessage2.reply_markup) != null) {
            tL_message.flags |= 64;
            tL_message.reply_markup = replyMarkup;
        }
        return new b1(i10, tL_message, true, true);
    }

    public static void e1(Context context, int i10, long j10, String str, p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        x1Var.r(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = vp.r1(i10).n1(j10);
        tL_messages_getPreparedInlineMessage.id = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getPreparedInlineMessage, new b20(i10, x1Var, context, j10, p6Var, qVar, eVar));
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.P1, 0, true, new qh.d(this, 29), this.I0);
        this.R1 = p51Var;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(2131752981, null);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        if (this.T1 || this.U1) {
            return;
        }
        this.U1 = true;
        org.telegram.tgnet.e eVar = this.V1;
        if (eVar != null) {
            eVar.a("USER_DECLINED", null);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tk0 tk0Var = this.k1;
        tk0Var.v0(Math.max((tk0Var.getAdapter() == null ? 0 : tk0Var.getAdapter().b()) - 1, 0));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            int w02 = t6.w0(t6.a7, this.I0);
            if (w02 != this.W1) {
                this.W1 = w02;
                v0(w02);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
