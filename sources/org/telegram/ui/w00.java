package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class w00 extends FrameLayout {
    public final /* synthetic */ x00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w00(x00 x00Var, Context context) {
        super(context);
        this.a = x00Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        addView(imageView, w7.a6.a(44.0f, 0.0f, 22.0f, 0.0f, 0.0f, 54, 49));
        wh.n nVar = new wh.n(context);
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        nVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        nVar.setGravity(1);
        nVar.setText(x00Var.S(nVar));
        MessagesController.DialogFilter dialogFilter = x00Var.X;
        nVar.s = (dialogFilter == null || !dialogFilter.title_noanimate) ? 0 : 26;
        addView(nVar, w7.a6.a(-2.0f, 20.0f, 84.0f, 20.0f, 0.0f, -2, 49));
        TextView textView = new TextView(context);
        textView.setText(x00Var.Y.isEmpty() ? LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty) : LocaleController.getString(R.string.FolderLinkShareSubtitle));
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        addView(textView, w7.a6.a(-2.0f, 30.0f, 117.0f, 30.0f, 0.0f, -2, 49));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.C6, false), PorterDuff.Mode.MULTIPLY));
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, w7.a6.a(48.0f, 0.0f, -4.0f, 2.0f, 0.0f, 48, 53));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), TLObject.FLAG_30));
    }
}
