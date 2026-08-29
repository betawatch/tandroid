package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a extends FrameLayout implements x5 {
    public final c6 a;
    public final t9 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public a(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        t9 t9Var = new t9(context);
        this.b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(7.3125f));
        addView(t9Var, f6.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, f6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, f6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, f6.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, f6.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        e();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.id);
        setTitle(DialogObject.getShortName(chat));
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", chatFull != null ? chatFull.linked_peers.size() : 0, new Object[0]));
        this.b.e(chat, new e9(chat));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = g6.S0;
        t9 t9Var = this.b;
        r.a(canvas, drawable, (t9Var.getWidth() / 2.0f) + t9Var.getLeft(), (t9Var.getHeight() / 2.0f) + t9Var.getTop(), t9Var.getHeight());
        super.dispatchDraw(canvas);
        c6 c6Var = this.a;
        Paint G = c6Var != null ? c6Var.G("paintDivider") : null;
        if (G == null) {
            G = g6.k0;
        }
        canvas.drawLine(AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, G);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = g6.z6;
        c6 c6Var = this.a;
        this.e.setColorFilter(g6.v0(i10, c6Var));
        this.c.setTextColor(g6.v0(g6.G6, c6Var));
        this.d.setTextColor(g6.v0(i10, c6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
