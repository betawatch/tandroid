package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y7 extends f2.p0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // f2.p0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((j8) this.d).H;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).U2.size();
            case 2:
                return ((org.telegram.ui.Components.t8) this.d).U2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((mp0) this.d).f.size();
        }
    }

    @Override // f2.p0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                j8 j8Var = (j8) this.d;
                return ((j8Var.F - (i10 / 12)) * 100) + (j8Var.G - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.t8) this.d).U2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.s8) r0.U2.get(i10)).a;
        }
    }

    @Override // f2.p0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.t8) this.d).U2.size() ? 1 : 0;
            default:
                return super.j(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        int i11;
        int i12;
        boolean z4;
        boolean z10;
        int i13;
        switch (this.c) {
            case 0:
                g8 g8Var = (g8) m1Var.a;
                j8 j8Var = (j8) this.d;
                int i14 = j8Var.F - (i10 / 12);
                int i15 = j8Var.G - (i10 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (g8Var.b == i14) {
                    int i16 = g8Var.c;
                }
                SparseArray sparseArray = (SparseArray) j8Var.P.get((i14 * 100) + i15);
                j8 j8Var2 = g8Var.x;
                boolean z11 = (i14 == g8Var.b && i15 == g8Var.c) ? false : true;
                g8Var.b = i14;
                g8Var.c = i15;
                g8Var.n = sparseArray;
                boolean z12 = false;
                if (z11 && g8Var.r != null) {
                    for (int i17 = 0; i17 < g8Var.r.size(); i17++) {
                        ((ImageReceiver) g8Var.r.valueAt(i17)).onDetachedFromWindow();
                        ((ImageReceiver) g8Var.r.valueAt(i17)).setParentView(null);
                    }
                    g8Var.r = null;
                }
                if (sparseArray != null) {
                    if (g8Var.r == null) {
                        g8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i18);
                        if (g8Var.r.get(keyAt, z12) == null && ((h8) sparseArray.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver();
                            imageReceiver.setParentView(g8Var);
                            MessageObject messageObject = ((h8) sparseArray.get(keyAt)).a;
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
                                            i11 = ((org.telegram.ui.ActionBar.p2) j8Var2).currentAccount;
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
                                g8Var.r.put(keyAt, imageReceiver);
                            }
                        }
                        i18++;
                        z12 = false;
                    }
                }
                int i19 = i15 + 1;
                g8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                g8Var.e = (calendar.get(7) + 6) % 7;
                g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = g8Var.d + g8Var.e;
                g8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                g8Var.a.l(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                j8Var2.s0(g8Var, false);
                g8.a(g8Var, j8Var.M, j8Var.N);
                g8.b(g8Var, 1.0f);
                j8Var.s0(g8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) m1Var.a;
                bb0 bb0Var = (bb0) ((org.telegram.ui.Cells.t) this.d).U2.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = bb0Var.b;
                int i22 = bb0Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!bb0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i22));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.y3.h(i22, new StringBuilder("d ")));
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_premiumlock, 0);
                    oqVar.setTopOffset(1);
                    oqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(k7.j6.a(bb0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), -16777216));
                qVar.setForeground(bb0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                org.telegram.ui.Components.w8 w8Var = t8Var.Z2;
                ArrayList arrayList = t8Var.U2;
                org.telegram.ui.Components.u8 u8Var = (org.telegram.ui.Components.u8) m1Var.a;
                if (m1Var.f != 0) {
                    u8Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.p2) w8Var).currentAccount;
                    boolean z13 = !UserConfig.getInstance(i12).isPremium();
                    if (u8Var.v != z13) {
                        u8Var.v = z13;
                        u8Var.invalidate();
                    }
                    u8Var.a = t8Var.Y2;
                    z4 = t8Var.W2 == 1;
                    if (u8Var.c != z4) {
                        u8Var.c = z4;
                        u8Var.invalidate();
                        break;
                    }
                } else {
                    u8Var.d = false;
                    org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) arrayList.get(i10);
                    if (s8Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.p2) w8Var).currentAccount;
                        if (!UserConfig.getInstance(i13).isPremium()) {
                            z10 = true;
                            if (u8Var.v != z10) {
                                u8Var.v = z10;
                                u8Var.invalidate();
                            }
                            u8Var.a = s8Var;
                            z4 = t8Var.W2 == ((org.telegram.ui.Components.s8) arrayList.get(i10)).a;
                            if (u8Var.c == z4) {
                                u8Var.c = z4;
                                u8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (u8Var.v != z10) {
                    }
                    u8Var.a = s8Var;
                    if (t8Var.W2 == ((org.telegram.ui.Components.s8) arrayList.get(i10)).a) {
                    }
                    if (u8Var.c == z4) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            default:
                TextView textView2 = (TextView) m1Var.a;
                mp0 mp0Var = (mp0) this.d;
                textView2.setText((CharSequence) mp0Var.f.get(i10));
                textView2.setTextColor(i10 == mp0Var.d ? mp0Var.B : mp0Var.y);
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.el0(new g8((j8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, k7.c6.q(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                sVar.addView(textView, k7.c6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.el0(sVar);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                return new org.telegram.ui.Components.el0(new org.telegram.ui.Components.u8(t8Var.Z2, t8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.el0(((org.telegram.ui.Components.pm) this.d).v);
            case 4:
                return new org.telegram.ui.Components.el0(new fg.h0(this, ((org.telegram.ui.Components.sn) this.d).getContext(), 10));
            default:
                org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(viewGroup.getContext(), null);
                g90Var.setGravity(17);
                g90Var.setTypeface(AndroidUtilities.bold());
                g90Var.setTextSize(1, 14.0f);
                g90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                g90Var.setEllipsize(TextUtils.TruncateAt.END);
                g90Var.setSingleLine();
                g90Var.setMaxLines(1);
                g90Var.setLayoutParams(new f2.x0(-2, AndroidUtilities.dp(28.0f)));
                k7.e6.b(g90Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.el0(g90Var);
        }
    }

    private final void D(f2.m1 m1Var, int i10) {
    }

    private final void E(f2.m1 m1Var, int i10) {
    }
}
