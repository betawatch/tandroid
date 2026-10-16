package yg;

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
import di.aa;
import di.g2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.z30;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class i extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final c6 a;
    public final g2 b;
    public final int c;
    public final aa d;
    public final ArrayList e;
    public z30 f;
    public boolean h;
    public Utilities.Callback n;
    public final g6 r;
    public final LinearGradient s;
    public final Paint v;
    public final Matrix w;
    public final g6 x;
    public final LinearGradient y;

    public i(Context context, c6 c6Var) {
        super(context);
        this.e = new ArrayList();
        es esVar = es.h;
        this.r = new g6(this, 0L, 300L, esVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Matrix();
        this.x = new g6(this, 0L, 300L, esVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = c6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        aa aaVar = new aa(this, context);
        this.d = aaVar;
        addView(aaVar, z5.d(-2.0f, -1));
        g2 g2Var = new g2(this, context, 11);
        this.b = g2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            g2Var.setRevealOnFocusHint(false);
        }
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        int i10 = org.telegram.ui.ActionBar.g6.Yh;
        g2Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        g2Var.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        g2Var.setCursorWidth(1.5f);
        g2Var.setInputType(g2Var.getInputType() | 176);
        g2Var.setSingleLine(true);
        g2Var.setBackgroundDrawable(null);
        g2Var.setVerticalScrollBarEnabled(false);
        g2Var.setHorizontalScrollBarEnabled(false);
        g2Var.setTextIsSelectable(false);
        g2Var.setPadding(0, 0, 0, 0);
        g2Var.setImeOptions(268435462);
        g2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        aaVar.addView(g2Var);
        g2Var.setHintText(LocaleController.getString(R.string.Search));
        this.c = (int) g2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        g2Var.addTextChangedListener(new f(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            z30 z30Var = (z30) view;
            if (!z30Var.y) {
                z30 z30Var2 = this.f;
                if (z30Var2 != null) {
                    z30Var2.a();
                    this.f = null;
                }
                this.f = z30Var;
                z30Var.b();
                return;
            }
            this.f = null;
            aa aaVar = this.d;
            i iVar = (i) aaVar.n;
            iVar.G = true;
            iVar.e.remove(z30Var);
            z30Var.setOnClickListener(null);
            aaVar.c();
            aaVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            aaVar.b = animatorSet;
            animatorSet.addListener(new ql0(23, aaVar, z30Var));
            ArrayList arrayList = aaVar.h;
            arrayList.clear();
            arrayList.add(z30Var);
            ArrayList arrayList2 = aaVar.d;
            arrayList2.clear();
            aaVar.e.clear();
            arrayList2.add(z30Var);
            ArrayList arrayList3 = aaVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(z30Var, (Property<z30, Float>) View.ALPHA, 1.0f, 0.0f));
            aaVar.requestLayout();
            hashSet.remove(Long.valueOf(z30Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i10;
        Property property;
        Property property2;
        Property property3;
        MessagesController messagesController;
        Object obj;
        ArrayList arrayList3 = arrayList;
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i11 >= arrayList2.size()) {
                break;
            }
            z30 z30Var = (z30) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(z30Var.getUid()))) {
                arrayList4.add(z30Var);
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
                    Object user = longValue >= 0 ? messagesController2.getUser(l4) : messagesController2.getChat(Long.valueOf(-longValue));
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj2;
                            messagesController = messagesController2;
                            if (tL_help_country.default_name.hashCode() == longValue) {
                                obj = tL_help_country;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                messagesController2 = messagesController;
                            }
                        }
                    }
                    messagesController = messagesController2;
                    obj = user;
                    if (obj != null) {
                        z30 z30Var2 = new z30(getContext(), obj, null, true, this.a);
                        z30Var2.setOnClickListener(new e(this, hashSet, runnable, 0));
                        arrayList5.add(z30Var2);
                    }
                } else {
                    if (((z30) arrayList2.get(i12)).getUid() == longValue) {
                        messagesController = messagesController2;
                        break;
                    }
                    i12++;
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            aa aaVar = this.d;
            ArrayList arrayList6 = aaVar.e;
            ArrayList arrayList7 = aaVar.d;
            ArrayList arrayList8 = aaVar.f;
            i iVar = (i) aaVar.n;
            iVar.G = true;
            ArrayList arrayList9 = iVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = aaVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((z30) arrayList4.get(i14)).setOnClickListener(null);
            }
            aaVar.c();
            if (z10) {
                aaVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                aaVar.b = animatorSet;
                animatorSet.addListener(new h(aaVar, arrayList4, 0));
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
                    z30 z30Var3 = (z30) arrayList4.get(i15);
                    arrayList6.add(z30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var3, (Property<z30, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var3, (Property<z30, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var3, (Property<z30, Float>) property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    z30 z30Var4 = (z30) arrayList5.get(i16);
                    arrayList7.add(z30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var4, (Property<z30, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var4, (Property<z30, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(z30Var4, (Property<z30, Float>) property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    aaVar.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                aaVar.b = null;
                i10 = 0;
                aaVar.c = false;
                iVar.b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                aaVar.addView((View) arrayList5.get(i18));
            }
            aaVar.requestLayout();
        }
        this.b.setOnKeyListener(new g(this, hashSet, runnable));
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
        float e7 = this.x.e(canScrollVertically(1));
        Matrix matrix2 = this.F;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f));
        this.y.setLocalMatrix(matrix2);
        Paint paint2 = this.E;
        paint2.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.G) {
            this.G = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = g0.C(20.0f, this.H, rect.top);
        rect.bottom = g0.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        aa aaVar = this.d;
        if (aaVar != null) {
            aaVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }
}
