package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.text.Editable;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uu0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wc a02;
        int i10;
        int i11 = this.a;
        int i12 = 0;
        int i13 = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                vu0 vu0Var = (vu0) obj2;
                Uri uri = (Uri) obj;
                vu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i14 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(file, true, 0L, 0, null, null, null, 0L, i14, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = c6Var.q(0L, false);
                    c6Var.u();
                    AndroidUtilities.runOnUIThread(new uu0(vu0Var, i13, q6, 1));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new ql0(vu0Var, 22));
                    return;
                }
            case 1:
                vu0 vu0Var2 = (vu0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i13 == vu0Var2.a) {
                    vu0Var2.setImageBitmap(bitmap);
                    vu0Var2.c = true;
                    vu0Var2.b = false;
                    break;
                }
                break;
            case 2:
                ow0 ow0Var = (ow0) obj2;
                ((df) obj).run(Integer.valueOf(i13));
                ow0Var.c(i13 == 1 || i13 == 13);
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i13 == profileActivity.W2) {
                    a02 = org.telegram.ui.Components.wc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.wc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.em.o(i10, a02);
                break;
            case 4:
                f11 f11Var = (f11) obj2;
                s4.c1 c1Var = (s4.c1) obj;
                f11Var.getClass();
                if (c1Var.b() == i13 && f11Var.e.U2 == i13 && c1Var.f == 2) {
                    f11Var.v(c1Var, i13);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.wc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.hy) obj);
                break;
            case 6:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                break;
            case 7:
                pe1 pe1Var = (pe1) obj2;
                ((df) obj).run(Integer.valueOf(i13));
                pe1Var.c(i13 == 1 || i13 == 13);
                break;
            case 8:
                nj1 nj1Var = (nj1) obj2;
                TLObject tLObject = (TLObject) obj;
                HashMap hashMap = nj1Var.e;
                WallpapersListActivity wallpapersListActivity = nj1Var.E;
                ArrayList arrayList = nj1Var.d;
                if (i13 == nj1Var.v) {
                    nj1Var.s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        nj1Var.r = messages_botresults.next_offset;
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
                        nj1Var.f = size == arrayList.size() || nj1Var.r == null;
                    }
                    if (size != arrayList.size()) {
                        int i17 = size % wallpapersListActivity.R;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i17 != 0) {
                            nj1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.R)) - 1);
                        }
                        wallpapersListActivity.J.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.R)) - ceil);
                    }
                    wallpapersListActivity.N.c();
                    break;
                }
                break;
            case 9:
                pg.m0 m0Var = (pg.m0) obj2;
                og.l lVar = (og.l) obj;
                if (m0Var.W0.getCurrentBrush() instanceof og.l) {
                    m0Var.k1 = true;
                }
                m0Var.B(lVar);
                pg.r1 r1Var = m0Var.t1;
                int i18 = r1Var.d + 1;
                r1Var.a(i18);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.a[i18], i13);
                r1Var.e = true;
                break;
            case 10:
                ((r4.c) ((p4.s0) obj2).c).x(i13, obj);
                break;
            case 11:
                org.telegram.ui.Components.wr0 wr0Var = (org.telegram.ui.Components.wr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                xh.l5 l5Var = wr0Var.e;
                if (i13 != -1) {
                    int i19 = tL_starGiftCollection.collection_id;
                    int i20 = l5Var.a;
                    int f10 = l5Var.f(i19);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) l5Var.e.remove(f10);
                        l5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i20).getInputPeer(l5Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i20).sendRequest(deletestargiftcollection, null);
                    }
                    wr0Var.f(true);
                    org.telegram.ui.Components.u81 u81Var = wr0Var.n;
                    if (i13 < l5Var.d().size()) {
                        i13++;
                    }
                    u81Var.d(-1, i13);
                    wr0Var.n();
                    break;
                }
                break;
            case 12:
                xh.x2 x2Var = (xh.x2) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr = x2Var.V;
                xh.t2 t2Var = x2Var.f;
                xh.q2 q2Var = x2Var.h;
                if (starGift != null) {
                    xh.v2 v2Var = new xh.v2(x2Var.getContext());
                    v2Var.a(starGift, false);
                    v2Var.setRotation(180.0f);
                    q2Var.f(i13, v2Var);
                    v2Var.setScaleX(0.5f);
                    v2Var.setScaleY(0.5f);
                    v2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = v2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(wrVar);
                    interpolator.setUpdateListener(new qg.o(x2Var, 7));
                    interpolator.start();
                    q2Var.a[i13].setVisibility(8);
                    t2Var.setVisibility(0);
                    t2Var.setAlpha(0.0f);
                    t2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(wrVar).start();
                    break;
                } else {
                    FrameLayout frameLayout = new FrameLayout(x2Var.getContext());
                    org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(x2Var.getContext());
                    kj0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(kj0Var, w7.a6.e(32, 32, 17));
                    kj0Var.setScaleX(0.5f);
                    kj0Var.setScaleY(0.5f);
                    kj0Var.setAlpha(0.0f);
                    kj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    x2Var.l0 = kj0Var;
                    frameLayout.setBackground(new xh.k3(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.l1(0.075f, -1)));
                    q2Var.a[i13].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    q2Var.f(i13, frameLayout);
                    x2Var.F.a(iArr[2], iArr[3]);
                    xh.w2 w2Var = x2Var.b;
                    int[] iArr2 = x2Var.U;
                    w2Var.a(iArr2[2], iArr2[3]);
                    t2Var.a(iArr[3], iArr[2]);
                    break;
                }
            case 13:
                ((Utilities.Callback3) obj).run(LocaleController.formatString(R.string.Gift2RarityHint, di.m.G0(i13)), (xh.n3) obj2, Boolean.FALSE);
                break;
            case 14:
                xh.v5 v5Var = (xh.v5) obj2;
                TLObject tLObject2 = (TLObject) obj;
                boolean[] zArr = v5Var.r;
                ArrayList[] arrayListArr = v5Var.q;
                int i21 = v5Var.a;
                v5Var.t[i13] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i21).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i21).putChats(starsStatus.chats, false);
                    arrayListArr[i13].addAll(starsStatus.history);
                    zArr[i13] = !arrayListArr[i13].isEmpty() || zArr[i13];
                    boolean[] zArr2 = v5Var.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i13] = z10;
                    v5Var.s[i13] = z10 ? null : starsStatus.next_offset;
                    v5Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 15:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i13).linkPrefix + "/nft/" + ((String) obj));
                break;
            case 16:
                yg.s sVar = (yg.s) obj2;
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj;
                Editable text = sVar.n.getText();
                int spanStart = text.getSpanStart(y5Var);
                int spanEnd = text.getSpanEnd(y5Var);
                int i22 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.n.getText().delete(spanStart, spanEnd);
                    yg.p pVar = sVar.n;
                    pVar.setSelection(Math.min(i13 - i22, pVar.getText().length()));
                    break;
                }
                break;
            case 17:
                ((zh.t0) obj2).F.put((String) obj, Integer.valueOf(i13));
                break;
            case 18:
                TLObject tLObject3 = (TLObject) obj2;
                ta0 ta0Var = (ta0) obj;
                if (tLObject3 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList2 = ((TL_stories.TL_albums) tLObject3).albums;
                    int size3 = arrayList2.size();
                    while (i12 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList2.get(i12);
                        i12++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i13) {
                            ta0Var.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                ta0Var.accept(null);
                break;
            default:
                zh.u7 u7Var = ((zh.l7) obj2).d;
                zh.k7 k7Var = u7Var.n0;
                int i23 = u7Var.h;
                k7Var.A0 = (ArrayList) obj;
                k7Var.y0 = i23;
                k7Var.setAdapter(null);
                k7Var.setAdapter(k7Var.z0);
                k7Var.setCurrentItem(i13);
                k7Var.C0 = true;
                break;
        }
    }

    public /* synthetic */ uu0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.c = i10;
    }
}
