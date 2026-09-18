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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y7 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((j8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).X2.size();
            case 2:
                return ((org.telegram.ui.Components.z8) this.d).X2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((bq0) this.d).f.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                j8 j8Var = (j8) this.d;
                return ((j8Var.I - (i10 / 12)) * 100) + (j8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.z8) this.d).X2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.y8) r0.X2.get(i10)).a;
        }
    }

    @Override // s4.h0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.z8) this.d).X2.size() ? 1 : 0;
            default:
                return super.j(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        switch (this.c) {
            case 0:
                g8 g8Var = (g8) c1Var.a;
                j8 j8Var = (j8) this.d;
                int i14 = j8Var.I - (i10 / 12);
                int i15 = j8Var.J - (i10 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (g8Var.b == i14) {
                    int i16 = g8Var.c;
                }
                SparseArray sparseArray = (SparseArray) j8Var.S.get((i14 * 100) + i15);
                j8 j8Var2 = g8Var.x;
                boolean z12 = (i14 == g8Var.b && i15 == g8Var.c) ? false : true;
                g8Var.b = i14;
                g8Var.c = i15;
                g8Var.n = sparseArray;
                boolean z13 = false;
                if (z12 && g8Var.r != null) {
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
                        if (g8Var.r.get(keyAt, z13) == null && ((h8) sparseArray.get(keyAt)).g) {
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
                                            i11 = ((org.telegram.ui.ActionBar.o2) j8Var2).currentAccount;
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
                                        long j3 = 0;
                                        if (messageObject.strippedThumb != null) {
                                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
                                            String str2 = hasMediaSpoilers ? "5_5_b" : "44_44";
                                            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
                                            if (closestPhotoSizeWithSize4 != null) {
                                                str = str2;
                                                j3 = closestPhotoSizeWithSize4.size;
                                            } else {
                                                str = str2;
                                            }
                                            imageReceiver.setImage(forObject, str, null, null, bitmapDrawable2, j3, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
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
                        z13 = false;
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
                g8.a(g8Var, j8Var.P, j8Var.Q);
                g8.b(g8Var, 1.0f);
                j8Var.s0(g8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) c1Var.a;
                nb0 nb0Var = (nb0) ((org.telegram.ui.Cells.t) this.d).X2.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = nb0Var.b;
                int i22 = nb0Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!nb0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i22));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.w1.h(i22, new StringBuilder("d ")));
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.msg_mini_premiumlock, 0);
                    oqVar.setTopOffset(1);
                    oqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(oqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(w7.e6.a(nb0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), -16777216));
                qVar.setForeground(nb0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.z8 z8Var = (org.telegram.ui.Components.z8) this.d;
                org.telegram.ui.Components.c9 c9Var = z8Var.c3;
                ArrayList arrayList = z8Var.X2;
                org.telegram.ui.Components.a9 a9Var = (org.telegram.ui.Components.a9) c1Var.a;
                if (c1Var.f != 0) {
                    a9Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.o2) c9Var).currentAccount;
                    boolean z14 = !UserConfig.getInstance(i12).isPremium();
                    if (a9Var.v != z14) {
                        a9Var.v = z14;
                        a9Var.invalidate();
                    }
                    a9Var.a = z8Var.b3;
                    z10 = z8Var.Z2 == 1;
                    if (a9Var.c != z10) {
                        a9Var.c = z10;
                        a9Var.invalidate();
                        break;
                    }
                } else {
                    a9Var.d = false;
                    org.telegram.ui.Components.y8 y8Var = (org.telegram.ui.Components.y8) arrayList.get(i10);
                    if (y8Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.o2) c9Var).currentAccount;
                        if (!UserConfig.getInstance(i13).isPremium()) {
                            z11 = true;
                            if (a9Var.v != z11) {
                                a9Var.v = z11;
                                a9Var.invalidate();
                            }
                            a9Var.a = y8Var;
                            z10 = z8Var.Z2 == ((org.telegram.ui.Components.y8) arrayList.get(i10)).a;
                            if (a9Var.c == z10) {
                                a9Var.c = z10;
                                a9Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (a9Var.v != z11) {
                    }
                    a9Var.a = y8Var;
                    if (z8Var.Z2 == ((org.telegram.ui.Components.y8) arrayList.get(i10)).a) {
                    }
                    if (a9Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            default:
                TextView textView2 = (TextView) c1Var.a;
                bq0 bq0Var = (bq0) this.d;
                textView2.setText((CharSequence) bq0Var.f.get(i10));
                textView2.setTextColor(i10 == bq0Var.d ? bq0Var.E : bq0Var.y);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.wk0(new g8((j8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, w7.x5.q(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                sVar.addView(textView, w7.x5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.wk0(sVar);
            case 2:
                org.telegram.ui.Components.z8 z8Var = (org.telegram.ui.Components.z8) this.d;
                return new org.telegram.ui.Components.wk0(new org.telegram.ui.Components.a9(z8Var.c3, z8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.wk0(((org.telegram.ui.Components.qm) this.d).v);
            case 4:
                return new org.telegram.ui.Components.wk0(new ci.eb(this, ((org.telegram.ui.Components.vn) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(viewGroup.getContext(), null);
                c90Var.setGravity(17);
                c90Var.setTypeface(AndroidUtilities.bold());
                c90Var.setTextSize(1, 14.0f);
                c90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                c90Var.setEllipsize(TextUtils.TruncateAt.END);
                c90Var.setSingleLine();
                c90Var.setMaxLines(1);
                c90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.z5.b(c90Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.wk0(c90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
