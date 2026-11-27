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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xwb extends c79 {
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ axb r;

    public xwb(axb axbVar) {
        this.r = axbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.b() >= this.f && f89Var.b() < this.h;
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

    @Override // j79
    public final int b() {
        return this.c;
    }

    @Override // j79
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

    @Override // j79
    public final void f() {
        E();
        super.f();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        int i2 = this.e;
        axb axbVar = this.r;
        if (i < i2 || i2 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(axbVar.F);
        }
        if (d(i) == 4) {
            bd5 bd5Var = (bd5) view;
            TLRPC.Chat chat = (TLRPC.Chat) axbVar.f.get(i - this.f);
            bd5Var.e(chat, chat.title, (String) axbVar.h.get(i - this.f), i != this.h - 1);
            bd5Var.c(axbVar.x.contains(Long.valueOf(chat.id)), false);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        if (i == 1) {
            Context context = viewGroup.getContext();
            bxb bxbVar = new bxb(context);
            ImageView imageView = new ImageView(context);
            int i2 = aob.m9;
            yob.s(imageView, i2, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            qd4.w(textView, i2, null, 1, 20.0f);
            textView.setGravity(17);
            bxbVar.addView(textView, tre.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            bxbVar.a = textView2;
            yob.X(textView2, aob.g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            bxbVar.addView(textView2, tre.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(hl.L(12.0f));
            textPaint.setTypeface(hl.o());
            gb0 gb0Var = new gb0(context, new Paint(1), textPaint);
            gb0Var.setWillNotDraw(false);
            gb0Var.addView(imageView, tre.e(-2, -2, 1));
            bxbVar.addView(gb0Var, tre.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(ob6.M0(2131743694, null));
            imageView.setImageResource(R.drawable.groups_limit1);
            axb axbVar = this.r;
            axbVar.y = bxbVar;
            int i3 = axbVar.H;
            axbVar.y.setMessageText(i3 == 0 ? ob6.M0(2131743691, null) : i3 == 1 ? ob6.M0(2131743692, null) : ob6.M0(2131743693, null));
            r79 r79Var = new r79(-1, -2);
            ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin = hl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) r79Var).topMargin = hl.L(23.0f);
            axbVar.y.setLayoutParams(r79Var);
            view = bxbVar;
        } else if (i == 2) {
            rca rcaVar = new rca(viewGroup.getContext(), (uh9) null);
            Drawable W0 = aob.W0(viewGroup.getContext(), R.drawable.greydivider, aob.b7);
            int i4 = aob.a7;
            ColorDrawable colorDrawable = new ColorDrawable(aob.w0(null, i4, false));
            zm2 zm2Var = new zm2(colorDrawable, W0);
            zm2Var.x = true;
            rcaVar.setBackground(zm2Var);
            yob.x(rcaVar, colorDrawable, i4, null, PorterDuff.Mode.SRC_IN);
            view = rcaVar;
        } else if (i != 3) {
            view = i != 5 ? new bd5(viewGroup.getContext(), 1, 0, false) : new t24(viewGroup.getContext(), hl.L(12.0f));
        } else {
            mf5 mf5Var = new mf5(viewGroup.getContext(), aob.L6, 21, 8, false, null);
            mf5Var.setHeight(54);
            mf5Var.setText(ob6.M0(2131748964, null));
            view = mf5Var;
        }
        return new n69(view);
    }
}
