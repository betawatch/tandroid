// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class te2 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ te2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // pcc
    public final void a(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        l9c l9cVar;
        l9c l9cVar2;
        byte b = this.a;
        String str = "";
        Object obj2 = this.b;
        switch (b) {
            case 0:
                af2 af2Var = (af2) obj2;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        af2Var.e.put(tL_chatThemeUniqueGift.gift.slug, new ez3(af2Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    break;
                }
                break;
            case 1:
                x7 x7Var = (x7) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = x7Var.G;
                x7Var.a0 = false;
                x7Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                x7Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = x7Var.n;
                if (matrix == null) {
                    x7Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                x7Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = x7Var.n;
                int[] iArr = x7Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                x7Var.h.setLocalMatrix(x7Var.n);
                paint.setShader(x7Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                hl.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                x7Var.invalidate();
                break;
            case 2:
                id idVar = (id) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    if (idVar.G0 == null) {
                        idVar.G0 = new Paint(1);
                    }
                    idVar.D0 = bitmap2;
                    Bitmap bitmap3 = idVar.D0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    idVar.F0 = bitmapShader;
                    idVar.G0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    idVar.E0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = idVar.E0;
                    int[] iArr2 = idVar.y0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    idVar.F0.setLocalMatrix(idVar.E0);
                    idVar.b1.invalidate();
                    break;
                }
                break;
            case 3:
                ((zd) obj2).run();
                break;
            case 4:
                ((tw) obj2).L.p0 = ((Integer) obj).intValue() - hl.n > hl.L(20.0f);
                break;
            case 5:
                HashMap hashMap = ((km0) obj2).x;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 6:
                r47 r47Var = (r47) obj2;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = r47Var.k.media;
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
                long j = r47Var.k.date * 1000;
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    String b2 = ym0.b(r47Var);
                    TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(-r47Var.Z0()));
                    boolean z = M0 != null && xc2.V(M0);
                    c21 c21Var = new c21(Q.getParentActivity(), Q.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        c21Var.g(R.raw.chats_infotip, 30, 30, new String[0]);
                        c21Var.b.setText(ob6.M0(2131753364, null));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            c21Var.g(R.raw.forward, 30, 30, new String[0]);
                            c21Var.b.setText(ob6.M0(2131753362, null));
                        } else {
                            c21Var.g(R.raw.chats_infotip, 30, 30, new String[0]);
                            c21Var.b.setText(ob6.M0(2131753363, null));
                        }
                    }
                    c21Var.b.setSingleLine(false);
                    c21Var.b.setMaxLines(2);
                    t21 t21Var = new t21(Q.getResourceProvider(), Q.getParentActivity(), true);
                    t21Var.e(ob6.M0(2131748764, null));
                    t21Var.b = new va7(payments_giveawayinfo, z, b2, j, tL_messageMediaGiveaway2, Q);
                    c21Var.setButton(t21Var);
                    v21.g(Q, c21Var, 2750).j();
                    break;
                }
                break;
            case 7:
                vo0 vo0Var = (vo0) obj2;
                ArrayList arrayList = vo0Var.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                q9c q9cVar = vo0Var.a;
                if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                    l9cVar.O(true);
                    break;
                }
                break;
            case 8:
                kr0 kr0Var = (kr0) obj2;
                String str2 = (String) obj;
                ArrayList arrayList2 = kr0Var.h;
                if (!arrayList2.contains(str2)) {
                    arrayList2.add(str2);
                    kr0Var.i(true);
                }
                hl.d3(new a30(kr0Var, str2, (byte) 15), 120L);
                break;
            case 9:
                nv0 nv0Var = ((BotWebViewContainer$WebViewProxy) obj2).b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                String str3 = str;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "'abort'";
                }
                sb.append(str3);
                sb.append(")");
                nv0Var.c(sb.toString());
                break;
            case 10:
                g41 g41Var = (g41) obj2;
                boolean z2 = ((Integer) obj).intValue() > hl.L(20.0f);
                if (g41Var.G != z2) {
                    g41Var.G = z2;
                    if (!z2) {
                        g41Var.a.A0(0);
                        break;
                    }
                }
                break;
            case 11:
                ((qb1) obj2).x(((Integer) obj).intValue());
                break;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                kb1 kb1Var = ((ub1) obj2).f;
                kb1Var.setText(charSequence);
                kb1Var.w(charSequence.length(), charSequence.length());
                break;
            case 13:
                ((fc1) obj2).M(((Long) obj).longValue());
                break;
            case 14:
                hl.c3(new z21((tg1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 22));
                break;
            case 15:
                hl.c3(new z21((ij1) obj2, (TL_stories.TL_premium_boostsStatus) obj, (byte) 28));
                break;
            case 16:
                ((sh9) obj2).a((cm3) obj);
                break;
            case 17:
                ((vnc) obj2).setEditMenuProgress(((Float) obj).floatValue());
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((u52) obj2).w;
                chatAttachAlertPhotoLayout.t0(null, null, ((Long) obj).longValue());
                chatAttachAlertPhotoLayout.b.dismiss();
                break;
            case 19:
                hl.d0(((f72) obj2).s, new bm0((byte) 6));
                break;
            case 20:
                gi9 gi9Var = (gi9) obj2;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i = gi9Var.b;
                int i2 = gi9Var.a;
                pi9 pi9Var = gi9Var.e;
                if (richMessage != null) {
                    ArrayList arrayList3 = pi9Var.t3;
                    ArrayList arrayList4 = pi9Var.t3;
                    if (i2 < arrayList3.size() && i < arrayList4.size()) {
                        ch9 ch9Var = pi9Var.R3;
                        if (ch9Var != null) {
                            ch9Var.d();
                        }
                        di9 di9Var = pi9Var.v3;
                        if (di9Var != null) {
                            di9Var.e(false);
                        }
                        mk0 mk0Var = (mk0) arrayList4.get(i2);
                        mk0 mk0Var2 = (mk0) arrayList4.get(i);
                        String Q4 = pi9.x3(mk0Var.b) ? pi9Var.Q4(mk0Var) : "";
                        CharSequence charSequence2 = str;
                        if (pi9.x3(mk0Var2.b)) {
                            charSequence2 = pi9Var.Q4(mk0Var2);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Q4.subSequence(0, Math.max(0, Math.min(gi9Var.c, Q4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2.subSequence(Math.max(0, Math.min(gi9Var.d, charSequence2.length())), charSequence2.length()));
                        ArrayList arrayList5 = new ArrayList();
                        pi9.T2(arrayList5, richMessage.blocks, null);
                        if (arrayList5.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            km9.b(pageblockparagraph, spannableStringBuilder3);
                            arrayList5.add(new mk0(pageblockparagraph, mk0Var.c, mk0Var.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                mk0 mk0Var3 = (mk0) arrayList5.get(0);
                                if (pi9.x3(mk0Var3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) km9.z(mk0Var3.b));
                                    km9.b(mk0Var3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    km9.b(pageblockparagraph2, spannableStringBuilder);
                                    arrayList5.add(0, new mk0(pageblockparagraph2, mk0Var.c, mk0Var.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                mk0 mk0Var4 = (mk0) c00.g(1, arrayList5);
                                if (pi9.x3(mk0Var4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(km9.z(mk0Var4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    km9.b(mk0Var4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    km9.b(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList5.add(new mk0(pageblockparagraph3, mk0Var2.c, mk0Var2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = pi9Var.s3;
                        if (richMessage2 == null) {
                            pi9Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                            if (arrayList6 != null) {
                                richMessage2.photos.addAll(arrayList6);
                            }
                            ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                            if (arrayList7 != null) {
                                pi9Var.s3.documents.addAll(arrayList7);
                            }
                        }
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            pi9Var.x4((mk0) arrayList5.get(i3));
                        }
                        while (i >= i2) {
                            arrayList4.remove(i);
                            i--;
                        }
                        arrayList4.addAll(i2, arrayList5);
                        pi9Var.u4();
                        pi9Var.g3.O(false);
                        ch9 ch9Var2 = pi9Var.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.h();
                        }
                        pi9Var.p3.onContentChanged();
                        pi9Var.post(new z09(gi9Var, arrayList5.isEmpty() ? null : (mk0) c00.g(1, arrayList5), (byte) 21));
                        break;
                    }
                }
                break;
            case 21:
                ((r72) obj2).a.r.R1((TL_iv.RichMessage) obj);
                break;
            case 22:
                ((od2) obj2).e.T = (String) obj;
                break;
            case 23:
                bg2 bg2Var = ((xf2) obj2).d;
                bg2Var.A1 = ((Integer) obj).intValue();
                hl.U3(bg2Var.r0, bg2Var.c);
                break;
            case 24:
                mg2 mg2Var = (mg2) obj2;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                mg2Var.H = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : mg2Var.H.connected_bots.get(0);
                mg2Var.I = tL_connectedBot;
                mg2Var.N = tL_connectedBot == null ? null : mg2Var.getMessagesController().X1(Long.valueOf(mg2Var.I.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = mg2Var.I;
                mg2Var.K = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = mg2Var.I;
                mg2Var.J = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                u41 u41Var = mg2Var.w;
                if (u41Var != null) {
                    u41Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                q9c q9cVar2 = mg2Var.c;
                if (q9cVar2 != null && (l9cVar2 = q9cVar2.g3) != null) {
                    l9cVar2.O(true);
                }
                mg2Var.Z(true);
                mg2Var.U = true;
                break;
            case 25:
                kl2 kl2Var = (kl2) obj2;
                kl2Var.k0.n.P = ((Float) obj).floatValue();
                jl2 jl2Var = kl2Var.k0;
                il2 il2Var = jl2Var.d;
                if (il2Var != null) {
                    il2Var.setVolume(jl2Var.n.P);
                    break;
                }
                break;
            case 26:
                qn2 qn2Var = (qn2) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = qn2Var.n;
                boolean z3 = arrayList9 == null || arrayList9.isEmpty();
                qn2Var.n = arrayList8;
                q9c q9cVar3 = qn2Var.f;
                if (q9cVar3 != null) {
                    q9cVar3.g3.O(z3);
                    break;
                }
                break;
            case 27:
                ((cu2) obj2).b0((TL_account.TL_birthday) obj);
                break;
            default:
                ((ry2) obj2).b1((Pair) obj);
                break;
        }
    }
}
