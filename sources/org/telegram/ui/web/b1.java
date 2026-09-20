package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Pair;
import android.view.TextureView;
import android.widget.TextView;
import ci.c6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import qg.t2;
import xh.g4;
import xh.i4;
import xh.z3;
import xh.z4;
import yh.u5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        k61 k61Var;
        int i10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        String str;
        int i11 = this.a;
        int i12 = 1;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                z0 z0Var = ((BotWebViewContainer$WebViewProxy) obj2).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                z0Var.d(sb2.toString());
                break;
            case 1:
                i1 i1Var = (i1) obj2;
                i1Var.f = (ArrayList) obj;
                m61 m61Var = i1Var.a;
                if (m61Var.G) {
                    m61Var.Y2.N(true);
                    break;
                }
                break;
            case 2:
                a2 a2Var = (a2) obj2;
                a2Var.r = ((ArrayList) obj).size();
                m61 m61Var2 = a2Var.a;
                if (m61Var2 != null && (k61Var = m61Var2.Y2) != null && m61Var2.G) {
                    k61Var.N(true);
                    break;
                }
                break;
            case 3:
                pg.e0 e0Var = (pg.e0) obj2;
                pg.h1 h1Var = (pg.h1) obj;
                pg.e1 e1Var = e0Var.a;
                if (h1Var != null) {
                    float currentWeight = e1Var.getCurrentWeight();
                    h1Var.f = currentWeight;
                    double d = e0Var.p;
                    if (d > 0.0d) {
                        h1Var.f = (float) ((d / e0Var.q) * currentWeight);
                    }
                    if (h1Var.a.o() == 4) {
                        h1Var.k *= h1Var.f;
                    }
                }
                pg.s0 painting = e1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new pg.o0(painting, h1Var, i12));
                    break;
                }
                break;
            case 4:
                ph.i iVar = (ph.i) obj2;
                if (((ph.b) obj) == ph.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 5:
                c6 c6Var = (c6) obj2;
                TextureView textureView = (TextureView) obj;
                c6Var.w0 = textureView;
                if (textureView != null) {
                    c6Var.q0.addView(textureView, 0);
                    break;
                }
                break;
            case 6:
                t2 t2Var = (t2) obj2;
                t2Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.s = paint;
                Bitmap bitmap = t2Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, j6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, j6.I.q() ? -0.02f : -0.07f);
                t2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                break;
            case 7:
                qh.c cVar = (qh.c) obj2;
                qh.e eVar = (qh.e) obj;
                cVar.h = eVar;
                cVar.c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new r0(cVar, 19), 200L);
                break;
            case 8:
                ((rg.j0) obj2).E1((HashMap) obj);
                break;
            case 9:
                rg.w1 w1Var = (rg.w1) obj2;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (w1Var.d != isEnabled) {
                    w1Var.d = isEnabled;
                    w1Var.invalidate();
                    break;
                }
                break;
            case 10:
                MessageObject messageObject = (MessageObject) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j3 = messageObject.messageOwner.date * 1000;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = tg.i.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
                    xb xbVar = new xb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        xbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        xbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            xbVar.c(R.raw.forward, 30, 30, new String[0]);
                            xbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            xbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            xbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    xbVar.b.setSingleLine(false);
                    xbVar.b.setMaxLines(2);
                    nc ncVar = new nc(R.getParentActivity(), R.getResourceProvider(), true);
                    ncVar.e(LocaleController.getString(R.string.LearnMore));
                    ncVar.a = new ci.u1(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    xbVar.setButton(ncVar);
                    pc.g(R, xbVar, 2750).j();
                    break;
                }
                break;
            case 11:
                tg.s0 s0Var = (tg.s0) obj2;
                s0Var.a0.setLoading(false);
                tg.i.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 12:
                th.f.P((th.f) obj2, (Pair) obj);
                break;
            case 13:
                HashMap hashMap = ((ug.b) obj2).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 14:
                ((ug.e) obj2).F((TLObject) obj);
                break;
            case 15:
                HashMap hashMap2 = ((ug.g) obj2).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 16:
                uh.h hVar = (uh.h) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = hVar.K;
                if (!hVar.T) {
                    hVar.I = bitmap2;
                    Bitmap bitmap3 = hVar.I;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    hVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    Paint paint2 = new Paint(2);
                    hVar.L = paint2;
                    paint2.setShader(hVar.J);
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, j6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, j6.I.q() ? 0.02f : -0.15f);
                    hVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    hVar.J.setLocalMatrix(matrix);
                    break;
                } else {
                    hVar.I.recycle();
                    break;
                }
            case 17:
                ((xh.o1) obj2).a();
                break;
            case 18:
                ((i4) obj2).e0(((Boolean) obj).booleanValue());
                break;
            case 19:
                ((Boolean) obj).getClass();
                z3 z3Var = ((g4) obj2).d;
                if (z3Var != null) {
                    z3Var.run();
                    break;
                }
                break;
            case 20:
                tg.i.j(((z4) obj2).getContext(), (TLRPC.TL_error) obj);
                break;
            case 21:
                yh.a0 a0Var = (yh.a0) obj2;
                int i13 = yh.a0.w0[((Integer) obj).intValue()];
                if (a0Var.n0 != i13) {
                    a0Var.n0 = i13;
                    a0Var.f0.setText(LocaleController.formatPluralString("GiftOfferHours", i13 / 3600, new Object[0]));
                }
                a0Var.T(true);
                break;
            case 22:
                yh.s0 s0Var2 = (yh.s0) obj2;
                s0Var2.i0.g();
                s0Var2.k0.N(true);
                break;
            case 23:
                yh.j2 j2Var = (yh.j2) obj2;
                j2Var.getClass();
                j2Var.s = new Matrix();
                j2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                j2Var.r = bitmapShader2;
                Paint paint3 = j2Var.c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 24:
                u5.a((u5) obj2, (TL_stars.StarGifts) obj);
                break;
            case 25:
                ((f3) obj2).dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i14 = starGift.availability_remains;
                        textView.setText(i14 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i14, LocaleController.formatNumber(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
        }
    }
}
