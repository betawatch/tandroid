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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v7 extends f2.r0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v7(Object obj, int i9) {
        this.c = i9;
        this.d = obj;
    }

    @Override // f2.r0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((g8) this.d).G;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).T2.size();
            case 2:
                return ((org.telegram.ui.Components.t8) this.d).T2.size() + 1;
            case 3:
                return 1;
            default:
                return 1;
        }
    }

    @Override // f2.r0
    public long i(int i9) {
        switch (this.c) {
            case 0:
                g8 g8Var = (g8) this.d;
                return ((g8Var.E - (i9 / 12)) * 100) + (g8Var.F - (i9 % 12));
            case 1:
            default:
                return super.i(i9);
            case 2:
                if (i9 >= ((org.telegram.ui.Components.t8) this.d).T2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.s8) r0.T2.get(i9)).a;
        }
    }

    @Override // f2.r0
    public int j(int i9) {
        switch (this.c) {
            case 2:
                return i9 >= ((org.telegram.ui.Components.t8) this.d).T2.size() ? 1 : 0;
            default:
                return super.j(i9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        switch (this.c) {
            case 0:
                d8 d8Var = (d8) q1Var.a;
                g8 g8Var = (g8) this.d;
                int i13 = g8Var.E - (i9 / 12);
                int i14 = g8Var.F - (i9 % 12);
                if (i14 < 0) {
                    i14 += 12;
                    i13--;
                }
                if (d8Var.b == i13) {
                    int i15 = d8Var.c;
                }
                SparseArray sparseArray = (SparseArray) g8Var.O.get((i13 * 100) + i14);
                g8 g8Var2 = d8Var.x;
                boolean z12 = (i13 == d8Var.b && i14 == d8Var.c) ? false : true;
                d8Var.b = i13;
                d8Var.c = i14;
                d8Var.n = sparseArray;
                boolean z13 = false;
                if (z12 && d8Var.r != null) {
                    for (int i16 = 0; i16 < d8Var.r.size(); i16++) {
                        ((ImageReceiver) d8Var.r.valueAt(i16)).onDetachedFromWindow();
                        ((ImageReceiver) d8Var.r.valueAt(i16)).setParentView(null);
                    }
                    d8Var.r = null;
                }
                if (sparseArray != null) {
                    if (d8Var.r == null) {
                        d8Var.r = new SparseArray();
                    }
                    int i17 = 0;
                    while (i17 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i17);
                        if (d8Var.r.get(keyAt, z13) == null && ((e8) sparseArray.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver();
                            imageReceiver.setParentView(d8Var);
                            MessageObject messageObject = ((e8) sparseArray.get(keyAt)).a;
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
                                            i10 = ((org.telegram.ui.ActionBar.o2) g8Var2).currentAccount;
                                            if (!DownloadController.getInstance(i10).canDownloadMedia(messageObject)) {
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
                                d8Var.r.put(keyAt, imageReceiver);
                            }
                        }
                        i17++;
                        z13 = false;
                    }
                }
                int i18 = i14 + 1;
                d8Var.d = YearMonth.of(i13, i18).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i13, i14, 0);
                d8Var.e = (calendar.get(7) + 6) % 7;
                d8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i19 = d8Var.d + d8Var.e;
                d8Var.f = ((int) (i19 / 7.0f)) + (i19 % 7 == 0 ? 0 : 1);
                calendar.set(i13, i18, 0);
                d8Var.a.l(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                g8Var2.r0(d8Var, false);
                d8.a(d8Var, g8Var.L, g8Var.M);
                d8.b(d8Var, 1.0f);
                g8Var.r0(d8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) q1Var.a;
                pa0 pa0Var = (pa0) ((org.telegram.ui.Cells.t) this.d).T2.get(i9);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i20 = pa0Var.b;
                int i21 = pa0Var.d;
                qVar.setImageResource(i20);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!pa0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i21));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.l0.h(i21, new StringBuilder("d ")));
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_premiumlock, 0);
                    eqVar.setTopOffset(1);
                    eqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(eqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(g7.l6.a(pa0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), -16777216));
                qVar.setForeground(pa0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                org.telegram.ui.Components.w8 w8Var = t8Var.Y2;
                ArrayList arrayList = t8Var.T2;
                org.telegram.ui.Components.u8 u8Var = (org.telegram.ui.Components.u8) q1Var.a;
                if (q1Var.f != 0) {
                    u8Var.d = true;
                    i11 = ((org.telegram.ui.ActionBar.o2) w8Var).currentAccount;
                    boolean z14 = !UserConfig.getInstance(i11).isPremium();
                    if (u8Var.v != z14) {
                        u8Var.v = z14;
                        u8Var.invalidate();
                    }
                    u8Var.a = t8Var.X2;
                    z10 = t8Var.V2 == 1;
                    if (u8Var.c != z10) {
                        u8Var.c = z10;
                        u8Var.invalidate();
                        break;
                    }
                } else {
                    u8Var.d = false;
                    org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) arrayList.get(i9);
                    if (s8Var.b) {
                        i12 = ((org.telegram.ui.ActionBar.o2) w8Var).currentAccount;
                        if (!UserConfig.getInstance(i12).isPremium()) {
                            z11 = true;
                            if (u8Var.v != z11) {
                                u8Var.v = z11;
                                u8Var.invalidate();
                            }
                            u8Var.a = s8Var;
                            z10 = t8Var.V2 == ((org.telegram.ui.Components.s8) arrayList.get(i9)).a;
                            if (u8Var.c == z10) {
                                u8Var.c = z10;
                                u8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (u8Var.v != z11) {
                    }
                    u8Var.a = s8Var;
                    if (t8Var.V2 == ((org.telegram.ui.Components.s8) arrayList.get(i9)).a) {
                    }
                    if (u8Var.c == z10) {
                    }
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.ik0(new d8((g8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, g7.e6.q(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                sVar.addView(textView, g7.e6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.ik0(sVar);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                return new org.telegram.ui.Components.ik0(new org.telegram.ui.Components.u8(t8Var.Y2, t8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.ik0(((org.telegram.ui.Components.hm) this.d).v);
            default:
                return new org.telegram.ui.Components.ik0(new fh.l2(this, ((org.telegram.ui.Components.ln) this.d).getContext(), 14));
        }
    }

    private final void D(f2.q1 q1Var, int i9) {
    }

    private final void E(f2.q1 q1Var, int i9) {
    }
}
