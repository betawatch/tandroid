package wg;

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
import bi.nb;
import bi.q;
import bi.t2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wr;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class h extends ScrollView {
    public final Paint E;
    public final Matrix F;
    public boolean G;
    public int H;
    public float I;
    public final f6 a;
    public final t2 b;
    public final int c;
    public final nb d;
    public final ArrayList e;
    public w30 f;
    public boolean h;
    public Utilities.Callback n;
    public final d6 r;
    public final LinearGradient s;
    public final Paint v;
    public final Matrix w;
    public final d6 x;
    public final LinearGradient y;

    public h(Context context, f6 f6Var) {
        super(context);
        this.e = new ArrayList();
        wr wrVar = wr.h;
        this.r = new d6(this, 0L, 300L, wrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Matrix();
        this.x = new d6(this, 0L, 300L, wrVar);
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
        this.a = f6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, j6.w0(null, j6.d6, false));
        nb nbVar = new nb(this, context);
        this.d = nbVar;
        addView(nbVar, a6.c(-2.0f, -1));
        t2 t2Var = new t2(this, context, 10);
        this.b = t2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            t2Var.setRevealOnFocusHint(false);
        }
        t2Var.setTextSize(1, 16.0f);
        t2Var.setHintColor(j6.v0(j6.Xh, f6Var));
        t2Var.setTextColor(j6.v0(j6.G6, f6Var));
        int i10 = j6.Yh;
        t2Var.setCursorColor(j6.v0(i10, f6Var));
        t2Var.setHandlesColor(j6.v0(i10, f6Var));
        t2Var.setCursorWidth(1.5f);
        t2Var.setInputType(t2Var.getInputType() | 176);
        t2Var.setSingleLine(true);
        t2Var.setBackgroundDrawable(null);
        t2Var.setVerticalScrollBarEnabled(false);
        t2Var.setHorizontalScrollBarEnabled(false);
        t2Var.setTextIsSelectable(false);
        t2Var.setPadding(0, 0, 0, 0);
        t2Var.setImeOptions(268435462);
        t2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        nbVar.addView(t2Var);
        t2Var.setHintText(LocaleController.getString(R.string.Search));
        this.c = (int) t2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        t2Var.addTextChangedListener(new e(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            w30 w30Var = (w30) view;
            if (!w30Var.y) {
                w30 w30Var2 = this.f;
                if (w30Var2 != null) {
                    w30Var2.a();
                    this.f = null;
                }
                this.f = w30Var;
                w30Var.b();
                return;
            }
            this.f = null;
            nb nbVar = this.d;
            h hVar = (h) nbVar.n;
            hVar.G = true;
            hVar.e.remove(w30Var);
            w30Var.setOnClickListener(null);
            nbVar.c();
            nbVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nbVar.b = animatorSet;
            animatorSet.addListener(new vv0(20, (Object) nbVar, (Object) w30Var));
            ArrayList arrayList = nbVar.h;
            arrayList.clear();
            arrayList.add(w30Var);
            ArrayList arrayList2 = nbVar.d;
            arrayList2.clear();
            nbVar.e.clear();
            arrayList2.add(w30Var);
            ArrayList arrayList3 = nbVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.ALPHA, 1.0f, 0.0f));
            nbVar.requestLayout();
            hashSet.remove(Long.valueOf(w30Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        Property property;
        Property property2;
        Property property3;
        MessagesController messagesController;
        Object obj;
        ArrayList arrayList3 = arrayList;
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            w30 w30Var = (w30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(w30Var.getUid()))) {
                arrayList4.add(w30Var);
            }
            i10++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    Object user = longValue >= 0 ? messagesController2.getUser(l4) : messagesController2.getChat(Long.valueOf(-longValue));
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
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
                        w30 w30Var2 = new w30(getContext(), obj, null, true, this.a);
                        w30Var2.setOnClickListener(new q(this, hashSet, runnable, 26));
                        arrayList5.add(w30Var2);
                    }
                } else {
                    if (((w30) arrayList2.get(i11)).getUid() == longValue) {
                        messagesController = messagesController2;
                        break;
                    }
                    i11++;
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            nb nbVar = this.d;
            ArrayList arrayList6 = nbVar.e;
            ArrayList arrayList7 = nbVar.d;
            ArrayList arrayList8 = nbVar.f;
            h hVar = (h) nbVar.n;
            hVar.G = true;
            ArrayList arrayList9 = hVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = nbVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((w30) arrayList4.get(i13)).setOnClickListener(null);
            }
            nbVar.c();
            if (z10) {
                nbVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                nbVar.b = animatorSet;
                animatorSet.addListener(new g(nbVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i14 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i14 >= size2) {
                        break;
                    }
                    w30 w30Var3 = (w30) arrayList4.get(i14);
                    arrayList6.add(w30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var3, (Property<w30, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var3, (Property<w30, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var3, (Property<w30, Float>) property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    w30 w30Var4 = (w30) arrayList5.get(i15);
                    arrayList7.add(w30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var4, (Property<w30, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var4, (Property<w30, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(w30Var4, (Property<w30, Float>) property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    nbVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                nbVar.b = null;
                nbVar.c = false;
                hVar.b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                nbVar.addView((View) arrayList5.get(i17));
            }
            nbVar.requestLayout();
        }
        this.b.setOnKeyListener(new f(this, hashSet, runnable));
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
        rect.top = a2.C(20.0f, this.H, rect.top);
        rect.bottom = a2.C(50.0f, this.H, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.I = f7;
        nb nbVar = this.d;
        if (nbVar != null) {
            nbVar.requestLayout();
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
