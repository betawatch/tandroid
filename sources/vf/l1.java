package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final z8 a;
    public final ImageReceiver b;
    public final jh.s c;
    public final np d;
    public final ImageView e;
    public final g6 f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public l1(Context context, g6 g6Var, boolean z4) {
        super(context);
        this.a = new z8((g6) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = g6Var;
        setWillNotDraw(false);
        int i10 = z4 ? 42 : 16;
        jh.s sVar = new jh.s(context);
        this.c = sVar;
        sVar.setLines(2);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(k6.v0(k6.z6, g6Var));
        sVar.setTextSize(1, 14.0f);
        boolean z10 = LocaleController.isRTL;
        addView(sVar, c6.d(-1, -2.0f, 7, z10 ? i10 : 64.0f, 7.0f, z10 ? 64.0f : i10, 0.0f));
        if (z4) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.Uh, false), PorterDuff.Mode.MULTIPLY));
            imageView.setAlpha(0.0f);
            addView(imageView, c6.e(50, 50, (LocaleController.isRTL ? 3 : 5) | 112));
        } else {
            this.e = null;
        }
        np npVar = new np(getContext(), 21, g6Var);
        this.d = npVar;
        npVar.b(-1, k6.d6, k6.k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        addView(npVar, c6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(o1 o1Var, String str, boolean z4) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo2;
        String str3 = str;
        this.h = o1Var != null ? o1Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) o1Var.b);
        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = k6.G6;
        g6 g6Var = this.f;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(k6.v0(i10, g6Var)), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(k6.v0(k6.o6, g6Var)), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = o1Var.e;
        jh.s sVar = this.c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = o1Var.e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = o1Var.e.messageText;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), sVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = o1Var.e.messageOwner;
            if (message != null) {
                MessageObject.replaceAnimatedEmoji(replaceEmoji, message.entities, sVar.getPaint().getFontMetricsInt());
            }
            spannableStringBuilder.append(replaceEmoji);
        }
        if (o1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
            int a2 = o1Var.a() - 1;
            int i11 = org.telegram.ui.Components.a0.d;
            SpannableString spannableString = new SpannableString("+");
            org.telegram.ui.Components.a0 a0Var = new org.telegram.ui.Components.a0(a2);
            int dp2 = (int) (((k01) a0Var.c).c + AndroidUtilities.dp(10.0f));
            this.n[0] = dp2;
            spannableString.setSpan(a0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, sVar.getPaint(), (dp * 1.5f) - r12[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        sVar.setText(spannableStringBuilder);
        int i12 = UserConfig.selectedAccount;
        TLRPC.MessageMedia media = MessageObject.getMedia(o1Var.e);
        ImageReceiver imageReceiver = this.b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = o1Var.e;
            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.size : 0L, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (o1Var.e.isVideo() || o1Var.e.isSticker())) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(media.document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
            if (closestPhotoSizeWithSize2 == null) {
                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                j10 = media.document.size;
                imageLocation = forDocument;
                str2 = ImageLoader.AUTOPLAY_FILTER;
            } else {
                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                j10 = closestPhotoSizeWithSize2.size;
                str2 = "36_36";
                imageLocation = forObject2;
            }
            long j11 = j10;
            MessageObject messageObject3 = o1Var.e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j11, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media == null || (webPage = media.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            z8 z8Var = this.a;
            z8Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), z8Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo), "36_36", o1Var.e.strippedThumb, closestPhotoSizeWithSize3 != null ? closestPhotoSizeWithSize3.size : 0L, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        this.r = z4;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(51.0f) : AndroidUtilities.dp(15.0f);
        float dp = AndroidUtilities.dp(7.0f);
        float dp2 = AndroidUtilities.dp(36.0f);
        float dp3 = AndroidUtilities.dp(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(measuredWidth, dp, dp2, dp3);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.r) {
            Paint T0 = k6.T0("paintDivider", this.f);
            if (T0 == null) {
                T0 = k6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z4) {
        this.e.animate().alpha((!z4 || this.h) ? 0.0f : 1.0f).start();
    }
}
