package qg;

import ag.a1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.t5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class h extends ScrollView implements k6 {
    public final t5 D;
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public final p6 a;
    public final n0 b;
    public final int c;
    public final g d;
    public final ArrayList e;
    public s20 f;
    public boolean h;
    public q20 n;
    public int r;
    public final t5 s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public h(Context context, p6 p6Var) {
        super(context);
        this.e = new ArrayList();
        gr grVar = gr.h;
        this.s = new t5(this, 0L, 300L, grVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.D = new t5(this, 0L, 300L, grVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, i0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = p6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = t6.x0(null, t6.d6, false);
        this.r = x02;
        i0.y3(this, x02);
        g gVar = new g(this, context);
        this.d = gVar;
        addView(gVar, b6.c(-2.0f, -1));
        n0 n0Var = new n0(this, context, 9);
        this.b = n0Var;
        if (Build.VERSION.SDK_INT >= 25) {
            n0Var.setRevealOnFocusHint(false);
        }
        n0Var.setTextSize(1, 16.0f);
        a7.m(n0Var, 34, t6.Li, p6Var);
        a7.V(n0Var, t6.G6, p6Var);
        int i10 = t6.Mi;
        a7.m(n0Var, 30, i10, p6Var);
        a7.m(n0Var, 36, i10, p6Var);
        n0Var.setCursorWidth(1.5f);
        n0Var.setInputType(n0Var.getInputType() | zs.G2);
        n0Var.setSingleLine(true);
        n0Var.setBackgroundDrawable(null);
        n0Var.setVerticalScrollBarEnabled(false);
        n0Var.setHorizontalScrollBarEnabled(false);
        n0Var.setTextIsSelectable(false);
        n0Var.setPadding(0, 0, 0, 0);
        n0Var.setImeOptions(268435462);
        n0Var.setGravity((cd.X ? 5 : 3) | 16);
        gVar.addView(n0Var);
        n0Var.setHintText(cd.L0(2131745853, null));
        this.c = (int) n0Var.getPaint().measureText(cd.L0(2131745853, null));
        n0Var.addTextChangedListener(new a1(this, 27));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            s20 s20Var = (s20) view;
            if (!s20Var.D) {
                s20 s20Var2 = this.f;
                if (s20Var2 != null) {
                    s20Var2.a();
                    this.f = null;
                }
                this.f = s20Var;
                s20Var.b();
                return;
            }
            this.f = null;
            g gVar = this.d;
            h hVar = (h) gVar.n;
            hVar.H = true;
            hVar.e.remove(s20Var);
            s20Var.setOnClickListener(null);
            gVar.c();
            gVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            gVar.b = animatorSet;
            animatorSet.addListener(new iw0(13, (Object) gVar, (Object) s20Var));
            ArrayList arrayList = gVar.h;
            arrayList.clear();
            arrayList.add(s20Var);
            ArrayList arrayList2 = gVar.d;
            arrayList2.clear();
            gVar.e.clear();
            arrayList2.add(s20Var);
            ArrayList arrayList3 = gVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(s20Var, (Property<s20, Float>) View.ALPHA, 1.0f, 0.0f));
            gVar.requestLayout();
            hashSet.remove(Long.valueOf(s20Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i10;
        Property property;
        Property property2;
        Property property3;
        vp vpVar;
        Object obj;
        ArrayList arrayList3 = arrayList;
        vp r12 = vp.r1(d20.s0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i11 >= arrayList2.size()) {
                break;
            }
            s20 s20Var = (s20) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(s20Var.getUid()))) {
                arrayList4.add(s20Var);
            }
            i11++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    Object Z1 = longValue >= 0 ? r12.Z1(l4) : r12.L0(Long.valueOf(-longValue));
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj2;
                            vpVar = r12;
                            if (tL_help_country.default_name.hashCode() == longValue) {
                                obj = tL_help_country;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                r12 = vpVar;
                            }
                        }
                    }
                    vpVar = r12;
                    obj = Z1;
                    if (obj != null) {
                        s20 s20Var2 = new s20(getContext(), obj, null, true, this.a);
                        s20Var2.setOnClickListener(new ag.i(this, hashSet, runnable, 28));
                        arrayList5.add(s20Var2);
                    }
                } else {
                    if (((s20) arrayList2.get(i12)).getUid() == longValue) {
                        vpVar = r12;
                        break;
                    }
                    i12++;
                }
            }
            arrayList3 = arrayList;
            r12 = vpVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            g gVar = this.d;
            ArrayList arrayList6 = gVar.e;
            ArrayList arrayList7 = gVar.d;
            ArrayList arrayList8 = gVar.f;
            h hVar = (h) gVar.n;
            hVar.H = true;
            ArrayList arrayList9 = hVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = gVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((s20) arrayList4.get(i14)).setOnClickListener(null);
            }
            gVar.c();
            if (z10) {
                gVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                gVar.b = animatorSet;
                animatorSet.addListener(new f(gVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i15 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i15 >= size2) {
                        break;
                    }
                    s20 s20Var3 = (s20) arrayList4.get(i15);
                    arrayList6.add(s20Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(s20Var3, (Property<s20, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(s20Var3, (Property<s20, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(s20Var3, (Property<s20, Float>) property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    s20 s20Var4 = (s20) arrayList5.get(i16);
                    arrayList7.add(s20Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(s20Var4, (Property<s20, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(s20Var4, (Property<s20, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(s20Var4, (Property<s20, Float>) property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    gVar.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                gVar.b = null;
                i10 = 0;
                gVar.c = false;
                hVar.b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                gVar.addView((View) arrayList5.get(i18));
            }
            gVar.requestLayout();
        }
        this.b.setOnKeyListener(new e(this, hashSet, runnable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, zs.e4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.s.d(canScrollVertically(-1));
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.w.setLocalMatrix(matrix);
        Paint paint = this.x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), i0.L(8.0f) + r0, paint);
        float d10 = this.D.d(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - i0.L(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (d10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - i0.L(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = m5.C(20.0f, this.I, rect.top);
        rect.bottom = m5.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        g gVar = this.d;
        if (gVar != null) {
            gVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(q20 q20Var) {
        this.n = q20Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int x02 = t6.x0(null, t6.d6, false);
            int i10 = this.r;
            if (i10 == 0 || x02 == i10) {
                return;
            }
            this.r = x02;
            i0.y3(this, x02);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
