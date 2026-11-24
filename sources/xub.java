// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xub extends q59 {
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ avb r;

    public xub(avb avbVar) {
        this.r = avbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.b() >= this.f && u69Var.b() < this.h;
    }

    public final void E() {
        this.e = -1;
        this.f = -1;
        this.h = -1;
        this.n = -1;
        this.c = 2;
        this.d = true;
        ArrayList arrayList = this.r.f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i = this.c;
        int i2 = i + 1;
        this.e = i;
        int i3 = i + 2;
        this.c = i3;
        this.f = i2;
        int size = (arrayList.size() - 1) + i3;
        this.h = size;
        this.c = size + 1;
        this.n = size;
    }

    @Override // y59
    public final int b() {
        return this.c;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == this.d) {
            return 2;
        }
        if (i == this.e) {
            return 3;
        }
        return i == this.n ? 5 : 4;
    }

    @Override // y59
    public final void f() {
        E();
        super.f();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        int i2 = this.e;
        avb avbVar = this.r;
        if (i < i2 || i2 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(avbVar.F);
        }
        if (d(i) == 4) {
            xc5 xc5Var = (xc5) view;
            TLRPC.Chat chat = (TLRPC.Chat) avbVar.f.get(i - this.f);
            xc5Var.e(chat, chat.title, (String) avbVar.h.get(i - this.f), i != this.h - 1);
            xc5Var.c(avbVar.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        if (i == 1) {
            Context context = viewGroup.getContext();
            bvb bvbVar = new bvb(context);
            ImageView imageView = new ImageView(context);
            int i2 = cmb.l9;
            anb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            td4.x(textView, i2, null, 1, 20.0f);
            textView.setGravity(17);
            bvbVar.addView(textView, qoe.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            bvbVar.a = textView2;
            anb.X(textView2, cmb.f9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            bvbVar.addView(textView2, qoe.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(gm.L(12.0f));
            textPaint.setTypeface(gm.o());
            ec0 ec0Var = new ec0(context, new Paint(1), textPaint);
            ec0Var.setWillNotDraw(false);
            ec0Var.addView(imageView, qoe.e(-2, -2, 1));
            bvbVar.addView(ec0Var, qoe.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(jb6.M0(2131743726, null));
            imageView.setImageResource(R.drawable.groups_limit1);
            avb avbVar = this.r;
            avbVar.y = bvbVar;
            int i3 = avbVar.H;
            avbVar.y.setMessageText(i3 == 0 ? jb6.M0(2131743723, null) : i3 == 1 ? jb6.M0(2131743724, null) : jb6.M0(2131743725, null));
            g69 g69Var = new g69(-1, -2);
            ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin = gm.L(16.0f);
            ((ViewGroup.MarginLayoutParams) g69Var).topMargin = gm.L(23.0f);
            avbVar.y.setLayoutParams(g69Var);
            view = bvbVar;
        } else if (i == 2) {
            bba bbaVar = new bba(viewGroup.getContext(), (hg9) null);
            Drawable W0 = cmb.W0(viewGroup.getContext(), R.drawable.greydivider, cmb.a7);
            int i4 = cmb.Z6;
            ColorDrawable colorDrawable = new ColorDrawable(cmb.w0(null, i4, false));
            sn2 sn2Var = new sn2(colorDrawable, W0);
            sn2Var.x = true;
            bbaVar.setBackground(sn2Var);
            anb.x(bbaVar, colorDrawable, i4, null, PorterDuff.Mode.SRC_IN);
            view = bbaVar;
        } else if (i != 3) {
            view = i != 5 ? new xc5(viewGroup.getContext(), 1, 0, false) : new j34(viewGroup.getContext(), gm.L(12.0f));
        } else {
            jf5 jf5Var = new jf5(viewGroup.getContext(), cmb.K6, 21, 8, false, null);
            jf5Var.setHeight(54);
            jf5Var.setText(jb6.M0(2131748967, null));
            view = jf5Var;
        }
        return new b59(view);
    }
}
