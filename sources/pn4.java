// default package

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pn4 extends FrameLayout implements snb {
    public final boolean a;
    public final CharSequence b;
    public final on4 c;
    public final gm d;
    public final gm e;
    public final /* synthetic */ qn4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn4(qn4 qn4Var, Context context, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2) {
        super(context);
        this.f = qn4Var;
        this.a = z;
        String M0 = ob6.M0(2131750611, null);
        String M02 = ob6.M0(2131750610, null);
        CharSequence spannableStringBuilder = charSequence == null ? "" : new SpannableStringBuilder(charSequence);
        on4 on4Var = new on4(context);
        TextPaint textPaint = new TextPaint(1);
        on4Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        on4Var.b = textPaint2;
        Paint paint = new Paint(1);
        on4Var.c = paint;
        on4Var.d = new Path();
        float[] fArr = new float[8];
        on4Var.e = fArr;
        Paint paint2 = new Paint(1);
        on4Var.w = paint2;
        Paint paint3 = new Paint(1);
        on4Var.x = paint3;
        on4Var.y = new Matrix();
        on4Var.E = new Matrix();
        int i = aob.vi;
        textPaint.setColor(aob.p1(0.8f, aob.w0(null, i, false)));
        uh9.p(textPaint, hl.L(15.33f));
        int i2 = aob.o6;
        textPaint2.setColor(aob.w0(null, i2, false));
        uh9.p(textPaint2, hl.L(17.0f));
        paint.setColor(aob.w0(null, aob.Ki, false));
        hn hnVar = new hn(false, true, true);
        on4Var.F = hnVar;
        hnVar.n(0.3f, 250L, k43.h);
        hnVar.setCallback(on4Var);
        hnVar.w(hl.L(11.66f));
        hnVar.u(aob.w0(null, aob.d6, false));
        hnVar.x(hl.o());
        hnVar.b = 1;
        int p1 = aob.p1(0.8f, aob.w0(null, i, false));
        int w0 = aob.w0(null, i2, false);
        pkb pkbVar = new pkb(on4.a(M0), 15.33f, hl.o());
        pkbVar.q(on4Var);
        pkbVar.a.setColor(p1);
        on4Var.f = pkbVar;
        CharSequence a = on4.a(spannableStringBuilder);
        pkb pkbVar2 = new pkb(a, 15.33f, hl.o());
        pkbVar2.q(on4Var);
        TextPaint textPaint3 = pkbVar2.a;
        textPaint3.setColor(w0);
        on4Var.h = pkbVar2;
        pkbVar2.p(r47.A5(pv3.m(a, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        pkbVar2.n(z2 ? 26 : 0);
        pkb pkbVar3 = new pkb(on4.a(M02), 15.33f, hl.o());
        pkbVar3.q(on4Var);
        pkbVar3.a.setColor(p1);
        on4Var.n = pkbVar3;
        float L = hl.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = hl.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, hl.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        on4Var.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, hl.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        on4Var.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = on4Var;
        addView(on4Var, tre.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        gm gmVar = new gm(context);
        this.d = gmVar;
        int i3 = aob.G6;
        yob.X(gmVar, i3, null);
        gmVar.setTextSize(1, 20.0f);
        gmVar.setTypeface(hl.o());
        gmVar.setGravity(17);
        gmVar.setLineSpacing(hl.L(-1.0f), 1.0f);
        CharSequence n = pv3.n(new SpannableStringBuilder(charSequence), gmVar.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n;
        this.b = r47.B5(n, arrayList, gmVar.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        gmVar.setText(qn4Var.K0());
        gmVar.setCacheType(z2 ? 26 : 0);
        gmVar.setEmojiColor(aob.v0(aob.Fi, qn4Var.J0));
        addView(gmVar, tre.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        gm gmVar2 = new gm(context);
        this.e = gmVar2;
        yob.X(gmVar2, i3, null);
        gmVar2.setTextSize(1, 14.0f);
        gmVar2.setLines(2);
        gmVar2.setGravity(17);
        gmVar2.setLineSpacing(0.0f, 1.15f);
        addView(gmVar2, tre.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        qn4 qn4Var = this.f;
        ArrayList arrayList = qn4Var.b2;
        boolean z = qn4Var.W1;
        CharSequence charSequence = this.b;
        gm gmVar = this.e;
        if (z) {
            gmVar.setText(hl.R2(ob6.V(null, null, 2131750597, charSequence)));
            return;
        }
        if (!this.a) {
            if (arrayList == null || arrayList.isEmpty()) {
                gmVar.setText(hl.R2(ob6.V(null, null, 2131750601, charSequence)));
                return;
            } else {
                gmVar.setText(hl.R2(ob6.V(null, null, 2131750602, charSequence)));
                return;
            }
        }
        int size = arrayList != null ? arrayList.size() : 0;
        on4 on4Var = this.c;
        on4Var.F.t(size > 0 ? uh9.k(size, "+") : "", false, true);
        on4Var.invalidate();
        if (arrayList == null || arrayList.isEmpty()) {
            gmVar.setText(hl.R2(ob6.V(null, null, 2131750601, charSequence)));
        } else {
            gmVar.setText(hl.R2(ob6.F("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(172.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        try {
            gm gmVar = this.d;
            if (gmVar != null) {
                int i = aob.Fi;
                qn4 qn4Var = this.f;
                int i2 = qn4.A2;
                gmVar.setEmojiColor(aob.v0(i, qn4Var.J0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
