package zg;

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
import fi.c2;
import fi.j9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.t;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.x30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class i extends ScrollView implements p6 {
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public final u6 a;
    public final c2 b;
    public final int c;
    public final j9 d;
    public final ArrayList e;
    public x30 f;
    public boolean h;
    public Utilities.Callback n;
    public int r;
    public final h6 s;
    public final LinearGradient v;
    public final Paint w;
    public final Matrix x;
    public final h6 y;

    public i(Context context, u6 u6Var) {
        super(context);
        this.e = new ArrayList();
        ds dsVar = ds.h;
        this.s = new h6(this, 0L, 300L, dsVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.v = linearGradient;
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Matrix();
        this.y = new h6(this, 0L, 300L, dsVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = u6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = y6.x0(null, y6.d6, false);
        this.r = x02;
        AndroidUtilities.setScrollViewEdgeEffectColor(this, x02);
        j9 j9Var = new j9(this, context);
        this.d = j9Var;
        addView(j9Var, gb1.g(-2.0f, -1));
        c2 c2Var = new c2(this, context, 11);
        this.b = c2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            c2Var.setRevealOnFocusHint(false);
        }
        c2Var.setTextSize(1, 16.0f);
        f7.m(c2Var, 34, y6.Xh, u6Var);
        f7.V(c2Var, y6.G6, u6Var);
        int i10 = y6.Yh;
        f7.m(c2Var, 30, i10, u6Var);
        f7.m(c2Var, 36, i10, u6Var);
        c2Var.setCursorWidth(1.5f);
        c2Var.setInputType(c2Var.getInputType() | 176);
        c2Var.setSingleLine(true);
        c2Var.setBackgroundDrawable(null);
        c2Var.setVerticalScrollBarEnabled(false);
        c2Var.setHorizontalScrollBarEnabled(false);
        c2Var.setTextIsSelectable(false);
        c2Var.setPadding(0, 0, 0, 0);
        c2Var.setImeOptions(268435462);
        c2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        j9Var.addView(c2Var);
        c2Var.setHintText(LocaleController.getString(R.string.Search));
        this.c = (int) c2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        c2Var.addTextChangedListener(new f(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            x30 x30Var = (x30) view;
            if (!x30Var.y) {
                x30 x30Var2 = this.f;
                if (x30Var2 != null) {
                    x30Var2.a();
                    this.f = null;
                }
                this.f = x30Var;
                x30Var.b();
                return;
            }
            this.f = null;
            j9 j9Var = this.d;
            i iVar = (i) j9Var.n;
            iVar.H = true;
            iVar.e.remove(x30Var);
            x30Var.setOnClickListener(null);
            j9Var.c();
            j9Var.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            j9Var.b = animatorSet;
            animatorSet.addListener(new ll0(22, j9Var, x30Var));
            ArrayList arrayList = j9Var.h;
            arrayList.clear();
            arrayList.add(x30Var);
            ArrayList arrayList2 = j9Var.d;
            arrayList2.clear();
            j9Var.e.clear();
            arrayList2.add(x30Var);
            ArrayList arrayList3 = j9Var.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(x30Var, (Property<x30, Float>) View.ALPHA, 1.0f, 0.0f));
            j9Var.requestLayout();
            hashSet.remove(Long.valueOf(x30Var.getUid()));
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
            x30 x30Var = (x30) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(x30Var.getUid()))) {
                arrayList4.add(x30Var);
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
                        x30 x30Var2 = new x30(getContext(), obj, null, true, this.a);
                        x30Var2.setOnClickListener(new a51(this, hashSet, runnable, 3));
                        arrayList5.add(x30Var2);
                    }
                } else {
                    if (((x30) arrayList2.get(i12)).getUid() == longValue) {
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
            j9 j9Var = this.d;
            ArrayList arrayList6 = j9Var.e;
            ArrayList arrayList7 = j9Var.d;
            ArrayList arrayList8 = j9Var.f;
            i iVar = (i) j9Var.n;
            iVar.H = true;
            ArrayList arrayList9 = iVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = j9Var.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((x30) arrayList4.get(i14)).setOnClickListener(null);
            }
            j9Var.c();
            if (z10) {
                j9Var.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                j9Var.b = animatorSet;
                animatorSet.addListener(new h(j9Var, arrayList4, 0));
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
                    x30 x30Var3 = (x30) arrayList4.get(i15);
                    arrayList6.add(x30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var3, (Property<x30, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var3, (Property<x30, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var3, (Property<x30, Float>) property, 1.0f, 0.0f));
                    i15++;
                }
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    x30 x30Var4 = (x30) arrayList5.get(i16);
                    arrayList7.add(x30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var4, (Property<x30, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var4, (Property<x30, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(x30Var4, (Property<x30, Float>) property, 0.0f, 1.0f));
                }
                i10 = 0;
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    j9Var.removeView((View) arrayList4.get(i17));
                }
                arrayList10.clear();
                j9Var.b = null;
                i10 = 0;
                j9Var.c = false;
                iVar.b.setAllowDrawCursor(true);
            }
            for (int i18 = i10; i18 < arrayList5.size(); i18++) {
                j9Var.addView((View) arrayList5.get(i18));
            }
            j9Var.requestLayout();
        }
        this.b.setOnKeyListener(new g(this, hashSet, runnable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.s.e(canScrollVertically(-1));
        Matrix matrix = this.x;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.v.setLocalMatrix(matrix);
        Paint paint = this.w;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), AndroidUtilities.dp(8.0f) + r0, paint);
        float e10 = this.y.e(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (e10 * 255.0f));
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
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = t.D(20.0f, this.I, rect.top);
        rect.bottom = t.D(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        j9 j9Var = this.d;
        if (j9Var != null) {
            j9Var.requestLayout();
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            int x02 = y6.x0(null, y6.d6, false);
            int i10 = this.r;
            if (i10 == 0 || x02 == i10) {
                return;
            }
            this.r = x02;
            AndroidUtilities.setScrollViewEdgeEffectColor(this, x02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
