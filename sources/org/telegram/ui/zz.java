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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zz extends FrameLayout {
    public final /* synthetic */ a00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(a00 a00Var, Context context) {
        super(context);
        this.a = a00Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false)));
        addView(imageView, g7.e6.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        dh.u uVar = new dh.u(context);
        uVar.setTypeface(AndroidUtilities.bold());
        uVar.setTextSize(1, 20.0f);
        int i9 = org.telegram.ui.ActionBar.f6.j5;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        uVar.setGravity(1);
        uVar.setText(a00Var.Q(uVar));
        MessagesController.DialogFilter dialogFilter = a00Var.T;
        uVar.h = (dialogFilter == null || !dialogFilter.title_noanimate) ? 0 : 26;
        addView(uVar, g7.e6.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setText(a00Var.U.isEmpty() ? LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty) : LocaleController.getString(R.string.FolderLinkShareSubtitle));
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        addView(textView, g7.e6.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.C6, false), PorterDuff.Mode.MULTIPLY));
        imageView2.setOnClickListener(new a(this, 23));
        addView(imageView2, g7.e6.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), TLObject.FLAG_30));
    }
}
