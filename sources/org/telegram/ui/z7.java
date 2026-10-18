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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class z7 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z7(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // s4.g0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((k8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).V2.size();
            case 2:
                return ((org.telegram.ui.Components.b9) this.d).V2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((jp0) this.d).f.size();
        }
    }

    @Override // s4.g0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                k8 k8Var = (k8) this.d;
                return ((k8Var.I - (i10 / 12)) * 100) + (k8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.b9) this.d).V2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.a9) r0.V2.get(i10)).a;
        }
    }

    @Override // s4.g0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.b9) this.d).V2.size() ? 1 : 0;
            default:
                return super.j(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        switch (this.c) {
            case 0:
                h8 h8Var = (h8) b1Var.a;
                k8 k8Var = (k8) this.d;
                int i14 = k8Var.I - (i10 / 12);
                int i15 = k8Var.J - (i10 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (h8Var.b == i14) {
                    int i16 = h8Var.c;
                }
                SparseArray sparseArray = (SparseArray) k8Var.S.get((i14 * 100) + i15);
                k8 k8Var2 = h8Var.x;
                boolean z12 = (i14 == h8Var.b && i15 == h8Var.c) ? false : true;
                h8Var.b = i14;
                h8Var.c = i15;
                h8Var.n = sparseArray;
                boolean z13 = false;
                if (z12 && h8Var.r != null) {
                    for (int i17 = 0; i17 < h8Var.r.size(); i17++) {
                        ((ImageReceiver) h8Var.r.valueAt(i17)).onDetachedFromWindow();
                        ((ImageReceiver) h8Var.r.valueAt(i17)).setParentView(null);
                    }
                    h8Var.r = null;
                }
                if (sparseArray != null) {
                    if (h8Var.r == null) {
                        h8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i18);
                        if (h8Var.r.get(keyAt, z13) == null && ((i8) sparseArray.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver();
                            imageReceiver.setParentView(h8Var);
                            MessageObject messageObject = ((i8) sparseArray.get(keyAt)).a;
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
                                            i11 = ((org.telegram.ui.ActionBar.n2) k8Var2).currentAccount;
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
                                h8Var.r.put(keyAt, imageReceiver);
                            }
                        }
                        i18++;
                        z13 = false;
                    }
                }
                int i19 = i15 + 1;
                h8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                h8Var.e = (calendar.get(7) + 6) % 7;
                h8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = h8Var.d + h8Var.e;
                h8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                h8Var.a.l(LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true), false);
                k8Var2.s0(h8Var, false);
                h8.a(h8Var, k8Var.P, k8Var.Q);
                h8.b(h8Var, 1.0f);
                k8Var.s0(h8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) b1Var.a;
                qa0 qa0Var = (qa0) ((org.telegram.ui.Cells.t) this.d).V2.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = qa0Var.b;
                int i22 = qa0Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!qa0Var.e || UserConfig.hasPremiumOnAccounts()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(LocaleController.getString(i22));
                } else {
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.g0.g(i22, new StringBuilder("d ")));
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.msg_mini_premiumlock, 0);
                    yqVar.setTopOffset(1);
                    yqVar.setSize(AndroidUtilities.dp(13.0f));
                    spannableString.setSpan(yqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(w7.g6.a(qa0Var), false);
                int dp = AndroidUtilities.dp(18.0f);
                qVar.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), -16777216));
                qVar.setForeground(qa0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                org.telegram.ui.Components.e9 e9Var = b9Var.a3;
                ArrayList arrayList = b9Var.V2;
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) b1Var.a;
                if (b1Var.f != 0) {
                    c9Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.n2) e9Var).currentAccount;
                    boolean z14 = !UserConfig.getInstance(i12).isPremium();
                    if (c9Var.v != z14) {
                        c9Var.v = z14;
                        c9Var.invalidate();
                    }
                    c9Var.a = b9Var.Z2;
                    z10 = b9Var.X2 == 1;
                    if (c9Var.c != z10) {
                        c9Var.c = z10;
                        c9Var.invalidate();
                        break;
                    }
                } else {
                    c9Var.d = false;
                    org.telegram.ui.Components.a9 a9Var = (org.telegram.ui.Components.a9) arrayList.get(i10);
                    if (a9Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.n2) e9Var).currentAccount;
                        if (!UserConfig.getInstance(i13).isPremium()) {
                            z11 = true;
                            if (c9Var.v != z11) {
                                c9Var.v = z11;
                                c9Var.invalidate();
                            }
                            c9Var.a = a9Var;
                            z10 = b9Var.X2 == ((org.telegram.ui.Components.a9) arrayList.get(i10)).a;
                            if (c9Var.c == z10) {
                                c9Var.c = z10;
                                c9Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (c9Var.v != z11) {
                    }
                    c9Var.a = a9Var;
                    if (b9Var.X2 == ((org.telegram.ui.Components.a9) arrayList.get(i10)).a) {
                    }
                    if (c9Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            default:
                TextView textView2 = (TextView) b1Var.a;
                jp0 jp0Var = (jp0) this.d;
                textView2.setText((CharSequence) jp0Var.f.get(i10));
                textView2.setTextColor(i10 == jp0Var.d ? jp0Var.E : jp0Var.y);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.sl0(new h8((k8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, w7.z5.q(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
                sVar.addView(textView, w7.z5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.sl0(sVar);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                return new org.telegram.ui.Components.sl0(new org.telegram.ui.Components.c9(b9Var.a3, b9Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.sl0(((org.telegram.ui.Components.bn) this.d).v);
            case 4:
                return new org.telegram.ui.Components.sl0(new ai.ic(this, ((org.telegram.ui.Components.go) this.d).getContext(), 16));
            default:
                org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(viewGroup.getContext(), null);
                x90Var.setGravity(17);
                x90Var.setTypeface(AndroidUtilities.bold());
                x90Var.setTextSize(1, 14.0f);
                x90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                x90Var.setEllipsize(TextUtils.TruncateAt.END);
                x90Var.setSingleLine();
                x90Var.setMaxLines(1);
                x90Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(28.0f)));
                w7.b6.b(x90Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.sl0(x90Var);
        }
    }

    private final void D(s4.b1 b1Var, int i10) {
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
