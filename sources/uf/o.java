package uf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o extends FrameLayout {
    public final k5 a;
    public final ih.s b;
    public final k5 c;
    public final f6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public o(Context context, f6 f6Var) {
        super(context);
        this.d = f6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(j6.K(AndroidUtilities.dp(36.0f), j6.w0(null, j6.Oh, false)));
        imageView.setOnClickListener(new oh.n(this, 24));
        addView(imageView, b6.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.a = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTextColor(j6.w0(null, j6.G6, false));
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(k5Var, b6.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        k5 k5Var2 = new k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(14);
        int i10 = j6.z6;
        k5Var2.setTextColor(j6.w0(null, i10, false));
        k5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(k5Var2, b6.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        ih.s sVar = new ih.s(context);
        this.b = sVar;
        sVar.setTextSize(1, 13.0f);
        sVar.setMaxLines(1);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(j6.v0(i10, f6Var));
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        sVar.f = false;
        sVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(sVar);
        addView(sVar, b6.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint T0 = j6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = j6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z10 = LocaleController.isRTL;
        k5 k5Var = this.c;
        k5 k5Var2 = this.a;
        if (z10) {
            k5Var2.setPadding(k5Var.getTextWidth(), 0, 0, 0);
        } else {
            k5Var2.setPadding(0, 0, k5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
