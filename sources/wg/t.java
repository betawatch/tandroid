package wg;

import ai.a7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.r11;
import si.o0;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final wh.n a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public t(Context context, g6 g6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        wh.n nVar = new wh.n(context);
        this.a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        r6.W(nVar, k6.G6, g6Var);
        nVar.r = false;
        frameLayout.addView(nVar, z5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = k6.e7;
        int w02 = k6.w0(i10, g6Var);
        int i11 = k6.i6;
        int o10 = i0.a.o(k6.w0(i11, g6Var), 76);
        org.telegram.ui.Cells.y j02 = k6.j0(dp, dp, dp, dp, w02, o10, o10);
        n6 O = r6.O(i10);
        n6 h = r6.h(i11, 76);
        frameLayout.setBackground(j02);
        r6.k(frameLayout, j02, O, h, g6Var);
        addView(frameLayout, z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        final int i12 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: wg.s
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
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        r6.t(imageView, k6.j5, g6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(k6.w0(i11, g6Var), 76);
        imageView.setBackground(k6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: wg.s
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
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
        wh.n nVar = this.a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        q11 q11Var = new q11();
        q11Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new r11(q11Var, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new a7(5, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = o0.h("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
