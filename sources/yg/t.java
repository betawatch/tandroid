package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final xh.l a;
    public final FrameLayout b;
    public String c;
    public String d;
    public final ImageView e;

    public t(Context context, i6 i6Var) {
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
        u6.U(lVar, n6.G6, i6Var);
        final int i10 = 0;
        lVar.r = false;
        frameLayout.addView(lVar, na.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i11 = n6.e7;
        int w02 = n6.w0(i11, i6Var);
        int i12 = n6.i6;
        int o4 = i0.a.o(n6.w0(i12, i6Var), 76);
        org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, w02, o4, o4);
        q6 M = u6.M(i11);
        q6 g10 = u6.g(i12, 76);
        frameLayout.setBackground(k02);
        u6.j(frameLayout, k02, M, g10, i6Var);
        addView(frameLayout, na.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
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
        u6.s(imageView, n6.j5, i6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(n6.w0(i12, i6Var), 76);
        imageView.setBackground(n6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, na.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
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
        ez0 ez0Var = new ez0();
        ez0Var.a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.c);
        if (this.c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new fz0(ez0Var, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.b.setOnClickListener(new bi.d0(6, runnable));
    }

    public void setSlug(String str) {
        this.c = str;
        this.d = p5.c.k("https://t.me/giftcode/", str);
        this.a.setText("t.me/giftcode/" + str);
    }
}
