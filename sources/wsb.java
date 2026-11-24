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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wsb extends n39 {
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ zsb r;

    public wsb(zsb zsbVar) {
        this.r = zsbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.b() >= this.f && s49Var.b() < this.h;
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

    @Override // w39
    public final int b() {
        return this.c;
    }

    @Override // w39
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

    @Override // w39
    public final void f() {
        E();
        super.f();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        int i2 = this.e;
        zsb zsbVar = this.r;
        if (i < i2 || i2 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(zsbVar.F);
        }
        if (d(i) == 4) {
            za5 za5Var = (za5) view;
            TLRPC.Chat chat = (TLRPC.Chat) zsbVar.f.get(i - this.f);
            za5Var.e(chat, chat.title, (String) zsbVar.h.get(i - this.f), i != this.h - 1);
            za5Var.c(zsbVar.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        if (i == 1) {
            Context context = viewGroup.getContext();
            atb atbVar = new atb(context);
            ImageView imageView = new ImageView(context);
            int i2 = bkb.l9;
            zkb.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            tb4.w(textView, i2, null, 1, 20.0f);
            textView.setGravity(17);
            atbVar.addView(textView, nme.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            atbVar.a = textView2;
            zkb.X(textView2, bkb.f9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            atbVar.addView(textView2, nme.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(gl.L(12.0f));
            textPaint.setTypeface(gl.o());
            eb0 eb0Var = new eb0(context, new Paint(1), textPaint);
            eb0Var.setWillNotDraw(false);
            eb0Var.addView(imageView, nme.e(-2, -2, 1));
            atbVar.addView(eb0Var, nme.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(k96.M0(2131743800, null));
            imageView.setImageResource(R.drawable.groups_limit1);
            zsb zsbVar = this.r;
            zsbVar.y = atbVar;
            int i3 = zsbVar.H;
            zsbVar.y.setMessageText(i3 == 0 ? k96.M0(2131743797, null) : i3 == 1 ? k96.M0(2131743798, null) : k96.M0(2131743799, null));
            e49 e49Var = new e49(-1, -2);
            ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin = gl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) e49Var).topMargin = gl.L(23.0f);
            zsbVar.y.setLayoutParams(e49Var);
            view = atbVar;
        } else if (i == 2) {
            b9a b9aVar = new b9a(viewGroup.getContext(), (de9) null);
            Drawable W0 = bkb.W0(viewGroup.getContext(), R.drawable.greydivider, bkb.a7);
            int i4 = bkb.Z6;
            ColorDrawable colorDrawable = new ColorDrawable(bkb.w0(null, i4, false));
            fm2 fm2Var = new fm2(colorDrawable, W0);
            fm2Var.x = true;
            b9aVar.setBackground(fm2Var);
            zkb.x(b9aVar, colorDrawable, i4, null, PorterDuff.Mode.SRC_IN);
            view = b9aVar;
        } else if (i != 3) {
            view = i != 5 ? new za5(viewGroup.getContext(), 1, 0, false) : new y14(viewGroup.getContext(), gl.L(12.0f));
        } else {
            ld5 ld5Var = new ld5(viewGroup.getContext(), bkb.K6, 21, 8, false, null);
            ld5Var.setHeight(54);
            ld5Var.setText(k96.M0(2131749018, null));
            view = ld5Var;
        }
        return new y29(view);
    }
}
