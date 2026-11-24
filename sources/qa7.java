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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qa7 extends FrameLayout {
    public final wjb a;
    public final gc0 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public qa7(Context context, wjb wjbVar) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = wjbVar;
        setWillNotDraw(false);
        gc0 gc0Var = new gc0(this, false);
        this.b = gc0Var;
        gc0Var.l = true;
        gc0Var.p = gl.L(75.0f);
        gc0Var.o = gl.L(48.0f);
        gc0Var.x = true;
        gc0Var.s = gl.L(22.0f);
        int i = 0;
        while (i < 2) {
            this.c[i] = new TextView(context);
            zkb.X(this.c[i], bkb.F6, wjbVar);
            this.c[i].setTypeface(gl.o());
            this.c[i].setTextSize(1, 14.0f);
            int i2 = 8;
            this.c[i].setVisibility(i == 0 ? 0 : 8);
            addView(this.c[i], nme.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i] = new TextView(context);
            zkb.X(this.d[i], bkb.y6, wjbVar);
            this.d[i].setTextSize(1, 12.0f);
            TextView textView = this.d[i];
            if (i == 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            addView(this.d[i], nme.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i++;
        }
        ImageView k = tb4.k(context, R.drawable.msg_arrowright);
        zkb.s(k, bkb.O5, wjbVar, PorterDuff.Mode.SRC_IN);
        addView(k, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(t1b t1bVar) {
        String str;
        gc0 gc0Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = t1bVar.i;
            str = t1bVar.D;
            int size = arrayList.size();
            gc0Var = this.b;
            if (i >= size || i2 >= 3) {
                break;
            }
            k27 k27Var = (k27) t1bVar.i.get(i);
            long j = k27Var.l.dialogId;
            TextUtils.isEmpty(str);
            gc0Var.j(i2, t1bVar.c, k27Var.l);
            i2++;
            i++;
        }
        gc0Var.i(i2);
        gc0Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(k96.H(' ', "HashtagStoriesFound", t1bVar.J));
        } else {
            textViewArr[0].setText(c(k96.K("HashtagStoriesFoundChannel", t1bVar.J, ' ', b00.h("@", str))));
        }
        this.d[0].setText(k96.a0(null, null, 2131749156, t1bVar.C));
        return i2 > 0;
    }

    public final void b(int i, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(k96.H(' ', "HashtagMessagesFound", i));
        } else {
            textViewArr[1].setText(c(k96.K("HashtagMessagesFoundChannel", i, ' ', b00.h("@", str2))));
        }
        this.d[1].setText(k96.a0(null, null, 2131749165, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i = bkb.Ei;
        wjb wjbVar = this.a;
        SpannableStringBuilder N2 = gl.N2(str, i, wjbVar, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) N2.getSpans(0, N2.length(), CharacterStyle.class);
            for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                int spanStart = N2.getSpanStart(characterStyleArr[i2]);
                int spanEnd = N2.getSpanEnd(characterStyleArr[i2]);
                N2.removeSpan(characterStyleArr[i2]);
                N2.setSpan(new cm4(bkb.Ei, wjbVar), spanStart, spanEnd, 0);
            }
            return N2;
        } catch (Exception e) {
            fa4.g(e, true);
            return N2;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(gl.U1(this.e, 0, -gl.L(62.0f)), 0.0f);
        this.b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint U0 = bkb.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = bkb.j0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), U0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }
}
