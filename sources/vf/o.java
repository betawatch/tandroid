package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o extends FrameLayout {
    public final l5 a;
    public final jh.s b;
    public final l5 c;
    public final g6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public o(Context context, g6 g6Var) {
        super(context);
        this.d = g6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(k6.K(AndroidUtilities.dp(36.0f), k6.w0(null, k6.Oh, false)));
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 24));
        addView(imageView, c6.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.a = l5Var;
        l5Var.setTextSize(15);
        l5Var.setTextColor(k6.w0(null, k6.G6, false));
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(l5Var, c6.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        l5 l5Var2 = new l5(context);
        this.c = l5Var2;
        l5Var2.setTextSize(14);
        int i10 = k6.z6;
        l5Var2.setTextColor(k6.w0(null, i10, false));
        l5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(l5Var2, c6.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        jh.s sVar = new jh.s(context);
        this.b = sVar;
        sVar.setTextSize(1, 13.0f);
        sVar.setMaxLines(1);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(k6.v0(i10, g6Var));
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        sVar.f = false;
        sVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, c6.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint T0 = k6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = k6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z10 = LocaleController.isRTL;
        l5 l5Var = this.c;
        l5 l5Var2 = this.a;
        if (z10) {
            l5Var2.setPadding(l5Var.getTextWidth(), 0, 0, 0);
        } else {
            l5Var2.setPadding(0, 0, l5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
