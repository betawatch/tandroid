package ph;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.y80;
import org.telegram.ui.df;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final c6 a;
    public final t9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final y80 h;

    public l(Activity activity, c6 c6Var) {
        super(activity);
        this.a = c6Var;
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 0);
        f9.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        h6.b(f9, 0.025f, 1.4f);
        addView(f9, f6.e(-1, -1, 119));
        int i10 = g6.Oh;
        setBackground(g6.Y(g6.l1(0.1f, g6.v0(i10, c6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f9.addView(linearLayout, f6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, f6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, f6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(g6.v0(i10, c6Var));
        h6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(g6.b0(AndroidUtilities.dp(9.0f), g6.l1(0.1f, g6.v0(i10, c6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, f6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.v0(i11, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, f6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        y80 y80Var = new y80(activity, null);
        this.h = y80Var;
        y80Var.setTextSize(1, 13.0f);
        y80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
        y80Var.setTextColor(g6.v0(i11, c6Var));
        linearLayout.addView(y80Var, f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(y80Var);
        t9 t9Var = new t9(activity);
        this.b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        t9Var.setVisibility(8);
        f9.addView(t9Var, f6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(g6.f0(5, g6.l1(0.2f, g6.v0(g6.W5, c6Var)), -1));
        h6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.de, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new bg.n(26));
        imageView.setVisibility(8);
        f9.addView(imageView, f6.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final tn tnVar, final MessageObject messageObject, df dfVar, df dfVar2) {
        boolean z10;
        float measureText;
        float measureText2;
        if (messageObject == null) {
            return;
        }
        String str = messageObject.sponsoredTitle;
        TextView textView = this.d;
        CharSequence replaceEmoji = Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false);
        CharSequence charSequence = messageObject.messageText;
        y80 y80Var = this.h;
        CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence, y80Var.getPaint().getFontMetricsInt(), false);
        String str2 = messageObject.sponsoredUrl;
        TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
        ImageView imageView = this.c;
        t9 t9Var = this.b;
        if (messageMedia != null) {
            t9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = messageObject.sponsoredMedia;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                t9Var.k(ImageLocation.getForDocument(messageObject.sponsoredMedia.document), "48_48", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 48), messageObject.sponsoredMedia.document), "48_48", 0L, null, null, 0);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 48, true, null, true);
                    t9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.sponsoredMedia.photo), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredMedia.photo.sizes, 48, true, closestPhotoSizeWithSize, false), messageObject.sponsoredMedia.photo), "48_48", 0L, null, null, 0);
                }
            }
        } else {
            TLRPC.Photo photo2 = messageObject.sponsoredPhoto;
            if (photo2 == null) {
                t9Var.setVisibility(8);
                imageView.setVisibility(0);
                z10 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                int i10 = g6.Oh;
                c6 c6Var = this.a;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(replaceEmoji);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((dp - textView2.getPaint().measureText(textView2.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z10 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(replaceEmoji);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                y80Var.setText(replaceEmoji2);
                y80Var.setOnLinkPressListener(new x80() { // from class: ph.k
                    @Override // org.telegram.ui.Components.x80
                    public final void a(ClickableSpan clickableSpan) {
                        l lVar = l.this;
                        lVar.getClass();
                        tn tnVar2 = tnVar;
                        if (tnVar2 != null) {
                            tnVar2.J9(messageObject, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (tnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                tnVar2.da(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(lVar.h);
                    }
                });
                textView2.setOnClickListener(new mh.n(dfVar, 12));
                setOnClickListener(new ih.u3(this, tnVar, messageObject, str2, 14));
                imageView.setOnClickListener(new mh.n(dfVar2, 13));
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 48, true, null, true);
            t9Var.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, messageObject.sponsoredPhoto), "48_48", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageObject.sponsoredPhoto.sizes, 48, true, closestPhotoSizeWithSize2, false), messageObject.sponsoredPhoto), "48_48", 0L, null, null, 0);
            t9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z10 = true;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.SponsoredMessageAd));
        int i102 = g6.Oh;
        c6 c6Var2 = this.a;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(g6.v0(i102, c6Var2)), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(replaceEmoji);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float dp2 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((dp2 - textView22.getPaint().measureText(textView22.getText().toString())) - AndroidUtilities.dp(32.0f)) - AndroidUtilities.dp(!z10 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        y80Var.setText(replaceEmoji2);
        y80Var.setOnLinkPressListener(new x80() { // from class: ph.k
            @Override // org.telegram.ui.Components.x80
            public final void a(ClickableSpan clickableSpan) {
                l lVar = l.this;
                lVar.getClass();
                tn tnVar2 = tnVar;
                if (tnVar2 != null) {
                    tnVar2.J9(messageObject, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (tnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        tnVar2.da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(lVar.h);
            }
        });
        textView22.setOnClickListener(new mh.n(dfVar, 12));
        setOnClickListener(new ih.u3(this, tnVar, messageObject, str2, 14));
        imageView.setOnClickListener(new mh.n(dfVar2, 13));
    }
}
