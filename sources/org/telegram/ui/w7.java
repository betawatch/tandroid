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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class w7 extends s4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w7(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).X2.size();
            case 2:
                return ((org.telegram.ui.Components.c9) this.d).X2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((aq0) this.d).f.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i10 / 12)) * 100) + (h8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.c9) this.d).X2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.b9) r0.X2.get(i10)).a;
        }
    }

    @Override // s4.h0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.c9) this.d).X2.size() ? 1 : 0;
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
                e8 e8Var = (e8) c1Var.a;
                h8 h8Var = (h8) this.d;
                int i14 = h8Var.I - (i10 / 12);
                int i15 = h8Var.J - (i10 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (e8Var.b == i14) {
                    int i16 = e8Var.c;
                }
                SparseArray sparseArray = (SparseArray) h8Var.S.get((i14 * 100) + i15);
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
                e8.a(e8Var, h8Var.P, h8Var.Q);
                e8.b(e8Var, 1.0f);
                h8Var.s0(e8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) c1Var.a;
                lb0 lb0Var = (lb0) ((org.telegram.ui.Cells.t) this.d).X2.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = lb0Var.b;
                int i22 = lb0Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!lb0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i22));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.w1.h(i22, new StringBuilder("d ")));
                    org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.msg_mini_premiumlock, 0);
                    nqVar.setTopOffset(1);
                    nqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(nqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(w7.e6.a(lb0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), -16777216));
                qVar.setForeground(lb0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.d;
                org.telegram.ui.Components.f9 f9Var = c9Var.c3;
                ArrayList arrayList = c9Var.X2;
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) c1Var.a;
                if (c1Var.f != 0) {
                    d9Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.n2) f9Var).currentAccount;
                    boolean z14 = !UserConfig.getInstance(i12).isPremium();
                    if (d9Var.v != z14) {
                        d9Var.v = z14;
                        d9Var.invalidate();
                    }
                    d9Var.a = c9Var.b3;
                    z10 = c9Var.Z2 == 1;
                    if (d9Var.c != z10) {
                        d9Var.c = z10;
                        d9Var.invalidate();
                        break;
                    }
                } else {
                    d9Var.d = false;
                    org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) arrayList.get(i10);
                    if (b9Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.n2) f9Var).currentAccount;
                        if (!UserConfig.getInstance(i13).isPremium()) {
                            z11 = true;
                            if (d9Var.v != z11) {
                                d9Var.v = z11;
                                d9Var.invalidate();
                            }
                            d9Var.a = b9Var;
                            z10 = c9Var.Z2 == ((org.telegram.ui.Components.b9) arrayList.get(i10)).a;
                            if (d9Var.c == z10) {
                                d9Var.c = z10;
                                d9Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (d9Var.v != z11) {
                    }
                    d9Var.a = b9Var;
                    if (c9Var.Z2 == ((org.telegram.ui.Components.b9) arrayList.get(i10)).a) {
                    }
                    if (d9Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            default:
                TextView textView2 = (TextView) c1Var.a;
                aq0 aq0Var = (aq0) this.d;
                textView2.setText((CharSequence) aq0Var.f.get(i10));
                textView2.setTextColor(i10 == aq0Var.d ? aq0Var.E : aq0Var.y);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.vk0(new e8((h8) this.d, viewGroup.getContext()));
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
                return new org.telegram.ui.Components.vk0(sVar);
            case 2:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.d;
                return new org.telegram.ui.Components.vk0(new org.telegram.ui.Components.d9(c9Var.c3, c9Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.vk0(((org.telegram.ui.Components.qm) this.d).v);
            case 4:
                return new org.telegram.ui.Components.vk0(new di.eb(this, ((org.telegram.ui.Components.un) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(viewGroup.getContext(), null);
                d90Var.setGravity(17);
                d90Var.setTypeface(AndroidUtilities.bold());
                d90Var.setTextSize(1, 14.0f);
                d90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                d90Var.setEllipsize(TextUtils.TruncateAt.END);
                d90Var.setSingleLine();
                d90Var.setMaxLines(1);
                d90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.z5.b(d90Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.vk0(d90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
