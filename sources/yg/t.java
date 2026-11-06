package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.z6;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final xh.l a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public t(Context context, f6 f6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        xh.l lVar = new xh.l(context);
        this.a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        final int i7 = 1;
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        r6.V(lVar, k6.G6, f6Var);
        final int i10 = 0;
        lVar.r = false;
        frameLayout.addView(lVar, ha.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i11 = k6.e7;
        int w02 = k6.w0(i11, f6Var);
        int i12 = k6.i6;
        int o4 = i0.a.o(k6.w0(i12, f6Var), 76);
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o4, o4);
        n6 N = r6.N(i11);
        n6 h = r6.h(i12, 76);
        frameLayout.setBackground(k02);
        r6.k(frameLayout, k02, N, h, f6Var);
        addView(frameLayout, ha.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: yg.s
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g0.g(this.b.d);
                        break;
                    default:
                        g0.g(this.b.d);
                        break;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        r6.t(imageView, k6.j5, f6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(k6.w0(i12, f6Var), 76);
        imageView.setBackground(k6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, ha.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: yg.s
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        g0.g(this.b.d);
                        break;
                    default:
                        g0.g(this.b.d);
                        break;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        xh.l lVar = this.a;
        lVar.setPadding(L, L2, L3, L4);
        ty0 ty0Var = new ty0();
        ty0Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new uy0(ty0Var, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new z6(5, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = rf.b.i("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
