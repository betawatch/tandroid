// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w09 extends FrameLayout {
    public final rb0 a;
    public final ImageReceiver b;
    public final tpa c;
    public final og2 d;
    public final ImageView e;
    public final vnb f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public w09(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.a = new rb0((vnb) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = vnbVar;
        setWillNotDraw(false);
        int i = z ? 42 : 16;
        tpa tpaVar = new tpa(context);
        this.c = tpaVar;
        tpaVar.setLines(2);
        tpaVar.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(tpaVar, aob.z6, vnbVar);
        tpaVar.setTextSize(1, 14.0f);
        boolean z2 = ob6.a0;
        addView(tpaVar, tre.d(-1, -2.0f, 7, z2 ? i : 64.0f, 7.0f, z2 ? 64.0f : i, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            yob.s(imageView, aob.Li, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, tre.e(50, 50, (ob6.a0 ? 3 : 5) | jn7.w1));
        } else {
            this.e = null;
        }
        og2 og2Var = new og2(21, vnbVar, getContext());
        this.d = og2Var;
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        addView(og2Var, tre.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(a19 a19Var, String str, boolean z) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j;
        String str2;
        jn5 jn5Var;
        String str3 = str;
        this.h = a19Var != null ? a19Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) a19Var.b);
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        int i = aob.G6;
        vnb vnbVar = this.f;
        spannableStringBuilder.setSpan(new ho4(i, vnbVar), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new ho4(aob.o6, vnbVar), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        r47 r47Var = a19Var.e;
        tpa tpaVar = this.c;
        if (r47Var != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = a19Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = a19Var.e.v;
            }
            CharSequence m = pv3.m(new SpannableStringBuilder(charSequence), tpaVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = a19Var.e.k;
            if (message != null) {
                r47.A5(m, message.entities, tpaVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m);
        }
        if (a19Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = hl.q.x - hl.L(80.0f);
            int a = a19Var.a() - 1;
            int i2 = t0.d;
            SpannableString spannableString = new SpannableString("+");
            t0 t0Var = new t0(a);
            int L2 = (int) (((pkb) t0Var.c).c + hl.L(10.0f));
            this.n[0] = L2;
            spannableString.setSpan(t0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, tpaVar.getPaint(), (L * 1.5f) - r13[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        tpaVar.setText(spannableStringBuilder);
        int i3 = yac.t0;
        TLRPC.MessageMedia m1 = r47.m1(a19Var.e);
        ImageReceiver imageReceiver = this.b;
        if (m1 != null) {
            TLRPC.Photo photo2 = m1.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w = xb4.w(photo2.sizes, hl.L(36.0f), true, null, true);
                jn5 f = jn5.f(w, m1.photo);
                r47 r47Var2 = a19Var.e;
                imageReceiver.c0(f, "36_36", r47Var2.I1, w != null ? w.size : 0L, null, r47Var2, 0);
                imageReceiver.q0(hl.L(4.0f));
            } else if (m1.document != null && (r47.K4(a19Var.e.k) || a19Var.e.s4())) {
                TLRPC.PhotoSize w2 = xb4.w(m1.document.thumbs, hl.L(36.0f), true, null, true);
                TLRPC.Document document = m1.document;
                if (w2 == null) {
                    jn5 b = jn5.b(document);
                    j = m1.document.size;
                    jn5Var = b;
                    str2 = "g";
                } else {
                    jn5 f2 = jn5.f(w2, document);
                    j = w2.size;
                    str2 = "36_36";
                    jn5Var = f2;
                }
                long j2 = j;
                r47 r47Var3 = a19Var.e;
                imageReceiver.c0(jn5Var, str2, r47Var3.I1, j2, null, r47Var3, 0);
                imageReceiver.q0(hl.L(4.0f));
            }
            this.r = z;
            invalidate();
        }
        if (m1 == null || (webPage = m1.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f3 = yac.h(i3).f();
            rb0 rb0Var = this.a;
            rb0Var.q(f3);
            imageReceiver.U(yac.h(i3).f(), rb0Var, null);
            imageReceiver.q0(hl.L(36.0f));
        } else {
            TLRPC.PhotoSize w3 = xb4.w(photo.sizes, hl.L(36.0f), true, null, true);
            imageReceiver.c0(jn5.f(w3, m1.webpage.photo), "36_36", a19Var.e.I1, w3 != null ? w3.size : 0L, null, m1.webpage, 0);
            imageReceiver.q0(hl.L(4.0f));
        }
        this.r = z;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = ob6.a0 ? getMeasuredWidth() - hl.L(51.0f) : hl.L(15.0f);
        float L = hl.L(7.0f);
        float L2 = hl.L(36.0f);
        float L3 = hl.L(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint U0 = aob.U0("paintDivider", this.f);
            if (U0 == null) {
                U0 = aob.j0;
            }
            canvas.drawRect(hl.L(ob6.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - hl.L(ob6.a0 ? 64.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z) {
        this.e.animate().alpha((!z || this.h) ? 0.0f : 1.0f).start();
    }
}
