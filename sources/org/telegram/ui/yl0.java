package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yl0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x05ae  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.xc a02;
        int i10;
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                in0.X((in0) obj2, (SecureDocument) obj, i12);
                break;
            case 1:
                qo0 qo0Var = (qo0) obj2;
                Intent intent = (Intent) obj;
                if (i12 != -1) {
                    z10 = true;
                    if (i12 == 1) {
                        int i13 = v8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        FileLog.e(sb2.toString());
                    }
                    qo0Var.H0(z10, false);
                    qo0Var.D0(false);
                    frameLayout = qo0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<v8.i> creator = v8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    v8.i iVar = (v8.i) (byteArrayExtra != null ? w7.f0.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (qo0Var.K0 == null && qo0Var.M0 == null) {
                                lf.i a2 = w7.y7.a(string);
                                qo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                uc.a aVar = (uc.a) a2.d;
                                qo0Var.x0 = aVar.a() + " *" + aVar.b();
                                qo0Var.t0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            qo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            qo0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                qo0Var.x0 = "Android Pay";
                            } else {
                                qo0Var.x0 = optString;
                            }
                            qo0Var.t0();
                        } catch (JSONException e) {
                            FileLog.e(e);
                        }
                    }
                }
                z10 = true;
                qo0Var.H0(z10, false);
                qo0Var.D0(false);
                frameLayout = qo0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 2:
                nu0 nu0Var = (nu0) obj2;
                Uri uri = (Uri) obj;
                nu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i14 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(file, true, 0L, 0, null, null, null, 0L, i14, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = d6Var.q(0L, false);
                    d6Var.u();
                    AndroidUtilities.runOnUIThread(new yl0(nu0Var, i12, q6, 3));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new jl0(nu0Var, 22));
                    return;
                }
            case 3:
                nu0 nu0Var2 = (nu0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i12 == nu0Var2.a) {
                    nu0Var2.setImageBitmap(bitmap);
                    nu0Var2.c = true;
                    nu0Var2.b = false;
                    break;
                }
                break;
            case 4:
                fw0 fw0Var = (fw0) obj2;
                ((af) obj).run(Integer.valueOf(i12));
                fw0Var.c(i12 == 1 || i12 == 13);
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i12 == profileActivity.W2) {
                    a02 = org.telegram.ui.Components.xc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.xc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.ul.p(i10, a02);
                break;
            case 6:
                s01 s01Var = (s01) obj2;
                s4.c1 c1Var = (s4.c1) obj;
                s01Var.getClass();
                if (c1Var.b() == i12 && s01Var.e.U2 == i12 && c1Var.f == 2) {
                    s01Var.v(c1Var, i12);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.oy) obj);
                break;
            case 8:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                break;
            case 9:
                de1 de1Var = (de1) obj2;
                ((af) obj).run(Integer.valueOf(i12));
                de1Var.c(i12 == 1 || i12 == 13);
                break;
            case 10:
                bj1 bj1Var = (bj1) obj2;
                TLObject tLObject = (TLObject) obj;
                HashMap hashMap = bj1Var.e;
                WallpapersListActivity wallpapersListActivity = bj1Var.E;
                ArrayList arrayList = bj1Var.d;
                if (i12 == bj1Var.v) {
                    bj1Var.s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        bj1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i15);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.id = botInlineResult.id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i16);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.w;
                                                searchImage.height = documentAttribute.h;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    searchImage.size = webDocument2.size;
                                    searchImage.id = botInlineResult.id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    hashMap.put(searchImage.id, searchImage);
                                }
                            }
                        }
                        bj1Var.f = size == arrayList.size() || bj1Var.r == null;
                    }
                    if (size != arrayList.size()) {
                        int i17 = size % wallpapersListActivity.R;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i17 != 0) {
                            bj1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.R)) - 1);
                        }
                        wallpapersListActivity.J.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.R)) - ceil);
                    }
                    wallpapersListActivity.N.c();
                    break;
                }
                break;
            case 11:
                pg.r0 r0Var = (pg.r0) obj2;
                r0Var.e((pg.g1) obj, i12, r0Var.h);
                r0Var.h = null;
                break;
            case 12:
                qg.p0 p0Var = (qg.p0) obj2;
                pg.l lVar = (pg.l) obj;
                if (p0Var.W0.getCurrentBrush() instanceof pg.l) {
                    p0Var.k1 = true;
                }
                p0Var.b(lVar);
                qg.u1 u1Var = p0Var.t1;
                int i18 = u1Var.d + 1;
                u1Var.a(i18);
                AndroidUtilities.updateImageViewImageAnimated(u1Var.a[i18], i12);
                u1Var.e = true;
                break;
            case 13:
                ((r4.c) ((p4.s0) obj2).c).x(i12, obj);
                break;
            case 14:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                yh.k5 k5Var = nr0Var.e;
                if (i12 != -1) {
                    int i19 = tL_starGiftCollection.collection_id;
                    int i20 = k5Var.a;
                    int f10 = k5Var.f(i19);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) k5Var.e.remove(f10);
                        k5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i20).getInputPeer(k5Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i20).sendRequest(deletestargiftcollection, null);
                    }
                    nr0Var.f(true);
                    org.telegram.ui.Components.g81 g81Var = nr0Var.n;
                    if (i12 < k5Var.d().size()) {
                        i12++;
                    }
                    g81Var.d(-1, i12);
                    nr0Var.n();
                    break;
                }
                break;
            case 15:
                yh.y2 y2Var = (yh.y2) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr = y2Var.V;
                yh.t2 t2Var = y2Var.f;
                yh.q2 q2Var = y2Var.h;
                if (starGift != null) {
                    yh.v2 v2Var = new yh.v2(y2Var.getContext());
                    v2Var.a(starGift, false);
                    v2Var.setRotation(180.0f);
                    q2Var.f(i12, v2Var);
                    v2Var.setScaleX(0.5f);
                    v2Var.setScaleY(0.5f);
                    v2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = v2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(rrVar);
                    interpolator.setUpdateListener(new org.telegram.ui.Components.voip.r0(y2Var, 21));
                    interpolator.start();
                    q2Var.a[i12].setVisibility(8);
                    t2Var.setVisibility(0);
                    t2Var.setAlpha(0.0f);
                    t2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(rrVar).start();
                    break;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(y2Var.getContext());
                    org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(y2Var.getContext());
                    bj0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout2.addView(bj0Var, w7.x5.e(32, 32, 17));
                    bj0Var.setScaleX(0.5f);
                    bj0Var.setScaleY(0.5f);
                    bj0Var.setAlpha(0.0f);
                    bj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    y2Var.l0 = bj0Var;
                    frameLayout2.setBackground(new yh.l3(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.h6.l1(0.075f, -1)));
                    q2Var.a[i12].setVisibility(8);
                    frameLayout2.setRotation(180.0f);
                    q2Var.f(i12, frameLayout2);
                    y2Var.F.a(iArr[2], iArr[3]);
                    yh.x2 x2Var = y2Var.b;
                    int[] iArr2 = y2Var.U;
                    x2Var.a(iArr2[2], iArr2[3]);
                    t2Var.a(iArr[3], iArr[2]);
                    break;
                }
            case 16:
                ((Utilities.Callback3) obj).run(LocaleController.formatString(R.string.Gift2RarityHint, ei.l.G0(i12)), (yh.o3) obj2, Boolean.FALSE);
                break;
            case 17:
                yh.t5 t5Var = (yh.t5) obj2;
                TLObject tLObject2 = (TLObject) obj;
                boolean[] zArr = t5Var.r;
                ArrayList[] arrayListArr = t5Var.q;
                int i21 = t5Var.a;
                t5Var.t[i12] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i21).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i21).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr[i12] = !arrayListArr[i12].isEmpty() || zArr[i12];
                    boolean[] zArr2 = t5Var.u;
                    boolean z11 = (starsStatus.flags & 1) == 0;
                    zArr2[i12] = z11;
                    t5Var.s[i12] = z11 ? null : starsStatus.next_offset;
                    t5Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 18:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i12).linkPrefix + "/nft/" + ((String) obj));
                break;
            default:
                zg.q qVar = (zg.q) obj2;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) obj;
                Editable text = qVar.n.getText();
                int spanStart = text.getSpanStart(z5Var);
                int spanEnd = text.getSpanEnd(z5Var);
                int i22 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    qVar.n.getText().delete(spanStart, spanEnd);
                    zg.o oVar = qVar.n;
                    oVar.setSelection(Math.min(i12 - i22, oVar.getText().length()));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yl0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
