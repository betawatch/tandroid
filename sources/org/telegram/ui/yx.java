package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yx(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.a = 15;
        this.b = i10;
        this.c = callback;
        this.d = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x049d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.wc b02;
        int i10;
        boolean z11;
        int i11 = this.a;
        int i12 = 7;
        boolean z12 = true;
        Object[] objArr = 0;
        int i13 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                zx zxVar = (zx) obj2;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                ay ayVar = zxVar.g;
                cy cyVar = zxVar.h;
                cyVar.S1 = true;
                cyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
                cyVar.S1 = false;
                ArrayList<TLRPC.Dialog> dialogs = cyVar.getMessagesController().getDialogs(0);
                int indexOf = dialogs.indexOf(dialog);
                if (indexOf < 0) {
                    ayVar.q(false);
                    break;
                } else {
                    ArrayList<TLRPC.Dialog> dialogs2 = cyVar.getMessagesController().getDialogs(1);
                    if (!dialogs2.isEmpty() || indexOf != 1) {
                        cyVar.I4(true, true);
                        ayVar.x.D();
                        ayVar.q(true);
                        cyVar.w3();
                    }
                    if (dialogs2.isEmpty()) {
                        dialogs.remove(0);
                        if (indexOf != 1) {
                            if (!cyVar.R1.isEmpty()) {
                                cyVar.R1.remove(0);
                            }
                            ayVar.x.D();
                            ayVar.q(true);
                            break;
                        } else {
                            cyVar.I4(true, true);
                            ayVar.q(true);
                            cyVar.w3();
                            break;
                        }
                    }
                }
                break;
            case 1:
                v50 v50Var = (v50) obj2;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    e2Var.setOnCancelListener(new bi.f0(v50Var, i13, 6));
                    e2VarArr[0].show();
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) obj;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
                if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
                    if (tL_help_appUpdate.can_not_skip) {
                        launchActivity.N0(i13, tL_help_appUpdate, false);
                    } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                        ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i13);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    break;
                }
                break;
            case 3:
                ei eiVar = (ei) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    eiVar.a = (TLRPC.User) tLObject;
                    MessagesController.getInstance(i13).putUser(eiVar.a, false);
                }
                org.telegram.ui.Components.c10 c10Var = eiVar.c;
                org.telegram.ui.Components.z90 z90Var = eiVar.b;
                eiVar.setEnabled(eiVar.a != null);
                TLRPC.User user = eiVar.a;
                if (user != null) {
                    z90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new lh0(eiVar, user.id, objArr == true ? 1 : 0)));
                }
                z90Var.animate().alpha(1.0f).setDuration(220L).start();
                c10Var.animate().alpha(0.0f).setDuration(220L).setListener(new jo(c10Var)).start();
                break;
            case 4:
                in0.Y((in0) obj2, (SecureDocument) obj, i13);
                break;
            case 5:
                po0 po0Var = (po0) obj2;
                Intent intent = (Intent) obj;
                if (i13 != -1) {
                    z10 = true;
                    if (i13 == 1) {
                        int i14 = w8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        FileLog.e(sb2.toString());
                    }
                    po0Var.I0(z10, false);
                    po0Var.E0(false);
                    frameLayout = po0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<w8.i> creator = w8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    w8.i iVar = (w8.i) (byteArrayExtra != null ? a8.hf.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (po0Var.K0 == null && po0Var.M0 == null) {
                                s4.d a2 = w7.k5.a(string);
                                po0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                xc.a aVar = (xc.a) a2.d;
                                po0Var.x0 = aVar.a() + " *" + aVar.b();
                                po0Var.u0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            po0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            po0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                po0Var.x0 = "Android Pay";
                            } else {
                                po0Var.x0 = optString;
                            }
                            po0Var.u0();
                        } catch (JSONException e) {
                            FileLog.e(e);
                        }
                    }
                }
                z10 = true;
                po0Var.I0(z10, false);
                po0Var.E0(false);
                frameLayout = po0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 6:
                hu0 hu0Var = (hu0) obj2;
                Uri uri = (Uri) obj;
                hu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i15 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(file, true, 0L, 0, null, null, null, 0L, i15, false, point.x, point.y, null, 0, true);
                    Bitmap q5 = g6Var.q(0L, false);
                    g6Var.u();
                    AndroidUtilities.runOnUIThread(new yx(hu0Var, i13, q5, i12));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new lj0(hu0Var, 25));
                    return;
                }
            case 7:
                hu0 hu0Var2 = (hu0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i13 == hu0Var2.a) {
                    hu0Var2.setImageBitmap(bitmap);
                    hu0Var2.c = true;
                    hu0Var2.b = false;
                    break;
                }
                break;
            case 8:
                xv0 xv0Var = (xv0) obj2;
                ((ye) obj).run(Integer.valueOf(i13));
                xv0Var.c(i13 == 1 || i13 == 13);
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i16 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard((String) obj);
                if (i13 == profileActivity.W2) {
                    b02 = org.telegram.ui.Components.wc.b0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    b02 = org.telegram.ui.Components.wc.b0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.vh.m(i10, b02);
                break;
            case 10:
                j01 j01Var = (j01) obj2;
                s4.e1 e1Var = (s4.e1) obj;
                j01Var.getClass();
                if (e1Var.b() == i13 && j01Var.e.U2 == i13 && e1Var.f == 2) {
                    j01Var.v(e1Var, i13);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.t90) obj);
                break;
            case 12:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                break;
            case 13:
                id1 id1Var = (id1) obj2;
                ((ye) obj).run(Integer.valueOf(i13));
                id1Var.c(i13 == 1 || i13 == 13);
                break;
            case 14:
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (z0Var.c((uc.u) obj, i13)) {
                    z0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 15:
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.j((Utilities.Callback) obj2, (org.telegram.ui.Wallet.l0) obj, connectionsManager));
                break;
            case 16:
                Context context = (Context) obj2;
                String str2 = ((TL_wallet.walletTransaction[]) obj)[0].tx_hash;
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = MessagesController.getInstance(i13).tonBlockchainExplorerUrl;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "https://tonviewer.com/";
                    } else if (!str3.endsWith("/")) {
                        str3 = str3.concat("/");
                    }
                    StringBuilder l4 = org.telegram.ui.Components.b10.l(str3, "transaction/");
                    l4.append(Uri.encode(str2));
                    qf.d.t(context, l4.toString());
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) obj2;
                Bitmap[] bitmapArr = (Bitmap[]) obj;
                if (n5Var.f0 == i13) {
                    n5Var.f(bitmapArr);
                    n5Var.a.run();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) obj;
                int i17 = i13 + 1;
                ArrayList arrayList = ((org.telegram.ui.Wallet.w7) obj2).v;
                if (i17 >= arrayList.size()) {
                    AndroidUtilities.hideKeyboard(haVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.ha) arrayList.get(i17)).a.requestFocus();
                    break;
                }
            case 19:
                org.telegram.ui.Wallet.ha haVar2 = (org.telegram.ui.Wallet.ha) obj;
                int i18 = i13 + 1;
                ArrayList arrayList2 = ((org.telegram.ui.Wallet.z9) obj2).d;
                if (i18 >= arrayList2.size()) {
                    AndroidUtilities.hideKeyboard(haVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.ha) arrayList2.get(i18)).a.requestFocus();
                    break;
                }
            case 20:
                ei1 ei1Var = (ei1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                HashMap hashMap = ei1Var.e;
                WallpapersListActivity wallpapersListActivity = ei1Var.E;
                ArrayList arrayList3 = ei1Var.d;
                if (i13 == ei1Var.v) {
                    ei1Var.s = 0;
                    int size = arrayList3.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        ei1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i19);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    z11 = z12;
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
                                        arrayList3.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                } else {
                                    z11 = z12;
                                    if (botInlineResult.content != null) {
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i20);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    searchImage.width = documentAttribute.w;
                                                    searchImage.height = documentAttribute.h;
                                                } else {
                                                    i20++;
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
                                        arrayList3.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                }
                            } else {
                                z11 = z12;
                            }
                            i19++;
                            z12 = z11;
                        }
                        ei1Var.f = (size == arrayList3.size() || ei1Var.r == null) ? z12 : false;
                    }
                    if (size != arrayList3.size()) {
                        int i21 = size % wallpapersListActivity.N;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i21 != 0) {
                            ei1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.H.s(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    break;
                }
                break;
            case 21:
                ((View) obj).postOnAnimation(new wg1((ph.a) obj2, i13, i12));
                break;
            case 22:
                ((r4.c) ((p4.s0) obj2).c).Y(i13, obj);
                break;
            case 23:
                rg.q0 q0Var = (rg.q0) obj2;
                q0Var.e((rg.f1) obj, i13, q0Var.h);
                q0Var.h = null;
                break;
            case 24:
                sg.n0 n0Var = (sg.n0) obj2;
                rg.l lVar = (rg.l) obj;
                if (n0Var.L0.getCurrentBrush() instanceof rg.l) {
                    n0Var.Z0 = true;
                }
                n0Var.i(lVar);
                sg.t1 t1Var = n0Var.i1;
                int i22 = t1Var.d + 1;
                t1Var.a(i22);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.a[i22], i13);
                t1Var.e = true;
                break;
            default:
                org.telegram.ui.Components.vs0 vs0Var = (org.telegram.ui.Components.vs0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                bi.q9 q9Var = vs0Var.e;
                if (i13 != -1) {
                    int i23 = tL_starGiftCollection.collection_id;
                    int i24 = q9Var.a;
                    int f10 = q9Var.f(i23);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) q9Var.e.remove(f10);
                        q9Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i24).getInputPeer(q9Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i24).sendRequest(deletestargiftcollection, null);
                    }
                    vs0Var.f(true);
                    org.telegram.ui.Components.t91 t91Var = vs0Var.n;
                    if (i13 < q9Var.d().size()) {
                        i13++;
                    }
                    t91Var.d(-1, i13);
                    vs0Var.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yx(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ yx(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
