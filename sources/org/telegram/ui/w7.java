package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w7 extends f2.q0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w7(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // f2.q0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((h8) this.d).G;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).T2.size();
            case 2:
                return ((org.telegram.ui.Components.s8) this.d).T2.size() + 1;
            case 3:
                return 1;
            default:
                return 1;
        }
    }

    @Override // f2.q0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.E - (i10 / 12)) * 100) + (h8Var.F - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.s8) this.d).T2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.r8) r0.T2.get(i10)).a;
        }
    }

    @Override // f2.q0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.s8) this.d).T2.size() ? 1 : 0;
            default:
                return super.j(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        String str;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        switch (this.c) {
            case 0:
                e8 e8Var = (e8) o1Var.a;
                h8 h8Var = (h8) this.d;
                int i14 = h8Var.E - (i10 / 12);
                int i15 = h8Var.F - (i10 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (e8Var.b == i14) {
                    int i16 = e8Var.c;
                }
                SparseArray sparseArray = (SparseArray) h8Var.O.get((i14 * 100) + i15);
                h8 h8Var2 = e8Var.x;
                boolean z12 = (i14 == e8Var.b && i15 == e8Var.c) ? false : true;
                e8Var.b = i14;
                e8Var.c = i15;
                e8Var.n = sparseArray;
                boolean z13 = false;
                if (z12 && e8Var.r != null) {
                    for (int i17 = 0; i17 < e8Var.r.size(); i17++) {
                        ((ImageReceiver) e8Var.r.valueAt(i17)).onDetachedFromWindow();
                        ((ImageReceiver) e8Var.r.valueAt(i17)).setParentView(null);
                    }
                    e8Var.r = null;
                }
                if (sparseArray != null) {
                    if (e8Var.r == null) {
                        e8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i18);
                        if (e8Var.r.get(keyAt, z13) == null && ((f8) sparseArray.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver();
                            imageReceiver.setParentView(e8Var);
                            MessageObject messageObject = ((f8) sparseArray.get(keyAt)).a;
                            if (messageObject != null) {
                                boolean hasMediaSpoilers = messageObject.hasMediaSpoilers();
                                if (messageObject.isVideo()) {
                                    TLRPC.Document document = messageObject.getDocument();
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
                                    if (closestPhotoSizeWithSize == closestPhotoSizeWithSize2) {
                                        closestPhotoSizeWithSize2 = null;
                                    }
                                    if (closestPhotoSizeWithSize != null) {
                                        if (messageObject.strippedThumb != null) {
                                            imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), hasMediaSpoilers ? "5_5_b" : "44_44", messageObject.strippedThumb, null, messageObject, 0);
                                        } else {
                                            imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), hasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", (String) null, messageObject, 0);
                                        }
                                    }
                                } else {
                                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !messageObject.photoThumbs.isEmpty()) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
                                        if (!messageObject.mediaExists) {
                                            i11 = ((org.telegram.ui.ActionBar.n2) h8Var2).currentAccount;
                                            if (!DownloadController.getInstance(i11).canDownloadMedia(messageObject)) {
                                                BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
                                                if (bitmapDrawable != null) {
                                                    imageReceiver.setImage(null, null, bitmapDrawable, null, messageObject, 0);
                                                } else {
                                                    imageReceiver.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", (String) null, messageObject, 0);
                                                }
                                            }
                                        }
                                        if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                                            closestPhotoSizeWithSize3 = null;
                                        }
                                        long j10 = 0;
                                        if (messageObject.strippedThumb != null) {
                                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                                            String str2 = hasMediaSpoilers ? "5_5_b" : "44_44";
                                            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                                            if (closestPhotoSizeWithSize4 != null) {
                                                str = str2;
                                                j10 = closestPhotoSizeWithSize4.size;
                                            } else {
                                                str = str2;
                                            }
                                            imageReceiver.setImage(forObject, str, null, null, bitmapDrawable2, j10, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                        } else {
                                            imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject), hasMediaSpoilers ? "5_5_b" : "44_44", ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0L, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.setRoundRadius(AndroidUtilities.dp(22.0f));
                                e8Var.r.put(keyAt, imageReceiver);
                            }
                        }
                        i18++;
                        z13 = false;
                    }
                }
                int i19 = i15 + 1;
                e8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                e8Var.e = (calendar.get(7) + 6) % 7;
                e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = e8Var.d + e8Var.e;
                e8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                e8Var.a.l(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                h8Var2.s0(e8Var, false);
                e8.a(e8Var, h8Var.L, h8Var.M);
                e8.b(e8Var, 1.0f);
                h8Var.s0(e8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) o1Var.a;
                ta0 ta0Var = (ta0) ((org.telegram.ui.Cells.t) this.d).T2.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = ta0Var.b;
                int i22 = ta0Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!ta0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i22));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.y1.i(i22, new StringBuilder("d ")));
                    org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_premiumlock, 0);
                    cqVar.setTopOffset(1);
                    cqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(cqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(h7.g6.a(ta0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), -16777216));
                qVar.setForeground(ta0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) this.d;
                org.telegram.ui.Components.v8 v8Var = s8Var.Y2;
                ArrayList arrayList = s8Var.T2;
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) o1Var.a;
                if (o1Var.f != 0) {
                    t8Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.n2) v8Var).currentAccount;
                    boolean z14 = !UserConfig.getInstance(i12).isPremium();
                    if (t8Var.v != z14) {
                        t8Var.v = z14;
                        t8Var.invalidate();
                    }
                    t8Var.a = s8Var.X2;
                    z10 = s8Var.V2 == 1;
                    if (t8Var.c != z10) {
                        t8Var.c = z10;
                        t8Var.invalidate();
                        break;
                    }
                } else {
                    t8Var.d = false;
                    org.telegram.ui.Components.r8 r8Var = (org.telegram.ui.Components.r8) arrayList.get(i10);
                    if (r8Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.n2) v8Var).currentAccount;
                        if (!UserConfig.getInstance(i13).isPremium()) {
                            z11 = true;
                            if (t8Var.v != z11) {
                                t8Var.v = z11;
                                t8Var.invalidate();
                            }
                            t8Var.a = r8Var;
                            z10 = s8Var.V2 == ((org.telegram.ui.Components.r8) arrayList.get(i10)).a;
                            if (t8Var.c == z10) {
                                t8Var.c = z10;
                                t8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (t8Var.v != z11) {
                    }
                    t8Var.a = r8Var;
                    if (s8Var.V2 == ((org.telegram.ui.Components.r8) arrayList.get(i10)).a) {
                    }
                    if (t8Var.c == z10) {
                    }
                }
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.lk0(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                org.telegram.ui.Cells.s sVar = new org.telegram.ui.Cells.s(context);
                Paint paint = new Paint(1);
                sVar.a = paint;
                Paint paint2 = new Paint(1);
                sVar.b = paint2;
                sVar.setOrientation(1);
                sVar.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                sVar.c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                sVar.addView(qVar, h7.z5.q(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                sVar.addView(textView, h7.z5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.lk0(sVar);
            case 2:
                org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) this.d;
                return new org.telegram.ui.Components.lk0(new org.telegram.ui.Components.t8(s8Var.Y2, s8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.lk0(((org.telegram.ui.Components.em) this.d).v);
            default:
                return new org.telegram.ui.Components.lk0(new ag.s0(this, ((org.telegram.ui.Components.jn) this.d).getContext(), 14));
        }
    }

    private final void D(f2.o1 o1Var, int i10) {
    }

    private final void E(f2.o1 o1Var, int i10) {
    }
}
