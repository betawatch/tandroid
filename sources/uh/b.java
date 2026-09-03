package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b extends FrameLayout implements b6 {
    public final g6 a;
    public final p9 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(p9Var, c6.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, c6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, c6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, c6.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c6.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        e();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.id);
        setTitle(DialogObject.getShortName(chat));
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", chatFull != null ? chatFull.linked_peers.size() : 0, new Object[0]));
        this.b.e(chat, new z8(chat));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = k6.S0;
        p9 p9Var = this.b;
        r.a(canvas, drawable, (p9Var.getWidth() / 2.0f) + p9Var.getLeft(), (p9Var.getHeight() / 2.0f) + p9Var.getTop(), p9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = k6.z6;
        g6 g6Var = this.a;
        this.e.setColorFilter(k6.v0(i10, g6Var));
        this.c.setTextColor(k6.v0(k6.G6, g6Var));
        this.d.setTextColor(k6.v0(i10, g6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
