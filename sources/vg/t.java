package vg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.e11;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final vh.o a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public t(Context context, e6 e6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        vh.o oVar = new vh.o(context);
        this.a = oVar;
        oVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        oVar.setTextSize(1, 16.0f);
        oVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        oVar.setSingleLine(true);
        oVar.setTextColor(j6.v0(j6.G6, e6Var));
        oVar.f = false;
        frameLayout.addView(oVar, y5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = j6.v0(j6.e7, e6Var);
        int i10 = j6.i6;
        int k10 = i0.a.k(j6.v0(i10, e6Var), 76);
        frameLayout.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, y5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        final int i11 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: vg.s
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(j6.v0(j6.j5, e6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(j6.v0(i10, e6Var), 76);
        imageView.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, y5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        final int i12 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: vg.s
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.b.d);
                        break;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        vh.o oVar = this.a;
        oVar.setPadding(dp, dp2, dp3, dp4);
        d11 d11Var = new d11();
        d11Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new e11(d11Var, 0), 0, spannableStringBuilder.length(), 33);
        oVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new bi.p(4, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = t8.b.i("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
