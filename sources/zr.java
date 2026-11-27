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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zr extends FrameLayout implements fn7 {
    public final int a;
    public final p66 b;
    public final Runnable c;

    public zr(Context context, int i, vnb vnbVar, Runnable runnable, zg3 zg3Var) {
        super(context);
        this.a = i;
        this.c = runnable;
        lv2.r(i).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = hl.L(80.0f);
        int i2 = aob.K7;
        ShapeDrawable K = aob.K(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, vnbVar);
        imageView.setImageResource(R.drawable.large_archive);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, tre.t(80, 80, 49, 0, zg3Var != null ? 14 : 0, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        yob.X(textView, aob.j5, vnbVar);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        textView.setText(ob6.M0(2131754160, null));
        linearLayout.addView(textView, tre.t(-1, -2, 1, 32, 0, 32, 9));
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, aob.z6, vnbVar);
        p66Var.setGravity(1);
        b();
        linearLayout.addView(p66Var, tre.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(R.drawable.msg_archive_archive, ob6.N0("ArchiveHintSection1"), ob6.N0("ArchiveHintSection1Info"), vnbVar), tre.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_hide, ob6.N0("ArchiveHintSection2"), ob6.N0("ArchiveHintSection2Info"), vnbVar), tre.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(R.drawable.msg_archive_stories, ob6.N0("ArchiveHintSection3"), ob6.N0("ArchiveHintSection3Info"), vnbVar), tre.t(-1, -2, 7, 32, 0, 32, 16));
        if (zg3Var != null) {
            c51 i3 = xnb.i(24, vnbVar, context, true);
            i3.i(ob6.N0("GotIt"), false, true);
            i3.setOnClickListener(new k1(zg3Var, (byte) 9));
            linearLayout.addView(i3, tre.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i, String str, String str2, vnb vnbVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i2 = aob.j5;
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i);
        frameLayout.addView(imageView, tre.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        yob.X(textView, i2, vnbVar);
        textView.setTypeface(hl.o());
        textView.setTextSize(0, hl.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, tre.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        yob.X(textView2, aob.z6, vnbVar);
        textView2.setTextSize(0, hl.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, tre.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, tre.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(this.a).Y;
        String N0 = ob6.N0(globalPrivacySettings != null ? globalPrivacySettings.keep_archived_unmuted : true ? "ArchiveHintSubtitle" : "ArchiveHintSubtitleUnmutedMove");
        int i = aob.Xc;
        SpannableStringBuilder N2 = hl.N2(N0, i, 0, this.c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        wm2 wm2Var = new wm2(0, mutate);
        wm2Var.a(i);
        wm2Var.c(hl.L(18.0f));
        wm2Var.F = hl.L(11.0f);
        wm2Var.r = -hl.L(5.0f);
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        this.b.setText(hl.G2(N2, spannableString, ">"));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.k0) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.k0);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(400.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
    }
}
