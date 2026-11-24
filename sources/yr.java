// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yr extends FrameLayout implements gk7 {
    public final int a;
    public final l46 b;
    public final Runnable c;

    public yr(Context context, int i, wjb wjbVar, Runnable runnable, mk2 mk2Var) {
        super(context);
        this.a = i;
        this.c = runnable;
        qu2.r(i).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = gl.L(80.0f);
        int i2 = bkb.J7;
        ShapeDrawable K = bkb.K(L, bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, wjbVar);
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, nme.t(80, 80, 49, 0, mk2Var != null ? 14 : 0, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTypeface(gl.o());
        textView.setGravity(1);
        textView.setText(k96.M0(2131754164, null));
        linearLayout.addView(textView, nme.t(-1, -2, 1, 32, 0, 32, 9));
        l46 l46Var = new l46(context, null);
        this.b = l46Var;
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, bkb.y6, wjbVar);
        l46Var.setGravity(1);
        b();
        linearLayout.addView(l46Var, nme.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, k96.N0("ArchiveHintSection1"), k96.N0("ArchiveHintSection1Info"), wjbVar), nme.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, k96.N0("ArchiveHintSection2"), k96.N0("ArchiveHintSection2Info"), wjbVar), nme.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, k96.N0("ArchiveHintSection3"), k96.N0("ArchiveHintSection3Info"), wjbVar), nme.t(-1, -2, 7, 32, 0, 32, 16));
        if (mk2Var != null) {
            u41 i3 = yjb.i(24, wjbVar, context, true);
            i3.i(k96.N0("GotIt"), false, true);
            i3.setOnClickListener(new j1(mk2Var, (byte) 9));
            linearLayout.addView(i3, nme.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i, String str, String str2, wjb wjbVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i2 = bkb.i5;
        zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i);
        frameLayout.addView(imageView, nme.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        zkb.X(textView, i2, wjbVar);
        textView.setTypeface(gl.o());
        textView.setTextSize(0, gl.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, nme.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        zkb.X(textView2, bkb.y6, wjbVar);
        textView2.setTextSize(0, gl.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, nme.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, nme.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings = qu2.r(this.a).Y;
        String N0 = k96.N0(globalPrivacySettings != null ? globalPrivacySettings.keep_archived_unmuted : true ? "ArchiveHintSubtitle" : "ArchiveHintSubtitleUnmutedMove");
        int i = bkb.Wc;
        SpannableStringBuilder N2 = gl.N2(N0, i, 0, this.c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        cm2 cm2Var = new cm2(0, mutate);
        cm2Var.a(i);
        cm2Var.c(gl.L(18.0f));
        cm2Var.F = gl.L(11.0f);
        cm2Var.r = -gl.L(5.0f);
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        this.b.setText(gl.G2(N2, spannableString, ">"));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.j0) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.j0);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.j0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(400.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
    }
}
