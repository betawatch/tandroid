// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class u57 extends FrameLayout {
    public final int E;
    public boolean F;
    public float G;
    public final int a;
    public final boolean b;
    public final vnb c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final long n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final Runnable y;

    /* JADX WARN: Multi-variable type inference failed */
    public u57(Context context, int i, r47 r47Var, Runnable runnable, vnb vnbVar) {
        super(context);
        TLRPC.MessageFwdHeader messageFwdHeader;
        this.F = false;
        this.G = -1.0f;
        this.b = i;
        int i2 = r47Var.K1;
        this.a = i2;
        this.c = vnbVar;
        this.y = runnable;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        TLRPC.Message message = r47Var.k;
        this.E = currentTime - message.date;
        this.n = r47.B0(message);
        this.r = r47Var.e1();
        TLRPC.Message message2 = r47Var.k;
        this.s = message2 == null ? 0 : message2.date;
        this.w = message2 == null ? 0 : message2.edit_date;
        this.x = (message2 == null || (messageFwdHeader = message2.fwd_from) == null) ? 0 : messageFwdHeader.date;
        ImageView imageView = new ImageView(context);
        addView(imageView, tre.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(i == 1 ? uc7.s1(i2).k4.f0.f ? R.drawable.outline_message_time_24 : R.drawable.menu_edited_stamp : i == 2 ? R.drawable.menu_forward_stamp : r47.Q4(r47Var.k) ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        yob.x(this, mutate, aob.F8, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        TextView textView = new TextView(context);
        this.h = textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("loading text ");
        spannableStringBuilder.setSpan(new ya6(textView, hl.L(96.0f), hl.L(2.0f), vnbVar), 0, spannableStringBuilder.length() - 1, 17);
        int i3 = aob.j5;
        yob.Y(textView, yob.K(0.7f, i3), vnbVar);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 13.0f);
        addView(textView, tre.d(96, -2.0f, 19, 40.0f, -1.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setAlpha(0.0f);
        addView(linearLayout, tre.d(-1, -2.0f, 19, 38.0f, 0.0f, 8.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        yob.X(textView2, i3, vnbVar);
        textView2.setTextSize(1, 14.0f);
        TextView m = ik8.m(linearLayout, textView2, tre.t(-2, -2, 19, 0, -1, 0, 0), context);
        this.f = m;
        int L = hl.L(20.0f);
        int i4 = aob.d7;
        ShapeDrawable b0 = aob.b0(L, aob.p1(0.75f, aob.v0(i4, vnbVar)));
        uob K = yob.K(0.75f, i4);
        m.setBackground(b0);
        yob.j(m, b0, K, null, vnbVar);
        yob.X(m, i3, vnbVar);
        m.setTextSize(1, 11.0f);
        m.setPadding(hl.L(5.33f), hl.L(2.0f), hl.L(5.33f), hl.L(2.33f));
        linearLayout.addView(m, tre.t(-2, -2, 19, 4, 0, 0, 0));
        a();
    }

    public static void b(Context context, int i, long j, boolean z, Runnable runnable, Runnable runnable2, vnb vnbVar) {
        q61 q61Var = new q61(1, vnbVar, context, false);
        q61Var.K(aob.v0(aob.h5, vnbVar));
        boolean M3 = uc7.s1(i).M3();
        LinearLayout j2 = uh9.j(context, 1);
        j2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        e29 e29Var = new e29(context);
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        e29Var.f(z ? R.raw.large_lastseen : R.raw.large_readtime, 70, 70, null);
        e29Var.d();
        e29Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = hl.L(80.0f);
        int i2 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        e29Var.setBackground(K);
        yob.j(e29Var, K, M, null, vnbVar);
        j2.addView(e29Var, tre.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        int i3 = aob.j5;
        yob.X(textView, i3, vnbVar);
        textView.setTextSize(1, 20.0f);
        textView.setText(ob6.M0(z ? 2131746774 : 2131746684, null));
        j2.addView(textView, tre.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        yob.X(textView2, i3, vnbVar);
        textView2.setTextSize(1, 14.0f);
        String k = j > 0 ? lbc.k(uc7.s1(i).X1(Long.valueOf(j)), true) : "";
        uh9.r(null, null, z ? M3 ? 2131746770 : 2131746771 : M3 ? 2131746680 : 2131746681, new Object[]{k}, textView2);
        j2.addView(textView2, tre.t(-1, -2, 1, 32, 9, 32, 19));
        c51 i4 = xnb.i(24, vnbVar, context, true);
        i4.i(ob6.M0(z ? 2131746776 : 2131746686, null), false, true);
        j2.addView(i4, tre.r(-1, 48, 1));
        i4.setOnClickListener(new xm3(i4, z, i, q61Var, runnable2, context, vnbVar));
        if (!M3) {
            t57 t57Var = new t57(context, vnbVar);
            t57Var.setGravity(17);
            t57Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
            yob.W(t57Var, aob.z6, vnbVar);
            t57Var.l(" " + ob6.M0(2131746758, null) + " ", false);
            t57Var.setTextSize(14);
            j2.addView(t57Var, tre.t(jn7.s4, -2, 1, 12, 17, 12, 17));
            TextView textView3 = new TextView(context);
            textView3.setTypeface(hl.o());
            textView3.setGravity(17);
            yob.X(textView3, i3, vnbVar);
            textView3.setTextSize(1, 20.0f);
            textView3.setText(ob6.M0(z ? 2131746773 : 2131746683, null));
            j2.addView(textView3, tre.t(-1, -2, 1, 12, 0, 12, 0));
            TextView textView4 = new TextView(context);
            textView4.setGravity(17);
            yob.X(textView4, i3, vnbVar);
            textView4.setTextSize(1, 14.0f);
            uh9.r(null, null, z ? 2131746769 : 2131746679, new Object[]{k}, textView4);
            j2.addView(textView4, tre.t(-1, -2, 1, 32, 9, 32, 19));
            ok8 ok8Var = new ok8(vnbVar, context, true);
            ok8Var.setOnClickListener(new hw2(z, q61Var, runnable));
            ok8Var.c(ob6.M0(z ? 2131746775 : 2131746685, null), false, false);
            j2.addView(ok8Var, tre.t(-1, 48, 1, 0, 0, 0, 4));
        }
        q61Var.O = j2;
        q61Var.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        boolean z = this.b;
        String str = "LOC_ERR";
        if (z == 1) {
            this.d.setAlpha(1.0f);
            this.h.setAlpha(0.0f);
            this.f.setVisibility(8);
            TextView textView = this.e;
            if (uc7.s1(this.a).k4.f0.f) {
                long j = this.s * 1000;
                try {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(6);
                    int i2 = calendar.get(1);
                    calendar.setTimeInMillis(j);
                    int i3 = calendar.get(6);
                    int i4 = calendar.get(1);
                    str = (i3 == i && i2 == i4) ? ob6.a0(null, null, 2131746917, ob6.D0().o0().format(new Date(j))) : (i3 + 1 == i && i2 == i4) ? ob6.a0(null, null, 2131746916, ob6.D0().o0().format(new Date(j))) : Math.abs(System.currentTimeMillis() - j) < 31536000000L ? ob6.a0(null, null, 2131746918, ob6.D0().p0().format(new Date(j)), ob6.D0().o0().format(new Date(j))) : ob6.a0(null, null, 2131746918, ob6.D0().B0().format(new Date(j)), ob6.D0().o0().format(new Date(j)));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else {
                str = ob6.L(this.w);
            }
            textView.setText(str);
            return;
        }
        if (z != 2) {
            setOnClickListener(null);
            this.d.setAlpha(0.0f);
            this.h.setAlpha(1.0f);
            this.f.setVisibility(0);
            TLRPC.TL_messages_getOutboxReadDate tL_messages_getOutboxReadDate = new TLRPC.TL_messages_getOutboxReadDate();
            tL_messages_getOutboxReadDate.peer = uc7.s1(this.a).j1(this.n);
            tL_messages_getOutboxReadDate.msg_id = this.r;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getOutboxReadDate, new w15(this, (byte) 10));
            return;
        }
        this.d.setAlpha(1.0f);
        this.h.setAlpha(0.0f);
        this.f.setVisibility(8);
        TextView textView2 = this.e;
        long j2 = this.x * 1000;
        try {
            Calendar calendar2 = Calendar.getInstance();
            int i5 = calendar2.get(6);
            int i6 = calendar2.get(1);
            calendar2.setTimeInMillis(j2);
            int i7 = calendar2.get(6);
            int i8 = calendar2.get(1);
            str = (i7 == i5 && i6 == i8) ? ob6.a0(null, null, 2131746926, ob6.D0().o0().format(new Date(j2))) : (i7 + 1 == i5 && i6 == i8) ? ob6.a0(null, null, 2131746925, ob6.D0().o0().format(new Date(j2))) : Math.abs(System.currentTimeMillis() - j2) < 31536000000L ? ob6.a0(null, null, 2131746927, ob6.D0().p0().format(new Date(j2)), ob6.D0().o0().format(new Date(j2))) : ob6.a0(null, null, 2131746927, ob6.D0().B0().format(new Date(j2)), ob6.D0().o0().format(new Date(j2)));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        textView2.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z11 z11Var;
        super.onDetachedFromWindow();
        v21 v21Var = v21.x;
        if (v21Var == null || (z11Var = v21Var.e) == null || z11Var.getParent() == null || !(v21Var.e.getParent().getParent() instanceof n11)) {
            return;
        }
        v21Var.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        View view = (View) getParent();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.G < 0.0f) {
            this.G = 0.0f;
            boolean z = this.b;
            TextView textView = this.e;
            if (z) {
                this.G = textView.getPaint().measureText(textView.getText().toString()) + hl.L(48.0f);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                float max = Math.max(this.G, hl.L(144.0f));
                this.G = max;
                float max2 = Math.max(max, textView.getPaint().measureText(ob6.M0(2131746920, null)) + hl.L(48.0f));
                this.G = max2;
                float max3 = Math.max(max2, textView.getPaint().measureText(ob6.M0(2131746924, null) + this.f.getPaint().measureText(ob6.M0(2131746922, null))) + hl.L(64.0f));
                this.G = max3;
                float max4 = Math.max(max3, textView.getPaint().measureText(ob6.a0(null, null, 2131746921, ob6.D0().o0().format(new Date(currentTimeMillis)))) + ((float) hl.L(48.0f)));
                this.G = max4;
                int i3 = this.E;
                if (i3 > 86400) {
                    f = 48.0f;
                    max4 = Math.max(max4, textView.getPaint().measureText(ob6.a0(null, null, 2131746919, ob6.D0().o0().format(new Date(currentTimeMillis)))) + hl.L(48.0f));
                    this.G = max4;
                } else {
                    f = 48.0f;
                }
                if (i3 > 172800) {
                    float max5 = Math.max(max4, textView.getPaint().measureText(ob6.a0(null, null, 2131746923, ob6.D0().p0().format(new Date(currentTimeMillis)), ob6.D0().o0().format(new Date(currentTimeMillis)))) + hl.L(f));
                    this.G = max5;
                    this.G = Math.max(max5, textView.getPaint().measureText(ob6.a0(null, null, 2131746923, ob6.D0().B0().format(new Date(currentTimeMillis)), ob6.D0().o0().format(new Date(currentTimeMillis)))) + hl.L(f));
                }
            }
        }
        int i4 = TLObject.FLAG_30;
        if (view != null && view.getWidth() > 0) {
            size = view.getWidth();
            mode = 1073741824;
        }
        float f2 = size;
        float f3 = this.G;
        if (f2 < f3 || mode == Integer.MIN_VALUE) {
            size = (int) f3;
        } else {
            i4 = mode;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, i4), i2);
    }
}
