// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xc7 extends FrameLayout {
    public final vnb a;
    public final ic0 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public xc7(Context context, vnb vnbVar) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = vnbVar;
        setWillNotDraw(false);
        ic0 ic0Var = new ic0(this, false);
        this.b = ic0Var;
        ic0Var.l = true;
        ic0Var.p = hl.L(75.0f);
        ic0Var.o = hl.L(48.0f);
        ic0Var.x = true;
        ic0Var.s = hl.L(22.0f);
        int i = 0;
        while (i < 2) {
            this.c[i] = new TextView(context);
            yob.X(this.c[i], aob.G6, vnbVar);
            this.c[i].setTypeface(hl.o());
            this.c[i].setTextSize(1, 14.0f);
            int i2 = 8;
            this.c[i].setVisibility(i == 0 ? 0 : 8);
            addView(this.c[i], tre.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i] = new TextView(context);
            yob.X(this.d[i], aob.z6, vnbVar);
            this.d[i].setTextSize(1, 12.0f);
            TextView textView = this.d[i];
            if (i == 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            addView(this.d[i], tre.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i++;
        }
        ImageView k = qd4.k(context, R.drawable.msg_arrowright);
        yob.s(k, aob.P5, vnbVar, PorterDuff.Mode.SRC_IN);
        addView(k, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(p5b p5bVar) {
        String str;
        ic0 ic0Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = p5bVar.i;
            str = p5bVar.D;
            int size = arrayList.size();
            ic0Var = this.b;
            if (i >= size || i2 >= 3) {
                break;
            }
            r47 r47Var = (r47) p5bVar.i.get(i);
            long j = r47Var.l.dialogId;
            TextUtils.isEmpty(str);
            ic0Var.j(i2, p5bVar.c, r47Var.l);
            i2++;
            i++;
        }
        ic0Var.i(i2);
        ic0Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(ob6.H(' ', "HashtagStoriesFound", p5bVar.J));
        } else {
            textViewArr[0].setText(c(ob6.K("HashtagStoriesFoundChannel", p5bVar.J, ' ', c00.i("@", str))));
        }
        this.d[0].setText(ob6.a0(null, null, 2131749102, p5bVar.C));
        return i2 > 0;
    }

    public final void b(int i, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(ob6.H(' ', "HashtagMessagesFound", i));
        } else {
            textViewArr[1].setText(c(ob6.K("HashtagMessagesFoundChannel", i, ' ', c00.i("@", str2))));
        }
        this.d[1].setText(ob6.a0(null, null, 2131749111, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i = aob.Fi;
        vnb vnbVar = this.a;
        SpannableStringBuilder M2 = hl.M2(str, i, vnbVar, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) M2.getSpans(0, M2.length(), CharacterStyle.class);
            for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                int spanStart = M2.getSpanStart(characterStyleArr[i2]);
                int spanEnd = M2.getSpanEnd(characterStyleArr[i2]);
                M2.removeSpan(characterStyleArr[i2]);
                M2.setSpan(new ho4(aob.Fi, vnbVar), spanStart, spanEnd, 0);
            }
            return M2;
        } catch (Exception e) {
            cc4.g(e, true);
            return M2;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(hl.U1(this.e, 0, -hl.L(62.0f)), 0.0f);
        this.b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint U0 = aob.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = aob.j0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), U0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }
}
