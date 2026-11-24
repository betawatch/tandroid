// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class x7b extends ScrollView implements vlb {
    public final ln E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final ylb a;
    public final l7 b;
    public final int c;
    public final i1a d;
    public final ArrayList e;
    public wc5 f;
    public final m7b h;
    public boolean n;
    public qac r;
    public final ln s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public x7b(Context context, ylb ylbVar, m7b m7bVar) {
        super(context);
        this.e = new ArrayList();
        d53 d53Var = d53.h;
        this.s = new ln(this, 0L, 300L, d53Var);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.E = new ln(this, 0L, 300L, d53Var);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = ylbVar;
        this.h = m7bVar;
        setVerticalScrollBarEnabled(false);
        gm.u3(this, cmb.w0(null, cmb.c6, false));
        i1a i1aVar = new i1a(this, context);
        this.d = i1aVar;
        addView(i1aVar, qoe.c(-2.0f, -1));
        l7 l7Var = new l7((byte) 8, context, this);
        this.b = l7Var;
        if (Build.VERSION.SDK_INT >= 25) {
            l7Var.setRevealOnFocusHint(false);
        }
        l7Var.setTextSize(1, 16.0f);
        anb.l(l7Var, 34, cmb.Ni, ylbVar);
        anb.X(l7Var, cmb.F6, ylbVar);
        int i = cmb.Oi;
        anb.l(l7Var, 30, i, ylbVar);
        anb.l(l7Var, 36, i, ylbVar);
        l7Var.setCursorWidth(1.5f);
        l7Var.setInputType(l7Var.getInputType() | nm7.F2);
        l7Var.setSingleLine(true);
        l7Var.setBackgroundDrawable(null);
        l7Var.setVerticalScrollBarEnabled(false);
        l7Var.setHorizontalScrollBarEnabled(false);
        l7Var.setTextIsSelectable(false);
        l7Var.setPadding(0, 0, 0, 0);
        l7Var.setImeOptions(268435462);
        l7Var.setGravity((jb6.a0 ? 5 : 3) | 16);
        i1aVar.addView(l7Var);
        l7Var.setHintText(jb6.M0(2131745570, null));
        this.c = (int) l7Var.getPaint().measureText(jb6.M0(2131745570, null));
        l7Var.addTextChangedListener(new og6(this, (byte) 15));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, nm7.d4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.s.d(canScrollVertically(-1));
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.w.setLocalMatrix(matrix);
        Paint paint = this.x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), gm.L(8.0f) + r0, paint);
        float d2 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - gm.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - gm.L(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = hg9.v(20.0f, this.J, rect.top);
        rect.bottom = hg9.v(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setContainerHeight(float f) {
        this.K = f;
        i1a i1aVar = this.d;
        if (i1aVar != null) {
            i1aVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(qac qacVar) {
        this.r = qacVar;
    }

    public void setText(CharSequence charSequence) {
        this.n = true;
        this.b.setText(charSequence);
        this.n = false;
    }

    @Override // vlb
    public final void updateColors() {
        ylb ylbVar = this.a;
        l7 l7Var = this.b;
        if (l7Var != null) {
            try {
                l7Var.setHintColor(cmb.v0(cmb.Ni, ylbVar));
                int i = cmb.Oi;
                l7Var.setCursorColor(cmb.v0(i, ylbVar));
                l7Var.setHandlesColor(cmb.v0(i, ylbVar));
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        gm.u3(this, cmb.w0(null, cmb.c6, false));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
