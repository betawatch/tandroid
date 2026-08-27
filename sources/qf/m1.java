package qf;

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
import h7.z5;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public final y8 a;
    public final ImageReceiver b;
    public final eh.s c;
    public final bp d;
    public final ImageView e;
    public final c6 f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public m1(Context context, c6 c6Var, boolean z10) {
        super(context);
        this.a = new y8((c6) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = c6Var;
        setWillNotDraw(false);
        int i10 = z10 ? 42 : 16;
        eh.s sVar = new eh.s(context);
        this.c = sVar;
        sVar.setLines(2);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(g6.v0(g6.z6, c6Var));
        sVar.setTextSize(1, 14.0f);
        boolean z11 = LocaleController.isRTL;
        addView(sVar, z5.d(-1, -2.0f, 7, z11 ? i10 : 64.0f, 7.0f, z11 ? 64.0f : i10, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Uh, false), PorterDuff.Mode.MULTIPLY));
            imageView.setAlpha(0.0f);
            addView(imageView, z5.e(50, 50, (LocaleController.isRTL ? 3 : 5) | 112));
        } else {
            this.e = null;
        }
        bp bpVar = new bp(getContext(), 21, c6Var);
        this.d = bpVar;
        bpVar.b(-1, g6.d6, g6.k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        addView(bpVar, z5.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(p1 p1Var, String str, boolean z10) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo2;
        String str3 = str;
        this.h = p1Var != null ? p1Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) p1Var.b);
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = g6.G6;
        c6 c6Var = this.f;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(g6.o6, c6Var)), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = p1Var.e;
        eh.s sVar = this.c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = p1Var.e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = p1Var.e.messageText;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), sVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = p1Var.e.messageOwner;
            if (message != null) {
                MessageObject.replaceAnimatedEmoji(replaceEmoji, message.entities, sVar.getPaint().getFontMetricsInt());
            }
            spannableStringBuilder.append(replaceEmoji);
        }
        if (p1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
            int a2 = p1Var.a() - 1;
            int i11 = org.telegram.ui.Components.z.d;
            SpannableString spannableString = new SpannableString("+");
            org.telegram.ui.Components.z zVar = new org.telegram.ui.Components.z(a2);
            int dp2 = (int) (((pz0) zVar.c).c + AndroidUtilities.dp(10.0f));
            this.n[0] = dp2;
            spannableString.setSpan(zVar, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, sVar.getPaint(), (dp * 1.5f) - r12[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        sVar.setText(spannableStringBuilder);
        int i12 = UserConfig.selectedAccount;
        TLRPC.MessageMedia media = MessageObject.getMedia(p1Var.e);
        ImageReceiver imageReceiver = this.b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = p1Var.e;
            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.size : 0L, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (p1Var.e.isVideo() || p1Var.e.isSticker())) {
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
            MessageObject messageObject3 = p1Var.e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j11, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media == null || (webPage = media.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            y8 y8Var = this.a;
            y8Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), y8Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo), "36_36", p1Var.e.strippedThumb, closestPhotoSizeWithSize3 != null ? closestPhotoSizeWithSize3.size : 0L, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        this.r = z10;
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
            Paint T0 = g6.T0("paintDivider", this.f);
            if (T0 == null) {
                T0 = g6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z10) {
        this.e.animate().alpha((!z10 || this.h) ? 0.0f : 1.0f).start();
    }
}
