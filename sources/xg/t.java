package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.w6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.z11;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class t extends FrameLayout {
    public final xh.n a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public t(Context context, u6 u6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        xh.n nVar = new xh.n(context);
        this.a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        f7.V(nVar, y6.G6, u6Var);
        nVar.r = false;
        frameLayout.addView(nVar, gb1.i(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = y6.e7;
        int w02 = y6.w0(i10, u6Var);
        int i11 = y6.i6;
        int o10 = i0.a.o(y6.w0(i11, u6Var), 76);
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, w02, o10, o10);
        b7 N = f7.N(i10);
        b7 h = f7.h(i11, 76);
        frameLayout.setBackground(j02);
        f7.k(frameLayout, j02, N, h, u6Var);
        addView(frameLayout, gb1.h(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        final int i12 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: xg.s
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
        f7.t(imageView, y6.j5, u6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(y6.w0(i11, u6Var), 76);
        imageView.setBackground(y6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        addView(imageView, gb1.h(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: xg.s
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
        xh.n nVar = this.a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        y11 y11Var = new y11();
        y11Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new z11(y11Var, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new w6(5, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = b10.j("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
