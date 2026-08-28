package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout implements w5 {
    public final b6 a;
    public final ImageView b;
    public final TextView c;

    public e(Context context, b6 b6Var) {
        super(context);
        this.a = b6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, e6.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, e6.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = f6.Wk;
        b6 b6Var = this.a;
        int i10 = (int) 153.0f;
        this.c.setTextColor(i0.a.k(f6.v0(i9, b6Var), i10));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(f6.v0(i9, b6Var), i10), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(f6.f0(i0.a.k(f6.v0(i9, b6Var), (int) 25.5f), 1, -1));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }
}
