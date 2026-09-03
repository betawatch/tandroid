package ph;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o30;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class b8 extends ScrollView {
    public final Paint B;
    public final Matrix C;
    public boolean D;
    public int E;
    public float F;
    public int G;
    public boolean H;
    public final kg.f a;
    public final int b;
    public final kg.j c;
    public final ArrayList d;
    public o30 e;
    public final q7 f;
    public boolean h;
    public Utilities.Callback n;
    public final org.telegram.ui.Components.z5 r;
    public final LinearGradient s;
    public final Paint v;
    public final Matrix w;
    public final org.telegram.ui.Components.z5 x;
    public final LinearGradient y;

    public b8(Context context, org.telegram.ui.ActionBar.f6 f6Var, q7 q7Var) {
        super(context);
        this.d = new ArrayList();
        mr mrVar = mr.h;
        this.r = new org.telegram.ui.Components.z5(this, 0L, 300L, mrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Matrix();
        this.x = new org.telegram.ui.Components.z5(this, 0L, 300L, mrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f = q7Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        kg.j jVar = new kg.j(this, context);
        this.c = jVar;
        addView(jVar, k7.b6.c(-2.0f, -1));
        kg.f fVar = new kg.f(this, context, 10);
        this.a = fVar;
        if (Build.VERSION.SDK_INT >= 25) {
            fVar.setRevealOnFocusHint(false);
        }
        fVar.setTextSize(1, 16.0f);
        fVar.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        int i10 = org.telegram.ui.ActionBar.j6.Yh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fVar.setCursorWidth(1.5f);
        fVar.setInputType(fVar.getInputType() | 176);
        fVar.setSingleLine(true);
        fVar.setBackgroundDrawable(null);
        fVar.setVerticalScrollBarEnabled(false);
        fVar.setHorizontalScrollBarEnabled(false);
        fVar.setTextIsSelectable(false);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setImeOptions(268435462);
        fVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        jVar.addView(fVar);
        fVar.setHintText(LocaleController.getString(R.string.Search));
        this.b = (int) fVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        fVar.addTextChangedListener(new z7(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.r.e(canScrollVertically(-1));
        Matrix matrix = this.w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), AndroidUtilities.dp(8.0f) + r0, paint);
        float e6 = this.x.e(canScrollVertically(1));
        Matrix matrix2 = this.C;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f));
        this.y.setLocalMatrix(matrix2);
        Paint paint2 = this.B;
        paint2.setAlpha((int) (e6 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.D) {
            this.D = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.y3.C(20.0f, this.E, rect.top);
        rect.bottom = org.telegram.messenger.y3.C(50.0f, this.E, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    public void setContainerHeight(float f10) {
        this.F = f10;
        kg.j jVar = this.c;
        if (jVar != null) {
            jVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.a.setText(charSequence);
        this.h = false;
    }
}
