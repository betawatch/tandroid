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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rc7 extends FrameLayout {
    public final ylb a;
    public final gd0 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public rc7(Context context, ylb ylbVar) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = ylbVar;
        setWillNotDraw(false);
        gd0 gd0Var = new gd0(this, false);
        this.b = gd0Var;
        gd0Var.l = true;
        gd0Var.p = gm.L(75.0f);
        gd0Var.o = gm.L(48.0f);
        gd0Var.x = true;
        gd0Var.s = gm.L(22.0f);
        int i = 0;
        while (i < 2) {
            this.c[i] = new TextView(context);
            anb.X(this.c[i], cmb.F6, ylbVar);
            this.c[i].setTypeface(gm.o());
            this.c[i].setTextSize(1, 14.0f);
            int i2 = 8;
            this.c[i].setVisibility(i == 0 ? 0 : 8);
            addView(this.c[i], qoe.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i] = new TextView(context);
            anb.X(this.d[i], cmb.y6, ylbVar);
            this.d[i].setTextSize(1, 12.0f);
            TextView textView = this.d[i];
            if (i == 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            addView(this.d[i], qoe.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i++;
        }
        ImageView k = td4.k(context, R.drawable.msg_arrowright);
        anb.s(k, cmb.O5, ylbVar, PorterDuff.Mode.SRC_IN);
        addView(k, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(u3b u3bVar) {
        String str;
        gd0 gd0Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = u3bVar.i;
            str = u3bVar.D;
            int size = arrayList.size();
            gd0Var = this.b;
            if (i >= size || i2 >= 3) {
                break;
            }
            k47 k47Var = (k47) u3bVar.i.get(i);
            long j = k47Var.l.dialogId;
            TextUtils.isEmpty(str);
            gd0Var.j(i2, u3bVar.c, k47Var.l);
            i2++;
            i++;
        }
        gd0Var.i(i2);
        gd0Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(jb6.H(' ', "HashtagStoriesFound", u3bVar.J));
        } else {
            textViewArr[0].setText(c(jb6.K("HashtagStoriesFoundChannel", u3bVar.J, ' ', b10.h("@", str))));
        }
        this.d[0].setText(jb6.a0(null, null, 2131749105, u3bVar.C));
        return i2 > 0;
    }

    public final void b(int i, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(jb6.H(' ', "HashtagMessagesFound", i));
        } else {
            textViewArr[1].setText(c(jb6.K("HashtagMessagesFoundChannel", i, ' ', b10.h("@", str2))));
        }
        this.d[1].setText(jb6.a0(null, null, 2131749114, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i = cmb.Ei;
        ylb ylbVar = this.a;
        SpannableStringBuilder M2 = gm.M2(str, i, ylbVar, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) M2.getSpans(0, M2.length(), CharacterStyle.class);
            for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                int spanStart = M2.getSpanStart(characterStyleArr[i2]);
                int spanEnd = M2.getSpanEnd(characterStyleArr[i2]);
                M2.removeSpan(characterStyleArr[i2]);
                M2.setSpan(new do4(cmb.Ei, ylbVar), spanStart, spanEnd, 0);
            }
            return M2;
        } catch (Exception e) {
            fc4.g(e, true);
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
        canvas.translate(gm.U1(this.e, 0, -gm.L(62.0f)), 0.0f);
        this.b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint U0 = cmb.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = cmb.j0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), U0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }
}
