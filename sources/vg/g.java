package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.py0;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class g extends c {
    public final ImageView r;
    public f s;
    public TLRPC.Chat v;
    public boolean w;

    public g(Context context, d6 d6Var) {
        super(context, d6Var);
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(i6.f0(i6.w0(null, i6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i6.m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z10 = LocaleController.isRTL;
        addView(imageView, z5.d(48, 50.0f, (z10 ? 3 : 5) | 17, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override // vg.c
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z10, int i11) {
        String string;
        this.w = z10;
        this.v = chat;
        h9 h9Var = this.b;
        h9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str = chat.title;
        ai.z5 z5Var = this.d;
        z5Var.k(Emoji.replaceEmoji(str, z5Var.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z10) {
            if (i11 >= 1) {
                string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i11, new Object[0]);
            } else {
                string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
            setSubtitle(string);
        } else {
            setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", i10, new Object[0]));
        }
        this.e.setTextColor(i6.v0(i6.r5, this.a));
        setDivider(true);
        ImageView imageView = this.r;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new py0(21, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override // vg.c, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(f fVar) {
        this.s = fVar;
    }
}
